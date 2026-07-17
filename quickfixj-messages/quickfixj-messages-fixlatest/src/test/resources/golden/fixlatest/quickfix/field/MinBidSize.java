/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MinBidSize extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 647;

  public MinBidSize() {
    super(647);
  }

  public MinBidSize(BigDecimal data) {
    super(647, data);
  }

  public MinBidSize(double data) {
    super(647, BigDecimal.valueOf(data));
  }
}
