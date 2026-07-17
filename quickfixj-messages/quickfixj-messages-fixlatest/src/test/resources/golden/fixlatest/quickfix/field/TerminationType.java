/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TerminationType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 788;

  public static final int OVERNIGHT = 1;

  public static final int TERM = 2;

  public static final int FLEXIBLE = 3;

  public static final int OPEN = 4;

  public TerminationType() {
    super(788);
  }

  public TerminationType(Integer data) {
    super(788, data);
  }

  public TerminationType(int data) {
    super(788, data);
  }
}
