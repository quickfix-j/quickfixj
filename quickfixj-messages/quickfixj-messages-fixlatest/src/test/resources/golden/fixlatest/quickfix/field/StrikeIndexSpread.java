/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class StrikeIndexSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2001;

  public StrikeIndexSpread() {
    super(2001);
  }

  public StrikeIndexSpread(BigDecimal data) {
    super(2001, data);
  }

  public StrikeIndexSpread(double data) {
    super(2001, BigDecimal.valueOf(data));
  }
}
