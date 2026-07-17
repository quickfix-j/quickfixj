/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class RoundLot extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 561;

  public RoundLot() {
    super(561);
  }

  public RoundLot(BigDecimal data) {
    super(561, data);
  }

  public RoundLot(double data) {
    super(561, BigDecimal.valueOf(data));
  }
}
