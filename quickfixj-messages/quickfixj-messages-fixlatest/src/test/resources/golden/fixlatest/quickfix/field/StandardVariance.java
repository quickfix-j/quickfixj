/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class StandardVariance extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2588;

  public StandardVariance() {
    super(2588);
  }

  public StandardVariance(BigDecimal data) {
    super(2588, data);
  }

  public StandardVariance(double data) {
    super(2588, BigDecimal.valueOf(data));
  }
}
