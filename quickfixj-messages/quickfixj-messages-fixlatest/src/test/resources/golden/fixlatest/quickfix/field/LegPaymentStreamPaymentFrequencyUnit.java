/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class LegPaymentStreamPaymentFrequencyUnit extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40295;

  public static final String DAY = "D";

  public static final String WEEK = "Wk";

  public static final String MONTH = "Mo";

  public static final String YEAR = "Yr";

  public static final String TERM = "T";

  public LegPaymentStreamPaymentFrequencyUnit() {
    super(40295);
  }

  public LegPaymentStreamPaymentFrequencyUnit(String data) {
    super(40295, data);
  }
}
