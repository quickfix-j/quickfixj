/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AllocAvgPxIndicator extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2769;

  public static final int NO_AVERAGE_PRICING = 0;

  public static final int TRADE = 1;

  public static final int LAST_TRADE = 2;

  public static final int NOTIONAL_VALUE_AVERAGE_PX_GROUP_TRADE = 3;

  public static final int AVERAGE_PRICED_TRADE = 4;

  public AllocAvgPxIndicator() {
    super(2769);
  }

  public AllocAvgPxIndicator(Integer data) {
    super(2769, data);
  }

  public AllocAvgPxIndicator(int data) {
    super(2769, data);
  }
}
