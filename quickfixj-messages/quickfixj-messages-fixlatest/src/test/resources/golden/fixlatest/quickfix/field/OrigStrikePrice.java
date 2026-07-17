/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class OrigStrikePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2578;

  public OrigStrikePrice() {
    super(2578);
  }

  public OrigStrikePrice(BigDecimal data) {
    super(2578, data);
  }

  public OrigStrikePrice(double data) {
    super(2578, BigDecimal.valueOf(data));
  }
}
