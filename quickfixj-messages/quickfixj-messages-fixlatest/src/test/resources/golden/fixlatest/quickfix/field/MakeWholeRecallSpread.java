/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MakeWholeRecallSpread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42595;

  public MakeWholeRecallSpread() {
    super(42595);
  }

  public MakeWholeRecallSpread(BigDecimal data) {
    super(42595, data);
  }

  public MakeWholeRecallSpread(double data) {
    super(42595, BigDecimal.valueOf(data));
  }
}
