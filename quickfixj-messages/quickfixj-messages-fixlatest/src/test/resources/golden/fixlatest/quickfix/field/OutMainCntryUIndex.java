/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class OutMainCntryUIndex extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 412;

  public OutMainCntryUIndex() {
    super(412);
  }

  public OutMainCntryUIndex(BigDecimal data) {
    super(412, data);
  }

  public OutMainCntryUIndex(double data) {
    super(412, BigDecimal.valueOf(data));
  }
}
