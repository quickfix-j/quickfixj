/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ProvisionType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40091;

  public static final int MANDATORY_EARLY_TERMINATION = 0;

  public static final int OPTIONAL_EARLY_TERMINATION = 1;

  public static final int CANCELABLE = 2;

  public static final int EXTENDABLE = 3;

  public static final int MUTUAL_EARLY_TERMINATION = 4;

  public static final int EVERGREEN = 5;

  public static final int CALLABLE = 6;

  public static final int PUTTABLE = 7;

  public ProvisionType() {
    super(40091);
  }

  public ProvisionType(Integer data) {
    super(40091, data);
  }

  public ProvisionType(int data) {
    super(40091, data);
  }
}
