/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PartyDetailRequestResult extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1877;

  public static final int SUCCESSFUL = 0;

  public static final int INVALID_PARTY = 1;

  public static final int INVALID_RELATED_PARTY = 2;

  public static final int INVALID_PARTY_STATUS = 3;

  public static final int NOT_AUTHORIZED = 98;

  public static final int OTHER = 99;

  public PartyDetailRequestResult() {
    super(1877);
  }

  public PartyDetailRequestResult(Integer data) {
    super(1877, data);
  }

  public PartyDetailRequestResult(int data) {
    super(1877, data);
  }
}
