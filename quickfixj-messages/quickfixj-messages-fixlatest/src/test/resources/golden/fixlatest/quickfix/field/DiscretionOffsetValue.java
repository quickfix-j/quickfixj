/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class DiscretionOffsetValue extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 389;

  public DiscretionOffsetValue() {
    super(389);
  }

  public DiscretionOffsetValue(BigDecimal data) {
    super(389, data);
  }

  public DiscretionOffsetValue(double data) {
    super(389, BigDecimal.valueOf(data));
  }
}
