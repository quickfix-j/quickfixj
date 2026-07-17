/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class PostTradePaymentAmount extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2817;

  public PostTradePaymentAmount() {
    super(2817);
  }

  public PostTradePaymentAmount(BigDecimal data) {
    super(2817, data);
  }

  public PostTradePaymentAmount(double data) {
    super(2817, BigDecimal.valueOf(data));
  }
}
