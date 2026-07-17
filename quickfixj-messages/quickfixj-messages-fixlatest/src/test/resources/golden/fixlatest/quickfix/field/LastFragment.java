/* Generated Java Source File */
package quickfix.field;
import quickfix.BooleanField;

public class LastFragment extends BooleanField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 893;

  public static final boolean NOT_LAST_MESSAGE = false;

  public static final boolean LAST_MESSAGE = true;

  public LastFragment() {
    super(893);
  }

  public LastFragment(Boolean data) {
    super(893, data);
  }

  public LastFragment(boolean data) {
    super(893, data);
  }
}
