/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingSettlPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 732;

  public UnderlyingSettlPrice() {
    super(732);
  }

  public UnderlyingSettlPrice(BigDecimal data) {
    super(732, data);
  }

  public UnderlyingSettlPrice(double data) {
    super(732, BigDecimal.valueOf(data));
  }
}
