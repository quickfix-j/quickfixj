/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ContingencyType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1385;

  public static final int ONE_CANCELS_THE_OTHER = 1;

  public static final int ONE_TRIGGERS_THE_OTHER = 2;

  public static final int ONE_UPDATES_THE_OTHER_ABSOLUTE = 3;

  public static final int ONE_UPDATES_THE_OTHER_PROPORTIONAL = 4;

  public static final int BID_AND_OFFER = 5;

  public static final int BID_AND_OFFER_OCO = 6;

  public ContingencyType() {
    super(1385);
  }

  public ContingencyType(Integer data) {
    super(1385, data);
  }

  public ContingencyType(int data) {
    super(1385, data);
  }
}
