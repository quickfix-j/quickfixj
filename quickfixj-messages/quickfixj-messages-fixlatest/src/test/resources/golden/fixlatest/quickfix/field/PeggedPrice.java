/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PeggedPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 839;

  public PeggedPrice() {
    super(839);
  }

  public PeggedPrice(BigDecimal data) {
    super(839, data);
  }

  public PeggedPrice(double data) {
    super(839, BigDecimal.valueOf(data));
  }
}
