/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AllocAvgPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 153;

  public AllocAvgPx() {
    super(153);
  }

  public AllocAvgPx(BigDecimal data) {
    super(153, data);
  }

  public AllocAvgPx(double data) {
    super(153, BigDecimal.valueOf(data));
  }
}
