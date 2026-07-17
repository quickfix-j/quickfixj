/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegPaymentStreamCompoundingMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40288;

  public static final int NONE = 0;

  public static final int FLAT = 1;

  public static final int STRAIGHT = 2;

  public static final int SPREAD_EXCLUSIVE = 3;

  public LegPaymentStreamCompoundingMethod() {
    super(40288);
  }

  public LegPaymentStreamCompoundingMethod(Integer data) {
    super(40288, data);
  }

  public LegPaymentStreamCompoundingMethod(int data) {
    super(40288, data);
  }
}
