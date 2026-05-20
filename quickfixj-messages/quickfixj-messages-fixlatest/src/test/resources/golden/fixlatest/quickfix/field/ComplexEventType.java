/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ComplexEventType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1484;

  public static final int CAPPED = 1;

  public static final int TRIGGER = 2;

  public static final int KNOCK_IN_UP = 3;

  public static final int KNOCK_IN_DOWN = 4;

  public static final int KNOCK_OUT_UP = 5;

  public static final int KNOCK_OUT_DOWN = 6;

  public static final int UNDERLYING = 7;

  public static final int RESET_BARRIER = 8;

  public static final int ROLLING_BARRIER = 9;

  public static final int ONE_TOUCH = 10;

  public static final int NO_TOUCH = 11;

  public static final int DBL_ONE_TOUCH = 12;

  public static final int DBL_NO_TOUCH = 13;

  public static final int FXCOMPOSITE = 14;

  public static final int FXQUANTO = 15;

  public static final int FXCRSS_CCY = 16;

  public static final int STRK_SPREAD = 17;

  public static final int CLNDR_SPREAD = 18;

  public static final int PX_OBSVTN = 19;

  public static final int PASS_THROUGH = 20;

  public static final int STRK_SCHED = 21;

  public static final int EQUITY_VALUATION = 22;

  public static final int DIVIDEND_VALUATION = 23;

  public ComplexEventType() {
    super(1484);
  }

  public ComplexEventType(Integer data) {
    super(1484, data);
  }

  public ComplexEventType(int data) {
    super(1484, data);
  }
}
