/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class StreamNotional extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40054;

  public StreamNotional() {
    super(40054);
  }

  public StreamNotional(BigDecimal data) {
    super(40054, data);
  }

  public StreamNotional(double data) {
    super(40054, BigDecimal.valueOf(data));
  }
}
