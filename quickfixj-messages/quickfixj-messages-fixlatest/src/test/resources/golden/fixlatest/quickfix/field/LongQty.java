/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LongQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 704;

  public LongQty() {
    super(704);
  }

  public LongQty(BigDecimal data) {
    super(704, data);
  }

  public LongQty(double data) {
    super(704, BigDecimal.valueOf(data));
  }
}
