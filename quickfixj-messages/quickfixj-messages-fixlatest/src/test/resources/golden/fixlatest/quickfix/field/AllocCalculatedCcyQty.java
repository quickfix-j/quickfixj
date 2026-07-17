/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AllocCalculatedCcyQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2515;

  public AllocCalculatedCcyQty() {
    super(2515);
  }

  public AllocCalculatedCcyQty(BigDecimal data) {
    super(2515, data);
  }

  public AllocCalculatedCcyQty(double data) {
    super(2515, BigDecimal.valueOf(data));
  }
}
