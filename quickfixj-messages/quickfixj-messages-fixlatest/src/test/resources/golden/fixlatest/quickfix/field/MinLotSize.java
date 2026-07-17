/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MinLotSize extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1231;

  public MinLotSize() {
    super(1231);
  }

  public MinLotSize(BigDecimal data) {
    super(1231, data);
  }

  public MinLotSize(double data) {
    super(1231, BigDecimal.valueOf(data));
  }
}
