package quickfix.test.acceptance;

import java.io.IOException;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import junit.framework.Assert;
import junit.framework.TestResult;

import org.apache.log4j.Logger;

import quickfix.FieldValueConverter;
import quickfix.FixVersions;

public class InitiateMessageStep implements TestStep {
    private Logger log = Logger.getLogger(getClass());
    private final String data;
    private int clientId = 0;
    private static final Pattern MESSAGE_PATTERN = Pattern.compile("I(\\d,)*(8=FIX\\.\\d\\.\\d\\001)(.*)");
    private static final Pattern TIME_PATTERN = Pattern.compile("<TIME([+-](\\d+))*>");
    private static final DecimalFormat CHECKSUM_FORMAT = new DecimalFormat("000");

    public InitiateMessageStep(String data) {
        this.data = data;
    }

    public void run(TestResult result, TestContext context) {
        Matcher messageStructureMatcher = MESSAGE_PATTERN.matcher(data);
        String message;
        if (messageStructureMatcher.matches()) {
            if (messageStructureMatcher.group(1) != null && !messageStructureMatcher.group(1).equals("")) {
                clientId = Integer.parseInt(messageStructureMatcher.group(1).replaceAll(",", ""));
            } else {
                clientId = 1;
            }
            String version = messageStructureMatcher.group(2);
            String messageTail = insertTimes(messageStructureMatcher.group(3));
            message = version
                    + (!messageTail.startsWith("9=") ? "9=" + messageTail.length() + "\001" : "")
                    + messageTail;
        } else {
            log.info("garbled message being sent");
            clientId = 1;
            message = data.substring(1);
        }
        message += "10=" + CHECKSUM_FORMAT.format(checksum(message)) + '\001';
        log.debug("sending to client " + clientId + ": " + message);
        try {
            OutputStream clientOutputStream = context.getClientOutputStream(clientId);
            clientOutputStream.write(message.getBytes());
            clientOutputStream.flush();
        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }
    }

    private String insertTimes(String message) {
        Matcher matcher = TIME_PATTERN.matcher(message);
        while (matcher.find()) {
            long offset = 0;
            if (matcher.group(2) != null) {
                offset = Long.parseLong(matcher.group(2)) * 1000L;
                if (matcher.group(2).equals("-")) {
                    offset *= -1;
                }
            }
            String beginString = message.substring(2, 9);
            boolean includeMillis = beginString.compareTo(FixVersions.BEGINSTRING_FIX42) >= 0;
            message = matcher.replaceFirst(FieldValueConverter.UtcTimestampConverter
                    .convert(new Date(System.currentTimeMillis()+(offset*1000)), includeMillis));
            matcher = TIME_PATTERN.matcher(message);
        }
        return message;
    }

    private int checksum(String message) {
        int sum = 0;
        //int fieldOffset = 0;
        int fieldSum = 0;
        for (int i = 0; i < message.length(); i++) {
            sum += message.charAt(i);
            fieldSum += message.charAt(i);
            if (message.charAt(i) == '\001') {
                //System.out.println(message.substring(fieldOffset, i)+"
                // "+fieldSum);
                //fieldOffset = i + 1;
                fieldSum = 0;
            }
        }
        //System.out.println("sum="+sum);
        return sum % 256;
    }

    public String toString() {
        return "initiate message: " + data;
    }
}