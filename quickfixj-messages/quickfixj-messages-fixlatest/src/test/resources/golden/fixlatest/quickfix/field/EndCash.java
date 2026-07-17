/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class EndCash extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 922;

  public EndCash() {
    super(922);
  }

  public EndCash(BigDecimal data) {
    super(922, data);
  }

  public EndCash(double data) {
    super(922, BigDecimal.valueOf(data));
  }
}
