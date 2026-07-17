/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class ProvisionCashSettlQuoteType extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 40111;

  public static final int BID = 0;

  public static final int MID = 1;

  public static final int OFFER = 2;

  public static final int EXERCISING_PARTY_PAYS = 3;

  public ProvisionCashSettlQuoteType() {
    super(40111);
  }

  public ProvisionCashSettlQuoteType(Integer data) {
    super(40111, data);
  }

  public ProvisionCashSettlQuoteType(int data) {
    super(40111, data);
  }
}
