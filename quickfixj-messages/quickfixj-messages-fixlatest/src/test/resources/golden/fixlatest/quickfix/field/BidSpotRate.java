/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class BidSpotRate extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 188;

  public BidSpotRate() {
    super(188);
  }

  public BidSpotRate(BigDecimal data) {
    super(188, data);
  }

  public BidSpotRate(double data) {
    super(188, BigDecimal.valueOf(data));
  }
}
