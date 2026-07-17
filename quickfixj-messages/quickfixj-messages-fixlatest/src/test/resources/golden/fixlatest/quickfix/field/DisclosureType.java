/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class DisclosureType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1813;

  public static final int VOLUME = 1;

  public static final int PRICE = 2;

  public static final int SIDE = 3;

  public static final int AON = 4;

  public static final int GENERAL = 5;

  public static final int CLEARING_ACCOUNT = 6;

  public static final int CMTAACCOUNT = 7;

  public DisclosureType() {
    super(1813);
  }

  public DisclosureType(Integer data) {
    super(1813, data);
  }

  public DisclosureType(int data) {
    super(1813, data);
  }
}
