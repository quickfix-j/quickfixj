/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class BenchmarkPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 662;

  public BenchmarkPrice() {
    super(662);
  }

  public BenchmarkPrice(BigDecimal data) {
    super(662, data);
  }

  public BenchmarkPrice(double data) {
    super(662, BigDecimal.valueOf(data));
  }
}
