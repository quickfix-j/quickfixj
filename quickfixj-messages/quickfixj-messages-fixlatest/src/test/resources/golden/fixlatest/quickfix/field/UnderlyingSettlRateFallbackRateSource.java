/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingSettlRateFallbackRateSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40904;

  public static final int BLOOMBERG = 0;

  public static final int REUTERS = 1;

  public static final int TELERATE = 2;

  public static final int ISDARATE_OPTION = 3;

  public static final int OTHER = 99;

  public UnderlyingSettlRateFallbackRateSource() {
    super(40904);
  }

  public UnderlyingSettlRateFallbackRateSource(Integer data) {
    super(40904, data);
  }

  public UnderlyingSettlRateFallbackRateSource(int data) {
    super(40904, data);
  }
}
