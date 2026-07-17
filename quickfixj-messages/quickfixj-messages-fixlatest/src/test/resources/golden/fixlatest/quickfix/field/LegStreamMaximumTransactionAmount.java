/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegStreamMaximumTransactionAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41554;

  public LegStreamMaximumTransactionAmount() {
    super(41554);
  }

  public LegStreamMaximumTransactionAmount(BigDecimal data) {
    super(41554, data);
  }

  public LegStreamMaximumTransactionAmount(double data) {
    super(41554, BigDecimal.valueOf(data));
  }
}
