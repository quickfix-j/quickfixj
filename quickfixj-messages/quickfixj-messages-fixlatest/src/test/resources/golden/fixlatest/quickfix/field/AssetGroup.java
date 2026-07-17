/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class AssetGroup extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2210;

  public static final int FINANCIALS = 1;

  public static final int COMMODITIES = 2;

  public static final int ALTERNATIVE_INVESTMENTS = 3;

  public AssetGroup() {
    super(2210);
  }

  public AssetGroup(Integer data) {
    super(2210, data);
  }

  public AssetGroup(int data) {
    super(2210, data);
  }
}
