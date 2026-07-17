/* Generated Java Source File */
package quickfix.field;
import quickfix.BooleanField;

public class LastRptRequested extends BooleanField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 912;

  public static final boolean NOT_LAST_MESSAGE = false;

  public static final boolean LAST_MESSAGE = true;

  public LastRptRequested() {
    super(912);
  }

  public LastRptRequested(Boolean data) {
    super(912, data);
  }

  public LastRptRequested(boolean data) {
    super(912, data);
  }
}
