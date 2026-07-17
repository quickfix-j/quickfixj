/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class TotalIssuedAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1947;

  public TotalIssuedAmount() {
    super(1947);
  }

  public TotalIssuedAmount(BigDecimal data) {
    super(1947, data);
  }

  public TotalIssuedAmount(double data) {
    super(1947, BigDecimal.valueOf(data));
  }
}
