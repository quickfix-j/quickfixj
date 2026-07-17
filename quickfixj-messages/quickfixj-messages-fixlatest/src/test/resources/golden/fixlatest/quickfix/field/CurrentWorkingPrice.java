/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CurrentWorkingPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2838;

  public CurrentWorkingPrice() {
    super(2838);
  }

  public CurrentWorkingPrice(BigDecimal data) {
    super(2838, data);
  }

  public CurrentWorkingPrice(double data) {
    super(2838, BigDecimal.valueOf(data));
  }
}
