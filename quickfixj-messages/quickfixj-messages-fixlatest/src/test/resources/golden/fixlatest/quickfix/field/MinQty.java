/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MinQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 110;

  public MinQty() {
    super(110);
  }

  public MinQty(BigDecimal data) {
    super(110, data);
  }

  public MinQty(double data) {
    super(110, BigDecimal.valueOf(data));
  }
}
