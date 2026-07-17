/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradeAggregationTransType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2788;

  public static final int NEW = 0;

  public static final int CANCEL = 1;

  public static final int REPLACE = 2;

  public TradeAggregationTransType() {
    super(2788);
  }

  public TradeAggregationTransType(Integer data) {
    super(2788, data);
  }

  public TradeAggregationTransType(int data) {
    super(2788, data);
  }
}
