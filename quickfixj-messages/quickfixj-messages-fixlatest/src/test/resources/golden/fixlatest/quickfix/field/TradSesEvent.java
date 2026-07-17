/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradSesEvent extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1368;

  public static final int TRADING_RESUMES = 0;

  public static final int CHANGE_OF_TRADING_SESSION = 1;

  public static final int CHANGE_OF_TRADING_SUBSESSION = 2;

  public static final int CHANGE_OF_TRADING_STATUS = 3;

  public TradSesEvent() {
    super(1368);
  }

  public TradSesEvent(Integer data) {
    super(1368, data);
  }

  public TradSesEvent(int data) {
    super(1368, data);
  }
}
