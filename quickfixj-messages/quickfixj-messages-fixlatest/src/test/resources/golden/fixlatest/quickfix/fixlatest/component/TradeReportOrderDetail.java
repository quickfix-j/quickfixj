/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class TradeReportOrderDetail extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {37, 198, 11, 526, 66, 1080, 1081, 1431, 1091, 40, 44, 99, 18, 39, 151, 14, 59, 126, 2362, 1629, 1916, 528, 529, 775, 1432, 1724, 2704, 821, 1093, 483, 586, 2766, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public TradeReportOrderDetail() {
    super();
  }

  public void set(quickfix.field.OrderID value) {
    setField(value);
  }

  public quickfix.field.OrderID get(quickfix.field.OrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderID getOrderID() throws FieldNotFound {
    return get(new quickfix.field.OrderID());
  }

  public boolean isSet(quickfix.field.OrderID field) {
    return isSetField(field);
  }

  public boolean isSetOrderID() {
    return isSetField(37);
  }

  public void set(quickfix.field.SecondaryOrderID value) {
    setField(value);
  }

  public quickfix.field.SecondaryOrderID get(quickfix.field.SecondaryOrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryOrderID getSecondaryOrderID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryOrderID());
  }

  public boolean isSet(quickfix.field.SecondaryOrderID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryOrderID() {
    return isSetField(198);
  }

  public void set(quickfix.field.ClOrdID value) {
    setField(value);
  }

  public quickfix.field.ClOrdID get(quickfix.field.ClOrdID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClOrdID getClOrdID() throws FieldNotFound {
    return get(new quickfix.field.ClOrdID());
  }

  public boolean isSet(quickfix.field.ClOrdID field) {
    return isSetField(field);
  }

  public boolean isSetClOrdID() {
    return isSetField(11);
  }

  public void set(quickfix.field.SecondaryClOrdID value) {
    setField(value);
  }

  public quickfix.field.SecondaryClOrdID get(quickfix.field.SecondaryClOrdID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryClOrdID getSecondaryClOrdID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryClOrdID());
  }

  public boolean isSet(quickfix.field.SecondaryClOrdID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryClOrdID() {
    return isSetField(526);
  }

  public void set(quickfix.field.ListID value) {
    setField(value);
  }

  public quickfix.field.ListID get(quickfix.field.ListID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ListID getListID() throws FieldNotFound {
    return get(new quickfix.field.ListID());
  }

  public boolean isSet(quickfix.field.ListID field) {
    return isSetField(field);
  }

  public boolean isSetListID() {
    return isSetField(66);
  }

  public void set(quickfix.field.RefOrderID value) {
    setField(value);
  }

  public quickfix.field.RefOrderID get(quickfix.field.RefOrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefOrderID getRefOrderID() throws FieldNotFound {
    return get(new quickfix.field.RefOrderID());
  }

  public boolean isSet(quickfix.field.RefOrderID field) {
    return isSetField(field);
  }

  public boolean isSetRefOrderID() {
    return isSetField(1080);
  }

  public void set(quickfix.field.RefOrderIDSource value) {
    setField(value);
  }

  public quickfix.field.RefOrderIDSource get(quickfix.field.RefOrderIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefOrderIDSource getRefOrderIDSource() throws FieldNotFound {
    return get(new quickfix.field.RefOrderIDSource());
  }

  public boolean isSet(quickfix.field.RefOrderIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRefOrderIDSource() {
    return isSetField(1081);
  }

  public void set(quickfix.field.RefOrdIDReason value) {
    setField(value);
  }

  public quickfix.field.RefOrdIDReason get(quickfix.field.RefOrdIDReason value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RefOrdIDReason getRefOrdIDReason() throws FieldNotFound {
    return get(new quickfix.field.RefOrdIDReason());
  }

  public boolean isSet(quickfix.field.RefOrdIDReason field) {
    return isSetField(field);
  }

  public boolean isSetRefOrdIDReason() {
    return isSetField(1431);
  }

  public void set(quickfix.fixlatest.component.RelatedOrderGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedOrderGrp get(quickfix.fixlatest.component.RelatedOrderGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedOrderGrp getRelatedOrderGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedOrderGrp());
  }

  public void set(quickfix.field.NoOrders value) {
    setField(value);
  }

  public quickfix.field.NoOrders get(quickfix.field.NoOrders value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOrders getNoOrders() throws FieldNotFound {
    return get(new quickfix.field.NoOrders());
  }

  public boolean isSet(quickfix.field.NoOrders field) {
    return isSetField(field);
  }

  public boolean isSetNoOrders() {
    return isSetField(73);
  }

public static class NoOrders extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2887, 2888, 2836, 2889, 2890, 2835, 0};

  public NoOrders() {
    super(73, 2887, ORDER);
  }

  public void set(quickfix.field.RelatedOrderID value) {
    setField(value);
  }

  public quickfix.field.RelatedOrderID get(quickfix.field.RelatedOrderID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedOrderID getRelatedOrderID() throws FieldNotFound {
    return get(new quickfix.field.RelatedOrderID());
  }

  public boolean isSet(quickfix.field.RelatedOrderID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedOrderID() {
    return isSetField(2887);
  }

  public void set(quickfix.field.RelatedOrderIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedOrderIDSource get(quickfix.field.RelatedOrderIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedOrderIDSource getRelatedOrderIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedOrderIDSource());
  }

  public boolean isSet(quickfix.field.RelatedOrderIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedOrderIDSource() {
    return isSetField(2888);
  }

  public void set(quickfix.field.RelatedOrderTime value) {
    setField(value);
  }

  public quickfix.field.RelatedOrderTime get(quickfix.field.RelatedOrderTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedOrderTime getRelatedOrderTime() throws FieldNotFound {
    return get(new quickfix.field.RelatedOrderTime());
  }

  public boolean isSet(quickfix.field.RelatedOrderTime field) {
    return isSetField(field);
  }

  public boolean isSetRelatedOrderTime() {
    return isSetField(2836);
  }

  public void set(quickfix.field.RelatedOrderQty value) {
    setField(value);
  }

  public quickfix.field.RelatedOrderQty get(quickfix.field.RelatedOrderQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedOrderQty getRelatedOrderQty() throws FieldNotFound {
    return get(new quickfix.field.RelatedOrderQty());
  }

  public boolean isSet(quickfix.field.RelatedOrderQty field) {
    return isSetField(field);
  }

  public boolean isSetRelatedOrderQty() {
    return isSetField(2889);
  }

  public void set(quickfix.field.OrderRelationship value) {
    setField(value);
  }

  public quickfix.field.OrderRelationship get(quickfix.field.OrderRelationship value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderRelationship getOrderRelationship() throws FieldNotFound {
    return get(new quickfix.field.OrderRelationship());
  }

  public boolean isSet(quickfix.field.OrderRelationship field) {
    return isSetField(field);
  }

  public boolean isSetOrderRelationship() {
    return isSetField(2890);
  }

  public void set(quickfix.field.OrderOriginationFirmID value) {
    setField(value);
  }

  public quickfix.field.OrderOriginationFirmID get(quickfix.field.OrderOriginationFirmID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderOriginationFirmID getOrderOriginationFirmID() throws FieldNotFound {
    return get(new quickfix.field.OrderOriginationFirmID());
  }

  public boolean isSet(quickfix.field.OrderOriginationFirmID field) {
    return isSetField(field);
  }

  public boolean isSetOrderOriginationFirmID() {
    return isSetField(2835);
  }
}

  public void set(quickfix.field.PreTradeAnonymity value) {
    setField(value);
  }

  public quickfix.field.PreTradeAnonymity get(quickfix.field.PreTradeAnonymity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PreTradeAnonymity getPreTradeAnonymity() throws FieldNotFound {
    return get(new quickfix.field.PreTradeAnonymity());
  }

  public boolean isSet(quickfix.field.PreTradeAnonymity field) {
    return isSetField(field);
  }

  public boolean isSetPreTradeAnonymity() {
    return isSetField(1091);
  }

  public void set(quickfix.field.OrdType value) {
    setField(value);
  }

  public quickfix.field.OrdType get(quickfix.field.OrdType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrdType getOrdType() throws FieldNotFound {
    return get(new quickfix.field.OrdType());
  }

  public boolean isSet(quickfix.field.OrdType field) {
    return isSetField(field);
  }

  public boolean isSetOrdType() {
    return isSetField(40);
  }

  public void set(quickfix.field.Price value) {
    setField(value);
  }

  public quickfix.field.Price get(quickfix.field.Price value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Price getPrice() throws FieldNotFound {
    return get(new quickfix.field.Price());
  }

  public boolean isSet(quickfix.field.Price field) {
    return isSetField(field);
  }

  public boolean isSetPrice() {
    return isSetField(44);
  }

  public void set(quickfix.field.StopPx value) {
    setField(value);
  }

  public quickfix.field.StopPx get(quickfix.field.StopPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StopPx getStopPx() throws FieldNotFound {
    return get(new quickfix.field.StopPx());
  }

  public boolean isSet(quickfix.field.StopPx field) {
    return isSetField(field);
  }

  public boolean isSetStopPx() {
    return isSetField(99);
  }

  public void set(quickfix.field.ExecInst value) {
    setField(value);
  }

  public quickfix.field.ExecInst get(quickfix.field.ExecInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecInst getExecInst() throws FieldNotFound {
    return get(new quickfix.field.ExecInst());
  }

  public boolean isSet(quickfix.field.ExecInst field) {
    return isSetField(field);
  }

  public boolean isSetExecInst() {
    return isSetField(18);
  }

  public void set(quickfix.field.OrdStatus value) {
    setField(value);
  }

  public quickfix.field.OrdStatus get(quickfix.field.OrdStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrdStatus getOrdStatus() throws FieldNotFound {
    return get(new quickfix.field.OrdStatus());
  }

  public boolean isSet(quickfix.field.OrdStatus field) {
    return isSetField(field);
  }

  public boolean isSetOrdStatus() {
    return isSetField(39);
  }

  public void set(quickfix.fixlatest.component.OrderQtyData component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.OrderQtyData get(quickfix.fixlatest.component.OrderQtyData component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.OrderQtyData getOrderQtyDataComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.OrderQtyData());
  }

  public void set(quickfix.field.LeavesQty value) {
    setField(value);
  }

  public quickfix.field.LeavesQty get(quickfix.field.LeavesQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LeavesQty getLeavesQty() throws FieldNotFound {
    return get(new quickfix.field.LeavesQty());
  }

  public boolean isSet(quickfix.field.LeavesQty field) {
    return isSetField(field);
  }

  public boolean isSetLeavesQty() {
    return isSetField(151);
  }

  public void set(quickfix.field.CumQty value) {
    setField(value);
  }

  public quickfix.field.CumQty get(quickfix.field.CumQty value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CumQty getCumQty() throws FieldNotFound {
    return get(new quickfix.field.CumQty());
  }

  public boolean isSet(quickfix.field.CumQty field) {
    return isSetField(field);
  }

  public boolean isSetCumQty() {
    return isSetField(14);
  }

  public void set(quickfix.field.TimeInForce value) {
    setField(value);
  }

  public quickfix.field.TimeInForce get(quickfix.field.TimeInForce value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TimeInForce getTimeInForce() throws FieldNotFound {
    return get(new quickfix.field.TimeInForce());
  }

  public boolean isSet(quickfix.field.TimeInForce field) {
    return isSetField(field);
  }

  public boolean isSetTimeInForce() {
    return isSetField(59);
  }

  public void set(quickfix.field.ExpireTime value) {
    setField(value);
  }

  public quickfix.field.ExpireTime get(quickfix.field.ExpireTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExpireTime getExpireTime() throws FieldNotFound {
    return get(new quickfix.field.ExpireTime());
  }

  public boolean isSet(quickfix.field.ExpireTime field) {
    return isSetField(field);
  }

  public boolean isSetExpireTime() {
    return isSetField(126);
  }

  public void set(quickfix.fixlatest.component.MatchingInstructions component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MatchingInstructions get(quickfix.fixlatest.component.MatchingInstructions component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MatchingInstructions getMatchingInstructionsComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MatchingInstructions());
  }

  public void set(quickfix.field.NoMatchInst value) {
    setField(value);
  }

  public quickfix.field.NoMatchInst get(quickfix.field.NoMatchInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMatchInst getNoMatchInst() throws FieldNotFound {
    return get(new quickfix.field.NoMatchInst());
  }

  public boolean isSet(quickfix.field.NoMatchInst field) {
    return isSetField(field);
  }

  public boolean isSetNoMatchInst() {
    return isSetField(1624);
  }

public static class NoMatchInst extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1625, 1673, 1626, 1627, 0};

  public NoMatchInst() {
    super(1624, 1625, ORDER);
  }

  public void set(quickfix.field.MatchInst value) {
    setField(value);
  }

  public quickfix.field.MatchInst get(quickfix.field.MatchInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchInst getMatchInst() throws FieldNotFound {
    return get(new quickfix.field.MatchInst());
  }

  public boolean isSet(quickfix.field.MatchInst field) {
    return isSetField(field);
  }

  public boolean isSetMatchInst() {
    return isSetField(1625);
  }

  public void set(quickfix.field.MatchInstMarketID value) {
    setField(value);
  }

  public quickfix.field.MatchInstMarketID get(quickfix.field.MatchInstMarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchInstMarketID getMatchInstMarketID() throws FieldNotFound {
    return get(new quickfix.field.MatchInstMarketID());
  }

  public boolean isSet(quickfix.field.MatchInstMarketID field) {
    return isSetField(field);
  }

  public boolean isSetMatchInstMarketID() {
    return isSetField(1673);
  }

  public void set(quickfix.field.MatchAttribTagID value) {
    setField(value);
  }

  public quickfix.field.MatchAttribTagID get(quickfix.field.MatchAttribTagID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchAttribTagID getMatchAttribTagID() throws FieldNotFound {
    return get(new quickfix.field.MatchAttribTagID());
  }

  public boolean isSet(quickfix.field.MatchAttribTagID field) {
    return isSetField(field);
  }

  public boolean isSetMatchAttribTagID() {
    return isSetField(1626);
  }

  public void set(quickfix.field.MatchAttribValue value) {
    setField(value);
  }

  public quickfix.field.MatchAttribValue get(quickfix.field.MatchAttribValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchAttribValue getMatchAttribValue() throws FieldNotFound {
    return get(new quickfix.field.MatchAttribValue());
  }

  public boolean isSet(quickfix.field.MatchAttribValue field) {
    return isSetField(field);
  }

  public boolean isSetMatchAttribValue() {
    return isSetField(1627);
  }
}

  public void set(quickfix.field.SelfMatchPreventionID value) {
    setField(value);
  }

  public quickfix.field.SelfMatchPreventionID get(quickfix.field.SelfMatchPreventionID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SelfMatchPreventionID getSelfMatchPreventionID() throws FieldNotFound {
    return get(new quickfix.field.SelfMatchPreventionID());
  }

  public boolean isSet(quickfix.field.SelfMatchPreventionID field) {
    return isSetField(field);
  }

  public boolean isSetSelfMatchPreventionID() {
    return isSetField(2362);
  }

  public void set(quickfix.field.ExposureDuration value) {
    setField(value);
  }

  public quickfix.field.ExposureDuration get(quickfix.field.ExposureDuration value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExposureDuration getExposureDuration() throws FieldNotFound {
    return get(new quickfix.field.ExposureDuration());
  }

  public boolean isSet(quickfix.field.ExposureDuration field) {
    return isSetField(field);
  }

  public boolean isSetExposureDuration() {
    return isSetField(1629);
  }

  public void set(quickfix.field.ExposureDurationUnit value) {
    setField(value);
  }

  public quickfix.field.ExposureDurationUnit get(quickfix.field.ExposureDurationUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExposureDurationUnit getExposureDurationUnit() throws FieldNotFound {
    return get(new quickfix.field.ExposureDurationUnit());
  }

  public boolean isSet(quickfix.field.ExposureDurationUnit field) {
    return isSetField(field);
  }

  public boolean isSetExposureDurationUnit() {
    return isSetField(1916);
  }

  public void set(quickfix.fixlatest.component.DisplayInstruction component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.DisplayInstruction get(quickfix.fixlatest.component.DisplayInstruction component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.DisplayInstruction getDisplayInstructionComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.DisplayInstruction());
  }

  public void set(quickfix.field.OrderCapacity value) {
    setField(value);
  }

  public quickfix.field.OrderCapacity get(quickfix.field.OrderCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderCapacity getOrderCapacity() throws FieldNotFound {
    return get(new quickfix.field.OrderCapacity());
  }

  public boolean isSet(quickfix.field.OrderCapacity field) {
    return isSetField(field);
  }

  public boolean isSetOrderCapacity() {
    return isSetField(528);
  }

  public void set(quickfix.field.OrderRestrictions value) {
    setField(value);
  }

  public quickfix.field.OrderRestrictions get(quickfix.field.OrderRestrictions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderRestrictions getOrderRestrictions() throws FieldNotFound {
    return get(new quickfix.field.OrderRestrictions());
  }

  public boolean isSet(quickfix.field.OrderRestrictions field) {
    return isSetField(field);
  }

  public boolean isSetOrderRestrictions() {
    return isSetField(529);
  }

  public void set(quickfix.field.BookingType value) {
    setField(value);
  }

  public quickfix.field.BookingType get(quickfix.field.BookingType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BookingType getBookingType() throws FieldNotFound {
    return get(new quickfix.field.BookingType());
  }

  public boolean isSet(quickfix.field.BookingType field) {
    return isSetField(field);
  }

  public boolean isSetBookingType() {
    return isSetField(775);
  }

  public void set(quickfix.field.OrigCustOrderCapacity value) {
    setField(value);
  }

  public quickfix.field.OrigCustOrderCapacity get(quickfix.field.OrigCustOrderCapacity value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrigCustOrderCapacity getOrigCustOrderCapacity() throws FieldNotFound {
    return get(new quickfix.field.OrigCustOrderCapacity());
  }

  public boolean isSet(quickfix.field.OrigCustOrderCapacity field) {
    return isSetField(field);
  }

  public boolean isSetOrigCustOrderCapacity() {
    return isSetField(1432);
  }

  public void set(quickfix.field.OrderOrigination value) {
    setField(value);
  }

  public quickfix.field.OrderOrigination get(quickfix.field.OrderOrigination value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderOrigination getOrderOrigination() throws FieldNotFound {
    return get(new quickfix.field.OrderOrigination());
  }

  public boolean isSet(quickfix.field.OrderOrigination field) {
    return isSetField(field);
  }

  public boolean isSetOrderOrigination() {
    return isSetField(1724);
  }

  public void set(quickfix.fixlatest.component.OrderAttributeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.OrderAttributeGrp get(quickfix.fixlatest.component.OrderAttributeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.OrderAttributeGrp getOrderAttributeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.OrderAttributeGrp());
  }

  public void set(quickfix.field.NoOrderAttributes value) {
    setField(value);
  }

  public quickfix.field.NoOrderAttributes get(quickfix.field.NoOrderAttributes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOrderAttributes getNoOrderAttributes() throws FieldNotFound {
    return get(new quickfix.field.NoOrderAttributes());
  }

  public boolean isSet(quickfix.field.NoOrderAttributes field) {
    return isSetField(field);
  }

  public boolean isSetNoOrderAttributes() {
    return isSetField(2593);
  }

public static class NoOrderAttributes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2594, 2595, 0};

  public NoOrderAttributes() {
    super(2593, 2594, ORDER);
  }

  public void set(quickfix.field.OrderAttributeType value) {
    setField(value);
  }

  public quickfix.field.OrderAttributeType get(quickfix.field.OrderAttributeType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderAttributeType getOrderAttributeType() throws FieldNotFound {
    return get(new quickfix.field.OrderAttributeType());
  }

  public boolean isSet(quickfix.field.OrderAttributeType field) {
    return isSetField(field);
  }

  public boolean isSetOrderAttributeType() {
    return isSetField(2594);
  }

  public void set(quickfix.field.OrderAttributeValue value) {
    setField(value);
  }

  public quickfix.field.OrderAttributeValue get(quickfix.field.OrderAttributeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderAttributeValue getOrderAttributeValue() throws FieldNotFound {
    return get(new quickfix.field.OrderAttributeValue());
  }

  public boolean isSet(quickfix.field.OrderAttributeValue field) {
    return isSetField(field);
  }

  public boolean isSetOrderAttributeValue() {
    return isSetField(2595);
  }
}

  public void set(quickfix.field.ExDestinationType value) {
    setField(value);
  }

  public quickfix.field.ExDestinationType get(quickfix.field.ExDestinationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExDestinationType getExDestinationType() throws FieldNotFound {
    return get(new quickfix.field.ExDestinationType());
  }

  public boolean isSet(quickfix.field.ExDestinationType field) {
    return isSetField(field);
  }

  public boolean isSetExDestinationType() {
    return isSetField(2704);
  }

  public void set(quickfix.field.OrderInputDevice value) {
    setField(value);
  }

  public quickfix.field.OrderInputDevice get(quickfix.field.OrderInputDevice value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderInputDevice getOrderInputDevice() throws FieldNotFound {
    return get(new quickfix.field.OrderInputDevice());
  }

  public boolean isSet(quickfix.field.OrderInputDevice field) {
    return isSetField(field);
  }

  public boolean isSetOrderInputDevice() {
    return isSetField(821);
  }

  public void set(quickfix.field.LotType value) {
    setField(value);
  }

  public quickfix.field.LotType get(quickfix.field.LotType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LotType getLotType() throws FieldNotFound {
    return get(new quickfix.field.LotType());
  }

  public boolean isSet(quickfix.field.LotType field) {
    return isSetField(field);
  }

  public boolean isSetLotType() {
    return isSetField(1093);
  }

  public void set(quickfix.field.TransBkdTime value) {
    setField(value);
  }

  public quickfix.field.TransBkdTime get(quickfix.field.TransBkdTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransBkdTime getTransBkdTime() throws FieldNotFound {
    return get(new quickfix.field.TransBkdTime());
  }

  public boolean isSet(quickfix.field.TransBkdTime field) {
    return isSetField(field);
  }

  public boolean isSetTransBkdTime() {
    return isSetField(483);
  }

  public void set(quickfix.field.OrigOrdModTime value) {
    setField(value);
  }

  public quickfix.field.OrigOrdModTime get(quickfix.field.OrigOrdModTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrigOrdModTime getOrigOrdModTime() throws FieldNotFound {
    return get(new quickfix.field.OrigOrdModTime());
  }

  public boolean isSet(quickfix.field.OrigOrdModTime field) {
    return isSetField(field);
  }

  public boolean isSetOrigOrdModTime() {
    return isSetField(586);
  }

  public void set(quickfix.field.OrderPercentOfTotalVolume value) {
    setField(value);
  }

  public quickfix.field.OrderPercentOfTotalVolume get(quickfix.field.OrderPercentOfTotalVolume value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OrderPercentOfTotalVolume getOrderPercentOfTotalVolume() throws FieldNotFound {
    return get(new quickfix.field.OrderPercentOfTotalVolume());
  }

  public boolean isSet(quickfix.field.OrderPercentOfTotalVolume field) {
    return isSetField(field);
  }

  public boolean isSetOrderPercentOfTotalVolume() {
    return isSetField(2766);
  }
}
