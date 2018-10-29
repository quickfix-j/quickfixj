package quickfix;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * This is an adapter implementation of Application interface, and that transforms the usage into more functional style.
 * It breaks down each interface method into a number of single-method interfaces, which can be supplied by lambda
 * expressions. Each single-method interface has its own add and remove listener method.
 *
 * <ol>
 *     <li>Support multiple listeners of the same operation, e.g. onLogon. The method of the listeners will be invoked
 *     in the same order of when add method was invoked, i.e. FIFO</li>
 *     <li>Support fail fast exception propagation for fromAdmin, toApp, and fromApp. The exception will be thrown for
 *     the first encountered exception.</li>
 *     <li>Provides a thread-safe way to delegate to, add and remove listeners, by the means of CopyOnWriteArrayList,
 *     under the assumption that adding and removing listeners are rare.</li>
 * </ol>
 */
public class ApplicationFunctionalAdapter implements Application {
    private final CopyOnWriteArrayList<Consumer<SessionID>> onCreateListeners = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<Consumer<SessionID>> onLogonListeners = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<Consumer<SessionID>> onLogoutListeners = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<BiConsumer<Message, SessionID>> toAdminListeners = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<FromAdminListener> fromAdminListeners = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<ToAppListener> toAppListeners = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<FromAppListener> fromAppListeners = new CopyOnWriteArrayList<>();

    /**
     * Add a Consumer of SessionID to listen to onCreate operation.
     *
     * @param onCreateListener the Consumer of Session for onCreate operation.
     */
    public void addOnCreateListener(Consumer<SessionID> onCreateListener) {
        onCreateListeners.add(onCreateListener);
    }

    /**
     * Remove a Consumer of SessionID from onCreate operation.
     *
     * @param onCreateListener the Consumer of Session for onCreate operation.
     */
    public void removeOnCreateListener(Consumer<SessionID> onCreateListener) {
        onCreateListeners.remove(onCreateListener);
    }

    /**
     * Add a Consumer of SessionID to listen to onLogon operation.
     *
     * @param onLogonListener the Consumer of Session for onLogon operation.
     */
    public void addOnLogonListener(Consumer<SessionID> onLogonListener) {
        onLogonListeners.add(onLogonListener);
    }

    /**
     * Remove a Consumer of SessionID from onLogon operation.
     *
     * @param onLogonListener the Consumer of Session for onLogon operation.
     */
    public void removeOnLogonListener(Consumer<SessionID> onLogonListener) {
        onLogonListeners.remove(onLogonListener);
    }

    /**
     * Add a Consumer of SessionID to listen to onLogout operation.
     *
     * @param onLogoutListener the Consumer of Session for onLogout operation.
     */
    public void addOnLogoutListener(Consumer<SessionID> onLogoutListener) {
        onLogoutListeners.add(onLogoutListener);
    }

    /**
     * Remove a Consumer of SessionID from onLogout operation.
     *
     * @param onLogoutListener the Consumer of Session for onLogout operation.
     */
    public void removeOnLogoutListener(Consumer<SessionID> onLogoutListener) {
        onLogoutListeners.remove(onLogoutListener);
    }

    /**
     * Add a BiConsumer of SessionID to listen to toAdmin operation.
     *
     * @param toAdminListener the BiConsumer of Session for toAdmin operation.
     */
    public void addToAdminListener(BiConsumer<Message, SessionID> toAdminListener) {
        toAdminListeners.add(toAdminListener);
    }

    /**
     * Remove a BiConsumer of SessionID from toAdmin operation.
     *
     * @param toAdminListener the BiConsumer of Session for toAdmin operation.
     */
    public void removeToAdminListener(BiConsumer<Message, SessionID> toAdminListener) {
        toAdminListeners.remove(toAdminListener);
    }

    /**
     * Add a listener of fromAdmin operation.
     *
     * @param fromAdminListener the listener of fromAdmin operation.
     */
    public void addFromAdminListener(FromAdminListener fromAdminListener) {
        fromAdminListeners.add(fromAdminListener);
    }

    /**
     * Remove a listener of fromAdmin operation.
     *
     * @param fromAdminListener the listener of fromAdmin operation.
     */
    public void removeFromAdminListener(FromAdminListener fromAdminListener) {
        fromAdminListeners.remove(fromAdminListener);
    }

    /**
     * Add a listener of toApp operation.
     *
     * @param toAppListener the listener of fromAdmin operation.
     */
    public void addToAppListener(ToAppListener toAppListener) {
        toAppListeners.add(toAppListener);
    }

    /**
     * Remove a listener of toApp operation.
     *
     * @param toAppListener the listener of toApp operation.
     */
    public void removeToAppListener(ToAppListener toAppListener) {
        toAppListeners.remove(toAppListener);
    }

    /**
     * Add a listener of fromApp operation.
     *
     * @param fromAppListener the listener of fromApp operation.
     */
    public void addFromAppListener(FromAppListener fromAppListener) {
        fromAppListeners.add(fromAppListener);
    }

    /**
     * Remove a listener of fromApp operation.
     *
     * @param fromAppListener the listener of fromApp operation.
     */
    public void removeFromAppListener(FromAppListener fromAppListener) {
        fromAppListeners.remove(fromAppListener);
    }

    @Override
    public void onCreate(SessionID sessionId) {
        onCreateListeners.forEach(c -> c.accept(sessionId));
    }

    @Override
    public void onLogon(SessionID sessionId) {
        onLogonListeners.forEach(c -> c.accept(sessionId));
    }

    @Override
    public void onLogout(SessionID sessionId) {
        onLogoutListeners.forEach(c -> c.accept(sessionId));
    }

    @Override
    public void toAdmin(Message message, SessionID sessionId) {
        toAdminListeners.forEach(c -> c.accept(message, sessionId));
    }

    @Override
    public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
        for (FromAdminListener listener : fromAdminListeners) {
            listener.accept(message, sessionId);
        }
    }

    @Override
    public void toApp(Message message, SessionID sessionId) throws DoNotSend {
        for (ToAppListener listener : toAppListeners) {
            listener.accept(message, sessionId);
        }
    }

    @Override
    public void fromApp(Message message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
        for (FromAppListener listener : fromAppListeners) {
            listener.accept(message, sessionId);
        }
    }

}
