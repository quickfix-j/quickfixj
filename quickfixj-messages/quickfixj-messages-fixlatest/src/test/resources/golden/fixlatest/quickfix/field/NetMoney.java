/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class NetMoney extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 118;

  public NetMoney() {
    super(118);
  }

  public NetMoney(BigDecimal data) {
    super(118, data);
  }

  public NetMoney(double data) {
    super(118, BigDecimal.valueOf(data));
  }
}
