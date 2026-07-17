/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class AssignmentUnit extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 745;

  public AssignmentUnit() {
    super(745);
  }

  public AssignmentUnit(BigDecimal data) {
    super(745, data);
  }

  public AssignmentUnit(double data) {
    super(745, BigDecimal.valueOf(data));
  }
}
