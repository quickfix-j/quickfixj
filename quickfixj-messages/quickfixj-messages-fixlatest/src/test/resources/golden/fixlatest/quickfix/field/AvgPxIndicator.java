/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AvgPxIndicator extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 819;

  public static final int NO_AVERAGE_PRICING = 0;

  public static final int TRADE = 1;

  public static final int LAST_TRADE = 2;

  public static final int NOTIONAL_VALUE_AVERAGE_PX_GROUP_TRADE = 3;

  public static final int AVERAGE_PRICED_TRADE = 4;

  public AvgPxIndicator() {
    super(819);
  }

  public AvgPxIndicator(Integer data) {
    super(819, data);
  }

  public AvgPxIndicator(int data) {
    super(819, data);
  }
}
