/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PegOffsetValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 211;

  public PegOffsetValue() {
    super(211);
  }

  public PegOffsetValue(BigDecimal data) {
    super(211, data);
  }

  public PegOffsetValue(double data) {
    super(211, BigDecimal.valueOf(data));
  }
}
