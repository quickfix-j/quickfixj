/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SideValue1 extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 396;

  public SideValue1() {
    super(396);
  }

  public SideValue1(BigDecimal data) {
    super(396, data);
  }

  public SideValue1(double data) {
    super(396, BigDecimal.valueOf(data));
  }
}
