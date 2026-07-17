/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class BasisFeaturePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 260;

  public BasisFeaturePrice() {
    super(260);
  }

  public BasisFeaturePrice(BigDecimal data) {
    super(260, data);
  }

  public BasisFeaturePrice(double data) {
    super(260, BigDecimal.valueOf(data));
  }
}
