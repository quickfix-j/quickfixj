package org.quickfixj;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.quickfixj.sample.SampleQuickFixJApplication;
import quickfix.ConfigError;
import quickfix.DataDictionary;
import quickfix.ValidationSettings;
import quickfix.FieldNotFound;
import quickfix.IncorrectTagValue;
import quickfix.InvalidMessage;
import quickfix.SessionID;
import quickfix.UnsupportedMessageType;
import quickfix.fix44.ExecutionReport;

public class MessageCrackerPerfTest extends AbstractPerfTest {

    private SessionID sessionID;
    private ExecutionReport executionReport;

    private SampleQuickFixJApplication application;

    @Setup
    public void prepare() throws ConfigError, InvalidMessage {

        String data = "8=FIX.4.4\0019=309\00135=8\00149=ASX\00156=CL1_FIX44\00134=4\001" +
                "52=20060324-01:05:58\00117=X-B-WOW-1494E9A0:58BD3F9D-1109\001150=D\001" +
                "39=0\00111=184271\00138=200\001198=1494E9A0:58BD3F9D\001526=4324\001" +
                "37=B-WOW-1494E9A0:58BD3F9D\00155=WOW\00154=1\001151=200\00114=0\00140=2\001" +
                "44=15\00159=1\0016=0\001453=3\001448=AAA35791\001447=D\001452=3\001448=8\001" +
                "447=D\001452=4\001448=FIX11\001447=D\001452=36\00160=20060320-03:34:29\00110=169\001";

        sessionID = new SessionID("FIX4.4", "CL1_FIX44", "ASX");
        executionReport = new ExecutionReport();
        DataDictionary dataDictionary = new DataDictionary(MessageCrackerPerfTest.class.getClassLoader()
                .getResourceAsStream("FIX44.xml"));
        ValidationSettings validationSettings = new ValidationSettings();

        executionReport.fromString(data, dataDictionary, validationSettings, false);

        application = new SampleQuickFixJApplication();
    }

    @Benchmark
    public void baseline() {
    }

    @Benchmark
    public void crack() throws UnsupportedMessageType, IncorrectTagValue, FieldNotFound {
        application.fromApp(executionReport, sessionID);
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(".*" + MessageCrackerPerfTest.class.getSimpleName() + ".*")
                .build();

        new Runner(opt).run();
    }

}
