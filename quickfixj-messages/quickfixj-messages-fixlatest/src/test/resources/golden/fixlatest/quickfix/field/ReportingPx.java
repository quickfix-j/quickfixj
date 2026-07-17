/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ReportingPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2750;

  public ReportingPx() {
    super(2750);
  }

  public ReportingPx(BigDecimal data) {
    super(2750, data);
  }

  public ReportingPx(double data) {
    super(2750, BigDecimal.valueOf(data));
  }
}
