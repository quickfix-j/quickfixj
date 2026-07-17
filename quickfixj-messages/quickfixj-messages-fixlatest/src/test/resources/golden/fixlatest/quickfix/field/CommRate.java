/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CommRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1233;

  public CommRate() {
    super(1233);
  }

  public CommRate(BigDecimal data) {
    super(1233, data);
  }

  public CommRate(double data) {
    super(1233, BigDecimal.valueOf(data));
  }
}
