/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SideValue2 extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 397;

  public SideValue2() {
    super(397);
  }

  public SideValue2(BigDecimal data) {
    super(397, data);
  }

  public SideValue2(double data) {
    super(397, BigDecimal.valueOf(data));
  }
}
