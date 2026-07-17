/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AllocRiskLimitCheckStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2483;

  public static final int ACCEPTED = 0;

  public static final int REJECTED = 1;

  public static final int CLAIM_REQUIRED = 2;

  public static final int PRE_DEFINED_LIMIT_CHECK_SUCCEEDED = 3;

  public static final int PRE_DEFINED_LIMIT_CHECK_FAILED = 4;

  public static final int PRE_DEFINED_AUTO_ACCEPT_RULE_INVOKED = 5;

  public static final int PRE_DEFINED_AUTO_REJECT_RULE_INVOKED = 6;

  public static final int ACCEPTED_BY_CLEARING_FIRM = 7;

  public static final int REJECTED_BY_CLEARING_FIRM = 8;

  public static final int PENDING = 9;

  public static final int ACCEPTED_BY_CREDIT_HUB = 10;

  public static final int REJECTED_BY_CREDIT_HUB = 11;

  public static final int PENDING_CREDIT_HUB_CHECK = 12;

  public static final int ACCEPTED_BY_EXEC_VENUE = 13;

  public static final int REJECTED_BY_EXEC_VENUE = 14;

  public AllocRiskLimitCheckStatus() {
    super(2483);
  }

  public AllocRiskLimitCheckStatus(Integer data) {
    super(2483, data);
  }

  public AllocRiskLimitCheckStatus(int data) {
    super(2483, data);
  }
}
