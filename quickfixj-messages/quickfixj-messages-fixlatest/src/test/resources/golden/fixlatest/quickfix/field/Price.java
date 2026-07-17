/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class Price extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 44;

  public Price() {
    super(44);
  }

  public Price(BigDecimal data) {
    super(44, data);
  }

  public Price(double data) {
    super(44, BigDecimal.valueOf(data));
  }
}
