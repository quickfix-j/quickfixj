/* Generated Java Source File */
package quickfix.field;
import quickfix.BooleanField;

public class OddLot extends BooleanField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 575;

  public static final boolean TREAT_AS_ROUND_LOT = false;

  public static final boolean TREAT_AS_ODD_LOT = true;

  public OddLot() {
    super(575);
  }

  public OddLot(Boolean data) {
    super(575, data);
  }

  public OddLot(boolean data) {
    super(575, data);
  }
}
