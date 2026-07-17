/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class StartCash extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 921;

  public StartCash() {
    super(921);
  }

  public StartCash(BigDecimal data) {
    super(921, data);
  }

  public StartCash(double data) {
    super(921, BigDecimal.valueOf(data));
  }
}
