/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class NewsCategory extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1473;

  public static final int COMPANY_NEWS = 0;

  public static final int MARKETPLACE_NEWS = 1;

  public static final int FINANCIAL_MARKET_NEWS = 2;

  public static final int TECHNICAL_NEWS = 3;

  public static final int OTHER_NEWS = 99;

  public NewsCategory() {
    super(1473);
  }

  public NewsCategory(Integer data) {
    super(1473, data);
  }

  public NewsCategory(int data) {
    super(1473, data);
  }
}
