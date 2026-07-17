/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class NewsRefType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1477;

  public static final int REPLACEMENT = 0;

  public static final int OTHER_LANGUAGE = 1;

  public static final int COMPLIMENTARY = 2;

  public static final int WITHDRAWAL = 3;

  public NewsRefType() {
    super(1477);
  }

  public NewsRefType(Integer data) {
    super(1477, data);
  }

  public NewsRefType(int data) {
    super(1477, data);
  }
}
