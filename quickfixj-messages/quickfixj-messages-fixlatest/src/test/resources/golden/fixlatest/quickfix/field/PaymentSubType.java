/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PaymentSubType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40993;

  public static final int INITIAL = 0;

  public static final int INTERMEDIATE = 1;

  public static final int FINAL = 2;

  public static final int PREPAID = 3;

  public static final int POSTPAID = 4;

  public static final int VARIABLE = 5;

  public static final int FIXED = 6;

  public static final int SWAP = 7;

  public static final int CONDITIONAL = 8;

  public static final int FIXED_RATE = 9;

  public static final int FLOATING_RATE = 10;

  public PaymentSubType() {
    super(40993);
  }

  public PaymentSubType(Integer data) {
    super(40993, data);
  }

  public PaymentSubType(int data) {
    super(40993, data);
  }
}
