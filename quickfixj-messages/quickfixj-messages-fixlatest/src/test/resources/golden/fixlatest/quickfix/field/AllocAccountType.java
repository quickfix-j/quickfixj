/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AllocAccountType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 798;

  public static final int CARRIED_CUSTOMER_SIDE = 1;

  public static final int CARRIED_NON_CUSTOMER_SIDE = 2;

  public static final int HOUSE_TRADER = 3;

  public static final int FLOOR_TRADER = 4;

  public static final int CARRIED_NON_CUSTOMER_SIDE_CROSS_MARGINED = 6;

  public static final int HOUSE_TRADER_CROSS_MARGINED = 7;

  public static final int JOINT_BACK_OFFICE_ACCOUNT = 8;

  public AllocAccountType() {
    super(798);
  }

  public AllocAccountType(Integer data) {
    super(798, data);
  }

  public AllocAccountType(int data) {
    super(798, data);
  }
}
