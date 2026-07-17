/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AllocQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 80;

  public AllocQty() {
    super(80);
  }

  public AllocQty(BigDecimal data) {
    super(80, data);
  }

  public AllocQty(double data) {
    super(80, BigDecimal.valueOf(data));
  }
}
