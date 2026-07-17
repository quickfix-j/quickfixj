/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradSesStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 340;

  public static final int UNKNOWN = 0;

  public static final int HALTED = 1;

  public static final int OPEN = 2;

  public static final int CLOSED = 3;

  public static final int PRE_OPEN = 4;

  public static final int PRE_CLOSE = 5;

  public static final int REQUEST_REJECTED = 6;

  public TradSesStatus() {
    super(340);
  }

  public TradSesStatus(Integer data) {
    super(340, data);
  }

  public TradSesStatus(int data) {
    super(340, data);
  }
}
