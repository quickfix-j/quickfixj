/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ComplexEventPeriodType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41011;

  public static final int ASIAN_OUT = 0;

  public static final int ASIAN_IN = 1;

  public static final int BARRIER_CAP = 2;

  public static final int BARRIER_FLOOR = 3;

  public static final int KNOCK_OUT = 4;

  public static final int KNOCK_IN = 5;

  public ComplexEventPeriodType() {
    super(41011);
  }

  public ComplexEventPeriodType(Integer data) {
    super(41011, data);
  }

  public ComplexEventPeriodType(int data) {
    super(41011, data);
  }
}
