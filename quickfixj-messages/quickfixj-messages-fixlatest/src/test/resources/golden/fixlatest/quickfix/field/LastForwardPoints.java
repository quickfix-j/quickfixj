/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LastForwardPoints extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 195;

  public LastForwardPoints() {
    super(195);
  }

  public LastForwardPoints(BigDecimal data) {
    super(195, data);
  }

  public LastForwardPoints(double data) {
    super(195, BigDecimal.valueOf(data));
  }
}
