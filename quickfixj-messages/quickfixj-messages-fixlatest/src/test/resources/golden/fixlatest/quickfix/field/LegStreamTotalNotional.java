/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegStreamTotalNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41707;

  public LegStreamTotalNotional() {
    super(41707);
  }

  public LegStreamTotalNotional(BigDecimal data) {
    super(41707, data);
  }

  public LegStreamTotalNotional(double data) {
    super(41707, BigDecimal.valueOf(data));
  }
}
