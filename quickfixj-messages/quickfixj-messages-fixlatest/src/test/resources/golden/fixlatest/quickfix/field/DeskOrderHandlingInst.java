/* Generated Java Source File */
package quickfix.field;
import quickfix.StringField;

public class DeskOrderHandlingInst extends StringField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1035;

  public static final String PHONE_SIMPLE = "A";

  public static final String PHONE_COMPLEX = "B";

  public static final String FCMPROVIDED_SCREEN = "C";

  public static final String OTHER_PROVIDED_SCREEN = "D";

  public static final String CLIENT_PROVIDED_PLATFORM_CONTROLLED_BY_FCM = "E";

  public static final String CLIENT_PROVIDED_PLATFORM_DIRECT_TO_EXCHANGE = "F";

  public static final String ALGO_ENGINE = "H";

  public static final String PRICE_AT_EXECUTION = "J";

  public static final String DESK_ELECTRONIC = "W";

  public static final String DESK_PIT = "X";

  public static final String CLIENT_ELECTRONIC = "Y";

  public static final String CLIENT_PIT = "Z";

  public static final String ADD_ON_ORDER = "ADD";

  public static final String ALL_OR_NONE = "AON";

  public static final String CONDITIONAL_ORDER = "CND";

  public static final String CASH_NOT_HELD = "CNH";

  public static final String DELIVERY_INSTRUCTIONS_CASH = "CSH";

  public static final String DIRECTED_ORDER = "DIR";

  public static final String DISCRETIONARY_LIMIT_ORDER = "DLO";

  public static final String EXCHANGE_FOR_PHYSICAL_TRANSACTION = "E.W";

  public static final String FILL_OR_KILL = "FOK";

  public static final String INTRA_DAY_CROSS = "IDX";

  public static final String IMBALANCE_ONLY = "IO";

  public static final String IMMEDIATE_OR_CANCEL = "IOC";

  public static final String INTERMARKET_SWEEP_ORDER = "ISO";

  public static final String LIMIT_ON_OPEN = "LOO";

  public static final String LIMIT_ON_CLOSE = "LOC";

  public static final String MARKET_AT_OPEN = "MAO";

  public static final String MARKET_AT_CLOSE = "MAC";

  public static final String MARKET_ON_OPEN = "MOO";

  public static final String MARKET_ON_CLOSE = "MOC";

  public static final String MERGER_RELATED_TRANSFER_POSITION = "MPT";

  public static final String MINIMUM_QUANTITY = "MQT";

  public static final String MARKET_TO_LIMIT = "MTL";

  public static final String DELIVERY_INSTRUCTIONS_NEXT_DAY = "ND";

  public static final String NOT_HELD = "NH";

  public static final String OPTIONS_RELATED_TRANSACTION = "OPT";

  public static final String OVER_THE_DAY = "OVD";

  public static final String PEGGED = "PEG";

  public static final String RESERVE_SIZE_ORDER = "RSV";

  public static final String STOP_STOCK_TRANSACTION = "S.W";

  public static final String SCALE = "SCL";

  public static final String DELIVERY_INSTRUCTIONS_SELLERS_OPTION = "SLR";

  public static final String TIME_ORDER = "TMO";

  public static final String TRAILING_STOP = "TS";

  public static final String WORK = "WRK";

  public static final String STAY_ON_OFFERSIDE = "F0";

  public static final String GO_ALONG = "F3";

  public static final String PARTICIPATE_DO_NOT_INITIATE = "F6";

  public static final String STRICT_SCALE = "F7";

  public static final String TRY_TO_SCALE = "F8";

  public static final String STAY_ON_BIDSIDE = "F9";

  public static final String NO_CROSS = "FA";

  public static final String OKTO_CROSS = "FB";

  public static final String CALL_FIRST = "FC";

  public static final String PERCENT_OF_VOLUME = "FD";

  public static final String REINSTATE_ON_SYSTEM_FAILURE = "FH";

  public static final String INSTITUTION_ONLY = "FI";

  public static final String REINSTATE_ON_TRADING_HALT = "FJ";

  public static final String CANCEL_ON_TRADING_HALF = "FK";

  public static final String LAST_PEG = "FL";

  public static final String MID_PRICE_PEG = "FM";

  public static final String NON_NEGOTIABLE = "FN";

  public static final String OPENING_PEG = "FO";

  public static final String MARKET_PEG = "FP";

  public static final String CANCEL_ON_SYSTEM_FAILURE = "FQ";

  public static final String PRIMARY_PEG = "FR";

  public static final String SUSPEND = "FS";

  public static final String FIXED_PEG_TO_LOCAL_BBO = "FT";

  public static final String PEG_TO_VWAP = "FW";

  public static final String TRADE_ALONG = "FX";

  public static final String TRY_TO_STOP = "FY";

  public static final String CANCEL_IF_NOT_BEST = "FZ";

  public static final String STRICT_LIMIT = "Fb";

  public static final String IGNORE_PRICE_VALIDITY_CHECKS = "Fc";

  public static final String PEG_TO_LIMIT_PRICE = "Fd";

  public static final String WORK_TO_TARGET_STRATEGY = "Fe";

  public static final String GORDER_AND_FCMAPIOR_FIX = "G";

  public DeskOrderHandlingInst() {
    super(1035);
  }

  public DeskOrderHandlingInst(String data) {
    super(1035, data);
  }
}
