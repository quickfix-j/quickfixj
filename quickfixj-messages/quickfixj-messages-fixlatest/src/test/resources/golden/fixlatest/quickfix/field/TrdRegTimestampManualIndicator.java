/* Generated Java Source File */
package quickfix.field;
import quickfix.BooleanField;

public class TrdRegTimestampManualIndicator extends BooleanField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2839;

  public static final boolean NOT_MANUALLY_CAPTURED = false;

  public static final boolean MANUALLY_CAPTURED = true;

  public TrdRegTimestampManualIndicator() {
    super(2839);
  }

  public TrdRegTimestampManualIndicator(Boolean data) {
    super(2839, data);
  }

  public TrdRegTimestampManualIndicator(boolean data) {
    super(2839, data);
  }
}
