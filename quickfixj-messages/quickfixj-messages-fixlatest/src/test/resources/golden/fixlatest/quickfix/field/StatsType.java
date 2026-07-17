/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class StatsType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1176;

  public static final int EXCHANGE_LAST = 1;

  public static final int HIGH = 2;

  public static final int AVERAGE_PRICE = 3;

  public static final int TURNOVER = 4;

  public StatsType() {
    super(1176);
  }

  public StatsType(Integer data) {
    super(1176, data);
  }

  public StatsType(int data) {
    super(1176, data);
  }
}
