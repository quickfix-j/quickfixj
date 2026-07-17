/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ReturnRateInformationSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 42762;

  public static final int BLOOMBERG = 0;

  public static final int REUTERS = 1;

  public static final int TELERATE = 2;

  public static final int ISDARATE_OPTION = 3;

  public static final int OTHER = 99;

  public ReturnRateInformationSource() {
    super(42762);
  }

  public ReturnRateInformationSource(Integer data) {
    super(42762, data);
  }

  public ReturnRateInformationSource(int data) {
    super(42762, data);
  }
}
