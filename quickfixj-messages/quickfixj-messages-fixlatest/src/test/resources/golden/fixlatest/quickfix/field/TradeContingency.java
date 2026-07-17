/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradeContingency extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2387;

  public static final int DOES_NOT_APPLY = 0;

  public static final int CONTINGENT_TRADE = 1;

  public static final int NON_CONTINGENT_TRADE = 2;

  public TradeContingency() {
    super(2387);
  }

  public TradeContingency(Integer data) {
    super(2387, data);
  }

  public TradeContingency(int data) {
    super(2387, data);
  }
}
