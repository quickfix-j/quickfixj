/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LastQtyChanged extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2301;

  public LastQtyChanged() {
    super(2301);
  }

  public LastQtyChanged(BigDecimal data) {
    super(2301, data);
  }

  public LastQtyChanged(double data) {
    super(2301, BigDecimal.valueOf(data));
  }
}
