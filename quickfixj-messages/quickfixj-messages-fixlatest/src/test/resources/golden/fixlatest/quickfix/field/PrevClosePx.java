/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PrevClosePx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 140;

  public PrevClosePx() {
    super(140);
  }

  public PrevClosePx(BigDecimal data) {
    super(140, data);
  }

  public PrevClosePx(double data) {
    super(140, BigDecimal.valueOf(data));
  }
}
