/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PeggedRefPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1095;

  public PeggedRefPrice() {
    super(1095);
  }

  public PeggedRefPrice(BigDecimal data) {
    super(1095, data);
  }

  public PeggedRefPrice(double data) {
    super(1095, BigDecimal.valueOf(data));
  }
}
