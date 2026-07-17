/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TrdSubType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 829;

  public static final int CMTA = 0;

  public static final int INTERNAL_TRANSFER_OR_ADJUSTMENT = 1;

  public static final int EXTERNAL_TRANSFER_OR_TRANSFER_OF_ACCOUNT = 2;

  public static final int REJECT_FOR_SUBMITTING_SIDE = 3;

  public static final int ADVISORY_FOR_CONTRA_SIDE = 4;

  public static final int OFFSET_DUE_TO_AN_ALLOCATION = 5;

  public static final int ONSET_DUE_TO_AN_ALLOCATION = 6;

  public static final int DIFFERENTIAL_SPREAD = 7;

  public static final int IMPLIED_SPREAD_LEG_EXECUTED_AGAINST_AN_OUTRIGHT = 8;

  public static final int TRANSACTION_FROM_EXERCISE = 9;

  public static final int TRANSACTION_FROM_ASSIGNMENT = 10;

  public static final int ACATS = 11;

  public static final int OFF_HOURS_TRADE = 33;

  public static final int ON_HOURS_TRADE = 34;

  public static final int OTCQUOTE = 35;

  public static final int CONVERTED_SWAP = 36;

  public static final int WASH_TRADE = 40;

  public static final int TRADE_AT_SETTLEMENT = 41;

  public static final int AUCTION_TRADE = 42;

  public static final int TRADE_AT_MARKER = 43;

  public static final int CREDIT_DEFAULT = 44;

  public static final int CREDIT_RESTRUCTURING = 45;

  public static final int MERGER = 46;

  public static final int SPIN_OFF = 47;

  public static final int MULTILATERAL_COMPRESSION = 48;

  public static final int BALANCING = 50;

  public static final int BASIS_TRADE_INDEX_CLOSE = 51;

  public static final int TRADE_AT_CASH_OPEN = 52;

  public static final int TRD_SUBMIT_VENUE_CLR_SETTL = 53;

  public static final int BILATERAL_COMPRESSION = 54;

  public static final int AI = 14;

  public static final int B = 15;

  public static final int K = 16;

  public static final int LC = 17;

  public static final int M = 18;

  public static final int N = 19;

  public static final int NM = 20;

  public static final int NR = 21;

  public static final int P = 22;

  public static final int PA = 23;

  public static final int PC = 24;

  public static final int PN = 25;

  public static final int R = 26;

  public static final int RO = 27;

  public static final int RT = 28;

  public static final int SW = 29;

  public static final int T = 30;

  public static final int WN = 31;

  public static final int WT = 32;

  public static final int CROSSED_TRADE = 37;

  public static final int INTERIM_PROTECTED_TRADE = 38;

  public static final int LARGE_IN_SCALE = 39;

  public TrdSubType() {
    super(829);
  }

  public TrdSubType(Integer data) {
    super(829, data);
  }

  public TrdSubType(int data) {
    super(829, data);
  }
}
