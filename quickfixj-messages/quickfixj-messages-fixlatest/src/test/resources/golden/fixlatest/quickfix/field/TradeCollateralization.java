/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradeCollateralization extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1936;

  public static final int UNCOLLATERALIZED = 0;

  public static final int PARTIALLY_COLLATERALIZED = 1;

  public static final int ONE_WAY_COLLATERALLIZATION = 2;

  public static final int FULLY_COLLATERALIZED = 3;

  public static final int NET_EXPOSURE = 4;

  public TradeCollateralization() {
    super(1936);
  }

  public TradeCollateralization(Integer data) {
    super(1936, data);
  }

  public TradeCollateralization(int data) {
    super(1936, data);
  }
}
