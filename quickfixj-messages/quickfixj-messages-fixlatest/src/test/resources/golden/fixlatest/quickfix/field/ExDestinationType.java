/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ExDestinationType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2704;

  public static final int NO_RESTRICTION = 0;

  public static final int TRADED_ONLY_ON_TRADING_VENUE = 1;

  public static final int TRADED_ONLY_ON_SI = 2;

  public static final int TRADED_ON_TRADING_VENUE_OR_SI = 3;

  public ExDestinationType() {
    super(2704);
  }

  public ExDestinationType(Integer data) {
    super(2704, data);
  }

  public ExDestinationType(int data) {
    super(2704, data);
  }
}
