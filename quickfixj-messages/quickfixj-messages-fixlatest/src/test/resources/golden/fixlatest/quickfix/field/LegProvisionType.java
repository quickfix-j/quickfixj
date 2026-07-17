/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegProvisionType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40449;

  public static final int MANDATORY_EARLY_TERMINATION = 0;

  public static final int OPTIONAL_EARLY_TERMINATION = 1;

  public static final int CANCELABLE = 2;

  public static final int EXTENDABLE = 3;

  public static final int MUTUAL_EARLY_TERMINATION = 4;

  public static final int EVERGREEN = 5;

  public static final int CALLABLE = 6;

  public static final int PUTTABLE = 7;

  public LegProvisionType() {
    super(40449);
  }

  public LegProvisionType(Integer data) {
    super(40449, data);
  }

  public LegProvisionType(int data) {
    super(40449, data);
  }
}
