/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class Seniority extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1450;

  public static final String SENIOR_SECURED = "SD";

  public static final String SENIOR = "SR";

  public static final String SUBORDINATED = "SB";

  public static final String JUNIOR = "JR";

  public static final String MEZZANINE = "MZ";

  public static final String SENIOR_NON_PREFERRED = "SN";

  public Seniority() {
    super(1450);
  }

  public Seniority(String data) {
    super(1450, data);
  }
}
