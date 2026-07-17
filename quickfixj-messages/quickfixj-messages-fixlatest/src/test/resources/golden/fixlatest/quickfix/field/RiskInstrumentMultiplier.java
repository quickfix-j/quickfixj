/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class RiskInstrumentMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1558;

  public RiskInstrumentMultiplier() {
    super(1558);
  }

  public RiskInstrumentMultiplier(BigDecimal data) {
    super(1558, data);
  }

  public RiskInstrumentMultiplier(double data) {
    super(1558, BigDecimal.valueOf(data));
  }
}
