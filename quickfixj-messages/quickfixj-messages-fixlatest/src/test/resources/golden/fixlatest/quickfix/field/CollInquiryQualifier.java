/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class CollInquiryQualifier extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 896;

  public static final int TRADE_DATE = 0;

  public static final int GCINSTRUMENT = 1;

  public static final int COLLATERAL_INSTRUMENT = 2;

  public static final int SUBSTITUTION_ELIGIBLE = 3;

  public static final int NOT_ASSIGNED = 4;

  public static final int PARTIALLY_ASSIGNED = 5;

  public static final int FULLY_ASSIGNED = 6;

  public static final int OUTSTANDING_TRADES = 7;

  public CollInquiryQualifier() {
    super(896);
  }

  public CollInquiryQualifier(Integer data) {
    super(896, data);
  }

  public CollInquiryQualifier(int data) {
    super(896, data);
  }
}
