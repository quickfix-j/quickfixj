/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class StreamTotalNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 41310;

  public StreamTotalNotional() {
    super(41310);
  }

  public StreamTotalNotional(BigDecimal data) {
    super(41310, data);
  }

  public StreamTotalNotional(double data) {
    super(41310, BigDecimal.valueOf(data));
  }
}
