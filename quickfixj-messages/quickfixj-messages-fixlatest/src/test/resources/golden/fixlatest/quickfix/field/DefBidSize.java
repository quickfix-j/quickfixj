/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DefBidSize extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 293;

  public DefBidSize() {
    super(293);
  }

  public DefBidSize(BigDecimal data) {
    super(293, data);
  }

  public DefBidSize(double data) {
    super(293, BigDecimal.valueOf(data));
  }
}
