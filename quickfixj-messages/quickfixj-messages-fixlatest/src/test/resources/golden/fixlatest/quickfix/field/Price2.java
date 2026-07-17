/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class Price2 extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 640;

  public Price2() {
    super(640);
  }

  public Price2(BigDecimal data) {
    super(640, data);
  }

  public Price2(double data) {
    super(640, BigDecimal.valueOf(data));
  }
}
