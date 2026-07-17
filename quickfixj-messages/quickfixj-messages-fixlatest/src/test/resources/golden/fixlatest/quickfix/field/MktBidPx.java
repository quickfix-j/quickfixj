/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MktBidPx extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 645;

  public MktBidPx() {
    super(645);
  }

  public MktBidPx(BigDecimal data) {
    super(645, data);
  }

  public MktBidPx(double data) {
    super(645, BigDecimal.valueOf(data));
  }
}
