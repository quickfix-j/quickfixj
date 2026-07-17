/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class LegRestructuringType extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2149;

  public static final String FULL_RESTRUCTURING = "FR";

  public static final String MODIFIED_RESTRUCTURING = "MR";

  public static final String MODIFIED_MOD_RESTRUCTURING = "MM";

  public static final String NO_RESTRUCTURING_SPECIFIED = "XR";

  public LegRestructuringType() {
    super(2149);
  }

  public LegRestructuringType(String data) {
    super(2149, data);
  }
}
