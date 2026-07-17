/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingStreamTotalNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42023;

  public UnderlyingStreamTotalNotional() {
    super(42023);
  }

  public UnderlyingStreamTotalNotional(BigDecimal data) {
    super(42023, data);
  }

  public UnderlyingStreamTotalNotional(double data) {
    super(42023, BigDecimal.valueOf(data));
  }
}
