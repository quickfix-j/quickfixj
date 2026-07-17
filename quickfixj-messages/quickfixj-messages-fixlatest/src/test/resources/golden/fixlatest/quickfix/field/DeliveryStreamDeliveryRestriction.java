/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class DeliveryStreamDeliveryRestriction extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41063;

  public static final int FIRM = 1;

  public static final int NON_FIRM = 2;

  public static final int FORCE_MAJEURE = 3;

  public static final int SYSTEM_FIRM = 4;

  public static final int UNIT_FIRM = 5;

  public DeliveryStreamDeliveryRestriction() {
    super(41063);
  }

  public DeliveryStreamDeliveryRestriction(Integer data) {
    super(41063, data);
  }

  public DeliveryStreamDeliveryRestriction(int data) {
    super(41063, data);
  }
}
