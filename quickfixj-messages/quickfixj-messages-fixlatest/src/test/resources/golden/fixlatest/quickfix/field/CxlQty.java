/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CxlQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 84;

  public CxlQty() {
    super(84);
  }

  public CxlQty(BigDecimal data) {
    super(84, data);
  }

  public CxlQty(double data) {
    super(84, BigDecimal.valueOf(data));
  }
}
