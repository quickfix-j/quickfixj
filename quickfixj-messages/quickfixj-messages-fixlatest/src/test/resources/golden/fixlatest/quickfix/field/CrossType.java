/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class CrossType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 549;

  public static final int CROSS_AON = 1;

  public static final int CROSS_IOC = 2;

  public static final int CROSS_ONE_SIDE = 3;

  public static final int CROSS_SAME_PRICE = 4;

  public static final int BASIS_CROSS = 5;

  public static final int CONTINGENT_CROSS = 6;

  public static final int VWAPCROSS = 7;

  public static final int STSCROSS = 8;

  public static final int CUSTOMER_TO_CUSTOMER = 9;

  public CrossType() {
    super(549);
  }

  public CrossType(Integer data) {
    super(549, data);
  }

  public CrossType(int data) {
    super(549, data);
  }
}
