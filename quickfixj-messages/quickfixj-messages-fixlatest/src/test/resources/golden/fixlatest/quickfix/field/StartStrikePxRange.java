/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class StartStrikePxRange extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1202;

  public StartStrikePxRange() {
    super(1202);
  }

  public StartStrikePxRange(BigDecimal data) {
    super(1202, data);
  }

  public StartStrikePxRange(double data) {
    super(1202, BigDecimal.valueOf(data));
  }
}
