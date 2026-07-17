/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class StrikePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 202;

  public StrikePrice() {
    super(202);
  }

  public StrikePrice(BigDecimal data) {
    super(202, data);
  }

  public StrikePrice(double data) {
    super(202, BigDecimal.valueOf(data));
  }
}
