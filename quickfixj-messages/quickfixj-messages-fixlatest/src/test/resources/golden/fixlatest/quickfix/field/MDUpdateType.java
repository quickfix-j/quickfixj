/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MDUpdateType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 265;

  public static final int FULL_REFRESH = 0;

  public static final int INCREMENTAL_REFRESH = 1;

  public MDUpdateType() {
    super(265);
  }

  public MDUpdateType(Integer data) {
    super(265, data);
  }

  public MDUpdateType(int data) {
    super(265, data);
  }
}
