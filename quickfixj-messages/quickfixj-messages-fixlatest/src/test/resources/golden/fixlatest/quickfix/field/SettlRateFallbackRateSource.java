/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SettlRateFallbackRateSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40373;

  public static final int BLOOMBERG = 0;

  public static final int REUTERS = 1;

  public static final int TELERATE = 2;

  public static final int ISDARATE_OPTION = 3;

  public static final int OTHER = 99;

  public SettlRateFallbackRateSource() {
    super(40373);
  }

  public SettlRateFallbackRateSource(Integer data) {
    super(40373, data);
  }

  public SettlRateFallbackRateSource(int data) {
    super(40373, data);
  }
}
