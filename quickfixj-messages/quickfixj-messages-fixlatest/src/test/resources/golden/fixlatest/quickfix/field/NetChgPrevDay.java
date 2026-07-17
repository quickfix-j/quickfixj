/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class NetChgPrevDay extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 451;

  public NetChgPrevDay() {
    super(451);
  }

  public NetChgPrevDay(BigDecimal data) {
    super(451, data);
  }

  public NetChgPrevDay(double data) {
    super(451, BigDecimal.valueOf(data));
  }
}
