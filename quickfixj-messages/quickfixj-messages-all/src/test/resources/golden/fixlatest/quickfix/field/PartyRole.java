/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PartyRole extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 452;

  public static final int EXECUTING_FIRM = 1;

  public static final int BROKER_OF_CREDIT = 2;

  public static final int CLIENT_ID = 3;

  public static final int CLEARING_FIRM = 4;

  public static final int INVESTOR_ID = 5;

  public static final int INTRODUCING_FIRM = 6;

  public static final int ENTERING_FIRM = 7;

  public static final int LOCATE = 8;

  public static final int FUND_MANAGER_CLIENT_ID = 9;

  public static final int SETTLEMENT_LOCATION = 10;

  public static final int ORDER_ORIGINATION_TRADER = 11;

  public static final int EXECUTING_TRADER = 12;

  public static final int ORDER_ORIGINATION_FIRM = 13;

  public static final int GIVEUP_CLEARING_FIRM_DEPR = 14;

  public static final int CORRESPONDANT_CLEARING_FIRM = 15;

  public static final int EXECUTING_SYSTEM = 16;

  public static final int CONTRA_FIRM = 17;

  public static final int CONTRA_CLEARING_FIRM = 18;

  public static final int SPONSORING_FIRM = 19;

  public static final int UNDERLYING_CONTRA_FIRM = 20;

  public static final int CLEARING_ORGANIZATION = 21;

  public static final int EXCHANGE = 22;

  public static final int CUSTOMER_ACCOUNT = 24;

  public static final int CORRESPONDENT_CLEARING_ORGANIZATION = 25;

  public static final int CORRESPONDENT_BROKER = 26;

  public static final int BUYER = 27;

  public static final int CUSTODIAN = 28;

  public static final int INTERMEDIARY = 29;

  public static final int AGENT = 30;

  public static final int SUB_CUSTODIAN = 31;

  public static final int BENEFICIARY = 32;

  public static final int INTERESTED_PARTY = 33;

  public static final int REGULATORY_BODY = 34;

  public static final int LIQUIDITY_PROVIDER = 35;

  public static final int ENTERING_TRADER = 36;

  public static final int CONTRA_TRADER = 37;

  public static final int POSITION_ACCOUNT = 38;

  public static final int CONTRA_INVESTOR_ID = 39;

  public static final int TRANSFER_TO_FIRM = 40;

  public static final int CONTRA_POSITION_ACCOUNT = 41;

  public static final int CONTRA_EXCHANGE = 42;

  public static final int INTERNAL_CARRY_ACCOUNT = 43;

  public static final int ORDER_ENTRY_OPERATOR_ID = 44;

  public static final int SECONDARY_ACCOUNT_NUMBER = 45;

  public static final int FOREIGN_FIRM = 46;

  public static final int THIRD_PARTY_ALLOCATION_FIRM = 47;

  public static final int CLAIMING_ACCOUNT = 48;

  public static final int ASSET_MANAGER = 49;

  public static final int PLEDGOR_ACCOUNT = 50;

  public static final int PLEDGEE_ACCOUNT = 51;

  public static final int LARGE_TRADER_REPORTABLE_ACCOUNT = 52;

  public static final int TRADER_MNEMONIC = 53;

  public static final int SENDER_LOCATION = 54;

  public static final int SESSION_ID = 55;

  public static final int ACCEPTABLE_COUNTERPARTY = 56;

  public static final int UNACCEPTABLE_COUNTERPARTY = 57;

  public static final int ENTERING_UNIT = 58;

  public static final int EXECUTING_UNIT = 59;

  public static final int INTRODUCING_BROKER = 60;

  public static final int QUOTE_ORIGINATOR = 61;

  public static final int REPORT_ORIGINATOR = 62;

  public static final int SYSTEMATIC_INTERNALISER = 63;

  public static final int MULTILATERAL_TRADING_FACILITY = 64;

  public static final int REGULATED_MARKET = 65;

  public static final int MARKET_MAKER = 66;

  public static final int INVESTMENT_FIRM = 67;

  public static final int HOST_COMPETENT_AUTHORITY = 68;

  public static final int HOME_COMPETENT_AUTHORITY = 69;

  public static final int COMPETENT_AUTHORITY_LIQUIDITY = 70;

  public static final int COMPETENT_AUTHORITY_TRANSACTION_VENUE = 71;

  public static final int REPORTING_INTERMEDIARY = 72;

  public static final int EXECUTION_VENUE = 73;

  public static final int MARKET_DATA_ENTRY_ORIGINATOR = 74;

  public static final int LOCATION_ID = 75;

  public static final int DESK_ID = 76;

  public static final int MARKET_DATA_MARKET = 77;

  public static final int ALLOCATION_ENTITY = 78;

  public static final int PRIME_BROKER = 79;

  public static final int STEP_OUT_FIRM = 80;

  public static final int BROKER_CLEARING_ID = 81;

  public static final int CENTRAL_REGISTRATION_DEPOSITORY = 82;

  public static final int CLEARING_ACCOUNT = 83;

  public static final int ACCEPTABLE_SETTLING_COUNTERPARTY = 84;

  public static final int UNACCEPTABLE_SETTLING_COUNTERPARTY = 85;

  public static final int CLSMEMBER_BANK = 86;

  public static final int IN_CONCERT_GROUP = 87;

  public static final int IN_CONCERT_CONTROLLING_ENTITY = 88;

  public static final int LARGE_POSITIONS_REPORTING_ACCOUNT = 89;

  public static final int SETTLEMENT_FIRM = 90;

  public static final int SETTLEMENT_ACCOUNT = 91;

  public static final int REPORTING_MARKET_CENTER = 92;

  public static final int RELATED_REPORTING_MARKET_CENTER = 93;

  public static final int AWAY_MARKET = 94;

  public static final int GIVEUP_TRADING_FIRM = 95;

  public static final int TAKEUP_TRADING_FIRM = 96;

  public static final int GIVEUP_CLEARING_FIRM = 97;

  public static final int TAKEUP_CLEARING_FIRM = 98;

  public static final int ORIGINATING_MARKET = 99;

  public static final int MARGIN_ACCOUNT = 100;

  public static final int COLLATERAL_ASSET_ACCOUNT = 101;

  public static final int DATA_REPOSITORY = 102;

  public static final int CALCULATION_AGENT = 103;

  public static final int EXERCISE_NOTICE_SENDER = 104;

  public static final int EXERCISE_NOTICE_RECEIVER = 105;

  public static final int RATE_REFERENCE_BANK = 106;

  public static final int CORRESPONDENT = 107;

  public static final int BENEFICIARY_BANK = 109;

  public static final int BORROWER = 110;

  public static final int PRIMARY_OBLIGATOR = 111;

  public static final int GUARANTOR = 112;

  public static final int EXCLUDED_REFERENCE_ENTITY = 113;

  public static final int DETERMINING_PARTY = 114;

  public static final int HEDGING_PARTY = 115;

  public static final int REPORTING_ENTITY = 116;

  public static final int SALES_PERSON = 117;

  public static final int OPERATOR = 118;

  public static final int CSD = 119;

  public static final int ICSD = 120;

  public static final int TRADING_SUB_ACCOUNT = 121;

  public static final int INVESTMENT_DECISION_MAKER = 122;

  public static final int PUBLISHING_INTERMEDIARY = 123;

  public static final int CSDPARTICIPANT = 124;

  public static final int ISSUER = 125;

  public static final int CONTRA_CUSTOMER_ACCOUNT = 126;

  public static final int CONTRA_INVESTMENT_DECISION_MAKER = 127;

  public PartyRole() {
    super(452);
  }

  public PartyRole(Integer data) {
    super(452, data);
  }

  public PartyRole(int data) {
    super(452, data);
  }
}
