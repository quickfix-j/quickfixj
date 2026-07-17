/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class MatchExceptionType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2773;

  public static final int NO_MATCHING_CONFIRMATION = 0;

  public static final int NO_MATCHING_ALLOCATION = 1;

  public static final int ALLOCATION_DATA_ELEMENT_MISSING = 2;

  public static final int CONFIRMATION_DATA_ELEMENT_MISSING = 3;

  public static final int DATA_DIFFERENCE_NOT_WITHIN_TOLERANCE = 4;

  public static final int MATCH_WITHIN_TOLERANCE = 5;

  public static final int OTHER = 99;

  public MatchExceptionType() {
    super(2773);
  }

  public MatchExceptionType(Integer data) {
    super(2773, data);
  }

  public MatchExceptionType(int data) {
    super(2773, data);
  }
}
