/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class TradeRequestType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 569;

  public static final int ALL_TRADES = 0;

  public static final int MATCHED_TRADES_MATCHING_CRITERIA = 1;

  public static final int UNMATCHED_TRADES_THAT_MATCH_CRITERIA = 2;

  public static final int UNREPORTED_TRADES_THAT_MATCH_CRITERIA = 3;

  public static final int ADVISORIES_THAT_MATCH_CRITERIA = 4;

  public TradeRequestType() {
    super(569);
  }

  public TradeRequestType(Integer data) {
    super(569, data);
  }

  public TradeRequestType(int data) {
    super(569, data);
  }
}
