/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SecondaryDisplayQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1082;

  public SecondaryDisplayQty() {
    super(1082);
  }

  public SecondaryDisplayQty(BigDecimal data) {
    super(1082, data);
  }

  public SecondaryDisplayQty(double data) {
    super(1082, BigDecimal.valueOf(data));
  }
}
