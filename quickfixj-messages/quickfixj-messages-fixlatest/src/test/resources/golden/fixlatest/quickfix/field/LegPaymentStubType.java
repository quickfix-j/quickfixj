/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegPaymentStubType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40419;

  public static final int INITIAL = 0;

  public static final int FINAL = 1;

  public static final int COMPOUNDING_INITIAL = 2;

  public static final int COMPOUNDING_FINAL = 3;

  public LegPaymentStubType() {
    super(40419);
  }

  public LegPaymentStubType(Integer data) {
    super(40419, data);
  }

  public LegPaymentStubType(int data) {
    super(40419, data);
  }
}
