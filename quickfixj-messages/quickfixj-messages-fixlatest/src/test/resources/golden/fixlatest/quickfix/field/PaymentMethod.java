/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 492;

  public static final int CREST = 1;

  public static final int NSCC = 2;

  public static final int EUROCLEAR = 3;

  public static final int CLEARSTREAM = 4;

  public static final int CHEQUE = 5;

  public static final int TELEGRAPHIC_TRANSFER = 6;

  public static final int FED_WIRE = 7;

  public static final int DEBIT_CARD = 8;

  public static final int DIRECT_DEBIT = 9;

  public static final int DIRECT_CREDIT = 10;

  public static final int CREDIT_CARD = 11;

  public static final int ACHDEBIT = 12;

  public static final int ACHCREDIT = 13;

  public static final int BPAY = 14;

  public static final int HIGH_VALUE_CLEARING_SYSTEM = 15;

  public static final int CHIPS = 16;

  public static final int SWIFT = 17;

  public static final int CHAPS = 18;

  public static final int SIC = 19;

  public static final int EURO_SIC = 20;

  public PaymentMethod() {
    super(492);
  }

  public PaymentMethod(Integer data) {
    super(492, data);
  }

  public PaymentMethod(int data) {
    super(492, data);
  }
}
