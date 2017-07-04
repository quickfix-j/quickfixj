package quickfix;

import quickfix.field.DefaultApplVerID;

import java.net.InetAddress;
import java.util.Set;
import java.util.function.Supplier;

public class SessionFactoryTestSupport implements SessionFactory {
    private static final SessionFactoryTestSupport instance = new SessionFactoryTestSupport();

    @Override
    public Session create(SessionID sessionID, SessionSettings settings) throws ConfigError {
        return new Builder().setSessionId(sessionID).build();
    }

    public static Session createSession(SessionID sessionID, Application application,
                                        boolean isInitiator) {
        return new Builder().setSessionId(sessionID).setApplication(application).setIsInitiator(isInitiator).build();
    }

    public static Session createFileStoreSession(SessionID sessionID, Application application,
                                                 boolean isInitiator, SessionSettings settings, SessionSchedule sessionSchedule) {
        return new Builder().setSessionId(sessionID).setApplication(application).setIsInitiator(isInitiator)
                .setMessageStoreFactory(new FileStoreFactory(settings)).setSessionSchedule(sessionSchedule)
                .build();
    }

    public static Session createSession(SessionID sessionID, Application application,
                                        boolean isInitiator, boolean resetOnLogon, boolean validateSequenceNumbers) {
        return new Builder().setSessionId(sessionID).setApplication(application).setIsInitiator(isInitiator)
                .setResetOnLogon(resetOnLogon).setValidateSequenceNumbers(validateSequenceNumbers)
                .setPersistMessages(true)
                .build();
    }

    public static Session createSession(SessionID sessionID, Application application,
                                        boolean isInitiator, boolean resetOnLogon, boolean validateSequenceNumbers,
                                        boolean useDataDictionary, DefaultApplVerID senderDefaultApplVerID) {
        return new Builder().setSessionId(sessionID).setApplication(application).setIsInitiator(isInitiator)
                .setDataDictionaryProvider(new DefaultDataDictionaryProvider())
                .setResetOnLogon(resetOnLogon).setValidateSequenceNumbers(validateSequenceNumbers)
                .setPersistMessages(true).setSenderDefaultApplVerID(senderDefaultApplVerID)
                .build();
    }

    public static Session createSession(SessionID sessionID, Application application,
                                        boolean isInitiator, boolean resetOnLogon) {
        return createSession(sessionID, application, isInitiator, resetOnLogon, false);
    }

    public static Session createNonpersistedSession(SessionID sessionID, Application application, boolean isInitiator) {
        return new Builder().setSessionId(sessionID).setApplication(application).setIsInitiator(isInitiator)
                .setResetOnLogon(true)
                .build();
    }

    public static Session createSession() throws ConfigError {
        return instance.create(null, null);
    }

    public static final class Builder {
        private String beginString = "FIX.4.2";
        private String senderCompID = "SENDER";
        private String targetCompID = "TARGET";
        private boolean isInitiator = false;
        private Supplier<SessionID> sessionIDSupplier = () -> new SessionID(beginString, senderCompID, targetCompID);
        private Supplier<Application> applicationSupplier = UnitTestApplication::new;
        private Supplier<MessageStoreFactory> messageStoreFactorySupplier = MemoryStoreFactory::new;
        private Supplier<DataDictionaryProvider> dataDictionaryProviderSupplier = () -> null;
        private Supplier<SessionSchedule> sessionScheduleSupplier = () -> null;
        private Supplier<LogFactory> logFactorySupplier = () -> new ScreenLogFactory(true, true, true);
        private Supplier<MessageFactory> messageFactorySupplier = DefaultMessageFactory::new;
        private Supplier<Integer> sessionHeartbeatIntervalSupplier = () -> isInitiator ? 30 : 0;
        private boolean checkLatency = false;
        private int maxLatency = 30;
        private UtcTimestampPrecision timestampPrecision = UtcTimestampPrecision.MILLIS;
        private boolean resetOnLogon = false;
        private boolean resetOnLogout = false;
        private boolean resetOnDisconnect = false;
        private boolean refreshMessageStoreAtLogon = false;
        private boolean checkCompID = false;
        private boolean redundantResentRequestsAllowed = false;
        private boolean persistMessages = false;
        private boolean useClosedRangeForResend = false;
        private double testRequestDelayMultiplier = 1.5;
        private DefaultApplVerID senderDefaultApplVerID = null;
        private boolean validateSequenceNumbers = true;
        private int[] logonIntervals = new int[]{5};
        private boolean resetOnError = false;
        private boolean disconnectOnError = false;
        private boolean disableHeartBeatCheck = false;
        private boolean rejectInvalidMessage = true;
        private boolean rejectMessageOnUnhandledException = false;
        private boolean requiresOrigSendingTime = true;
        private boolean forceResendWhenCorruptedStore = false;
        private Set<InetAddress> allowedRemoteAddresses = null;
        private boolean validateIncomingMessage = true;
        private int resendRequestChunkSize = 0;
        private boolean enableNextExpectedMsgSeqNum = false;
        private boolean enableLastMsgSeqNumProcessed = false;

