/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class MultiLegReportingType extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 442;

  public static final char SINGLE_SECURITY = '1';

  public static final char INDIVIDUAL_LEG_OF_AMULTI_LEG_SECURITY = '2';

  public static final char MULTI_LEG_SECURITY = '3';

  public MultiLegReportingType() {
    super(442);
  }

  public MultiLegReportingType(Character data) {
    super(442, data);
  }

  public MultiLegReportingType(char data) {
    super(442, data);
  }
}
