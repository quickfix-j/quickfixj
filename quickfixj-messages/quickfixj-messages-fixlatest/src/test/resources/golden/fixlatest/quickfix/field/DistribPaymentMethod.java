/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class DistribPaymentMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 477;

  public static final int CREST = 1;

  public static final int NSCC = 2;

  public static final int EUROCLEAR = 3;

  public static final int CLEARSTREAM = 4;

  public static final int CHEQUE = 5;

  public static final int TELEGRAPHIC_TRANSFER = 6;

  public static final int FED_WIRE = 7;

  public static final int DIRECT_CREDIT = 8;

  public static final int ACHCREDIT = 9;

  public static final int BPAY = 10;

  public static final int HIGH_VALUE_CLEARING_SYSTEM_HVACS = 11;

  public static final int REINVEST_IN_FUND = 12;

  public DistribPaymentMethod() {
    super(477);
  }

  public DistribPaymentMethod(Integer data) {
    super(477, data);
  }

  public DistribPaymentMethod(int data) {
    super(477, data);
  }
}
