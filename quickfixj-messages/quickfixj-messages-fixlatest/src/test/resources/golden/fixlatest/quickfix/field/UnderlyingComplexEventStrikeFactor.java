/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingComplexEventStrikeFactor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2275;

  public UnderlyingComplexEventStrikeFactor() {
    super(2275);
  }

  public UnderlyingComplexEventStrikeFactor(BigDecimal data) {
    super(2275, data);
  }

  public UnderlyingComplexEventStrikeFactor(double data) {
    super(2275, BigDecimal.valueOf(data));
  }
}
