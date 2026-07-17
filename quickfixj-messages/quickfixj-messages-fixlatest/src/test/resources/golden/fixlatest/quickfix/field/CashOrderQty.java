/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CashOrderQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 152;

  public CashOrderQty() {
    super(152);
  }

  public CashOrderQty(BigDecimal data) {
    super(152, data);
  }

  public CashOrderQty(double data) {
    super(152, BigDecimal.valueOf(data));
  }
}
