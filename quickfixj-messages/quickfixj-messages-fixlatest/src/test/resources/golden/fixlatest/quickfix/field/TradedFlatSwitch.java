/* Generated Java Source File */
package quickfix.field;
import quickfix.BooleanField;

public class TradedFlatSwitch extends BooleanField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 258;

  public static final boolean NOT_TRADED_FLAT = false;

  public static final boolean TRADED_FLAT = true;

  public TradedFlatSwitch() {
    super(258);
  }

  public TradedFlatSwitch(Boolean data) {
    super(258, data);
  }

  public TradedFlatSwitch(boolean data) {
    super(258, data);
  }
}
