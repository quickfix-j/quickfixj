/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class OrderAttributeType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2594;

  public static final int AGGREGATED_ORDER = 0;

  public static final int PENDING_ALLOCATION = 1;

  public static final int LIQUIDITY_PROVISION_ACTIVITY_ORDER = 2;

  public static final int RISK_REDUCTION_ORDER = 3;

  public static final int ALGORITHMIC_ORDER = 4;

  public static final int SYSTEMIC_INTERNALISER_ORDER = 5;

  public static final int ALL_EXECUTIONS_SUBMITTED_TO_APA = 6;

  public static final int ORDER_EXECUTION_INSTRUCTED_BY_CLIENT = 7;

  public static final int LARGE_IN_SCALE = 8;

  public static final int HIDDEN = 9;

  public static final int SUBJECT_TO_EUSTO = 10;

  public static final int SUBJECT_TO_UKSTO = 11;

  public static final int REPRESENTATIVE_ORDER = 12;

  public static final int LINKAGE_TYPE = 13;

  public static final int EXEMPT_FROM_STO = 14;

  public OrderAttributeType() {
    super(2594);
  }

  public OrderAttributeType(Integer data) {
    super(2594, data);
  }

  public OrderAttributeType(int data) {
    super(2594, data);
  }
}
