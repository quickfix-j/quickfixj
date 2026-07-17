/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LockedQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1808;

  public LockedQty() {
    super(1808);
  }

  public LockedQty(BigDecimal data) {
    super(1808, data);
  }

  public LockedQty(double data) {
    super(1808, BigDecimal.valueOf(data));
  }
}
