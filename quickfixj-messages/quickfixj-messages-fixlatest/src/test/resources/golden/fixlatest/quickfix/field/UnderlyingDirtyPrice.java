/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingDirtyPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 882;

  public UnderlyingDirtyPrice() {
    super(882);
  }

  public UnderlyingDirtyPrice(BigDecimal data) {
    super(882, data);
  }

  public UnderlyingDirtyPrice(double data) {
    super(882, BigDecimal.valueOf(data));
  }
}
