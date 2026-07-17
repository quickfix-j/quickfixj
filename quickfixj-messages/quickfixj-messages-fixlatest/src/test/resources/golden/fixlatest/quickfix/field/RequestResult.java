/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class RequestResult extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1511;

  public static final int VALID_REQUEST = 0;

  public static final int INVALID_OR_UNSUPPORTED_REQUEST = 1;

  public static final int NO_DATA_FOUND = 2;

  public static final int NOT_AUTHORIZED = 3;

  public static final int DATA_TEMPORARILY_UNAVAILABLE = 4;

  public static final int REQUEST_FOR_DATA_NOT_SUPPORTED = 5;

  public static final int OTHER = 99;

  public RequestResult() {
    super(1511);
  }

  public RequestResult(Integer data) {
    super(1511, data);
  }

  public RequestResult(int data) {
    super(1511, data);
  }
}
