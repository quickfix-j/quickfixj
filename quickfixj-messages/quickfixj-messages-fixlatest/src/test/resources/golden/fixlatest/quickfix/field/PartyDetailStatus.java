/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PartyDetailStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1672;

  public static final int ACTIVE = 0;

  public static final int SUSPENDED = 1;

  public static final int HALTED = 2;

  public PartyDetailStatus() {
    super(1672);
  }

  public PartyDetailStatus(Integer data) {
    super(1672, data);
  }

  public PartyDetailStatus(int data) {
    super(1672, data);
  }
}
