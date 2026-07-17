/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MDEntrySpotRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1026;

  public MDEntrySpotRate() {
    super(1026);
  }

  public MDEntrySpotRate(BigDecimal data) {
    super(1026, data);
  }

  public MDEntrySpotRate(double data) {
    super(1026, BigDecimal.valueOf(data));
  }
}
