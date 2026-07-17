/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ExecPriceAdjustment extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 485;

  public ExecPriceAdjustment() {
    super(485);
  }

  public ExecPriceAdjustment(BigDecimal data) {
    super(485, data);
  }

  public ExecPriceAdjustment(double data) {
    super(485, BigDecimal.valueOf(data));
  }
}
