/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class CommodityFinalPriceType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2736;

  public static final int ARGUS_MC_CLOSKEY = 0;

  public static final int BALTIC = 1;

  public static final int EXCHANGE = 2;

  public static final int GLOBAL_COAL = 3;

  public static final int IHSMC_CLOSKEY = 4;

  public static final int PLATTS = 5;

  public static final int OTHER = 99;

  public CommodityFinalPriceType() {
    super(2736);
  }

  public CommodityFinalPriceType(Integer data) {
    super(2736, data);
  }

  public CommodityFinalPriceType(int data) {
    super(2736, data);
  }
}
