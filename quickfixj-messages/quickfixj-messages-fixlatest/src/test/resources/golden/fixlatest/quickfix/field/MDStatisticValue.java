/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MDStatisticValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2478;

  public MDStatisticValue() {
    super(2478);
  }

  public MDStatisticValue(BigDecimal data) {
    super(2478, data);
  }

  public MDStatisticValue(double data) {
    super(2478, BigDecimal.valueOf(data));
  }
}
