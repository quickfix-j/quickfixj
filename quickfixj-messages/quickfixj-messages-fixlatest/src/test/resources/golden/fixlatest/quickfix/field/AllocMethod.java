/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AllocMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1002;

  public static final int AUTOMATIC = 1;

  public static final int GUARANTOR = 2;

  public static final int MANUAL = 3;

  public static final int BROKER_ASSIGNED = 4;

  public AllocMethod() {
    super(1002);
  }

  public AllocMethod(Integer data) {
    super(1002, data);
  }

  public AllocMethod(int data) {
    super(1002, data);
  }
}
