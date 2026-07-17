/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SecurityClassificationReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1583;

  public static final int FEE = 0;

  public static final int CREDIT_CONTROLS = 1;

  public static final int MARGIN = 2;

  public static final int ENTITLEMENT_OR_ELIGIBILITY = 3;

  public static final int MARKET_DATA = 4;

  public static final int ACCOUNT_SELECTION = 5;

  public static final int DELIVERY_PROCESS = 6;

  public static final int SECTOR = 7;

  public SecurityClassificationReason() {
    super(1583);
  }

  public SecurityClassificationReason(Integer data) {
    super(1583, data);
  }

  public SecurityClassificationReason(int data) {
    super(1583, data);
  }
}
