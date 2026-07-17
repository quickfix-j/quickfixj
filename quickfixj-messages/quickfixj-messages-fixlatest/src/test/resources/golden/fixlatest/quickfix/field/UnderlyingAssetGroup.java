/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class UnderlyingAssetGroup extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2491;

  public static final int FINANCIALS = 1;

  public static final int COMMODITIES = 2;

  public static final int ALTERNATIVE_INVESTMENTS = 3;

  public UnderlyingAssetGroup() {
    super(2491);
  }

  public UnderlyingAssetGroup(Integer data) {
    super(2491, data);
  }

  public UnderlyingAssetGroup(int data) {
    super(2491, data);
  }
}
