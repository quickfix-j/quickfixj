/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class MDEntrySize extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 271;

  public MDEntrySize() {
    super(271);
  }

  public MDEntrySize(BigDecimal data) {
    super(271, data);
  }

  public MDEntrySize(double data) {
    super(271, BigDecimal.valueOf(data));
  }
}
