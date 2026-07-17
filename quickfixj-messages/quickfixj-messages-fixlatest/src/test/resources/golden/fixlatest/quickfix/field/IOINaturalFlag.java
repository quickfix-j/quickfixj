/* Generated Java Source File */
package quickfix.field;
import quickfix.BooleanField;

public class IOINaturalFlag extends BooleanField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 130;

  public static final boolean NOT_NATURAL = false;

  public static final boolean NATURAL = true;

  public IOINaturalFlag() {
    super(130);
  }

  public IOINaturalFlag(Boolean data) {
    super(130, data);
  }

  public IOINaturalFlag(boolean data) {
    super(130, data);
  }
}
