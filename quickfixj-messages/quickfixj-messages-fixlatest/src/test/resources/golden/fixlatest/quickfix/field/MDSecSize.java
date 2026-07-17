/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MDSecSize extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1179;

  public MDSecSize() {
    super(1179);
  }

  public MDSecSize(BigDecimal data) {
    super(1179, data);
  }

  public MDSecSize(double data) {
    super(1179, BigDecimal.valueOf(data));
  }
}
