/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class HighLimitPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1149;

  public HighLimitPrice() {
    super(1149);
  }

  public HighLimitPrice(BigDecimal data) {
    super(1149, data);
  }

  public HighLimitPrice(double data) {
    super(1149, BigDecimal.valueOf(data));
  }
}
