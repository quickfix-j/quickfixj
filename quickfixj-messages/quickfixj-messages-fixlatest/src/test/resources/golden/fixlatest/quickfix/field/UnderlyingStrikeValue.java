/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingStrikeValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2022;

  public UnderlyingStrikeValue() {
    super(2022);
  }

  public UnderlyingStrikeValue(BigDecimal data) {
    super(2022, data);
  }

  public UnderlyingStrikeValue(double data) {
    super(2022, BigDecimal.valueOf(data));
  }
}
