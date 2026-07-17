/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class StreamTerminationDateOffsetUnit extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40070;

  public static final String DAY = "D";

  public static final String WEEK = "Wk";

  public static final String MONTH = "Mo";

  public static final String YEAR = "Yr";

  public StreamTerminationDateOffsetUnit() {
    super(40070);
  }

  public StreamTerminationDateOffsetUnit(String data) {
    super(40070, data);
  }
}
