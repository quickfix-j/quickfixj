/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ReportedPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 861;

  public ReportedPx() {
    super(861);
  }

  public ReportedPx(BigDecimal data) {
    super(861, data);
  }

  public ReportedPx(double data) {
    super(861, BigDecimal.valueOf(data));
  }
}
