/* Generated Java Source File */
package quickfix.field;
import quickfix.BooleanField;

public class PreviouslyReported extends BooleanField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 570;

  public static final boolean NOT_REPORTED_TO_COUNTERPARTY = false;

  public static final boolean PREVIOUSLY_REPORTED_TO_COUNTERPARTY = true;

  public PreviouslyReported() {
    super(570);
  }

  public PreviouslyReported(Boolean data) {
    super(570, data);
  }

  public PreviouslyReported(boolean data) {
    super(570, data);
  }
}
