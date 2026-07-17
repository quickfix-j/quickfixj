/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class RestructuringType extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1449;

  public static final String FULL_RESTRUCTURING = "FR";

  public static final String MODIFIED_RESTRUCTURING = "MR";

  public static final String MODIFIED_MOD_RESTRUCTURING = "MM";

  public static final String NO_RESTRUCTURING_SPECIFIED = "XR";

  public RestructuringType() {
    super(1449);
  }

  public RestructuringType(String data) {
    super(1449, data);
  }
}
