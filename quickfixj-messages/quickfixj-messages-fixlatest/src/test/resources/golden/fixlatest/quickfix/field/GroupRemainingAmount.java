/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class GroupRemainingAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2760;

  public GroupRemainingAmount() {
    super(2760);
  }

  public GroupRemainingAmount(BigDecimal data) {
    super(2760, data);
  }

  public GroupRemainingAmount(double data) {
    super(2760, BigDecimal.valueOf(data));
  }
}
