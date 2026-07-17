/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class TriggerNewQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1112;

  public TriggerNewQty() {
    super(1112);
  }

  public TriggerNewQty(BigDecimal data) {
    super(1112, data);
  }

  public TriggerNewQty(double data) {
    super(1112, BigDecimal.valueOf(data));
  }
}
