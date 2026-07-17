/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ComplexEventRateSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41014;

  public static final int BLOOMBERG = 0;

  public static final int REUTERS = 1;

  public static final int TELERATE = 2;

  public static final int ISDARATE_OPTION = 3;

  public static final int OTHER = 99;

  public ComplexEventRateSource() {
    super(41014);
  }

  public ComplexEventRateSource(Integer data) {
    super(41014, data);
  }

  public ComplexEventRateSource(int data) {
    super(41014, data);
  }
}
