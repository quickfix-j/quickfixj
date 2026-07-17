/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class RespondentType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1172;

  public static final int ALL_MARKET_PARTICIPANTS = 1;

  public static final int SPECIFIED_MARKET_PARTICIPANTS = 2;

  public static final int ALL_MARKET_MAKERS = 3;

  public static final int PRIMARY_MARKET_MAKER = 4;

  public RespondentType() {
    super(1172);
  }

  public RespondentType(Integer data) {
    super(1172, data);
  }

  public RespondentType(int data) {
    super(1172, data);
  }
}
