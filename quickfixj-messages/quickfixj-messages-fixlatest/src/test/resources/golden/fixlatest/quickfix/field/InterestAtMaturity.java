/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class InterestAtMaturity extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 738;

  public InterestAtMaturity() {
    super(738);
  }

  public InterestAtMaturity(BigDecimal data) {
    super(738, data);
  }

  public InterestAtMaturity(double data) {
    super(738, BigDecimal.valueOf(data));
  }
}
