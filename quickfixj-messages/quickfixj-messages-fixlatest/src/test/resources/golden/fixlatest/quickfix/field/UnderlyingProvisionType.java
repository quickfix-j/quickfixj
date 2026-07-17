/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingProvisionType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42150;

  public static final int MANDATORY_EARLY_TERMINATION = 0;

  public static final int OPTIONAL_EARLY_TERMINATION = 1;

  public static final int CANCELABLE = 2;

  public static final int EXTENDABLE = 3;

  public static final int MUTUAL_EARLY_TERMINATION = 4;

  public static final int EVERGREEN = 5;

  public static final int CALLABLE = 6;

  public static final int PUTTABLE = 7;

  public UnderlyingProvisionType() {
    super(42150);
  }

  public UnderlyingProvisionType(Integer data) {
    super(42150, data);
  }

  public UnderlyingProvisionType(int data) {
    super(42150, data);
  }
}
