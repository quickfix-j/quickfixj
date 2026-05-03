/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MDEntryPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 270;

  public MDEntryPx() {
    super(270);
  }

  public MDEntryPx(BigDecimal data) {
    super(270, data);
  }

  public MDEntryPx(double data) {
    super(270, BigDecimal.valueOf(data));
  }
}
