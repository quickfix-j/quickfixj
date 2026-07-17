/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PegLimitType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 837;

  public static final int OR_BETTER = 0;

  public static final int STRICT = 1;

  public static final int OR_WORSE = 2;

  public PegLimitType() {
    super(837);
  }

  public PegLimitType(Integer data) {
    super(837, data);
  }

  public PegLimitType(int data) {
    super(837, data);
  }
}
