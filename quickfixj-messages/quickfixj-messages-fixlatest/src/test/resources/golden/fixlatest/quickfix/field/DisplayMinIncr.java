/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DisplayMinIncr extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1087;

  public DisplayMinIncr() {
    super(1087);
  }

  public DisplayMinIncr(BigDecimal data) {
    super(1087, data);
  }

  public DisplayMinIncr(double data) {
    super(1087, BigDecimal.valueOf(data));
  }
}
