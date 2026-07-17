/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegStreamNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40246;

  public LegStreamNotional() {
    super(40246);
  }

  public LegStreamNotional(BigDecimal data) {
    super(40246, data);
  }

  public LegStreamNotional(double data) {
    super(40246, BigDecimal.valueOf(data));
  }
}
