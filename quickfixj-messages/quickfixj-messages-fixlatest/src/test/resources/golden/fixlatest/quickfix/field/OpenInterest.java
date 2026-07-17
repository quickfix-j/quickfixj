/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class OpenInterest extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 746;

  public OpenInterest() {
    super(746);
  }

  public OpenInterest(BigDecimal data) {
    super(746, data);
  }

  public OpenInterest(double data) {
    super(746, BigDecimal.valueOf(data));
  }
}
