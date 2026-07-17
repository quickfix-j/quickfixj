/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class RelativeValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2531;

  public RelativeValue() {
    super(2531);
  }

  public RelativeValue(BigDecimal data) {
    super(2531, data);
  }

  public RelativeValue(double data) {
    super(2531, BigDecimal.valueOf(data));
  }
}
