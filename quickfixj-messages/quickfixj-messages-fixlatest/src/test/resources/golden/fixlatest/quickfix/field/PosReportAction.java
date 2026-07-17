/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PosReportAction extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2364;

  public static final int NEW = 1;

  public static final int REPLACE = 2;

  public static final int CANCEL = 3;

  public static final int REVERSE = 4;

  public PosReportAction() {
    super(2364);
  }

  public PosReportAction(Integer data) {
    super(2364, data);
  }

  public PosReportAction(int data) {
    super(2364, data);
  }
}
