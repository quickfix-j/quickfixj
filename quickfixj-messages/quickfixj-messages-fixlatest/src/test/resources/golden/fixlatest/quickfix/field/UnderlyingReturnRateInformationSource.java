/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingReturnRateInformationSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 43061;

  public static final int BLOOMBERG = 0;

  public static final int REUTERS = 1;

  public static final int TELERATE = 2;

  public static final int ISDARATE_OPTION = 3;

  public static final int OTHER = 99;

  public UnderlyingReturnRateInformationSource() {
    super(43061);
  }

  public UnderlyingReturnRateInformationSource(Integer data) {
    super(43061, data);
  }

  public UnderlyingReturnRateInformationSource(int data) {
    super(43061, data);
  }
}
