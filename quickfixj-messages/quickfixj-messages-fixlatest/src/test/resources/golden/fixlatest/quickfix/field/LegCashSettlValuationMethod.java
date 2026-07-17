/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegCashSettlValuationMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41361;

  public static final int MARKET = 0;

  public static final int HIGHEST = 1;

  public static final int AVERAGE_MARKET = 2;

  public static final int AVERAGE_HIGHEST = 3;

  public static final int BLENDED_MARKET = 4;

  public static final int BLENDED_HIGHEST = 5;

  public static final int AVERAGE_BLENDED_MARKET = 6;

  public static final int AVERAGE_BLENDED_HIGHEST = 7;

  public LegCashSettlValuationMethod() {
    super(41361);
  }

  public LegCashSettlValuationMethod(Integer data) {
    super(41361, data);
  }

  public LegCashSettlValuationMethod(int data) {
    super(41361, data);
  }
}
