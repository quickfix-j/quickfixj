/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class StatusValue extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 928;

  public static final int CONNECTED = 1;

  public static final int NOT_CONNECTED_UNEXPECTED = 2;

  public static final int NOT_CONNECTED_EXPECTED = 3;

  public static final int IN_PROCESS = 4;

  public StatusValue() {
    super(928);
  }

  public StatusValue(Integer data) {
    super(928, data);
  }

  public StatusValue(int data) {
    super(928, data);
  }
}
