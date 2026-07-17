/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegTerminationType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2514;

  public static final int OVERNIGHT = 1;

  public static final int TERM = 2;

  public static final int FLEXIBLE = 3;

  public static final int OPEN = 4;

  public LegTerminationType() {
    super(2514);
  }

  public LegTerminationType(Integer data) {
    super(2514, data);
  }

  public LegTerminationType(int data) {
    super(2514, data);
  }
}
