/* Generated Java Source File */
package quickfix.field;
import quickfix.BooleanField;

public class InViewOfCommon extends BooleanField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 328;

  public static final boolean HALT_WAS_NOT_RELATED_TO_AHALT_OF_THE_COMMON_STOCK = false;

  public static final boolean HALT_WAS_DUE_TO_COMMON_STOCK_BEING_HALTED = true;

  public InViewOfCommon() {
    super(328);
  }

  public InViewOfCommon(Boolean data) {
    super(328, data);
  }

  public InViewOfCommon(boolean data) {
    super(328, data);
  }
}
