/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class StrikeValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 968;

  public StrikeValue() {
    super(968);
  }

  public StrikeValue(BigDecimal data) {
    super(968, data);
  }

  public StrikeValue(double data) {
    super(968, BigDecimal.valueOf(data));
  }
}
