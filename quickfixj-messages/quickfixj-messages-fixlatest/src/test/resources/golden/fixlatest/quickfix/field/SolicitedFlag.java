/* Generated Java Source File */
package quickfix.field;
import quickfix.BooleanField;

public class SolicitedFlag extends BooleanField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 377;

  public static final boolean WAS_NOT_SOLICITED = false;

  public static final boolean WAS_SOLICITED = true;

  public SolicitedFlag() {
    super(377);
  }

  public SolicitedFlag(Boolean data) {
    super(377, data);
  }

  public SolicitedFlag(boolean data) {
    super(377, data);
  }
}
