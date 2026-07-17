/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SideAvgPxIndicator extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1853;

  public static final int NO_AVG_PRICING = 0;

  public static final int TRADE_IS_PART_AVG_PRICE_GRP = 1;

  public static final int LAST_TRADE_IS_PART_AVG_PRICE_GRP = 2;

  public SideAvgPxIndicator() {
    super(1853);
  }

  public SideAvgPxIndicator(Integer data) {
    super(1853, data);
  }

  public SideAvgPxIndicator(int data) {
    super(1853, data);
  }
}
