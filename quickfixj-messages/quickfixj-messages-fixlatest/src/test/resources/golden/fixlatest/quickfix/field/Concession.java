/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class Concession extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 238;

  public Concession() {
    super(238);
  }

  public Concession(BigDecimal data) {
    super(238, data);
  }

  public Concession(double data) {
    super(238, BigDecimal.valueOf(data));
  }
}
