/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class DiscretionLimitType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 843;

  public static final int OR_BETTER = 0;

  public static final int STRICT = 1;

  public static final int OR_WORSE = 2;

  public DiscretionLimitType() {
    super(843);
  }

  public DiscretionLimitType(Integer data) {
    super(843, data);
  }

  public DiscretionLimitType(int data) {
    super(843, data);
  }
}
