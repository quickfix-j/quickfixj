/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class InitialDisplayQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1608;

  public InitialDisplayQty() {
    super(1608);
  }

  public InitialDisplayQty(BigDecimal data) {
    super(1608, data);
  }

  public InitialDisplayQty(double data) {
    super(1608, BigDecimal.valueOf(data));
  }
}
