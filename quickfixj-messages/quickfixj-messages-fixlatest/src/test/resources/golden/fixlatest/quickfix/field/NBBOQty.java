/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class NBBOQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2833;

  public NBBOQty() {
    super(2833);
  }

  public NBBOQty(BigDecimal data) {
    super(2833, data);
  }

  public NBBOQty(double data) {
    super(2833, BigDecimal.valueOf(data));
  }
}
