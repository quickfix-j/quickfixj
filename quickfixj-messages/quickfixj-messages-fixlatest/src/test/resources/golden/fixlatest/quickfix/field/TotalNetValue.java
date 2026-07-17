/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class TotalNetValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 900;

  public TotalNetValue() {
    super(900);
  }

  public TotalNetValue(BigDecimal data) {
    super(900, data);
  }

  public TotalNetValue(double data) {
    super(900, BigDecimal.valueOf(data));
  }
}
