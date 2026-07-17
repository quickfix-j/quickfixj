/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradeAggregationRejectReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2791;

  public static final int UNKNOWN_ORDERS = 0;

  public static final int UNKNOWN_EXECUTION_FILLS = 1;

  public static final int OTHER = 99;

  public TradeAggregationRejectReason() {
    super(2791);
  }

  public TradeAggregationRejectReason(Integer data) {
    super(2791, data);
  }

  public TradeAggregationRejectReason(int data) {
    super(2791, data);
  }
}
