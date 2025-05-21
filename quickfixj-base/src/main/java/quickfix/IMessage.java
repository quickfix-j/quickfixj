package quickfix;

import java.time.LocalDateTime;

/**
 * Interface for FIX message implementations.
 * The standard concrete implementation is {@link Message}
 */
public interface IMessage {

    String toRawString();

    boolean isAdmin();
    String getHeaderString(int field) throws FieldNotFound;
    int getHeaderInt(int field) throws FieldNotFound;

    void setHeaderString(int field, String value);

    void setString(int tag, String value);

    void setHeaderInt(int field, int value);

    void setInt(int tag, int value);

    void setHeaderUtcTimeStamp(int field, LocalDateTime localDateTime, UtcTimestampPrecision timestampPrecision);

    boolean isSetField(int field);

    boolean getBoolean(int field) throws FieldNotFound;

    boolean isSetHeaderField(int field);

    int getInt(int tag) throws FieldNotFound;

    String getString(int tag) throws FieldNotFound;

    void removeHeaderField(int field);

    /**
     * Provides the first error found while parsing the message
     * May indicate the resulting data is only a partial copy of the raw string **/
    FieldException getException();
}