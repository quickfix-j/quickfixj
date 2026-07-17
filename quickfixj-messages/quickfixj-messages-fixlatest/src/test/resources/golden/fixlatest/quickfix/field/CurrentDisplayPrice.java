/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CurrentDisplayPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2828;

  public CurrentDisplayPrice() {
    super(2828);
  }

  public CurrentDisplayPrice(BigDecimal data) {
    super(2828, data);
  }

  public CurrentDisplayPrice(double data) {
    super(2828, BigDecimal.valueOf(data));
  }
}
