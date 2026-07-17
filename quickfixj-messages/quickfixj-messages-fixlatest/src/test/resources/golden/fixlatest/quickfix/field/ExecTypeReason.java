/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ExecTypeReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2431;

  public static final int ORD_ADDED_ON_REQUEST = 1;

  public static final int ORD_REPLACED_ON_REQUEST = 2;

  public static final int ORD_CXLD_ON_REQUEST = 3;

  public static final int UNSOLICITED_ORD_CXL = 4;

  public static final int NON_RESTING_ORD_ADDED_ON_REQUEST = 5;

  public static final int ORD_REPLACED_WITH_NON_RESTING_ORD_ON_REQUEST = 6;

  public static final int TRIGGER_ORD_REPLACED_ON_REQUEST = 7;

  public static final int SUSPENDED_ORD_REPLACED_ON_REQUEST = 8;

  public static final int SUSPENDED_ORD_CXLD_ON_REQUEST = 9;

  public static final int ORD_CXL_PENDING = 10;

  public static final int PENDING_CXL_EXECUTED = 11;

  public static final int RESTING_ORD_TRIGGERED = 12;

  public static final int SUSPENDED_ORD_ACTIVATED = 13;

  public static final int ACTIVE_ORD_SUSPENDED = 14;

  public static final int ORD_EXPIRED = 15;

  public ExecTypeReason() {
    super(2431);
  }

  public ExecTypeReason(Integer data) {
    super(2431, data);
  }

  public ExecTypeReason(int data) {
    super(2431, data);
  }
}
