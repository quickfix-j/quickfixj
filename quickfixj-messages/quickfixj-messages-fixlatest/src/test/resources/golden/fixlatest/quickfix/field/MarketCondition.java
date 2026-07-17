/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MarketCondition extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2705;

  public static final int NORMAL = 0;

  public static final int STRESSED = 1;

  public static final int EXCEPTIONAL = 2;

  public MarketCondition() {
    super(2705);
  }

  public MarketCondition(Integer data) {
    super(2705, data);
  }

  public MarketCondition(int data) {
    super(2705, data);
  }
}
