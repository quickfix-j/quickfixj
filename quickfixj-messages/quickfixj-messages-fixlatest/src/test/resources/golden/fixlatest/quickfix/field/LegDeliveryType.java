/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegDeliveryType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2504;

  public static final int VERSUS_PAYMENT = 0;

  public static final int FREE = 1;

  public static final int TRI_PARTY = 2;

  public static final int HOLD_IN_CUSTODY = 3;

  public static final int DELIVER_BY_VALUE = 4;

  public LegDeliveryType() {
    super(2504);
  }

  public LegDeliveryType(Integer data) {
    super(2504, data);
  }

  public LegDeliveryType(int data) {
    super(2504, data);
  }
}
