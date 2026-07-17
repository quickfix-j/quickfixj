/* Generated Java Source File */
package quickfix.field;
import quickfix.BooleanField;

public class LegalConfirm extends BooleanField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 650;

  public static final boolean DOES_NOT_CONSITUTE_ALEGAL_CONFIRM = false;

  public static final boolean LEGAL_CONFIRM = true;

  public LegalConfirm() {
    super(650);
  }

  public LegalConfirm(Boolean data) {
    super(650, data);
  }

  public LegalConfirm(boolean data) {
    super(650, data);
  }
}
