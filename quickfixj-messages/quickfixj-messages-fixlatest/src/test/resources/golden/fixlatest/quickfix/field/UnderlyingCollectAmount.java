/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingCollectAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 986;

  public UnderlyingCollectAmount() {
    super(986);
  }

  public UnderlyingCollectAmount(BigDecimal data) {
    super(986, data);
  }

  public UnderlyingCollectAmount(double data) {
    super(986, BigDecimal.valueOf(data));
  }
}
