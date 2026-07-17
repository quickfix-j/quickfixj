/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ComplexEventStrikePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2130;

  public ComplexEventStrikePrice() {
    super(2130);
  }

  public ComplexEventStrikePrice(BigDecimal data) {
    super(2130, data);
  }

  public ComplexEventStrikePrice(double data) {
    super(2130, BigDecimal.valueOf(data));
  }
}
