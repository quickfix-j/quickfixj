/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MDBookType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1021;

  public static final int TOP_OF_BOOK = 1;

  public static final int PRICE_DEPTH = 2;

  public static final int ORDER_DEPTH = 3;

  public MDBookType() {
    super(1021);
  }

  public MDBookType(Integer data) {
    super(1021, data);
  }

  public MDBookType(int data) {
    super(1021, data);
  }
}
