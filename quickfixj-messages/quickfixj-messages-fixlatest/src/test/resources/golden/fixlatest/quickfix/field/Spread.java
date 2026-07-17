/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class Spread extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 218;

  public Spread() {
    super(218);
  }

  public Spread(BigDecimal data) {
    super(218, data);
  }

  public Spread(double data) {
    super(218, BigDecimal.valueOf(data));
  }
}
