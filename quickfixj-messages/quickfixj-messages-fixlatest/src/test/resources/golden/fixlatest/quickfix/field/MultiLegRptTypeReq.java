/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MultiLegRptTypeReq extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 563;

  public static final int REPORT_BY_MULITLEG_SECURITY_ONLY = 0;

  public static final int REPORT_BY_MULTILEG_SECURITY_AND_INSTRUMENT_LEGS = 1;

  public static final int REPORT_BY_INSTRUMENT_LEGS_ONLY = 2;

  public MultiLegRptTypeReq() {
    super(563);
  }

  public MultiLegRptTypeReq(Integer data) {
    super(563, data);
  }

  public MultiLegRptTypeReq(int data) {
    super(563, data);
  }
}
