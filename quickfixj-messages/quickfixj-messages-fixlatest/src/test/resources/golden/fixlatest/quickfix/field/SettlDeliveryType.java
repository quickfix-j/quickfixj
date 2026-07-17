/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SettlDeliveryType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 172;

  public static final int VERSUS = 0;

  public static final int FREE = 1;

  public static final int TRI_PARTY = 2;

  public static final int HOLD_IN_CUSTODY = 3;

  public SettlDeliveryType() {
    super(172);
  }

  public SettlDeliveryType(Integer data) {
    super(172, data);
  }

  public SettlDeliveryType(int data) {
    super(172, data);
  }
}
