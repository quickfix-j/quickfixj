/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MaturityNetMoney extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 890;

  public MaturityNetMoney() {
    super(890);
  }

  public MaturityNetMoney(BigDecimal data) {
    super(890, data);
  }

  public MaturityNetMoney(double data) {
    super(890, BigDecimal.valueOf(data));
  }
}
