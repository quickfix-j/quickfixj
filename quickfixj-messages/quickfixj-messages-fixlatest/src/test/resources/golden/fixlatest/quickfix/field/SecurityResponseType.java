/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class SecurityResponseType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 323;

  public static final int ACCEPT_AS_IS = 1;

  public static final int ACCEPT_WITH_REVISIONS = 2;

  public static final int LIST_OF_SECURITY_TYPES_RETURNED_PER_REQUEST = 3;

  public static final int LIST_OF_SECURITIES_RETURNED_PER_REQUEST = 4;

  public static final int REJECT_SECURITY_PROPOSAL = 5;

  public static final int CANNOT_MATCH_SELECTION_CRITERIA = 6;

  public SecurityResponseType() {
    super(323);
  }

  public SecurityResponseType(Integer data) {
    super(323, data);
  }

  public SecurityResponseType(int data) {
    super(323, data);
  }
}
