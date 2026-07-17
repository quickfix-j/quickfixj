/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AllocCommissionAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2654;

  public AllocCommissionAmount() {
    super(2654);
  }

  public AllocCommissionAmount(BigDecimal data) {
    super(2654, data);
  }

  public AllocCommissionAmount(double data) {
    super(2654, BigDecimal.valueOf(data));
  }
}
