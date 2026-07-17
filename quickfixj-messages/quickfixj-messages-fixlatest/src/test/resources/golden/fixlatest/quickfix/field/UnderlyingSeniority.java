/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class UnderlyingSeniority extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1454;

  public static final String SENIOR_SECURED = "SD";

  public static final String SENIOR = "SR";

  public static final String SUBORDINATED = "SB";

  public static final String JUNIOR = "JR";

  public static final String MEZZANINE = "MZ";

  public static final String SENIOR_NON_PREFERRED = "SN";

  public UnderlyingSeniority() {
    super(1454);
  }

  public UnderlyingSeniority(String data) {
    super(1454, data);
  }
}
