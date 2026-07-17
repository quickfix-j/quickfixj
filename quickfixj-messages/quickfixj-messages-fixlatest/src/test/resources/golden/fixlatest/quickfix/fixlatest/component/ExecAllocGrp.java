/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ExecAllocGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {124, };
  protected int[] getGroupFields() { return componentGroups; }

  public ExecAllocGrp() {
    super();
  }

  public void set(quickfix.field.NoExecs value) {
    setField(value);
  }

  public quickfix.field.NoExecs get(quickfix.field.NoExecs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoExecs getNoExecs() throws FieldNotFound {
    return get(new quickfix.field.NoExecs());
  }

  public boolean isSet(quickfix.field.NoExecs field) {
    return isSetField(field);
  }

  public boolean isSetNoExecs() {
    return isSetField(124);
  }

public static class NoExecs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {32, 17, 527, 31, 669, 29, 1003, 1041, 2749, 2524, 2668, 1838, 0};

  public NoExecs() {
    super(124, 32, ORDER);
  }

  public void set(quickfix.field.LastQty value) {
    setField(value);
  }

  public quickfix.field.LastQty get(quickfix.field.LastQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastQty getLastQty() throws FieldNotFound {
    return get(new quickfix.field.LastQty());
  }

  public boolean isSet(quickfix.field.LastQty field) {
    return isSetField(field);
  }

  public boolean isSetLastQty() {
    return isSetField(32);
  }

  public void set(quickfix.field.ExecID value) {
    setField(value);
  }

  public quickfix.field.ExecID get(quickfix.field.ExecID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecID getExecID() throws FieldNotFound {
    return get(new quickfix.field.ExecID());
  }

  public boolean isSet(quickfix.field.ExecID field) {
    return isSetField(field);
  }

  public boolean isSetExecID() {
    return isSetField(17);
  }

  public void set(quickfix.field.SecondaryExecID value) {
    setField(value);
  }

  public quickfix.field.SecondaryExecID get(quickfix.field.SecondaryExecID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryExecID getSecondaryExecID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryExecID());
  }

  public boolean isSet(quickfix.field.SecondaryExecID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryExecID() {
    return isSetField(527);
  }

  public void set(quickfix.field.LastPx value) {
    setField(value);
  }

  public quickfix.field.LastPx get(quickfix.field.LastPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastPx getLastPx() throws FieldNotFound {
    return get(new quickfix.field.LastPx());
  }

  public boolean isSet(quickfix.field.LastPx field) {
    return isSetField(field);
  }

  public boolean isSetLastPx() {
    return isSetField(31);
  }

  public void set(quickfix.field.LastParPx value) {
    setField(value);
  }

  public quickfix.field.LastParPx get(quickfix.field.LastParPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastParPx getLastParPx() throws FieldNotFound {
    return get(new quickfix.field.LastParPx());
  }

  public boolean isSet(quickfix.field.LastParPx field) {
    return isSetField(field);
  }

  public boolean isSetLastParPx() {
    return isSetField(669);
  }

  public void set(quickfix.field.LastCapacity value) {
    setField(value);
  }

  public quickfix.field.LastCapacity get(quickfix.field.LastCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastCapacity getLastCapacity() throws FieldNotFound {
    return get(new quickfix.field.LastCapacity());
  }

  public boolean isSet(quickfix.field.LastCapacity field) {
    return isSetField(field);
  }

  public boolean isSetLastCapacity() {
    return isSetField(29);
  }

  public void set(quickfix.field.TradeID value) {
    setField(value);
  }

  public quickfix.field.TradeID get(quickfix.field.TradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeID getTradeID() throws FieldNotFound {
    return get(new quickfix.field.TradeID());
  }

  public boolean isSet(quickfix.field.TradeID field) {
    return isSetField(field);
  }

  public boolean isSetTradeID() {
    return isSetField(1003);
  }

  public void set(quickfix.field.FirmTradeID value) {
    setField(value);
  }

  public quickfix.field.FirmTradeID get(quickfix.field.FirmTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FirmTradeID getFirmTradeID() throws FieldNotFound {
    return get(new quickfix.field.FirmTradeID());
  }

  public boolean isSet(quickfix.field.FirmTradeID field) {
    return isSetField(field);
  }

  public boolean isSetFirmTradeID() {
    return isSetField(1041);
  }

  public void set(quickfix.field.ExecutionTimestamp value) {
    setField(value);
  }

  public quickfix.field.ExecutionTimestamp get(quickfix.field.ExecutionTimestamp value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecutionTimestamp getExecutionTimestamp() throws FieldNotFound {
    return get(new quickfix.field.ExecutionTimestamp());
  }

  public boolean isSet(quickfix.field.ExecutionTimestamp field) {
    return isSetField(field);
  }

  public boolean isSetExecutionTimestamp() {
    return isSetField(2749);
  }

  public void set(quickfix.field.TradeReportingIndicator value) {
    setField(value);
  }

  public quickfix.field.TradeReportingIndicator get(quickfix.field.TradeReportingIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeReportingIndicator getTradeReportingIndicator() throws FieldNotFound {
    return get(new quickfix.field.TradeReportingIndicator());
  }

  public boolean isSet(quickfix.field.TradeReportingIndicator field) {
    return isSetField(field);
  }

  public boolean isSetTradeReportingIndicator() {
    return isSetField(2524);
  }

  public void set(quickfix.fixlatest.component.TrdRegPublicationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TrdRegPublicationGrp get(quickfix.fixlatest.component.TrdRegPublicationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TrdRegPublicationGrp getTrdRegPublicationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TrdRegPublicationGrp());
  }

  public void set(quickfix.field.NoTrdRegPublications value) {
    setField(value);
  }

  public quickfix.field.NoTrdRegPublications get(quickfix.field.NoTrdRegPublications value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTrdRegPublications getNoTrdRegPublications() throws FieldNotFound {
    return get(new quickfix.field.NoTrdRegPublications());
  }

  public boolean isSet(quickfix.field.NoTrdRegPublications field) {
    return isSetField(field);
  }

  public boolean isSetNoTrdRegPublications() {
    return isSetField(2668);
  }

public static class NoTrdRegPublications extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2669, 2670, 0};

  public NoTrdRegPublications() {
    super(2668, 2669, ORDER);
  }

  public void set(quickfix.field.TrdRegPublicationType value) {
    setField(value);
  }

  public quickfix.field.TrdRegPublicationType get(quickfix.field.TrdRegPublicationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRegPublicationType getTrdRegPublicationType() throws FieldNotFound {
    return get(new quickfix.field.TrdRegPublicationType());
  }

  public boolean isSet(quickfix.field.TrdRegPublicationType field) {
    return isSetField(field);
  }

  public boolean isSetTrdRegPublicationType() {
    return isSetField(2669);
  }

  public void set(quickfix.field.TrdRegPublicationReason value) {
    setField(value);
  }

  public quickfix.field.TrdRegPublicationReason get(quickfix.field.TrdRegPublicationReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRegPublicationReason getTrdRegPublicationReason() throws FieldNotFound {
    return get(new quickfix.field.TrdRegPublicationReason());
  }

  public boolean isSet(quickfix.field.TrdRegPublicationReason field) {
    return isSetField(field);
  }

  public boolean isSetTrdRegPublicationReason() {
    return isSetField(2670);
  }
}

  public void set(quickfix.fixlatest.component.TradePriceConditionGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradePriceConditionGrp get(quickfix.fixlatest.component.TradePriceConditionGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradePriceConditionGrp getTradePriceConditionGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradePriceConditionGrp());
  }

  public void set(quickfix.field.NoTradePriceConditions value) {
    setField(value);
  }

  public quickfix.field.NoTradePriceConditions get(quickfix.field.NoTradePriceConditions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTradePriceConditions getNoTradePriceConditions() throws FieldNotFound {
    return get(new quickfix.field.NoTradePriceConditions());
  }

  public boolean isSet(quickfix.field.NoTradePriceConditions field) {
    return isSetField(field);
  }

  public boolean isSetNoTradePriceConditions() {
    return isSetField(1838);
  }

public static class NoTradePriceConditions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1839, 0};

  public NoTradePriceConditions() {
    super(1838, 1839, ORDER);
  }

  public void set(quickfix.field.TradePriceCondition value) {
    setField(value);
  }

  public quickfix.field.TradePriceCondition get(quickfix.field.TradePriceCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradePriceCondition getTradePriceCondition() throws FieldNotFound {
    return get(new quickfix.field.TradePriceCondition());
  }

  public boolean isSet(quickfix.field.TradePriceCondition field) {
    return isSetField(field);
  }

  public boolean isSetTradePriceCondition() {
    return isSetField(1839);
  }
}
}

  public void set(quickfix.field.LastQty value) {
    setField(value);
  }

  public quickfix.field.LastQty get(quickfix.field.LastQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastQty getLastQty() throws FieldNotFound {
    return get(new quickfix.field.LastQty());
  }

  public boolean isSet(quickfix.field.LastQty field) {
    return isSetField(field);
  }

  public boolean isSetLastQty() {
    return isSetField(32);
  }

  public void set(quickfix.field.ExecID value) {
    setField(value);
  }

  public quickfix.field.ExecID get(quickfix.field.ExecID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecID getExecID() throws FieldNotFound {
    return get(new quickfix.field.ExecID());
  }

  public boolean isSet(quickfix.field.ExecID field) {
    return isSetField(field);
  }

  public boolean isSetExecID() {
    return isSetField(17);
  }

  public void set(quickfix.field.SecondaryExecID value) {
    setField(value);
  }

  public quickfix.field.SecondaryExecID get(quickfix.field.SecondaryExecID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryExecID getSecondaryExecID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryExecID());
  }

  public boolean isSet(quickfix.field.SecondaryExecID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryExecID() {
    return isSetField(527);
  }

  public void set(quickfix.field.LastPx value) {
    setField(value);
  }

  public quickfix.field.LastPx get(quickfix.field.LastPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastPx getLastPx() throws FieldNotFound {
    return get(new quickfix.field.LastPx());
  }

  public boolean isSet(quickfix.field.LastPx field) {
    return isSetField(field);
  }

  public boolean isSetLastPx() {
    return isSetField(31);
  }

  public void set(quickfix.field.LastParPx value) {
    setField(value);
  }

  public quickfix.field.LastParPx get(quickfix.field.LastParPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastParPx getLastParPx() throws FieldNotFound {
    return get(new quickfix.field.LastParPx());
  }

  public boolean isSet(quickfix.field.LastParPx field) {
    return isSetField(field);
  }

  public boolean isSetLastParPx() {
    return isSetField(669);
  }

  public void set(quickfix.field.LastCapacity value) {
    setField(value);
  }

  public quickfix.field.LastCapacity get(quickfix.field.LastCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LastCapacity getLastCapacity() throws FieldNotFound {
    return get(new quickfix.field.LastCapacity());
  }

  public boolean isSet(quickfix.field.LastCapacity field) {
    return isSetField(field);
  }

  public boolean isSetLastCapacity() {
    return isSetField(29);
  }

  public void set(quickfix.field.TradeID value) {
    setField(value);
  }

  public quickfix.field.TradeID get(quickfix.field.TradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeID getTradeID() throws FieldNotFound {
    return get(new quickfix.field.TradeID());
  }

  public boolean isSet(quickfix.field.TradeID field) {
    return isSetField(field);
  }

  public boolean isSetTradeID() {
    return isSetField(1003);
  }

  public void set(quickfix.field.FirmTradeID value) {
    setField(value);
  }

  public quickfix.field.FirmTradeID get(quickfix.field.FirmTradeID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FirmTradeID getFirmTradeID() throws FieldNotFound {
    return get(new quickfix.field.FirmTradeID());
  }

  public boolean isSet(quickfix.field.FirmTradeID field) {
    return isSetField(field);
  }

  public boolean isSetFirmTradeID() {
    return isSetField(1041);
  }

  public void set(quickfix.field.ExecutionTimestamp value) {
    setField(value);
  }

  public quickfix.field.ExecutionTimestamp get(quickfix.field.ExecutionTimestamp value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecutionTimestamp getExecutionTimestamp() throws FieldNotFound {
    return get(new quickfix.field.ExecutionTimestamp());
  }

  public boolean isSet(quickfix.field.ExecutionTimestamp field) {
    return isSetField(field);
  }

  public boolean isSetExecutionTimestamp() {
    return isSetField(2749);
  }

  public void set(quickfix.field.TradeReportingIndicator value) {
    setField(value);
  }

  public quickfix.field.TradeReportingIndicator get(quickfix.field.TradeReportingIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradeReportingIndicator getTradeReportingIndicator() throws FieldNotFound {
    return get(new quickfix.field.TradeReportingIndicator());
  }

  public boolean isSet(quickfix.field.TradeReportingIndicator field) {
    return isSetField(field);
  }

  public boolean isSetTradeReportingIndicator() {
    return isSetField(2524);
  }

  public void set(quickfix.fixlatest.component.TrdRegPublicationGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TrdRegPublicationGrp get(quickfix.fixlatest.component.TrdRegPublicationGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TrdRegPublicationGrp getTrdRegPublicationGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TrdRegPublicationGrp());
  }

  public void set(quickfix.field.NoTrdRegPublications value) {
    setField(value);
  }

  public quickfix.field.NoTrdRegPublications get(quickfix.field.NoTrdRegPublications value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTrdRegPublications getNoTrdRegPublications() throws FieldNotFound {
    return get(new quickfix.field.NoTrdRegPublications());
  }

  public boolean isSet(quickfix.field.NoTrdRegPublications field) {
    return isSetField(field);
  }

  public boolean isSetNoTrdRegPublications() {
    return isSetField(2668);
  }

public static class NoTrdRegPublications extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2669, 2670, 0};

  public NoTrdRegPublications() {
    super(2668, 2669, ORDER);
  }

  public void set(quickfix.field.TrdRegPublicationType value) {
    setField(value);
  }

  public quickfix.field.TrdRegPublicationType get(quickfix.field.TrdRegPublicationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRegPublicationType getTrdRegPublicationType() throws FieldNotFound {
    return get(new quickfix.field.TrdRegPublicationType());
  }

  public boolean isSet(quickfix.field.TrdRegPublicationType field) {
    return isSetField(field);
  }

  public boolean isSetTrdRegPublicationType() {
    return isSetField(2669);
  }

  public void set(quickfix.field.TrdRegPublicationReason value) {
    setField(value);
  }

  public quickfix.field.TrdRegPublicationReason get(quickfix.field.TrdRegPublicationReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TrdRegPublicationReason getTrdRegPublicationReason() throws FieldNotFound {
    return get(new quickfix.field.TrdRegPublicationReason());
  }

  public boolean isSet(quickfix.field.TrdRegPublicationReason field) {
    return isSetField(field);
  }

  public boolean isSetTrdRegPublicationReason() {
    return isSetField(2670);
  }
}

  public void set(quickfix.fixlatest.component.TradePriceConditionGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TradePriceConditionGrp get(quickfix.fixlatest.component.TradePriceConditionGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TradePriceConditionGrp getTradePriceConditionGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TradePriceConditionGrp());
  }

  public void set(quickfix.field.NoTradePriceConditions value) {
    setField(value);
  }

  public quickfix.field.NoTradePriceConditions get(quickfix.field.NoTradePriceConditions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTradePriceConditions getNoTradePriceConditions() throws FieldNotFound {
    return get(new quickfix.field.NoTradePriceConditions());
  }

  public boolean isSet(quickfix.field.NoTradePriceConditions field) {
    return isSetField(field);
  }

  public boolean isSetNoTradePriceConditions() {
    return isSetField(1838);
  }

public static class NoTradePriceConditions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1839, 0};

  public NoTradePriceConditions() {
    super(1838, 1839, ORDER);
  }

  public void set(quickfix.field.TradePriceCondition value) {
    setField(value);
  }

  public quickfix.field.TradePriceCondition get(quickfix.field.TradePriceCondition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TradePriceCondition getTradePriceCondition() throws FieldNotFound {
    return get(new quickfix.field.TradePriceCondition());
  }

  public boolean isSet(quickfix.field.TradePriceCondition field) {
    return isSetField(field);
  }

  public boolean isSetTradePriceCondition() {
    return isSetField(1839);
  }
}
}
