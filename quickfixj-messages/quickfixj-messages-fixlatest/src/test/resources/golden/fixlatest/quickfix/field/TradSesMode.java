/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradSesMode extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 339;

  public static final int TESTING = 1;

  public static final int SIMULATED = 2;

  public static final int PRODUCTION = 3;

  public TradSesMode() {
    super(339);
  }

  public TradSesMode(Integer data) {
    super(339, data);
  }

  public TradSesMode(int data) {
    super(339, data);
  }
}
