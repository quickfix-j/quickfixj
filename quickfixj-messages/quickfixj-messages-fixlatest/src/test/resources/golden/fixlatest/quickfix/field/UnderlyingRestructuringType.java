/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class UnderlyingRestructuringType extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1453;

  public static final String FULL_RESTRUCTURING = "FR";

  public static final String MODIFIED_RESTRUCTURING = "MR";

  public static final String MODIFIED_MOD_RESTRUCTURING = "MM";

  public static final String NO_RESTRUCTURING_SPECIFIED = "XR";

  public UnderlyingRestructuringType() {
    super(1453);
  }

  public UnderlyingRestructuringType(String data) {
    super(1453, data);
  }
}
