/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class RateSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1446;

  public static final int BLOOMBERG = 0;

  public static final int REUTERS = 1;

  public static final int TELERATE = 2;

  public static final int ISDARATE_OPTION = 3;

  public static final int OTHER = 99;

  public RateSource() {
    super(1446);
  }

  public RateSource(Integer data) {
    super(1446, data);
  }

  public RateSource(int data) {
    super(1446, data);
  }
}
