/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class LegReturnRateCommissionBasis extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42536;

  public static final char PER_UNIT = '1';

  public static final char PERCENT = '2';

  public static final char ABSOLUTE = '3';

  public static final char PERCENTAGE_WAIVED_CASH_DISCOUNT = '4';

  public static final char PERCENTAGE_WAIVED_ENHANCED_UNITS = '5';

  public static final char POINTS_PER_BOND_OR_CONTRACT = '6';

  public static final char BASIS_POINTS = '7';

  public static final char AMOUNT_PER_CONTRACT = '8';

  public LegReturnRateCommissionBasis() {
    super(42536);
  }

  public LegReturnRateCommissionBasis(Character data) {
    super(42536, data);
  }

  public LegReturnRateCommissionBasis(char data) {
    super(42536, data);
  }
}
