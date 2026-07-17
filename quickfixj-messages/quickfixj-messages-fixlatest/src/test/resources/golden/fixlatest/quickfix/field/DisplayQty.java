/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DisplayQty extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1138;

  public DisplayQty() {
    super(1138);
  }

  public DisplayQty(BigDecimal data) {
    super(1138, data);
  }

  public DisplayQty(double data) {
    super(1138, BigDecimal.valueOf(data));
  }
}
