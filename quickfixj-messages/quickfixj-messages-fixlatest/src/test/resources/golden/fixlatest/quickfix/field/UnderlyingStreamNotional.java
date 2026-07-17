/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingStreamNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40545;

  public UnderlyingStreamNotional() {
    super(40545);
  }

  public UnderlyingStreamNotional(BigDecimal data) {
    super(40545, data);
  }

  public UnderlyingStreamNotional(double data) {
    super(40545, BigDecimal.valueOf(data));
  }
}
