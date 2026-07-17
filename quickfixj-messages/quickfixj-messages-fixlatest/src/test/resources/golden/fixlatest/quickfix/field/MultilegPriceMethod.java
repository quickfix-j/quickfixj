/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MultilegPriceMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1378;

  public static final int NET_PRICE = 0;

  public static final int REVERSED_NET_PRICE = 1;

  public static final int YIELD_DIFFERENCE = 2;

  public static final int INDIVIDUAL = 3;

  public static final int CONTRACT_WEIGHTED_AVERAGE_PRICE = 4;

  public static final int MULTIPLIED_PRICE = 5;

  public MultilegPriceMethod() {
    super(1378);
  }

  public MultilegPriceMethod(Integer data) {
    super(1378, data);
  }

  public MultilegPriceMethod(int data) {
    super(1378, data);
  }
}
