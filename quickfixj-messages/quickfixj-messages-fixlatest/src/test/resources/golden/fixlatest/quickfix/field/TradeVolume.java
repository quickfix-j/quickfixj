/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class TradeVolume extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1020;

  public TradeVolume() {
    super(1020);
  }

  public TradeVolume(BigDecimal data) {
    super(1020, data);
  }

  public TradeVolume(double data) {
    super(1020, BigDecimal.valueOf(data));
  }
}
