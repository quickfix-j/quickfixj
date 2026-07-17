/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AveragePriceType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2763;

  public static final int TIME_WEIGHTED_AVERAGE_PRICE = 0;

  public static final int VOLUME_WEIGHTED_AVERAGE_PRICE = 1;

  public static final int PERCENT_OF_VOLUME_AVVERAGE_PRICE = 2;

  public static final int LIMIT_ORDER_AVERAGE_PRICE = 3;

  public AveragePriceType() {
    super(2763);
  }

  public AveragePriceType(Integer data) {
    super(2763, data);
  }

  public AveragePriceType(int data) {
    super(2763, data);
  }
}
