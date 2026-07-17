/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingConstituentWeight extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1988;

  public UnderlyingConstituentWeight() {
    super(1988);
  }

  public UnderlyingConstituentWeight(BigDecimal data) {
    super(1988, data);
  }

  public UnderlyingConstituentWeight(double data) {
    super(1988, BigDecimal.valueOf(data));
  }
}
