/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradePublishIndicator extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1390;

  public static final int DO_NOT_PUBLISH_TRADE = 0;

  public static final int PUBLISH_TRADE = 1;

  public static final int DEFERRED_PUBLICATION = 2;

  public static final int PUBLISHED = 3;

  public TradePublishIndicator() {
    super(1390);
  }

  public TradePublishIndicator(Integer data) {
    super(1390, data);
  }

  public TradePublishIndicator(int data) {
    super(1390, data);
  }
}
