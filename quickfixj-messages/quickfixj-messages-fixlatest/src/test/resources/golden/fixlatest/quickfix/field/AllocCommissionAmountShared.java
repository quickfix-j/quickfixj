/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AllocCommissionAmountShared extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2662;

  public AllocCommissionAmountShared() {
    super(2662);
  }

  public AllocCommissionAmountShared(BigDecimal data) {
    super(2662, data);
  }

  public AllocCommissionAmountShared(double data) {
    super(2662, BigDecimal.valueOf(data));
  }
}
