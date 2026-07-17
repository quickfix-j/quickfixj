/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ReturnRatePrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42767;

  public ReturnRatePrice() {
    super(42767);
  }

  public ReturnRatePrice(BigDecimal data) {
    super(42767, data);
  }

  public ReturnRatePrice(double data) {
    super(42767, BigDecimal.valueOf(data));
  }
}
