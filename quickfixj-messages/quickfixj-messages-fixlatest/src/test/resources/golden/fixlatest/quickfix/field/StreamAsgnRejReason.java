/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class StreamAsgnRejReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1502;

  public static final int UNKNOWN_CLIENT = 0;

  public static final int EXCEEDS_MAXIMUM_SIZE = 1;

  public static final int UNKNOWN_OR_INVALID_CURRENCY_PAIR = 2;

  public static final int NO_AVAILABLE_STREAM = 3;

  public static final int OTHER = 99;

  public StreamAsgnRejReason() {
    super(1502);
  }

  public StreamAsgnRejReason(Integer data) {
    super(1502, data);
  }

  public StreamAsgnRejReason(int data) {
    super(1502, data);
  }
}
