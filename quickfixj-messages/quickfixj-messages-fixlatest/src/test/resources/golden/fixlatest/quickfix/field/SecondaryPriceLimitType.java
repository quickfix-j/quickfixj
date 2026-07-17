/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SecondaryPriceLimitType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1305;

  public static final int PRICE = 0;

  public static final int TICKS = 1;

  public static final int PERCENTAGE = 2;

  public SecondaryPriceLimitType() {
    super(1305);
  }

  public SecondaryPriceLimitType(Integer data) {
    super(1305, data);
  }

  public SecondaryPriceLimitType(int data) {
    super(1305, data);
  }
}
