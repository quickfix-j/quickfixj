/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SideTrdRegTimestampType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1013;

  public static final int EXECUTION_TIME = 1;

  public static final int TIME_IN = 2;

  public static final int TIME_OUT = 3;

  public static final int BROKER_RECEIPT = 4;

  public static final int BROKER_EXECUTION = 5;

  public static final int DESK_RECEIPT = 6;

  public static final int SUBMISSION_TO_CLEARING = 7;

  public static final int TIME_PRIORITY = 8;

  public static final int ORDERBOOK_ENTRY_TIME = 9;

  public static final int ORDER_SUBMISSION_TIME = 10;

  public static final int PUBLICLY_REPORTED = 11;

  public static final int PUBLIC_REPORT_UPDATED = 12;

  public static final int NON_PUBLICLY_REPORTED = 13;

  public static final int NON_PUBLIC_REPORT_UPDATED = 14;

  public static final int SUBMITTED_FOR_CONFIRMATION = 15;

  public static final int UPDATED_FOR_CONFIRMATION = 16;

  public static final int CONFIRMED = 17;

  public static final int UPDATED_FOR_CLEARING = 18;

  public static final int CLEARED = 19;

  public static final int ALLOCATIONS_SUBMITTED = 20;

  public static final int ALLOCATIONS_UPDATED = 21;

  public static final int ALLOCATIONS_COMPLETED = 22;

  public static final int SUBMITTED_TO_REPOSITORY = 23;

  public static final int POST_TRD_CONTNTN_EVNT = 24;

  public static final int POST_TRADE_VALUATION = 25;

  public static final int PREVIOUS_TIME_PRIORITY = 26;

  public static final int IDENTIFIER_ASSIGNED = 27;

  public static final int PREVIOUS_IDENTIFIER_ASSIGNED = 28;

  public static final int ORDER_CANCELLATION_TIME = 29;

  public static final int ORDER_MODIFICATION_TIME = 30;

  public static final int ORDER_ROUTING_TIME = 31;

  public static final int TRADE_CANCELLATION_TIME = 32;

  public static final int TRADE_MODIFICATION_TIME = 33;

  public static final int REFERENCE_TIME_FOR_NBBO = 34;

  public SideTrdRegTimestampType() {
    super(1013);
  }

  public SideTrdRegTimestampType(Integer data) {
    super(1013, data);
  }

  public SideTrdRegTimestampType(int data) {
    super(1013, data);
  }
}
