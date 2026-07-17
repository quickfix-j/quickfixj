/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegQtyType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1591;

  public static final int UNITS = 0;

  public static final int CONTRACTS = 1;

  public static final int UNITS_OF_MEASURE_PER_TIME_UNIT = 2;

  public LegQtyType() {
    super(1591);
  }

  public LegQtyType(Integer data) {
    super(1591, data);
  }

  public LegQtyType(int data) {
    super(1591, data);
  }
}
