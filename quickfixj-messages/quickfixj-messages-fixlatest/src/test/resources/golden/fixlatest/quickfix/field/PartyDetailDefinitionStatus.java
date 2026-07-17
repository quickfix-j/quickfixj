/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PartyDetailDefinitionStatus extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1879;

  public static final int ACCEPTED = 0;

  public static final int ACCEPTED_WITH_CHANGES = 1;

  public static final int REJECTED = 2;

  public PartyDetailDefinitionStatus() {
    super(1879);
  }

  public PartyDetailDefinitionStatus(Integer data) {
    super(1879, data);
  }

  public PartyDetailDefinitionStatus(int data) {
    super(1879, data);
  }
}
