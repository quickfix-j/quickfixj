/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MassActionResponse extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1375;

  public static final int REJECTED = 0;

  public static final int ACCEPTED = 1;

  public static final int COMPLETED = 2;

  public MassActionResponse() {
    super(1375);
  }

  public MassActionResponse(Integer data) {
    super(1375, data);
  }

  public MassActionResponse(int data) {
    super(1375, data);
  }
}
