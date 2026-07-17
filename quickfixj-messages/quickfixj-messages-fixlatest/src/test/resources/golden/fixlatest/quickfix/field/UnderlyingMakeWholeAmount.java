/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingMakeWholeAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42889;

  public UnderlyingMakeWholeAmount() {
    super(42889);
  }

  public UnderlyingMakeWholeAmount(BigDecimal data) {
    super(42889, data);
  }

  public UnderlyingMakeWholeAmount(double data) {
    super(42889, BigDecimal.valueOf(data));
  }
}
