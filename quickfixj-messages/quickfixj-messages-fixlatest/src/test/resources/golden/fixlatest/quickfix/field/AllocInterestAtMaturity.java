/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AllocInterestAtMaturity extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 741;

  public AllocInterestAtMaturity() {
    super(741);
  }

  public AllocInterestAtMaturity(BigDecimal data) {
    super(741, data);
  }

  public AllocInterestAtMaturity(double data) {
    super(741, BigDecimal.valueOf(data));
  }
}
