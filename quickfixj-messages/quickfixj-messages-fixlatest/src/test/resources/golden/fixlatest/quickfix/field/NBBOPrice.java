/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class NBBOPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2832;

  public NBBOPrice() {
    super(2832);
  }

  public NBBOPrice(BigDecimal data) {
    super(2832, data);
  }

  public NBBOPrice(double data) {
    super(2832, BigDecimal.valueOf(data));
  }
}
