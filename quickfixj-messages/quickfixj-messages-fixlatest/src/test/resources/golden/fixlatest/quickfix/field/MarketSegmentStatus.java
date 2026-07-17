/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MarketSegmentStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2542;

  public static final int ACTIVE = 1;

  public static final int INACTIVE = 2;

  public static final int PUBLISHED = 3;

  public MarketSegmentStatus() {
    super(2542);
  }

  public MarketSegmentStatus(Integer data) {
    super(2542, data);
  }

  public MarketSegmentStatus(int data) {
    super(2542, data);
  }
}
