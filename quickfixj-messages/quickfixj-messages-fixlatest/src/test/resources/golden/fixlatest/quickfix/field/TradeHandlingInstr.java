/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class TradeHandlingInstr extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1123;

  public static final char TRADE_CONFIRMATION = '0';

  public static final char TWO_PARTY_REPORT = '1';

  public static final char ONE_PARTY_REPORT_FOR_MATCHING = '2';

  public static final char ONE_PARTY_REPORT_FOR_PASS_THROUGH = '3';

  public static final char AUTOMATED_FLOOR_ORDER_ROUTING = '4';

  public static final char TWO_PARTY_REPORT_FOR_CLAIM = '5';

  public static final char ONE_PARTY_REPORT = '6';

  public static final char THIRD_PTY_RPT_FOR_PASS_THROUGH = '7';

  public static final char ONE_PARTY_REPORT_AUTO_MATCH = '8';

  public TradeHandlingInstr() {
    super(1123);
  }

  public TradeHandlingInstr(Character data) {
    super(1123, data);
  }

  public TradeHandlingInstr(char data) {
    super(1123, data);
  }
}
