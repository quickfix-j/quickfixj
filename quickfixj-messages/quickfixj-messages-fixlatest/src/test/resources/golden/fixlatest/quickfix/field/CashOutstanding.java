/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class CashOutstanding extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 901;

  public CashOutstanding() {
    super(901);
  }

  public CashOutstanding(BigDecimal data) {
    super(901, data);
  }

  public CashOutstanding(double data) {
    super(901, BigDecimal.valueOf(data));
  }
}
