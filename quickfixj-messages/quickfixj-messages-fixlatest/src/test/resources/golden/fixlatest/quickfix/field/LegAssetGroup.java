/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class LegAssetGroup extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2348;

  public static final int FINANCIALS = 1;

  public static final int COMMODITIES = 2;

  public static final int ALTERNATIVE_INVESTMENTS = 3;

  public LegAssetGroup() {
    super(2348);
  }

  public LegAssetGroup(Integer data) {
    super(2348, data);
  }

  public LegAssetGroup(int data) {
    super(2348, data);
  }
}
