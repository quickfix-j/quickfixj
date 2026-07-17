/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AllocReportType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 794;

  public static final int PRELIMINARY_REQUEST_TO_INTERMEDIARY = 2;

  public static final int SELLSIDE_CALCULATED_USING_PRELIMINARY = 3;

  public static final int SELLSIDE_CALCULATED_WITHOUT_PRELIMINARY = 4;

  public static final int WAREHOUSE_RECAP = 5;

  public static final int REQUEST_TO_INTERMEDIARY = 8;

  public static final int ACCEPT = 9;

  public static final int REJECT = 10;

  public static final int ACCEPT_PENDING = 11;

  public static final int COMPLETE = 12;

  public static final int REVERSE_PENDING = 14;

  public static final int GIVEUP = 15;

  public static final int TAKEUP = 16;

  public static final int REVERSAL = 17;

  public static final int ALLEGED = 18;

  public static final int SUB_ALLOCATION_GIVEUP = 19;

  public AllocReportType() {
    super(794);
  }

  public AllocReportType(Integer data) {
    super(794, data);
  }

  public AllocReportType(int data) {
    super(794, data);
  }
}