        public Session build() {
            return new Session(applicationSupplier.get(), messageStoreFactorySupplier.get(), sessionIDSupplier.get(),
                    dataDictionaryProviderSupplier.get(), sessionScheduleSupplier.get(), logFactorySupplier.get(),
                    messageFactorySupplier.get(), sessionHeartbeatIntervalSupplier.get(), checkLatency, maxLatency,
                    timestampPrecision, resetOnLogon, resetOnLogout, resetOnDisconnect, refreshMessageStoreAtLogon,
                    checkCompID, redundantResentRequestsAllowed, persistMessages, useClosedRangeForResend,
                    testRequestDelayMultiplier, senderDefaultApplVerID, validateSequenceNumbers, logonIntervals,
                    resetOnError, disconnectOnError, disableHeartBeatCheck, rejectInvalidMessage,
                    rejectMessageOnUnhandledException, requiresOrigSendingTime, forceResendWhenCorruptedStore,
                    allowedRemoteAddresses, validateIncomingMessage, resendRequestChunkSize, enableNextExpectedMsgSeqNum,
                    enableLastMsgSeqNumProcessed);
        }

        public Builder setBeginString(final String beginString) {
            this.beginString = beginString;
            return this;
        }

        public Builder setSenderCompID(final String senderCompID) {
            this.senderCompID = senderCompID;
            return this;
        }

        public Builder setTargetCompID(final String targetCompID) {
            this.targetCompID = targetCompID;
            return this;
        }

        public Builder setSessionId(final SessionID sessionId) {
            if (sessionId != null) {
                this.sessionIDSupplier = () -> sessionId;
            }
            return this;
        }

        public Builder setApplication(final Application application) {
            this.applicationSupplier = () -> application;
            return this;
        }

        public Builder setMessageStoreFactory(final MessageStoreFactory messageStoreFactory) {
            this.messageStoreFactorySupplier = () -> messageStoreFactory;
            return this;
        }

        public Builder setDataDictionaryProvider(final DataDictionaryProvider dataDictionaryProvider) {
            this.dataDictionaryProviderSupplier = () -> dataDictionaryProvider;
            return this;
        }

        public Builder setSessionSchedule(final SessionSchedule sessionSchedule) {
            this.sessionScheduleSupplier = () -> sessionSchedule;
            return this;
        }

        public Builder setLogFactory(final LogFactory logFactory) {
            this.logFactorySupplier = () -> logFactory;
            return this;
        }

        public Builder setMessageFactory(final MessageFactory messageFactory) {
            this.messageFactorySupplier = () -> messageFactory;
            return this;
        }

        public Builder setIsInitiator(final boolean isInitiator) {
            this.isInitiator = isInitiator;
            return this;
        }

        public Builder setSessionHeartbeatInterval(final int sessionHeartbeatInterval) {
            this.sessionHeartbeatIntervalSupplier = () -> sessionHeartbeatInterval;
            return this;
        }

        public Builder setResetOnLogon(final boolean resetOnLogon) {
            this.resetOnLogon = resetOnLogon;
            return this;
        }

        public Builder setValidateSequenceNumbers(final boolean validateSequenceNumbers) {
            this.validateSequenceNumbers = validateSequenceNumbers;
            return this;
        }

        public Builder setPersistMessages(final boolean persistMessages) {
            this.persistMessages = persistMessages;
            return this;
        }

        public Builder setSenderDefaultApplVerID(final DefaultApplVerID senderDefaultApplVerID) {
            this.senderDefaultApplVerID = senderDefaultApplVerID;
            return this;
        }

        public Builder setEnableNextExpectedMsgSeqNum(final boolean enableNextExpectedMsgSeqNum) {
            this.enableNextExpectedMsgSeqNum = enableNextExpectedMsgSeqNum;
            return this;
        }
    }
}
