/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MDEntryForwardPoints extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1027;

  public MDEntryForwardPoints() {
    super(1027);
  }

  public MDEntryForwardPoints(BigDecimal data) {
    super(1027, data);
  }

  public MDEntryForwardPoints(double data) {
    super(1027, BigDecimal.valueOf(data));
  }
}
