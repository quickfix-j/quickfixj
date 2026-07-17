/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MaxShow extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 210;

  public MaxShow() {
    super(210);
  }

  public MaxShow(BigDecimal data) {
    super(210, data);
  }

  public MaxShow(double data) {
    super(210, BigDecimal.valueOf(data));
  }
}
