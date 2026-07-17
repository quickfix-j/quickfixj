/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ReportingQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2751;

  public ReportingQty() {
    super(2751);
  }

  public ReportingQty(BigDecimal data) {
    super(2751, data);
  }

  public ReportingQty(double data) {
    super(2751, BigDecimal.valueOf(data));
  }
}
