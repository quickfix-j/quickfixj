/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TaxAdvantageType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 495;

  public static final int NONE = 0;

  public static final int MAXI_ISA = 1;

  public static final int TESSA = 2;

  public static final int MINI_CASH_ISA = 3;

  public static final int MINI_STOCKS_AND_SHARES_ISA = 4;

  public static final int MINI_INSURANCE_ISA = 5;

  public static final int CURRENT_YEAR_PAYMENT = 6;

  public static final int PRIOR_YEAR_PAYMENT = 7;

  public static final int ASSET_TRANSFER = 8;

  public static final int EMPLOYEE_PRIOR_YEAR = 9;

  public static final int EMPLOYEE_CURRENT_YEAR = 10;

  public static final int EMPLOYER_PRIOR_YEAR = 11;

  public static final int EMPLOYER_CURRENT_YEAR = 12;

  public static final int NON_FUND_PROTOTYPE_IRA = 13;

  public static final int NON_FUND_QUALIFIED_PLAN = 14;

  public static final int DEFINED_CONTRIBUTION_PLAN = 15;

  public static final int IRA = 16;

  public static final int IRAROLLOVER = 17;

  public static final int KEOGH = 18;

  public static final int PROFIT_SHARING_PLAN = 19;

  public static final int US401K = 20;

  public static final int SELF_DIRECTED_IRA = 21;

  public static final int US403B = 22;

  public static final int US457 = 23;

  public static final int ROTH_IRAPROTOTYPE = 24;

  public static final int ROTH_IRANON_PROTOTYPE = 25;

  public static final int ROTH_CONVERSION_IRAPROTOTYPE = 26;

  public static final int ROTH_CONVERSION_IRANON_PROTOTYPE = 27;

  public static final int EDUCATION_IRAPROTOTYPE = 28;

  public static final int EDUCATION_IRANON_PROTOTYPE = 29;

  public static final int OTHER = 999;

  public TaxAdvantageType() {
    super(495);
  }

  public TaxAdvantageType(Integer data) {
    super(495, data);
  }

  public TaxAdvantageType(int data) {
    super(495, data);
  }
}
