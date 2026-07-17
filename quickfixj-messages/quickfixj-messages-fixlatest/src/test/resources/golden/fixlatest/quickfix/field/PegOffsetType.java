/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PegOffsetType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 836;

  public static final int PRICE = 0;

  public static final int BASIS_POINTS = 1;

  public static final int TICKS = 2;

  public static final int PRICE_TIER = 3;

  public static final int PERCENTAGE = 4;

  public PegOffsetType() {
    super(836);
  }

  public PegOffsetType(Integer data) {
    super(836, data);
  }

  public PegOffsetType(int data) {
    super(836, data);
  }
}
