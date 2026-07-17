/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ExecMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2405;

  public static final int UNSPECIFIED = 0;

  public static final int MANUAL = 1;

  public static final int AUTOMATED = 2;

  public static final int VOICE_BROKERED = 3;

  public ExecMethod() {
    super(2405);
  }

  public ExecMethod(Integer data) {
    super(2405, data);
  }

  public ExecMethod(int data) {
    super(2405, data);
  }
}
