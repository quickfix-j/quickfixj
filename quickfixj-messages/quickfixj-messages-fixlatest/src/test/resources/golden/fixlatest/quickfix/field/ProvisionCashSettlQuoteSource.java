/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ProvisionCashSettlQuoteSource extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40112;

  public static final int BLOOMBERG = 0;

  public static final int REUTERS = 1;

  public static final int TELERATE = 2;

  public static final int OTHER = 99;

  public ProvisionCashSettlQuoteSource() {
    super(40112);
  }

  public ProvisionCashSettlQuoteSource(Integer data) {
    super(40112, data);
  }

  public ProvisionCashSettlQuoteSource(int data) {
    super(40112, data);
  }
}
