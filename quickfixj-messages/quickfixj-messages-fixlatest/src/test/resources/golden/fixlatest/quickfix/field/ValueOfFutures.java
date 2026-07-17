/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ValueOfFutures extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 408;

  public ValueOfFutures() {
    super(408);
  }

  public ValueOfFutures(BigDecimal data) {
    super(408, data);
  }

  public ValueOfFutures(double data) {
    super(408, BigDecimal.valueOf(data));
  }
}
