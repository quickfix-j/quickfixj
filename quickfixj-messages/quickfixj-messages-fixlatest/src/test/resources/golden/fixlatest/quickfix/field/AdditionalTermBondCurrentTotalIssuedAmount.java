/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AdditionalTermBondCurrentTotalIssuedAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40015;

  public AdditionalTermBondCurrentTotalIssuedAmount() {
    super(40015);
  }

  public AdditionalTermBondCurrentTotalIssuedAmount(BigDecimal data) {
    super(40015, data);
  }

  public AdditionalTermBondCurrentTotalIssuedAmount(double data) {
    super(40015, BigDecimal.valueOf(data));
  }
}
