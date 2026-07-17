/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PositionContingentPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1595;

  public PositionContingentPrice() {
    super(1595);
  }

  public PositionContingentPrice(BigDecimal data) {
    super(1595, data);
  }

  public PositionContingentPrice(double data) {
    super(1595, BigDecimal.valueOf(data));
  }
}
