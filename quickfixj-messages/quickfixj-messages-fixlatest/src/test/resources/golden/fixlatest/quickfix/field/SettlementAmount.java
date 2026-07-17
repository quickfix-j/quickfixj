/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SettlementAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1701;

  public SettlementAmount() {
    super(1701);
  }

  public SettlementAmount(BigDecimal data) {
    super(1701, data);
  }

  public SettlementAmount(double data) {
    super(1701, BigDecimal.valueOf(data));
  }
}
