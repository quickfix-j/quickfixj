/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class OrigTradeHandlingInstr extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1124;

  public static final char TRADE_CONFIRMATION = '0';

  public static final char TWO_PARTY_REPORT = '1';

  public static final char ONE_PARTY_REPORT_FOR_MATCHING = '2';

  public static final char ONE_PARTY_REPORT_FOR_PASS_THROUGH = '3';

  public static final char AUTOMATED_FLOOR_ORDER_ROUTING = '4';

  public static final char TWO_PARTY_REPORT_FOR_CLAIM = '5';

  public static final char ONE_PARTY_REPORT = '6';

  public static final char THIRD_PTY_RPT_FOR_PASS_THROUGH = '7';

  public static final char ONE_PARTY_REPORT_AUTO_MATCH = '8';

  public OrigTradeHandlingInstr() {
    super(1124);
  }

  public OrigTradeHandlingInstr(Character data) {
    super(1124, data);
  }

  public OrigTradeHandlingInstr(char data) {
    super(1124, data);
  }
}
