/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingMakeWholeRecallSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42892;

  public UnderlyingMakeWholeRecallSpread() {
    super(42892);
  }

  public UnderlyingMakeWholeRecallSpread(BigDecimal data) {
    super(42892, data);
  }

  public UnderlyingMakeWholeRecallSpread(double data) {
    super(42892, BigDecimal.valueOf(data));
  }
}
