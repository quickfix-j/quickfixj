/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class SecondaryHighLimitPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1230;

  public SecondaryHighLimitPrice() {
    super(1230);
  }

  public SecondaryHighLimitPrice(BigDecimal data) {
    super(1230, data);
  }

  public SecondaryHighLimitPrice(double data) {
    super(1230, BigDecimal.valueOf(data));
  }
}
