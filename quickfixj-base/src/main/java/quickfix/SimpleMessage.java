package quickfix;

import quickfix.field.BodyLength;
import quickfix.field.CheckSum;
import quickfix.field.MsgType;
import quickfix.field.SessionRejectReason;
import quickfix.field.converter.BooleanConverter;
import quickfix.field.converter.IntConverter;
import quickfix.field.converter.UtcTimestampConverter;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SimpleMessage is designed to allow sending complex messages (e.g. repeating groups) of an arbitrary format *without* parsing the structure.
 * Use cases include messages stored and then later sent.
 */
public class SimpleMessage implements IMessage {
    private static final List<Integer> STRICT_ORDERING = Arrays.asList(new Integer[]{8, 9, 35});
    private static final String SOH = String.valueOf('\001');
    private static final String BODY_LENGTH_FIELD = SOH + String.valueOf(BodyLength.FIELD) + '=';
    private static final String CHECKSUM_FIELD = SOH + String.valueOf(CheckSum.FIELD) + '=';
    private final String messageData;

    public static class TagPair {
        public final int tag;
        public String value;

        public TagPair(int tag, String value) {
            this.tag = tag;
            this.value = value;
        }

        public String asString() {
            return tag+"="+value+SOH;
        }
    }

    private final List<TagPair> fields;

    public SimpleMessage(String message) {
        messageData = message;
        fields = Arrays.stream(message.split("\u0001")).map(p -> {
            String[] pairData = p.split("=", 2);
            return new TagPair(Integer.parseInt(pairData[0]), pairData[1]);
        }).collect(Collectors.toList());
    }

    public List<TagPair> getFields() {
        return fields;
    }

    @Override
    public String toString() {
        setHeaderString(BodyLength.FIELD, "100");
        setString(10, "000");
        StringBuilder messageString = buildMessageString();
        setBodyLength(messageString);
        setChecksum(messageString);
        return messageString.toString();
    }

    private static void setBodyLength(StringBuilder stringBuilder) {
        int bodyLengthIndex = stringBuilder.indexOf(BODY_LENGTH_FIELD, 0);
        int sohIndex = stringBuilder.indexOf(SOH, bodyLengthIndex + 1);
        int checkSumIndex = stringBuilder.lastIndexOf(CHECKSUM_FIELD);
        int length = checkSumIndex - sohIndex;
        bodyLengthIndex += BODY_LENGTH_FIELD.length();
        stringBuilder.replace(bodyLengthIndex, bodyLengthIndex + 3, NumbersCache.get(length));
    }

    private static void setChecksum(StringBuilder stringBuilder) {
        int checkSumIndex = stringBuilder.lastIndexOf(CHECKSUM_FIELD);
        int checkSum = 0;
        for(int i = checkSumIndex; i-- != 0;)
            checkSum += stringBuilder.charAt(i);
        String checkSumValue = NumbersCache.get((checkSum + 1) & 0xFF); // better than sum % 256 since it avoids overflow issues
        checkSumIndex += CHECKSUM_FIELD.length();
        stringBuilder.replace(checkSumIndex + (3 - checkSumValue.length()), checkSumIndex + 3, checkSumValue);
    }

    private StringBuilder buildMessageString() {
        StringBuilder message = new StringBuilder();
        //Print strict order tags
        for (Integer integer : STRICT_ORDERING) {
            TagPair tagPair = getField(integer);
            if (tagPair != null) {
                message.append(tagPair.asString());
            }
        }
        //Print unclaimed tags
        for (TagPair tagPair : fields) {
            if (tagPair.tag != 10 && !STRICT_ORDERING.contains(tagPair.tag)) {
                message.append(tagPair.asString());
            }
        }
        //Print footer tag
        TagPair footer = getField(10);
        if (footer != null) {
            message.append(footer.asString());
        }
        return message;
    }

    private TagPair getField(int tag) {
        for (TagPair field : fields) {
            if (field.tag == tag) {
                return field;
            }
        }
        return null;
    }

    @Override
    public String toRawString() {
        return messageData;
    }

    @Override
    public boolean isAdmin() {
        if (isSetHeaderField(MsgType.FIELD)) {
            try {
                final String msgType = getHeaderString(MsgType.FIELD);
                return MessageUtils.isAdminMessage(msgType);
            } catch (final FieldNotFound e) {
                // shouldn't happen
            }
        }
        return false;
    }

    @Override
    public String getHeaderString(int tag) throws FieldNotFound {
        for (TagPair field : fields) {
            if (field.tag == tag) {
                return field.value;
            }
        }
        throw new FieldNotFound(tag);
    }

    @Override
    public int getHeaderInt(int tag) throws FieldNotFound {
        for (TagPair field : fields) {
            if (field.tag == tag) {
                return Integer.parseInt(field.value);
            }
        }
        throw new FieldNotFound(tag);
    }

    @Override
    public void setHeaderString(int tag, String value) {
        for (TagPair field : fields) {
            if (field.tag == tag) {
                field.value = value;
                return;
            }
        }
        fields.add(new TagPair(tag, value));
    }

    @Override
    public void setString(int tag, String value) {
        for (TagPair field : fields) {
            if (field.tag == tag) {
                field.value = value;
                return;
            }
        }
        fields.add(new TagPair(tag, value));
    }

    @Override
    public void setHeaderInt(int tag, int value) {
        for (TagPair field : fields) {
            if (field.tag == tag) {
                field.value = Integer.toString(value);
                return;
            }
        }
        fields.add(new TagPair(tag, Integer.toString(value)));
    }

    @Override
    public void setInt(int tag, int value) {
        for (TagPair field : fields) {
            if (field.tag == tag) {
                field.value = Integer.toString(value);
                return;
            }
        }
        fields.add(new TagPair(tag, Integer.toString(value)));
    }

    @Override
    public void setHeaderUtcTimeStamp(int tag, LocalDateTime dateTime, UtcTimestampPrecision precision) {
        for (TagPair field : fields) {
            if (field.tag == tag) {
                field.value = UtcTimestampConverter.convert(dateTime, precision);
                return;
            }
        }
    }

    @Override
    public boolean isSetHeaderField(int tag) {
        for (TagPair field : fields) {
            if (field.tag == tag) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isSetField(int tag) {
        for (TagPair field : fields) {
            if (field.tag == tag) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean getBoolean(int tag) throws FieldNotFound {
        try {
            return BooleanConverter.convert(getString(tag));
        } catch (FieldConvertError e) {
            throw newIncorrectDataException(e, tag);
        }
    }

    @Override
    public int getInt(int tag) throws FieldNotFound {
        try {
            return IntConverter.convert(getString(tag));
        } catch (FieldConvertError e) {
            throw newIncorrectDataException(e, tag);
        }
    }

    @Override
    public String getString(int tag) throws FieldNotFound {
        for (TagPair field : fields) {
            if (field.tag == tag) {
                return field.value;
            }
        }
        throw new FieldNotFound(tag);
    }

    @Override
    public void removeHeaderField(int field) {
        fields.removeIf(f -> f.tag == field);
    }

    @Override
    public FieldException getException() {
        return null;
    }

    private FieldException newIncorrectDataException(FieldConvertError e, int tag) {
        return new FieldException(SessionRejectReason.INCORRECT_DATA_FORMAT_FOR_VALUE,
                e.getMessage(), tag);
    }
}