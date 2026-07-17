/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class TotalTakedown extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 237;

  public TotalTakedown() {
    super(237);
  }

  public TotalTakedown(BigDecimal data) {
    super(237, data);
  }

  public TotalTakedown(double data) {
    super(237, BigDecimal.valueOf(data));
  }
}
