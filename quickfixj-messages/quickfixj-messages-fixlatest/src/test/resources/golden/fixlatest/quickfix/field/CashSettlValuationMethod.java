/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class CashSettlValuationMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40038;

  public static final int MARKET = 0;

  public static final int HIGHEST = 1;

  public static final int AVERAGE_MARKET = 2;

  public static final int AVERAGE_HIGHEST = 3;

  public static final int BLENDED_MARKET = 4;

  public static final int BLENDED_HIGHEST = 5;

  public static final int AVERAGE_BLENDED_MARKET = 6;

  public static final int AVERAGE_BLENDED_HIGHEST = 7;

  public CashSettlValuationMethod() {
    super(40038);
  }

  public CashSettlValuationMethod(Integer data) {
    super(40038, data);
  }

  public CashSettlValuationMethod(int data) {
    super(40038, data);
  }
}
