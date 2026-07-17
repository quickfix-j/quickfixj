/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingCapValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1038;

  public UnderlyingCapValue() {
    super(1038);
  }

  public UnderlyingCapValue(BigDecimal data) {
    super(1038, data);
  }

  public UnderlyingCapValue(double data) {
    super(1038, BigDecimal.valueOf(data));
  }
}
