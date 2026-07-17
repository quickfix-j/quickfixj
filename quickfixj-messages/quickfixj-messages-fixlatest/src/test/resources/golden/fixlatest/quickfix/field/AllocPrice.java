/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AllocPrice extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 366;

  public AllocPrice() {
    super(366);
  }

  public AllocPrice(BigDecimal data) {
    super(366, data);
  }

  public AllocPrice(double data) {
    super(366, BigDecimal.valueOf(data));
  }
}
