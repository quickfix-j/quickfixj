/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MatchIncrement extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1089;

  public MatchIncrement() {
    super(1089);
  }

  public MatchIncrement(BigDecimal data) {
    super(1089, data);
  }

  public MatchIncrement(double data) {
    super(1089, BigDecimal.valueOf(data));
  }
}
