/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SecondaryLockedQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1809;

  public SecondaryLockedQty() {
    super(1809);
  }

  public SecondaryLockedQty(BigDecimal data) {
    super(1809, data);
  }

  public SecondaryLockedQty(double data) {
    super(1809, BigDecimal.valueOf(data));
  }
}
