/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MDStatisticSubScope extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2458;

  public static final int VISIBLE = 1;

  public static final int HIDDEN = 2;

  public static final int INDICATIVE = 3;

  public static final int TRADEABLE = 4;

  public static final int PASSIVE = 5;

  public static final int MARKET_CONSENSUS = 6;

  public static final int POWER = 7;

  public static final int HARDWARE_ERROR = 8;

  public static final int SOFTWARE_ERROR = 9;

  public static final int NETWORK_ERROR = 10;

  public static final int FAILED = 11;

  public static final int EXECUTED = 12;

  public static final int ENTERED = 13;

  public static final int MODIFIED = 14;

  public static final int CANCELLED = 15;

  public static final int MARKET_DATA_ACCESS = 16;

  public static final int TERMINAL_ACCESS = 17;

  public static final int VOLUME = 18;

  public static final int CLEARED = 19;

  public static final int SETTLED = 20;

  public static final int OTHER = 21;

  public static final int MONETARY = 22;

  public static final int NON_MONETARY = 23;

  public static final int GROSS = 24;

  public static final int LARGE_IN_SCALE = 25;

  public static final int NEITHER_HIDDEN_NOR_LARGE_IN_SCALE = 26;

  public static final int CORPORATE_ACTION = 27;

  public static final int VENUE_DECISION = 28;

  public static final int MINIMUM_TIME_PERIOD = 29;

  public static final int OPEN = 30;

  public static final int NOT_EXECUTED = 31;

  public static final int AGGRESSIVE = 32;

  public static final int DIRECTED = 33;

  public MDStatisticSubScope() {
    super(2458);
  }

  public MDStatisticSubScope(Integer data) {
    super(2458, data);
  }

  public MDStatisticSubScope(int data) {
    super(2458, data);
  }
}
