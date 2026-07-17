/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class OwnerType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 522;

  public static final int INDIVIDUAL_INVESTOR = 1;

  public static final int PUBLIC_COMPANY = 2;

  public static final int PRIVATE_COMPANY = 3;

  public static final int INDIVIDUAL_TRUSTEE = 4;

  public static final int COMPANY_TRUSTEE = 5;

  public static final int PENSION_PLAN = 6;

  public static final int CUSTODIAN_UNDER_GIFTS_TO_MINORS_ACT = 7;

  public static final int TRUSTS = 8;

  public static final int FIDUCIARIES = 9;

  public static final int NETWORKING_SUB_ACCOUNT = 10;

  public static final int NON_PROFIT_ORGANIZATION = 11;

  public static final int CORPORATE_BODY = 12;

  public static final int NOMINEE = 13;

  public static final int INSTITUTIONAL_CUSTOMER = 14;

  public static final int COMBINED = 15;

  public static final int MEMBER_FIRM_EMPLOYEE = 16;

  public static final int MARKET_MAKING_ACCOUNT = 17;

  public static final int PROPRIETARY_ACCOUNT = 18;

  public static final int NONBROKER_DEALER = 19;

  public static final int UNKNOWN_BENEFICIAL_OWNER_TYPE = 20;

  public static final int FIRMS_ERROR_ACCOUNT = 21;

  public static final int FIRM_AGENCY_AVERAGE_PRICE_ACCOUNT = 22;

  public OwnerType() {
    super(522);
  }

  public OwnerType(Integer data) {
    super(522, data);
  }

  public OwnerType(int data) {
    super(522, data);
  }
}
