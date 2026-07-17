/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SettlSubMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2579;

  public static final int SHARES = 1;

  public static final int DERIVATIVES = 2;

  public static final int PAYMENT_VS_PAYMENT = 3;

  public static final int NOTIONAL = 4;

  public static final int CASCADE = 5;

  public static final int REPURCHASE = 6;

  public static final int OTHER = 99;

  public SettlSubMethod() {
    super(2579);
  }

  public SettlSubMethod(Integer data) {
    super(2579, data);
  }

  public SettlSubMethod(int data) {
    super(2579, data);
  }
}
