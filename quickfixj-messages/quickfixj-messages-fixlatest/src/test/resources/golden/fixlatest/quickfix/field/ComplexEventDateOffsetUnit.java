/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class ComplexEventDateOffsetUnit extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41023;

  public static final String DAY = "D";

  public static final String WEEK = "Wk";

  public static final String MONTH = "Mo";

  public static final String YEAR = "Yr";

  public ComplexEventDateOffsetUnit() {
    super(41023);
  }

  public ComplexEventDateOffsetUnit(String data) {
    super(41023, data);
  }
}
