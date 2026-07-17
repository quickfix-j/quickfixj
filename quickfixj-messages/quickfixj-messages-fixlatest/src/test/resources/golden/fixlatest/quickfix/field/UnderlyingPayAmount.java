/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingPayAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 985;

  public UnderlyingPayAmount() {
    super(985);
  }

  public UnderlyingPayAmount(BigDecimal data) {
    super(985, data);
  }

  public UnderlyingPayAmount(double data) {
    super(985, BigDecimal.valueOf(data));
  }
}
