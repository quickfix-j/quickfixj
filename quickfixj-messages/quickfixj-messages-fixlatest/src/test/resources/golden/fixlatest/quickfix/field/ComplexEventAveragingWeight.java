/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class ComplexEventAveragingWeight extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40996;

  public ComplexEventAveragingWeight() {
    super(40996);
  }

  public ComplexEventAveragingWeight(BigDecimal data) {
    super(40996, data);
  }

  public ComplexEventAveragingWeight(double data) {
    super(40996, BigDecimal.valueOf(data));
  }
}
