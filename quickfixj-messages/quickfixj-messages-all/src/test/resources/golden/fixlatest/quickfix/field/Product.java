/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class Product extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 460;

  public static final int AGENCY = 1;

  public static final int COMMODITY = 2;

  public static final int CORPORATE = 3;

  public static final int CURRENCY = 4;

  public static final int EQUITY = 5;

  public static final int GOVERNMENT = 6;

  public static final int INDEX = 7;

  public static final int LOAN = 8;

  public static final int MONEYMARKET = 9;

  public static final int MORTGAGE = 10;

  public static final int MUNICIPAL = 11;

  public static final int OTHER = 12;

  public static final int FINANCING = 13;

  public Product() {
    super(460);
  }

  public Product(Integer data) {
    super(460, data);
  }

  public Product(int data) {
    super(460, data);
  }
}
