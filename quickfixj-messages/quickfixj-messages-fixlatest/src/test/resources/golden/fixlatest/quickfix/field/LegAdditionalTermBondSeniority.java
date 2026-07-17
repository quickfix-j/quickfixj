/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class LegAdditionalTermBondSeniority extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41326;

  public static final String SENIOR_SECURED = "SD";

  public static final String SENIOR = "SR";

  public static final String SUBORDINATED = "SB";

  public static final String JUNIOR = "JR";

  public static final String MEZZANINE = "MZ";

  public static final String SENIOR_NON_PREFERRED = "SN";

  public LegAdditionalTermBondSeniority() {
    super(41326);
  }

  public LegAdditionalTermBondSeniority(String data) {
    super(41326, data);
  }
}
