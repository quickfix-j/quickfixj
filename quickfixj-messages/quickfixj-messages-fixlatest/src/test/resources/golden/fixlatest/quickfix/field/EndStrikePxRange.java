/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class EndStrikePxRange extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1203;

  public EndStrikePxRange() {
    super(1203);
  }

  public EndStrikePxRange(BigDecimal data) {
    super(1203, data);
  }

  public EndStrikePxRange(double data) {
    super(1203, BigDecimal.valueOf(data));
  }
}
