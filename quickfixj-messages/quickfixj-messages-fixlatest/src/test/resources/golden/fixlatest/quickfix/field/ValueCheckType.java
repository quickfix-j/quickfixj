/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ValueCheckType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1869;

  public static final int PRICE_CHECK = 1;

  public static final int NOTIONAL_VALUE_CHECK = 2;

  public static final int QUANTITY_CHECK = 3;

  public ValueCheckType() {
    super(1869);
  }

  public ValueCheckType(Integer data) {
    super(1869, data);
  }

  public ValueCheckType(int data) {
    super(1869, data);
  }
}
