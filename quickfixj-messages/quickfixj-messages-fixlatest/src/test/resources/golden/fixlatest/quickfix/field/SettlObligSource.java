/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class SettlObligSource extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1164;

  public static final char INSTRUCTIONS_OF_BROKER = '1';

  public static final char INSTRUCTIONS_FOR_INSTITUTION = '2';

  public static final char INVESTOR = '3';

  public static final char BUYERS_SETTLEMENT_INSTRUCTIONS = '4';

  public static final char SELLERS_SETTLEMENT_INSTRUCTIONS = '5';

  public SettlObligSource() {
    super(1164);
  }

  public SettlObligSource(Character data) {
    super(1164, data);
  }

  public SettlObligSource(char data) {
    super(1164, data);
  }
}
