/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class NetworkStatusResponseType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 937;

  public static final int FULL = 1;

  public static final int INCREMENTAL_UPDATE = 2;

  public NetworkStatusResponseType() {
    super(937);
  }

  public NetworkStatusResponseType(Integer data) {
    super(937, data);
  }

  public NetworkStatusResponseType(int data) {
    super(937, data);
  }
}
