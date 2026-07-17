/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AllocNetMoney extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 154;

  public AllocNetMoney() {
    super(154);
  }

  public AllocNetMoney(BigDecimal data) {
    super(154, data);
  }

  public AllocNetMoney(double data) {
    super(154, BigDecimal.valueOf(data));
  }
}
