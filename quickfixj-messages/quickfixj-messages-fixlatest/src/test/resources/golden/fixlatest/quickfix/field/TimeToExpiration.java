/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class TimeToExpiration extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1189;

  public TimeToExpiration() {
    super(1189);
  }

  public TimeToExpiration(BigDecimal data) {
    super(1189, data);
  }

  public TimeToExpiration(double data) {
    super(1189, BigDecimal.valueOf(data));
  }
}
