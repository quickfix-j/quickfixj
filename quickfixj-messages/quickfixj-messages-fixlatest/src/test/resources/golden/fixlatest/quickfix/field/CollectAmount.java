/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CollectAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1711;

  public CollectAmount() {
    super(1711);
  }

  public CollectAmount(BigDecimal data) {
    super(1711, data);
  }

  public CollectAmount(double data) {
    super(1711, BigDecimal.valueOf(data));
  }
}
