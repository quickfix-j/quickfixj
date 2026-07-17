/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 687;

  public LegQty() {
    super(687);
  }

  public LegQty(BigDecimal data) {
    super(687, data);
  }

  public LegQty(double data) {
    super(687, BigDecimal.valueOf(data));
  }
}
