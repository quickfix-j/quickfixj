/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class FairValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 406;

  public FairValue() {
    super(406);
  }

  public FairValue(BigDecimal data) {
    super(406, data);
  }

  public FairValue(double data) {
    super(406, BigDecimal.valueOf(data));
  }
}
