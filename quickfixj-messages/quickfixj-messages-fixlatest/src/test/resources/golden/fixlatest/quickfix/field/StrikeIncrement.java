/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class StrikeIncrement extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1204;

  public StrikeIncrement() {
    super(1204);
  }

  public StrikeIncrement(BigDecimal data) {
    super(1204, data);
  }

  public StrikeIncrement(double data) {
    super(1204, BigDecimal.valueOf(data));
  }
}
