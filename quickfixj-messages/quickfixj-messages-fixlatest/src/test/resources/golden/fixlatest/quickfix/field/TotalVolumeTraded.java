/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class TotalVolumeTraded extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 387;

  public TotalVolumeTraded() {
    super(387);
  }

  public TotalVolumeTraded(BigDecimal data) {
    super(387, data);
  }

  public TotalVolumeTraded(double data) {
    super(387, BigDecimal.valueOf(data));
  }
}
