/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AllowableOneSidednessValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 766;

  public AllowableOneSidednessValue() {
    super(766);
  }

  public AllowableOneSidednessValue(BigDecimal data) {
    super(766, data);
  }

  public AllowableOneSidednessValue(double data) {
    super(766, BigDecimal.valueOf(data));
  }
}
