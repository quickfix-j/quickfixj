/* Generated Java Source File */
package quickfix.field;
import quickfix.BooleanField;

public class WorkingIndicator extends BooleanField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 636;

  public static final boolean NOT_WORKING = false;

  public static final boolean WORKING = true;

  public WorkingIndicator() {
    super(636);
  }

  public WorkingIndicator(Boolean data) {
    super(636, data);
  }

  public WorkingIndicator(boolean data) {
    super(636, data);
  }
}
