/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class FillQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1365;

  public FillQty() {
    super(1365);
  }

  public FillQty(BigDecimal data) {
    super(1365, data);
  }

  public FillQty(double data) {
    super(1365, BigDecimal.valueOf(data));
  }
}
