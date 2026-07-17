/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class LotType extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1093;

  public static final char ODD_LOT = '1';

  public static final char ROUND_LOT = '2';

  public static final char BLOCK_LOT = '3';

  public static final char ROUND_LOT_BASED_UPON = '4';

  public LotType() {
    super(1093);
  }

  public LotType(Character data) {
    super(1093, data);
  }

  public LotType(char data) {
    super(1093, data);
  }
}
