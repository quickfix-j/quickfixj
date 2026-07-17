/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PartyActionRejectReason extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2333;

  public static final int INVALID_PARTY = 0;

  public static final int UNK_REQ_PARTY = 1;

  public static final int NOT_AUTHORIZED = 98;

  public static final int OTHER = 99;

  public PartyActionRejectReason() {
    super(2333);
  }

  public PartyActionRejectReason(Integer data) {
    super(2333, data);
  }

  public PartyActionRejectReason(int data) {
    super(2333, data);
  }
}
