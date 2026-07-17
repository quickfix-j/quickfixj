/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ComplexEventStrikeFactor extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2131;

  public ComplexEventStrikeFactor() {
    super(2131);
  }

  public ComplexEventStrikeFactor(BigDecimal data) {
    super(2131, data);
  }

  public ComplexEventStrikeFactor(double data) {
    super(2131, BigDecimal.valueOf(data));
  }
}
