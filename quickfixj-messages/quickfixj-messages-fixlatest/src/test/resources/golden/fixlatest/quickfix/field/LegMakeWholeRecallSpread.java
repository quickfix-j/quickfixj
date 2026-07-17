/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegMakeWholeRecallSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42396;

  public LegMakeWholeRecallSpread() {
    super(42396);
  }

  public LegMakeWholeRecallSpread(BigDecimal data) {
    super(42396, data);
  }

  public LegMakeWholeRecallSpread(double data) {
    super(42396, BigDecimal.valueOf(data));
  }
}
