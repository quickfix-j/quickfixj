/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegBenchmarkPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 679;

  public LegBenchmarkPrice() {
    super(679);
  }

  public LegBenchmarkPrice(BigDecimal data) {
    super(679, data);
  }

  public LegBenchmarkPrice(double data) {
    super(679, BigDecimal.valueOf(data));
  }
}
