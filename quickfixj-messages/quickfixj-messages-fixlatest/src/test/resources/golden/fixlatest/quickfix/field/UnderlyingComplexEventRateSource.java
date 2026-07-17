/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingComplexEventRateSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41733;

  public static final int BLOOMBERG = 0;

  public static final int REUTERS = 1;

  public static final int TELERATE = 2;

  public static final int ISDARATE_OPTION = 3;

  public static final int OTHER = 99;

  public UnderlyingComplexEventRateSource() {
    super(41733);
  }

  public UnderlyingComplexEventRateSource(Integer data) {
    super(41733, data);
  }

  public UnderlyingComplexEventRateSource(int data) {
    super(41733, data);
  }
}
