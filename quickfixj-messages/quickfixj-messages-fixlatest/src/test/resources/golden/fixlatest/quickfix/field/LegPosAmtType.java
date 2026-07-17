/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class LegPosAmtType extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1588;

  public static final String CASH_AMOUNT = "CASH";

  public static final String CASH_RESIDUAL_AMOUNT = "CRES";

  public static final String FINAL_MARK_TO_MARKET_AMOUNT = "FMTM";

  public static final String INCREMENTAL_MARK_TO_MARKET_AMOUNT = "IMTM";

  public static final String PREMIUM_AMOUNT = "PREM";

  public static final String START_OF_DAY_MARK_TO_MARKET_AMOUNT = "SMTM";

  public static final String TRADE_VARIATION_AMOUNT = "TVAR";

  public static final String VALUE_ADJUSTED_AMOUNT = "VADJ";

  public static final String SETTLEMENT_VALUE = "SETL";

  public static final String INITIAL_TRADE_COUPON_AMOUNT = "ICPN";

  public static final String ACCRUED_COUPON_AMOUNT = "ACPN";

  public static final String COUPON_AMOUNT = "CPN";

  public static final String INCREMENTAL_ACCRUED_COUPON = "IACPN";

  public static final String COLLATERALIZED_MARK_TO_MARKET = "CMTM";

  public static final String INCREMENTAL_COLLATERALIZED_MARK_TO_MARKET = "ICMTM";

  public static final String COMPENSATION_AMOUNT = "DLV";

  public static final String TOTAL_BANKED_AMOUNT = "BANK";

  public static final String TOTAL_COLLATERALIZED_AMOUNT = "COLAT";

  public static final String LONG_PAIRED_SWAP_NOTIONAL_VALUE = "LSNV";

  public static final String SHORT_PAIRED_SWAP_NOTIONAL_VALUE = "SSNV";

  public static final String START_OF_DAY_ACCRUED_COUPON = "SACPN";

  public static final String NET_PRESENT_VALUE = "NPV";

  public static final String START_OF_DAY_NET_PRESENT_VALUE = "SNPV";

  public static final String NET_CASH_FLOW = "NCF";

  public static final String PRESENT_VALUE_OF_FEES = "PVFEES";

  public static final String PRESENT_VALUE_ONE_BASIS_POINTS = "PV01";

  public static final String FIVE_YEAR_EQUIVALENT_NOTIONAL = "5YREN";

  public static final String UNDISCOUNTED_MARK_TO_MARKET = "UMTM";

  public static final String MARK_TO_MODEL = "MTD";

  public static final String MARK_TO_MARKET_VARIANCE = "VMTM";

  public static final String MARK_TO_MODEL_VARIANCE = "VMTD";

  public static final String UPFRONT_PAYMENT = "UPFRNT";

  public static final String END_VALE = "ENDV";

  public static final String OUTSTANDING_MARGIN_LOAN = "MGNLN";

  public static final String LOAN_VALUE = "LNVL";

  public LegPosAmtType() {
    super(1588);
  }

  public LegPosAmtType(String data) {
    super(1588, data);
  }
}
