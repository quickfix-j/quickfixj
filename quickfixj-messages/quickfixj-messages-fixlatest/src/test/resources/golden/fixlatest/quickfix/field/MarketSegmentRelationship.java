/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MarketSegmentRelationship extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2547;

  public static final int MARKET_SEGMENT_POOL_MEMBER = 1;

  public static final int RETAIL_SEGMENT = 2;

  public static final int WHOLESALE_SEGMENT = 3;

  public MarketSegmentRelationship() {
    super(2547);
  }

  public MarketSegmentRelationship(Integer data) {
    super(2547, data);
  }

  public MarketSegmentRelationship(int data) {
    super(2547, data);
  }
}
