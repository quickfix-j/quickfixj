/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegAdditionalTermBondCurrentTotalIssuedAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41331;

  public LegAdditionalTermBondCurrentTotalIssuedAmount() {
    super(41331);
  }

  public LegAdditionalTermBondCurrentTotalIssuedAmount(BigDecimal data) {
    super(41331, data);
  }

  public LegAdditionalTermBondCurrentTotalIssuedAmount(double data) {
    super(41331, BigDecimal.valueOf(data));
  }
}
