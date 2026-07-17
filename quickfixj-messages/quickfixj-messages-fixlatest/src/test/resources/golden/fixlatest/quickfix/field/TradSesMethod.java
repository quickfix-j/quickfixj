/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradSesMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 338;

  public static final int ELECTRONIC = 1;

  public static final int OPEN_OUTCRY = 2;

  public static final int TWO_PARTY = 3;

  public static final int VOICE = 4;

  public TradSesMethod() {
    super(338);
  }

  public TradSesMethod(Integer data) {
    super(338, data);
  }

  public TradSesMethod(int data) {
    super(338, data);
  }
}
