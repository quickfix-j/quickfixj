/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SideShortSaleExemptionReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1690;

  public static final int EXEMPTION_REASON_UNKNOWN = 0;

  public static final int INCOMING_SSE = 1;

  public static final int ABOVE_NATIONAL_BEST_BID = 2;

  public static final int DELAYED_DELIVERY = 3;

  public static final int ODD_LOT = 4;

  public static final int DOMESTIC_ARBITRAGE = 5;

  public static final int INTERNATIONAL_ARBITRAGE = 6;

  public static final int UNDERWRITER_OR_SYNDICATE_DISTRIBUTION = 7;

  public static final int RISKLESS_PRINCIPAL = 8;

  public static final int VWAP = 9;

  public SideShortSaleExemptionReason() {
    super(1690);
  }

  public SideShortSaleExemptionReason(Integer data) {
    super(1690, data);
  }

  public SideShortSaleExemptionReason(int data) {
    super(1690, data);
  }
}
