/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PriceLimitType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1306;

  public static final int PRICE = 0;

  public static final int TICKS = 1;

  public static final int PERCENTAGE = 2;

  public PriceLimitType() {
    super(1306);
  }

  public PriceLimitType(Integer data) {
    super(1306, data);
  }

  public PriceLimitType(int data) {
    super(1306, data);
  }
}
