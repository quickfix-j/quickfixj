/* Generated Java Source File */
package quickfix.field;
import java.math.BigDecimal;
import quickfix.DecimalField;

public class UnderlyingContractMultiplier extends DecimalField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 436;

  public UnderlyingContractMultiplier() {
    super(436);
  }

  public UnderlyingContractMultiplier(BigDecimal data) {
    super(436, data);
  }

  public UnderlyingContractMultiplier(double data) {
    super(436, BigDecimal.valueOf(data));
  }
}
