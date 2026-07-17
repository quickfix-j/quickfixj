/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class AccountSummaryReport extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "CQ";

  public AccountSummaryReport() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public AccountSummaryReport (quickfix.field.AccountSummaryReportID accountSummaryReportID, quickfix.field.ClearingBusinessDate clearingBusinessDate) {
    this();
    setField(accountSummaryReportID);
    setField(clearingBusinessDate);
  }

  public void set(quickfix.field.AccountSummaryReportID value) {
    setField(value);
  }

  public quickfix.field.AccountSummaryReportID get(quickfix.field.AccountSummaryReportID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AccountSummaryReportID getAccountSummaryReportID() throws FieldNotFound {
    return get(new quickfix.field.AccountSummaryReportID());
  }

  public boolean isSet(quickfix.field.AccountSummaryReportID field) {
    return isSetField(field);
  }

  public boolean isSetAccountSummaryReportID() {
    return isSetField(1699);
  }

  public void set(quickfix.field.ClearingBusinessDate value) {
    setField(value);
  }

  public quickfix.field.ClearingBusinessDate get(quickfix.field.ClearingBusinessDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingBusinessDate getClearingBusinessDate() throws FieldNotFound {
    return get(new quickfix.field.ClearingBusinessDate());
  }

  public boolean isSet(quickfix.field.ClearingBusinessDate field) {
    return isSetField(field);
  }

  public boolean isSetClearingBusinessDate() {
    return isSetField(715);
  }

  public void set(quickfix.field.Currency value) {
    setField(value);
  }

  public quickfix.field.Currency get(quickfix.field.Currency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Currency getCurrency() throws FieldNotFound {
    return get(new quickfix.field.Currency());
  }

  public boolean isSet(quickfix.field.Currency field) {
    return isSetField(field);
  }

  public boolean isSetCurrency() {
    return isSetField(15);
  }

  public void set(quickfix.field.TotalNetValue value) {
    setField(value);
  }

  public quickfix.field.TotalNetValue get(quickfix.field.TotalNetValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TotalNetValue getTotalNetValue() throws FieldNotFound {
    return get(new quickfix.field.TotalNetValue());
  }

  public boolean isSet(quickfix.field.TotalNetValue field) {
    return isSetField(field);
  }

  public boolean isSetTotalNetValue() {
    return isSetField(900);
  }

  public void set(quickfix.field.MarginExcess value) {
    setField(value);
  }

  public quickfix.field.MarginExcess get(quickfix.field.MarginExcess value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginExcess getMarginExcess() throws FieldNotFound {
    return get(new quickfix.field.MarginExcess());
  }

  public boolean isSet(quickfix.field.MarginExcess field) {
    return isSetField(field);
  }

  public boolean isSetMarginExcess() {
    return isSetField(899);
  }

  public void set(quickfix.field.SettlSessID value) {
    setField(value);
  }

  public quickfix.field.SettlSessID get(quickfix.field.SettlSessID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlSessID getSettlSessID() throws FieldNotFound {
    return get(new quickfix.field.SettlSessID());
  }

  public boolean isSet(quickfix.field.SettlSessID field) {
    return isSetField(field);
  }

  public boolean isSetSettlSessID() {
    return isSetField(716);
  }

  public void set(quickfix.field.SettlSessSubID value) {
    setField(value);
  }

  public quickfix.field.SettlSessSubID get(quickfix.field.SettlSessSubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlSessSubID getSettlSessSubID() throws FieldNotFound {
    return get(new quickfix.field.SettlSessSubID());
  }

  public boolean isSet(quickfix.field.SettlSessSubID field) {
    return isSetField(field);
  }

  public boolean isSetSettlSessSubID() {
    return isSetField(717);
  }

  public void set(quickfix.field.TransactTime value) {
    setField(value);
  }

  public quickfix.field.TransactTime get(quickfix.field.TransactTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransactTime getTransactTime() throws FieldNotFound {
    return get(new quickfix.field.TransactTime());
  }

  public boolean isSet(quickfix.field.TransactTime field) {
    return isSetField(field);
  }

  public boolean isSetTransactTime() {
    return isSetField(60);
  }

  public void set(quickfix.fixlatest.component.SettlementAmountGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SettlementAmountGrp get(quickfix.fixlatest.component.SettlementAmountGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SettlementAmountGrp getSettlementAmountGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SettlementAmountGrp());
  }

  public void set(quickfix.field.NoSettlementAmounts value) {
    setField(value);
  }

  public quickfix.field.NoSettlementAmounts get(quickfix.field.NoSettlementAmounts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSettlementAmounts getNoSettlementAmounts() throws FieldNotFound {
    return get(new quickfix.field.NoSettlementAmounts());
  }

  public boolean isSet(quickfix.field.NoSettlementAmounts field) {
    return isSetField(field);
  }

  public boolean isSetNoSettlementAmounts() {
    return isSetField(1700);
  }

public static class NoSettlementAmounts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1701, 1702, 0};

  public NoSettlementAmounts() {
    super(1700, 1701, ORDER);
  }

  public void set(quickfix.field.SettlementAmount value) {
    setField(value);
  }

  public quickfix.field.SettlementAmount get(quickfix.field.SettlementAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlementAmount getSettlementAmount() throws FieldNotFound {
    return get(new quickfix.field.SettlementAmount());
  }

  public boolean isSet(quickfix.field.SettlementAmount field) {
    return isSetField(field);
  }

  public boolean isSetSettlementAmount() {
    return isSetField(1701);
  }

  public void set(quickfix.field.SettlementAmountCurrency value) {
    setField(value);
  }

  public quickfix.field.SettlementAmountCurrency get(quickfix.field.SettlementAmountCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SettlementAmountCurrency getSettlementAmountCurrency() throws FieldNotFound {
    return get(new quickfix.field.SettlementAmountCurrency());
  }

  public boolean isSet(quickfix.field.SettlementAmountCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSettlementAmountCurrency() {
    return isSetField(1702);
  }
}

  public void set(quickfix.fixlatest.component.MarginAmount component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MarginAmount get(quickfix.fixlatest.component.MarginAmount component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MarginAmount getMarginAmountComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MarginAmount());
  }

  public void set(quickfix.field.NoMarginAmt value) {
    setField(value);
  }

  public quickfix.field.NoMarginAmt get(quickfix.field.NoMarginAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMarginAmt getNoMarginAmt() throws FieldNotFound {
    return get(new quickfix.field.NoMarginAmt());
  }

  public boolean isSet(quickfix.field.NoMarginAmt field) {
    return isSetField(field);
  }

  public boolean isSetNoMarginAmt() {
    return isSetField(1643);
  }

public static class NoMarginAmt extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1645, 1644, 1646, 2088, 2089, 1714, 1715, 2851, 0};

  public NoMarginAmt() {
    super(1643, 1645, ORDER);
  }

  public void set(quickfix.field.MarginAmt value) {
    setField(value);
  }

  public quickfix.field.MarginAmt get(quickfix.field.MarginAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmt getMarginAmt() throws FieldNotFound {
    return get(new quickfix.field.MarginAmt());
  }

  public boolean isSet(quickfix.field.MarginAmt field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmt() {
    return isSetField(1645);
  }

  public void set(quickfix.field.MarginAmtType value) {
    setField(value);
  }

  public quickfix.field.MarginAmtType get(quickfix.field.MarginAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmtType getMarginAmtType() throws FieldNotFound {
    return get(new quickfix.field.MarginAmtType());
  }

  public boolean isSet(quickfix.field.MarginAmtType field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmtType() {
    return isSetField(1644);
  }

  public void set(quickfix.field.MarginAmtCcy value) {
    setField(value);
  }

  public quickfix.field.MarginAmtCcy get(quickfix.field.MarginAmtCcy value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmtCcy getMarginAmtCcy() throws FieldNotFound {
    return get(new quickfix.field.MarginAmtCcy());
  }

  public boolean isSet(quickfix.field.MarginAmtCcy field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmtCcy() {
    return isSetField(1646);
  }

  public void set(quickfix.field.MarginAmtFXRate value) {
    setField(value);
  }

  public quickfix.field.MarginAmtFXRate get(quickfix.field.MarginAmtFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmtFXRate getMarginAmtFXRate() throws FieldNotFound {
    return get(new quickfix.field.MarginAmtFXRate());
  }

  public boolean isSet(quickfix.field.MarginAmtFXRate field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmtFXRate() {
    return isSetField(2088);
  }

  public void set(quickfix.field.MarginAmtFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.MarginAmtFXRateCalc get(quickfix.field.MarginAmtFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmtFXRateCalc getMarginAmtFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.MarginAmtFXRateCalc());
  }

  public boolean isSet(quickfix.field.MarginAmtFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmtFXRateCalc() {
    return isSetField(2089);
  }

  public void set(quickfix.field.MarginAmountMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.MarginAmountMarketSegmentID get(quickfix.field.MarginAmountMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmountMarketSegmentID getMarginAmountMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.MarginAmountMarketSegmentID());
  }

  public boolean isSet(quickfix.field.MarginAmountMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmountMarketSegmentID() {
    return isSetField(1714);
  }

  public void set(quickfix.field.MarginAmountMarketID value) {
    setField(value);
  }

  public quickfix.field.MarginAmountMarketID get(quickfix.field.MarginAmountMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginAmountMarketID getMarginAmountMarketID() throws FieldNotFound {
    return get(new quickfix.field.MarginAmountMarketID());
  }

  public boolean isSet(quickfix.field.MarginAmountMarketID field) {
    return isSetField(field);
  }

  public boolean isSetMarginAmountMarketID() {
    return isSetField(1715);
  }

  public void set(quickfix.field.MarginDirection value) {
    setField(value);
  }

  public quickfix.field.MarginDirection get(quickfix.field.MarginDirection value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginDirection getMarginDirection() throws FieldNotFound {
    return get(new quickfix.field.MarginDirection());
  }

  public boolean isSet(quickfix.field.MarginDirection field) {
    return isSetField(field);
  }

  public boolean isSetMarginDirection() {
    return isSetField(2851);
  }
}

  public void set(quickfix.fixlatest.component.Parties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.Parties get(quickfix.fixlatest.component.Parties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.Parties getPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.Parties());
  }

  public void set(quickfix.field.NoPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoPartyIDs get(quickfix.field.NoPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyIDs getNoPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPartyIDs());
  }

  public boolean isSet(quickfix.field.NoPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyIDs() {
    return isSetField(453);
  }

public static class NoPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {448, 447, 452, 2376, 802, 0};

  public NoPartyIDs() {
    super(453, 448, ORDER);
  }

  public void set(quickfix.field.PartyID value) {
    setField(value);
  }

  public quickfix.field.PartyID get(quickfix.field.PartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyID getPartyID() throws FieldNotFound {
    return get(new quickfix.field.PartyID());
  }

  public boolean isSet(quickfix.field.PartyID field) {
    return isSetField(field);
  }

  public boolean isSetPartyID() {
    return isSetField(448);
  }

  public void set(quickfix.field.PartyIDSource value) {
    setField(value);
  }

  public quickfix.field.PartyIDSource get(quickfix.field.PartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyIDSource getPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.PartyIDSource());
  }

  public boolean isSet(quickfix.field.PartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetPartyIDSource() {
    return isSetField(447);
  }

  public void set(quickfix.field.PartyRole value) {
    setField(value);
  }

  public quickfix.field.PartyRole get(quickfix.field.PartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyRole getPartyRole() throws FieldNotFound {
    return get(new quickfix.field.PartyRole());
  }

  public boolean isSet(quickfix.field.PartyRole field) {
    return isSetField(field);
  }

  public boolean isSetPartyRole() {
    return isSetField(452);
  }

  public void set(quickfix.field.PartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.PartyRoleQualifier get(quickfix.field.PartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyRoleQualifier getPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.PartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.PartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetPartyRoleQualifier() {
    return isSetField(2376);
  }

  public void set(quickfix.fixlatest.component.PtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PtysSubGrp get(quickfix.fixlatest.component.PtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PtysSubGrp getPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PtysSubGrp());
  }

  public void set(quickfix.field.NoPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoPartySubIDs get(quickfix.field.NoPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartySubIDs getNoPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPartySubIDs() {
    return isSetField(802);
  }

public static class NoPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {523, 803, 0};

  public NoPartySubIDs() {
    super(802, 523, ORDER);
  }

  public void set(quickfix.field.PartySubID value) {
    setField(value);
  }

  public quickfix.field.PartySubID get(quickfix.field.PartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartySubID getPartySubID() throws FieldNotFound {
    return get(new quickfix.field.PartySubID());
  }

  public boolean isSet(quickfix.field.PartySubID field) {
    return isSetField(field);
  }

  public boolean isSetPartySubID() {
    return isSetField(523);
  }

  public void set(quickfix.field.PartySubIDType value) {
    setField(value);
  }

  public quickfix.field.PartySubIDType get(quickfix.field.PartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartySubIDType getPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.PartySubIDType());
  }

  public boolean isSet(quickfix.field.PartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetPartySubIDType() {
    return isSetField(803);
  }
}
}

  public void set(quickfix.fixlatest.component.CollateralAmountGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.CollateralAmountGrp get(quickfix.fixlatest.component.CollateralAmountGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.CollateralAmountGrp getCollateralAmountGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.CollateralAmountGrp());
  }

  public void set(quickfix.field.NoCollateralAmounts value) {
    setField(value);
  }

  public quickfix.field.NoCollateralAmounts get(quickfix.field.NoCollateralAmounts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoCollateralAmounts getNoCollateralAmounts() throws FieldNotFound {
    return get(new quickfix.field.NoCollateralAmounts());
  }

  public boolean isSet(quickfix.field.NoCollateralAmounts field) {
    return isSetField(field);
  }

  public boolean isSetNoCollateralAmounts() {
    return isSetField(1703);
  }

public static class NoCollateralAmounts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1704, 1705, 2632, 2090, 2091, 1706, 2092, 2093, 1902, 2350, 2690, 2689, 2840, 2841, 0};

  public NoCollateralAmounts() {
    super(1703, 1704, ORDER);
  }

  public void set(quickfix.field.CurrentCollateralAmount value) {
    setField(value);
  }

  public quickfix.field.CurrentCollateralAmount get(quickfix.field.CurrentCollateralAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CurrentCollateralAmount getCurrentCollateralAmount() throws FieldNotFound {
    return get(new quickfix.field.CurrentCollateralAmount());
  }

  public boolean isSet(quickfix.field.CurrentCollateralAmount field) {
    return isSetField(field);
  }

  public boolean isSetCurrentCollateralAmount() {
    return isSetField(1704);
  }

  public void set(quickfix.field.CollateralCurrency value) {
    setField(value);
  }

  public quickfix.field.CollateralCurrency get(quickfix.field.CollateralCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralCurrency getCollateralCurrency() throws FieldNotFound {
    return get(new quickfix.field.CollateralCurrency());
  }

  public boolean isSet(quickfix.field.CollateralCurrency field) {
    return isSetField(field);
  }

  public boolean isSetCollateralCurrency() {
    return isSetField(1705);
  }

  public void set(quickfix.field.CollateralAmountType value) {
    setField(value);
  }

  public quickfix.field.CollateralAmountType get(quickfix.field.CollateralAmountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralAmountType getCollateralAmountType() throws FieldNotFound {
    return get(new quickfix.field.CollateralAmountType());
  }

  public boolean isSet(quickfix.field.CollateralAmountType field) {
    return isSetField(field);
  }

  public boolean isSetCollateralAmountType() {
    return isSetField(2632);
  }

  public void set(quickfix.field.CollateralFXRate value) {
    setField(value);
  }

  public quickfix.field.CollateralFXRate get(quickfix.field.CollateralFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralFXRate getCollateralFXRate() throws FieldNotFound {
    return get(new quickfix.field.CollateralFXRate());
  }

  public boolean isSet(quickfix.field.CollateralFXRate field) {
    return isSetField(field);
  }

  public boolean isSetCollateralFXRate() {
    return isSetField(2090);
  }

  public void set(quickfix.field.CollateralFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.CollateralFXRateCalc get(quickfix.field.CollateralFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralFXRateCalc getCollateralFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.CollateralFXRateCalc());
  }

  public boolean isSet(quickfix.field.CollateralFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetCollateralFXRateCalc() {
    return isSetField(2091);
  }

  public void set(quickfix.field.CollateralType value) {
    setField(value);
  }

  public quickfix.field.CollateralType get(quickfix.field.CollateralType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralType getCollateralType() throws FieldNotFound {
    return get(new quickfix.field.CollateralType());
  }

  public boolean isSet(quickfix.field.CollateralType field) {
    return isSetField(field);
  }

  public boolean isSetCollateralType() {
    return isSetField(1706);
  }

  public void set(quickfix.field.CollateralAmountMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.CollateralAmountMarketSegmentID get(quickfix.field.CollateralAmountMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralAmountMarketSegmentID getCollateralAmountMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.CollateralAmountMarketSegmentID());
  }

  public boolean isSet(quickfix.field.CollateralAmountMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetCollateralAmountMarketSegmentID() {
    return isSetField(2092);
  }

  public void set(quickfix.field.CollateralAmountMarketID value) {
    setField(value);
  }

  public quickfix.field.CollateralAmountMarketID get(quickfix.field.CollateralAmountMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralAmountMarketID getCollateralAmountMarketID() throws FieldNotFound {
    return get(new quickfix.field.CollateralAmountMarketID());
  }

  public boolean isSet(quickfix.field.CollateralAmountMarketID field) {
    return isSetField(field);
  }

  public boolean isSetCollateralAmountMarketID() {
    return isSetField(2093);
  }

  public void set(quickfix.field.HaircutIndicator value) {
    setField(value);
  }

  public quickfix.field.HaircutIndicator get(quickfix.field.HaircutIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.HaircutIndicator getHaircutIndicator() throws FieldNotFound {
    return get(new quickfix.field.HaircutIndicator());
  }

  public boolean isSet(quickfix.field.HaircutIndicator field) {
    return isSetField(field);
  }

  public boolean isSetHaircutIndicator() {
    return isSetField(1902);
  }

  public void set(quickfix.field.CollateralPortfolioID value) {
    setField(value);
  }

  public quickfix.field.CollateralPortfolioID get(quickfix.field.CollateralPortfolioID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralPortfolioID getCollateralPortfolioID() throws FieldNotFound {
    return get(new quickfix.field.CollateralPortfolioID());
  }

  public boolean isSet(quickfix.field.CollateralPortfolioID field) {
    return isSetField(field);
  }

  public boolean isSetCollateralPortfolioID() {
    return isSetField(2350);
  }

  public void set(quickfix.field.CollateralPercentOverage value) {
    setField(value);
  }

  public quickfix.field.CollateralPercentOverage get(quickfix.field.CollateralPercentOverage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralPercentOverage getCollateralPercentOverage() throws FieldNotFound {
    return get(new quickfix.field.CollateralPercentOverage());
  }

  public boolean isSet(quickfix.field.CollateralPercentOverage field) {
    return isSetField(field);
  }

  public boolean isSetCollateralPercentOverage() {
    return isSetField(2690);
  }

  public void set(quickfix.field.CollateralMarketPrice value) {
    setField(value);
  }

  public quickfix.field.CollateralMarketPrice get(quickfix.field.CollateralMarketPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralMarketPrice getCollateralMarketPrice() throws FieldNotFound {
    return get(new quickfix.field.CollateralMarketPrice());
  }

  public boolean isSet(quickfix.field.CollateralMarketPrice field) {
    return isSetField(field);
  }

  public boolean isSetCollateralMarketPrice() {
    return isSetField(2689);
  }

  public void set(quickfix.field.CollateralReinvestmentRate value) {
    setField(value);
  }

  public quickfix.field.CollateralReinvestmentRate get(quickfix.field.CollateralReinvestmentRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollateralReinvestmentRate getCollateralReinvestmentRate() throws FieldNotFound {
    return get(new quickfix.field.CollateralReinvestmentRate());
  }

  public boolean isSet(quickfix.field.CollateralReinvestmentRate field) {
    return isSetField(field);
  }

  public boolean isSetCollateralReinvestmentRate() {
    return isSetField(2840);
  }

  public void set(quickfix.field.UnderlyingRefID value) {
    setField(value);
  }

  public quickfix.field.UnderlyingRefID get(quickfix.field.UnderlyingRefID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingRefID getUnderlyingRefID() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingRefID());
  }

  public boolean isSet(quickfix.field.UnderlyingRefID field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingRefID() {
    return isSetField(2841);
  }
}

  public void set(quickfix.fixlatest.component.PayCollectGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PayCollectGrp get(quickfix.fixlatest.component.PayCollectGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PayCollectGrp getPayCollectGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PayCollectGrp());
  }

  public void set(quickfix.field.NoPayCollects value) {
    setField(value);
  }

  public quickfix.field.NoPayCollects get(quickfix.field.NoPayCollects value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPayCollects getNoPayCollects() throws FieldNotFound {
    return get(new quickfix.field.NoPayCollects());
  }

  public boolean isSet(quickfix.field.NoPayCollects field) {
    return isSetField(field);
  }

  public boolean isSetNoPayCollects() {
    return isSetField(1707);
  }

public static class NoPayCollects extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1708, 1709, 2094, 2095, 1710, 1711, 1712, 1713, 0};

  public NoPayCollects() {
    super(1707, 1708, ORDER);
  }

  public void set(quickfix.field.PayCollectType value) {
    setField(value);
  }

  public quickfix.field.PayCollectType get(quickfix.field.PayCollectType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayCollectType getPayCollectType() throws FieldNotFound {
    return get(new quickfix.field.PayCollectType());
  }

  public boolean isSet(quickfix.field.PayCollectType field) {
    return isSetField(field);
  }

  public boolean isSetPayCollectType() {
    return isSetField(1708);
  }

  public void set(quickfix.field.PayCollectCurrency value) {
    setField(value);
  }

  public quickfix.field.PayCollectCurrency get(quickfix.field.PayCollectCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayCollectCurrency getPayCollectCurrency() throws FieldNotFound {
    return get(new quickfix.field.PayCollectCurrency());
  }

  public boolean isSet(quickfix.field.PayCollectCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPayCollectCurrency() {
    return isSetField(1709);
  }

  public void set(quickfix.field.PayCollectFXRate value) {
    setField(value);
  }

  public quickfix.field.PayCollectFXRate get(quickfix.field.PayCollectFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayCollectFXRate getPayCollectFXRate() throws FieldNotFound {
    return get(new quickfix.field.PayCollectFXRate());
  }

  public boolean isSet(quickfix.field.PayCollectFXRate field) {
    return isSetField(field);
  }

  public boolean isSetPayCollectFXRate() {
    return isSetField(2094);
  }

  public void set(quickfix.field.PayCollectFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.PayCollectFXRateCalc get(quickfix.field.PayCollectFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayCollectFXRateCalc getPayCollectFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.PayCollectFXRateCalc());
  }

  public boolean isSet(quickfix.field.PayCollectFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetPayCollectFXRateCalc() {
    return isSetField(2095);
  }

  public void set(quickfix.field.PayAmount value) {
    setField(value);
  }

  public quickfix.field.PayAmount get(quickfix.field.PayAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayAmount getPayAmount() throws FieldNotFound {
    return get(new quickfix.field.PayAmount());
  }

  public boolean isSet(quickfix.field.PayAmount field) {
    return isSetField(field);
  }

  public boolean isSetPayAmount() {
    return isSetField(1710);
  }

  public void set(quickfix.field.CollectAmount value) {
    setField(value);
  }

  public quickfix.field.CollectAmount get(quickfix.field.CollectAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CollectAmount getCollectAmount() throws FieldNotFound {
    return get(new quickfix.field.CollectAmount());
  }

  public boolean isSet(quickfix.field.CollectAmount field) {
    return isSetField(field);
  }

  public boolean isSetCollectAmount() {
    return isSetField(1711);
  }

  public void set(quickfix.field.PayCollectMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.PayCollectMarketSegmentID get(quickfix.field.PayCollectMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayCollectMarketSegmentID getPayCollectMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.PayCollectMarketSegmentID());
  }

  public boolean isSet(quickfix.field.PayCollectMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetPayCollectMarketSegmentID() {
    return isSetField(1712);
  }

  public void set(quickfix.field.PayCollectMarketID value) {
    setField(value);
  }

  public quickfix.field.PayCollectMarketID get(quickfix.field.PayCollectMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PayCollectMarketID getPayCollectMarketID() throws FieldNotFound {
    return get(new quickfix.field.PayCollectMarketID());
  }

  public boolean isSet(quickfix.field.PayCollectMarketID field) {
    return isSetField(field);
  }

  public boolean isSetPayCollectMarketID() {
    return isSetField(1713);
  }
}

  public void set(quickfix.fixlatest.component.PositionAmountData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PositionAmountData get(quickfix.fixlatest.component.PositionAmountData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PositionAmountData getPositionAmountDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PositionAmountData());
  }

  public void set(quickfix.field.NoPosAmt value) {
    setField(value);
  }

  public quickfix.field.NoPosAmt get(quickfix.field.NoPosAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPosAmt getNoPosAmt() throws FieldNotFound {
    return get(new quickfix.field.NoPosAmt());
  }

  public boolean isSet(quickfix.field.NoPosAmt field) {
    return isSetField(field);
  }

  public boolean isSetNoPosAmt() {
    return isSetField(753);
  }

public static class NoPosAmt extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {707, 708, 2096, 1055, 2097, 2098, 1585, 2099, 2100, 2876, 2877, 0};

  public NoPosAmt() {
    super(753, 707, ORDER);
  }

  public void set(quickfix.field.PosAmtType value) {
    setField(value);
  }

  public quickfix.field.PosAmtType get(quickfix.field.PosAmtType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtType getPosAmtType() throws FieldNotFound {
    return get(new quickfix.field.PosAmtType());
  }

  public boolean isSet(quickfix.field.PosAmtType field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtType() {
    return isSetField(707);
  }

  public void set(quickfix.field.PosAmt value) {
    setField(value);
  }

  public quickfix.field.PosAmt get(quickfix.field.PosAmt value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmt getPosAmt() throws FieldNotFound {
    return get(new quickfix.field.PosAmt());
  }

  public boolean isSet(quickfix.field.PosAmt field) {
    return isSetField(field);
  }

  public boolean isSetPosAmt() {
    return isSetField(708);
  }

  public void set(quickfix.field.PosAmtStreamDesc value) {
    setField(value);
  }

  public quickfix.field.PosAmtStreamDesc get(quickfix.field.PosAmtStreamDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtStreamDesc getPosAmtStreamDesc() throws FieldNotFound {
    return get(new quickfix.field.PosAmtStreamDesc());
  }

  public boolean isSet(quickfix.field.PosAmtStreamDesc field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtStreamDesc() {
    return isSetField(2096);
  }

  public void set(quickfix.field.PositionCurrency value) {
    setField(value);
  }

  public quickfix.field.PositionCurrency get(quickfix.field.PositionCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionCurrency getPositionCurrency() throws FieldNotFound {
    return get(new quickfix.field.PositionCurrency());
  }

  public boolean isSet(quickfix.field.PositionCurrency field) {
    return isSetField(field);
  }

  public boolean isSetPositionCurrency() {
    return isSetField(1055);
  }

  public void set(quickfix.field.PositionFXRate value) {
    setField(value);
  }

  public quickfix.field.PositionFXRate get(quickfix.field.PositionFXRate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionFXRate getPositionFXRate() throws FieldNotFound {
    return get(new quickfix.field.PositionFXRate());
  }

  public boolean isSet(quickfix.field.PositionFXRate field) {
    return isSetField(field);
  }

  public boolean isSetPositionFXRate() {
    return isSetField(2097);
  }

  public void set(quickfix.field.PositionFXRateCalc value) {
    setField(value);
  }

  public quickfix.field.PositionFXRateCalc get(quickfix.field.PositionFXRateCalc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PositionFXRateCalc getPositionFXRateCalc() throws FieldNotFound {
    return get(new quickfix.field.PositionFXRateCalc());
  }

  public boolean isSet(quickfix.field.PositionFXRateCalc field) {
    return isSetField(field);
  }

  public boolean isSetPositionFXRateCalc() {
    return isSetField(2098);
  }

  public void set(quickfix.field.PosAmtReason value) {
    setField(value);
  }

  public quickfix.field.PosAmtReason get(quickfix.field.PosAmtReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtReason getPosAmtReason() throws FieldNotFound {
    return get(new quickfix.field.PosAmtReason());
  }

  public boolean isSet(quickfix.field.PosAmtReason field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtReason() {
    return isSetField(1585);
  }

  public void set(quickfix.field.PosAmtMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.PosAmtMarketSegmentID get(quickfix.field.PosAmtMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtMarketSegmentID getPosAmtMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.PosAmtMarketSegmentID());
  }

  public boolean isSet(quickfix.field.PosAmtMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtMarketSegmentID() {
    return isSetField(2099);
  }

  public void set(quickfix.field.PosAmtMarketID value) {
    setField(value);
  }

  public quickfix.field.PosAmtMarketID get(quickfix.field.PosAmtMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtMarketID getPosAmtMarketID() throws FieldNotFound {
    return get(new quickfix.field.PosAmtMarketID());
  }

  public boolean isSet(quickfix.field.PosAmtMarketID field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtMarketID() {
    return isSetField(2100);
  }

  public void set(quickfix.field.PosAmtPrice value) {
    setField(value);
  }

  public quickfix.field.PosAmtPrice get(quickfix.field.PosAmtPrice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtPrice getPosAmtPrice() throws FieldNotFound {
    return get(new quickfix.field.PosAmtPrice());
  }

  public boolean isSet(quickfix.field.PosAmtPrice field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtPrice() {
    return isSetField(2876);
  }

  public void set(quickfix.field.PosAmtPriceType value) {
    setField(value);
  }

  public quickfix.field.PosAmtPriceType get(quickfix.field.PosAmtPriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PosAmtPriceType getPosAmtPriceType() throws FieldNotFound {
    return get(new quickfix.field.PosAmtPriceType());
  }

  public boolean isSet(quickfix.field.PosAmtPriceType field) {
    return isSetField(field);
  }

  public boolean isSetPosAmtPriceType() {
    return isSetField(2877);
  }
}
}
