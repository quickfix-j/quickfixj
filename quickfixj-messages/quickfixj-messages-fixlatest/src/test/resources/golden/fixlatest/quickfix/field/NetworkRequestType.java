/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class NetworkRequestType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 935;

  public static final int SNAPSHOT = 1;

  public static final int SUBSCRIBE = 2;

  public static final int STOP_SUBSCRIBING = 4;

  public static final int LEVEL_OF_DETAIL = 8;

  public NetworkRequestType() {
    super(935);
  }

  public NetworkRequestType(Integer data) {
    super(935, data);
  }

  public NetworkRequestType(int data) {
    super(935, data);
  }
}
