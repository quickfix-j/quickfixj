/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegComplexEventRateSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41383;

  public static final int BLOOMBERG = 0;

  public static final int REUTERS = 1;

  public static final int TELERATE = 2;

  public static final int ISDARATE_OPTION = 3;

  public static final int OTHER = 99;

  public LegComplexEventRateSource() {
    super(41383);
  }

  public LegComplexEventRateSource(Integer data) {
    super(41383, data);
  }

  public LegComplexEventRateSource(int data) {
    super(41383, data);
  }
}
