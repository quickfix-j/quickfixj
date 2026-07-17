/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class Factor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 228;

  public Factor() {
    super(228);
  }

  public Factor(BigDecimal data) {
    super(228, data);
  }

  public Factor(double data) {
    super(228, BigDecimal.valueOf(data));
  }
}
