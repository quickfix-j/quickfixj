/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PartyActionResponse extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2332;

  public static final int ACCEPTED = 0;

  public static final int COMPLETED = 1;

  public static final int REJECTED = 2;

  public PartyActionResponse() {
    super(2332);
  }

  public PartyActionResponse(Integer data) {
    super(2332, data);
  }

  public PartyActionResponse(int data) {
    super(2332, data);
  }
}
