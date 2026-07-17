/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class NBBOEntryType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2831;

  public static final int BID = 0;

  public static final int OFFER = 1;

  public static final int MID_PRICE = 2;

  public NBBOEntryType() {
    super(2831);
  }

  public NBBOEntryType(Integer data) {
    super(2831, data);
  }

  public NBBOEntryType(int data) {
    super(2831, data);
  }
}
