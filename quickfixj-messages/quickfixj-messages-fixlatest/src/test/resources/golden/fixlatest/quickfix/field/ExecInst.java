/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class ExecInst extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 18;

  public static final String STAY_ON_OFFER_SIDE = "0";

  public static final String NOT_HELD = "1";

  public static final String WORK = "2";

  public static final String GO_ALONG = "3";

  public static final String OVER_THE_DAY = "4";

  public static final String HELD = "5";

  public static final String PARTICIPATE_DO_NOT_INITIATE = "6";

  public static final String STRICT_SCALE = "7";

  public static final String TRY_TO_SCALE = "8";

  public static final String STAY_ON_BID_SIDE = "9";

  public static final String NO_CROSS = "A";

  public static final String OKTO_CROSS = "B";

  public static final String CALL_FIRST = "C";

  public static final String PERCENT_OF_VOLUME = "D";

  public static final String DO_NOT_INCREASE = "E";

  public static final String DO_NOT_REDUCE = "F";

  public static final String ALL_OR_NONE = "G";

  public static final String REINSTATE_ON_SYSTEM_FAILURE = "H";

  public static final String INSTITUTIONS_ONLY = "I";

  public static final String REINSTATE_ON_TRADING_HALT = "J";

  public static final String CANCEL_ON_TRADING_HALT = "K";

  public static final String LAST_PEG = "L";

  public static final String MID_PRICE_PEG = "M";

  public static final String NON_NEGOTIABLE = "N";

  public static final String OPENING_PEG = "O";

  public static final String MARKET_PEG = "P";

  public static final String CANCEL_ON_SYSTEM_FAILURE = "Q";

  public static final String PRIMARY_PEG = "R";

  public static final String SUSPEND = "S";

  public static final String FIXED_PEG_TO_LOCAL_BEST_BID_OR_OFFER_AT_TIME_OF_ORDER = "T";

  public static final String CUSTOMER_DISPLAY_INSTRUCTION = "U";

  public static final String NETTING = "V";

  public static final String PEG_TO_VWAP = "W";

  public static final String TRADE_ALONG = "X";

  public static final String TRY_TO_STOP = "Y";

  public static final String CANCEL_IF_NOT_BEST = "Z";

  public static final String TRAILING_STOP_PEG = "a";

  public static final String STRICT_LIMIT = "b";

  public static final String IGNORE_PRICE_VALIDITY_CHECKS = "c";

  public static final String PEG_TO_LIMIT_PRICE = "d";

  public static final String WORK_TO_TARGET_STRATEGY = "e";

  public static final String INTERMARKET_SWEEP = "f";

  public static final String EXTERNAL_ROUTING_ALLOWED = "g";

  public static final String EXTERNAL_ROUTING_NOT_ALLOWED = "h";

  public static final String IMBALANCE_ONLY = "i";

  public static final String SINGLE_EXECUTION_REQUESTED_FOR_BLOCK_TRADE = "j";

  public static final String BEST_EXECUTION = "k";

  public static final String SUSPEND_ON_SYSTEM_FAILURE = "l";

  public static final String SUSPEND_ON_TRADING_HALT = "m";

  public static final String REINSTATE_ON_CONNECTION_LOSS = "n";

  public static final String CANCEL_ON_CONNECTION_LOSS = "o";

  public static final String SUSPEND_ON_CONNECTION_LOSS = "p";

  public static final String RELEASE = "q";

  public static final String EXECUTE_AS_DELTA_NEUTRAL = "r";

  public static final String EXECUTE_AS_DURATION_NEUTRAL = "s";

  public static final String EXECUTE_AS_FXNEUTRAL = "t";

  public static final String MIN_GUARANTEED_FILL_ELIGIBLE = "u";

  public static final String BYPASS_NON_DISPLAY_LIQUIDITY = "v";

  public static final String LOCK = "w";

  public static final String IGNORE_NOTIONAL_VALUE_CHECKS = "x";

  public static final String TRD_AT_REF_PX = "y";

  public static final String ALLOW_FACILITATION = "z";

  public ExecInst() {
    super(18);
  }

  public ExecInst(String data) {
    super(18, data);
  }
}
