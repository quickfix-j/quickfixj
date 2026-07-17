/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class LegContractMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 614;

  public LegContractMultiplier() {
    super(614);
  }

  public LegContractMultiplier(BigDecimal data) {
    super(614, data);
  }

  public LegContractMultiplier(double data) {
    super(614, BigDecimal.valueOf(data));
  }
}
