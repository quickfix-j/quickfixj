/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MarginExcess extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 899;

  public MarginExcess() {
    super(899);
  }

  public MarginExcess(BigDecimal data) {
    super(899, data);
  }

  public MarginExcess(double data) {
    super(899, BigDecimal.valueOf(data));
  }
}
