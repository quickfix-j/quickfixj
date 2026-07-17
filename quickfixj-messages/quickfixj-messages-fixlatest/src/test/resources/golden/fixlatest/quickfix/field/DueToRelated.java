/* Generated Java Source File */
package quickfix.field;
import quickfix.BooleanField;

public class DueToRelated extends BooleanField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 329;

  public static final boolean NOT_RELATED_TO_SECURITY_HALT = false;

  public static final boolean RELATED_TO_SECURITY_HALT = true;

  public DueToRelated() {
    super(329);
  }

  public DueToRelated(Boolean data) {
    super(329, data);
  }

  public DueToRelated(boolean data) {
    super(329, data);
  }
}
