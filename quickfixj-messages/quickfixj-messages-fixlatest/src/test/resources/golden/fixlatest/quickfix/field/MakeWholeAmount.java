/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MakeWholeAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42592;

  public MakeWholeAmount() {
    super(42592);
  }

  public MakeWholeAmount(BigDecimal data) {
    super(42592, data);
  }

  public MakeWholeAmount(double data) {
    super(42592, BigDecimal.valueOf(data));
  }
}
