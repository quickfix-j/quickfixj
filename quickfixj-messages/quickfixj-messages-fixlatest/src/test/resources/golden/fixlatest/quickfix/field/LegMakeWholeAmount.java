/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegMakeWholeAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42393;

  public LegMakeWholeAmount() {
    super(42393);
  }

  public LegMakeWholeAmount(BigDecimal data) {
    super(42393, data);
  }

  public LegMakeWholeAmount(double data) {
    super(42393, BigDecimal.valueOf(data));
  }
}
