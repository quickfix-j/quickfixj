/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MarketSegmentType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2543;

  public static final int POOL = 1;

  public static final int RETAIL = 2;

  public static final int WHOLESALE = 3;

  public MarketSegmentType() {
    super(2543);
  }

  public MarketSegmentType(Integer data) {
    super(2543, data);
  }

  public MarketSegmentType(int data) {
    super(2543, data);
  }
}
