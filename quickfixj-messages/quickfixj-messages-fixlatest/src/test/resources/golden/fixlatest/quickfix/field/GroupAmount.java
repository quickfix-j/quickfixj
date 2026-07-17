/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class GroupAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2759;

  public GroupAmount() {
    super(2759);
  }

  public GroupAmount(BigDecimal data) {
    super(2759, data);
  }

  public GroupAmount(double data) {
    super(2759, BigDecimal.valueOf(data));
  }
}
