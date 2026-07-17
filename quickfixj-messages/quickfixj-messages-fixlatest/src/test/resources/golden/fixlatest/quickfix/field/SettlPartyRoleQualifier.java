/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SettlPartyRoleQualifier extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2389;

  public static final int FIRM_OR_LEGAL_ENTITY = 23;

  public static final int CURRENT = 18;

  public static final int NEW = 19;

  public static final int NATURAL_PERSON = 24;

  public static final int AGENCY = 0;

  public static final int PRINCIPAL = 1;

  public static final int RISKLESS_PRINCIPAL = 2;

  public static final int PRIMARY_TRD_REPOSITORY = 9;

  public static final int ORIG_TRD_REPOSITORY = 10;

  public static final int ADDTNL_INTL_TRD_REPOSITORY = 11;

  public static final int ADDTNL_DOMESTIC_TRD_REPOSITORY = 12;

  public static final int REGULAR_TRADER = 25;

  public static final int HEAD_TRADER = 26;

  public static final int SUPERVISOR = 27;

  public static final int ALGORITHM = 22;

  public static final int RELATED_EXCHANGE = 13;

  public static final int OPTIONS_EXCHANGE = 14;

  public static final int SPECIFIED_EXCHANGE = 15;

  public static final int CONSTITUENT_EXCHANGE = 16;

  public static final int BANK = 7;

  public static final int HUB = 8;

  public static final int TRI_PARTY = 28;

  public static final int LENDER = 29;

  public static final int GENERAL_CLEARING_MEMBER = 3;

  public static final int INDIVIDUAL_CLEARING_MEMBER = 4;

  public static final int PREFERRED_MARKET_MAKER = 5;

  public static final int DIRECTED_MARKET_MAKER = 6;

  public static final int DESIGNATED_SPONSOR = 20;

  public static final int SPECIALIST = 21;

  public static final int EXEMPT_FROM_TRADE_REPORTING = 17;

  public SettlPartyRoleQualifier() {
    super(2389);
  }

  public SettlPartyRoleQualifier(Integer data) {
    super(2389, data);
  }

  public SettlPartyRoleQualifier(int data) {
    super(2389, data);
  }
}
