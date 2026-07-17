/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class ProvisionDateTenorUnit extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40097;

  public static final String DAY = "D";

  public static final String WEEK = "Wk";

  public static final String MONTH = "Mo";

  public static final String YEAR = "Yr";

  public ProvisionDateTenorUnit() {
    super(40097);
  }

  public ProvisionDateTenorUnit(String data) {
    super(40097, data);
  }
}
