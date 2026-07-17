/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class OvernightInterestRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2590;

  public OvernightInterestRate() {
    super(2590);
  }

  public OvernightInterestRate(BigDecimal data) {
    super(2590, data);
  }

  public OvernightInterestRate(double data) {
    super(2590, BigDecimal.valueOf(data));
  }
}
