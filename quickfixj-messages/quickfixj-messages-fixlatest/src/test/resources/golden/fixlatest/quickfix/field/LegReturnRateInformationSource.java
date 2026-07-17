/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegReturnRateInformationSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42561;

  public static final int BLOOMBERG = 0;

  public static final int REUTERS = 1;

  public static final int TELERATE = 2;

  public static final int ISDARATE_OPTION = 3;

  public static final int OTHER = 99;

  public LegReturnRateInformationSource() {
    super(42561);
  }

  public LegReturnRateInformationSource(Integer data) {
    super(42561, data);
  }

  public LegReturnRateInformationSource(int data) {
    super(42561, data);
  }
}
