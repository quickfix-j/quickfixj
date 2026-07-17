/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class RefreshQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1088;

  public RefreshQty() {
    super(1088);
  }

  public RefreshQty(BigDecimal data) {
    super(1088, data);
  }

  public RefreshQty(double data) {
    super(1088, BigDecimal.valueOf(data));
  }
}
