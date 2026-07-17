/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class MarketDefinitionUpdateReport extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "BV";

  public MarketDefinitionUpdateReport() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public MarketDefinitionUpdateReport (quickfix.field.MarketReportID marketReportID, quickfix.field.MarketID marketID) {
    this();
    setField(marketReportID);
    setField(marketID);
  }

  public void set(quickfix.fixlatest.component.ApplicationSequenceControl component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ApplicationSequenceControl get(quickfix.fixlatest.component.ApplicationSequenceControl component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ApplicationSequenceControl getApplicationSequenceControlComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ApplicationSequenceControl());
  }

  public void set(quickfix.field.MarketReportID value) {
    setField(value);
  }

  public quickfix.field.MarketReportID get(quickfix.field.MarketReportID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketReportID getMarketReportID() throws FieldNotFound {
    return get(new quickfix.field.MarketReportID());
  }

  public boolean isSet(quickfix.field.MarketReportID field) {
    return isSetField(field);
  }

  public boolean isSetMarketReportID() {
    return isSetField(1394);
  }

  public void set(quickfix.field.MarketReqID value) {
    setField(value);
  }

  public quickfix.field.MarketReqID get(quickfix.field.MarketReqID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketReqID getMarketReqID() throws FieldNotFound {
    return get(new quickfix.field.MarketReqID());
  }

  public boolean isSet(quickfix.field.MarketReqID field) {
    return isSetField(field);
  }

  public boolean isSetMarketReqID() {
    return isSetField(1393);
  }

  public void set(quickfix.field.MarketUpdateAction value) {
    setField(value);
  }

  public quickfix.field.MarketUpdateAction get(quickfix.field.MarketUpdateAction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketUpdateAction getMarketUpdateAction() throws FieldNotFound {
    return get(new quickfix.field.MarketUpdateAction());
  }

  public boolean isSet(quickfix.field.MarketUpdateAction field) {
    return isSetField(field);
  }

  public boolean isSetMarketUpdateAction() {
    return isSetField(1395);
  }

  public void set(quickfix.field.MarketID value) {
    setField(value);
  }

  public quickfix.field.MarketID get(quickfix.field.MarketID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketID getMarketID() throws FieldNotFound {
    return get(new quickfix.field.MarketID());
  }

  public boolean isSet(quickfix.field.MarketID field) {
    return isSetField(field);
  }

  public boolean isSetMarketID() {
    return isSetField(1301);
  }

  public void set(quickfix.field.MarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.MarketSegmentID get(quickfix.field.MarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketSegmentID getMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.MarketSegmentID());
  }

  public boolean isSet(quickfix.field.MarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetMarketSegmentID() {
    return isSetField(1300);
  }

  public void set(quickfix.field.MarketSegmentDesc value) {
    setField(value);
  }

  public quickfix.field.MarketSegmentDesc get(quickfix.field.MarketSegmentDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketSegmentDesc getMarketSegmentDesc() throws FieldNotFound {
    return get(new quickfix.field.MarketSegmentDesc());
  }

  public boolean isSet(quickfix.field.MarketSegmentDesc field) {
    return isSetField(field);
  }

  public boolean isSetMarketSegmentDesc() {
    return isSetField(1396);
  }

  public void set(quickfix.field.EncodedMktSegmDescLen value) {
    setField(value);
  }

  public quickfix.field.EncodedMktSegmDescLen get(quickfix.field.EncodedMktSegmDescLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMktSegmDescLen getEncodedMktSegmDescLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedMktSegmDescLen());
  }

  public boolean isSet(quickfix.field.EncodedMktSegmDescLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMktSegmDescLen() {
    return isSetField(1397);
  }

  public void set(quickfix.field.EncodedMktSegmDesc value) {
    setField(value);
  }

  public quickfix.field.EncodedMktSegmDesc get(quickfix.field.EncodedMktSegmDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMktSegmDesc getEncodedMktSegmDesc() throws FieldNotFound {
    return get(new quickfix.field.EncodedMktSegmDesc());
  }

  public boolean isSet(quickfix.field.EncodedMktSegmDesc field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMktSegmDesc() {
    return isSetField(1398);
  }

  public void set(quickfix.field.ParentMktSegmID value) {
    setField(value);
  }

  public quickfix.field.ParentMktSegmID get(quickfix.field.ParentMktSegmID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ParentMktSegmID getParentMktSegmID() throws FieldNotFound {
    return get(new quickfix.field.ParentMktSegmID());
  }

  public boolean isSet(quickfix.field.ParentMktSegmID field) {
    return isSetField(field);
  }

  public boolean isSetParentMktSegmID() {
    return isSetField(1325);
  }

  public void set(quickfix.field.MarketSegmentStatus value) {
    setField(value);
  }

  public quickfix.field.MarketSegmentStatus get(quickfix.field.MarketSegmentStatus value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketSegmentStatus getMarketSegmentStatus() throws FieldNotFound {
    return get(new quickfix.field.MarketSegmentStatus());
  }

  public boolean isSet(quickfix.field.MarketSegmentStatus field) {
    return isSetField(field);
  }

  public boolean isSetMarketSegmentStatus() {
    return isSetField(2542);
  }

  public void set(quickfix.field.MarketSegmentType value) {
    setField(value);
  }

  public quickfix.field.MarketSegmentType get(quickfix.field.MarketSegmentType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketSegmentType getMarketSegmentType() throws FieldNotFound {
    return get(new quickfix.field.MarketSegmentType());
  }

  public boolean isSet(quickfix.field.MarketSegmentType field) {
    return isSetField(field);
  }

  public boolean isSetMarketSegmentType() {
    return isSetField(2543);
  }

  public void set(quickfix.field.MarketSegmentSubType value) {
    setField(value);
  }

  public quickfix.field.MarketSegmentSubType get(quickfix.field.MarketSegmentSubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketSegmentSubType getMarketSegmentSubType() throws FieldNotFound {
    return get(new quickfix.field.MarketSegmentSubType());
  }

  public boolean isSet(quickfix.field.MarketSegmentSubType field) {
    return isSetField(field);
  }

  public boolean isSetMarketSegmentSubType() {
    return isSetField(2544);
  }

  public void set(quickfix.fixlatest.component.InstrumentScopeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrumentScopeGrp get(quickfix.fixlatest.component.InstrumentScopeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrumentScopeGrp getInstrumentScopeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrumentScopeGrp());
  }

  public void set(quickfix.field.NoInstrumentScopes value) {
    setField(value);
  }

  public quickfix.field.NoInstrumentScopes get(quickfix.field.NoInstrumentScopes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoInstrumentScopes getNoInstrumentScopes() throws FieldNotFound {
    return get(new quickfix.field.NoInstrumentScopes());
  }

  public boolean isSet(quickfix.field.NoInstrumentScopes field) {
    return isSetField(field);
  }

  public boolean isSetNoInstrumentScopes() {
    return isSetField(1656);
  }

public static class NoInstrumentScopes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1535, 1536, 1537, 1538, 1539, 1540, 1543, 1544, 1545, 1546, 2895, 1547, 1548, 1549, 1550, 1551, 1552, 1553, 1554, 1555, 1616, 1556, 1620, 1621, 1557, 0};

  public NoInstrumentScopes() {
    super(1656, 1535, ORDER);
  }

  public void set(quickfix.field.InstrumentScopeOperator value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeOperator get(quickfix.field.InstrumentScopeOperator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeOperator getInstrumentScopeOperator() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeOperator());
  }

  public boolean isSet(quickfix.field.InstrumentScopeOperator field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeOperator() {
    return isSetField(1535);
  }

  public void set(quickfix.fixlatest.component.InstrumentScope component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrumentScope get(quickfix.fixlatest.component.InstrumentScope component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrumentScope getInstrumentScopeComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrumentScope());
  }
}

  public void set(quickfix.fixlatest.component.RelatedMarketSegmentGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.RelatedMarketSegmentGrp get(quickfix.fixlatest.component.RelatedMarketSegmentGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.RelatedMarketSegmentGrp getRelatedMarketSegmentGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.RelatedMarketSegmentGrp());
  }

  public void set(quickfix.field.NoRelatedMarketSegments value) {
    setField(value);
  }

  public quickfix.field.NoRelatedMarketSegments get(quickfix.field.NoRelatedMarketSegments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedMarketSegments getNoRelatedMarketSegments() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedMarketSegments());
  }

  public boolean isSet(quickfix.field.NoRelatedMarketSegments field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedMarketSegments() {
    return isSetField(2545);
  }

public static class NoRelatedMarketSegments extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2546, 2547, 0};

  public NoRelatedMarketSegments() {
    super(2545, 2546, ORDER);
  }

  public void set(quickfix.field.RelatedMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.RelatedMarketSegmentID get(quickfix.field.RelatedMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedMarketSegmentID getRelatedMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.RelatedMarketSegmentID());
  }

  public boolean isSet(quickfix.field.RelatedMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedMarketSegmentID() {
    return isSetField(2546);
  }

  public void set(quickfix.field.MarketSegmentRelationship value) {
    setField(value);
  }

  public quickfix.field.MarketSegmentRelationship get(quickfix.field.MarketSegmentRelationship value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketSegmentRelationship getMarketSegmentRelationship() throws FieldNotFound {
    return get(new quickfix.field.MarketSegmentRelationship());
  }

  public boolean isSet(quickfix.field.MarketSegmentRelationship field) {
    return isSetField(field);
  }

  public boolean isSetMarketSegmentRelationship() {
    return isSetField(2547);
  }
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

  public void set(quickfix.fixlatest.component.BaseTradingRules component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.BaseTradingRules get(quickfix.fixlatest.component.BaseTradingRules component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.BaseTradingRules getBaseTradingRulesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.BaseTradingRules());
  }

  public void set(quickfix.fixlatest.component.OrdTypeRules component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.OrdTypeRules get(quickfix.fixlatest.component.OrdTypeRules component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.OrdTypeRules getOrdTypeRulesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.OrdTypeRules());
  }

  public void set(quickfix.field.NoOrdTypeRules value) {
    setField(value);
  }

  public quickfix.field.NoOrdTypeRules get(quickfix.field.NoOrdTypeRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOrdTypeRules getNoOrdTypeRules() throws FieldNotFound {
    return get(new quickfix.field.NoOrdTypeRules());
  }

  public boolean isSet(quickfix.field.NoOrdTypeRules field) {
    return isSetField(field);
  }

  public boolean isSetNoOrdTypeRules() {
    return isSetField(1237);
  }

public static class NoOrdTypeRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40, 0};

  public NoOrdTypeRules() {
    super(1237, 40, ORDER);
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
}

  public void set(quickfix.fixlatest.component.TimeInForceRules component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.TimeInForceRules get(quickfix.fixlatest.component.TimeInForceRules component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.TimeInForceRules getTimeInForceRulesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.TimeInForceRules());
  }

  public void set(quickfix.field.NoTimeInForceRules value) {
    setField(value);
  }

  public quickfix.field.NoTimeInForceRules get(quickfix.field.NoTimeInForceRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTimeInForceRules getNoTimeInForceRules() throws FieldNotFound {
    return get(new quickfix.field.NoTimeInForceRules());
  }

  public boolean isSet(quickfix.field.NoTimeInForceRules field) {
    return isSetField(field);
  }

  public boolean isSetNoTimeInForceRules() {
    return isSetField(1239);
  }

public static class NoTimeInForceRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {59, 0};

  public NoTimeInForceRules() {
    super(1239, 59, ORDER);
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
}

  public void set(quickfix.fixlatest.component.ExecInstRules component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ExecInstRules get(quickfix.fixlatest.component.ExecInstRules component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ExecInstRules getExecInstRulesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ExecInstRules());
  }

  public void set(quickfix.field.NoExecInstRules value) {
    setField(value);
  }

  public quickfix.field.NoExecInstRules get(quickfix.field.NoExecInstRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoExecInstRules getNoExecInstRules() throws FieldNotFound {
    return get(new quickfix.field.NoExecInstRules());
  }

  public boolean isSet(quickfix.field.NoExecInstRules field) {
    return isSetField(field);
  }

  public boolean isSetNoExecInstRules() {
    return isSetField(1232);
  }

public static class NoExecInstRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1308, 0};

  public NoExecInstRules() {
    super(1232, 1308, ORDER);
  }

  public void set(quickfix.field.ExecInstValue value) {
    setField(value);
  }

  public quickfix.field.ExecInstValue get(quickfix.field.ExecInstValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecInstValue getExecInstValue() throws FieldNotFound {
    return get(new quickfix.field.ExecInstValue());
  }

  public boolean isSet(quickfix.field.ExecInstValue field) {
    return isSetField(field);
  }

  public boolean isSetExecInstValue() {
    return isSetField(1308);
  }
}

  public void set(quickfix.fixlatest.component.AuctionTypeRuleGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.AuctionTypeRuleGrp get(quickfix.fixlatest.component.AuctionTypeRuleGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.AuctionTypeRuleGrp getAuctionTypeRuleGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.AuctionTypeRuleGrp());
  }

  public void set(quickfix.field.NoAuctionTypeRules value) {
    setField(value);
  }

  public quickfix.field.NoAuctionTypeRules get(quickfix.field.NoAuctionTypeRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAuctionTypeRules getNoAuctionTypeRules() throws FieldNotFound {
    return get(new quickfix.field.NoAuctionTypeRules());
  }

  public boolean isSet(quickfix.field.NoAuctionTypeRules field) {
    return isSetField(field);
  }

  public boolean isSetNoAuctionTypeRules() {
    return isSetField(2548);
  }

public static class NoAuctionTypeRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1803, 2549, 0};

  public NoAuctionTypeRules() {
    super(2548, 1803, ORDER);
  }

  public void set(quickfix.field.AuctionType value) {
    setField(value);
  }

  public quickfix.field.AuctionType get(quickfix.field.AuctionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AuctionType getAuctionType() throws FieldNotFound {
    return get(new quickfix.field.AuctionType());
  }

  public boolean isSet(quickfix.field.AuctionType field) {
    return isSetField(field);
  }

  public boolean isSetAuctionType() {
    return isSetField(1803);
  }

  public void set(quickfix.field.AuctionTypeProductComplex value) {
    setField(value);
  }

  public quickfix.field.AuctionTypeProductComplex get(quickfix.field.AuctionTypeProductComplex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AuctionTypeProductComplex getAuctionTypeProductComplex() throws FieldNotFound {
    return get(new quickfix.field.AuctionTypeProductComplex());
  }

  public boolean isSet(quickfix.field.AuctionTypeProductComplex field) {
    return isSetField(field);
  }

  public boolean isSetAuctionTypeProductComplex() {
    return isSetField(2549);
  }
}

  public void set(quickfix.fixlatest.component.MarketDataFeedTypes component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MarketDataFeedTypes get(quickfix.fixlatest.component.MarketDataFeedTypes component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MarketDataFeedTypes getMarketDataFeedTypesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MarketDataFeedTypes());
  }

  public void set(quickfix.field.NoMDFeedTypes value) {
    setField(value);
  }

  public quickfix.field.NoMDFeedTypes get(quickfix.field.NoMDFeedTypes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMDFeedTypes getNoMDFeedTypes() throws FieldNotFound {
    return get(new quickfix.field.NoMDFeedTypes());
  }

  public boolean isSet(quickfix.field.NoMDFeedTypes field) {
    return isSetField(field);
  }

  public boolean isSetNoMDFeedTypes() {
    return isSetField(1141);
  }

public static class NoMDFeedTypes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1022, 1683, 264, 2563, 2564, 2565, 2566, 1021, 1173, 2567, 2568, 0};

  public NoMDFeedTypes() {
    super(1141, 1022, ORDER);
  }

  public void set(quickfix.field.MDFeedType value) {
    setField(value);
  }

  public quickfix.field.MDFeedType get(quickfix.field.MDFeedType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDFeedType getMDFeedType() throws FieldNotFound {
    return get(new quickfix.field.MDFeedType());
  }

  public boolean isSet(quickfix.field.MDFeedType field) {
    return isSetField(field);
  }

  public boolean isSetMDFeedType() {
    return isSetField(1022);
  }

  public void set(quickfix.field.MDSubFeedType value) {
    setField(value);
  }

  public quickfix.field.MDSubFeedType get(quickfix.field.MDSubFeedType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDSubFeedType getMDSubFeedType() throws FieldNotFound {
    return get(new quickfix.field.MDSubFeedType());
  }

  public boolean isSet(quickfix.field.MDSubFeedType field) {
    return isSetField(field);
  }

  public boolean isSetMDSubFeedType() {
    return isSetField(1683);
  }

  public void set(quickfix.field.MarketDepth value) {
    setField(value);
  }

  public quickfix.field.MarketDepth get(quickfix.field.MarketDepth value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDepth getMarketDepth() throws FieldNotFound {
    return get(new quickfix.field.MarketDepth());
  }

  public boolean isSet(quickfix.field.MarketDepth field) {
    return isSetField(field);
  }

  public boolean isSetMarketDepth() {
    return isSetField(264);
  }

  public void set(quickfix.field.MarketDepthTimeInterval value) {
    setField(value);
  }

  public quickfix.field.MarketDepthTimeInterval get(quickfix.field.MarketDepthTimeInterval value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDepthTimeInterval getMarketDepthTimeInterval() throws FieldNotFound {
    return get(new quickfix.field.MarketDepthTimeInterval());
  }

  public boolean isSet(quickfix.field.MarketDepthTimeInterval field) {
    return isSetField(field);
  }

  public boolean isSetMarketDepthTimeInterval() {
    return isSetField(2563);
  }

  public void set(quickfix.field.MarketDepthTimeIntervalUnit value) {
    setField(value);
  }

  public quickfix.field.MarketDepthTimeIntervalUnit get(quickfix.field.MarketDepthTimeIntervalUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarketDepthTimeIntervalUnit getMarketDepthTimeIntervalUnit() throws FieldNotFound {
    return get(new quickfix.field.MarketDepthTimeIntervalUnit());
  }

  public boolean isSet(quickfix.field.MarketDepthTimeIntervalUnit field) {
    return isSetField(field);
  }

  public boolean isSetMarketDepthTimeIntervalUnit() {
    return isSetField(2564);
  }

  public void set(quickfix.field.MDRecoveryTimeInterval value) {
    setField(value);
  }

  public quickfix.field.MDRecoveryTimeInterval get(quickfix.field.MDRecoveryTimeInterval value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDRecoveryTimeInterval getMDRecoveryTimeInterval() throws FieldNotFound {
    return get(new quickfix.field.MDRecoveryTimeInterval());
  }

  public boolean isSet(quickfix.field.MDRecoveryTimeInterval field) {
    return isSetField(field);
  }

  public boolean isSetMDRecoveryTimeInterval() {
    return isSetField(2565);
  }

  public void set(quickfix.field.MDRecoveryTimeIntervalUnit value) {
    setField(value);
  }

  public quickfix.field.MDRecoveryTimeIntervalUnit get(quickfix.field.MDRecoveryTimeIntervalUnit value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDRecoveryTimeIntervalUnit getMDRecoveryTimeIntervalUnit() throws FieldNotFound {
    return get(new quickfix.field.MDRecoveryTimeIntervalUnit());
  }

  public boolean isSet(quickfix.field.MDRecoveryTimeIntervalUnit field) {
    return isSetField(field);
  }

  public boolean isSetMDRecoveryTimeIntervalUnit() {
    return isSetField(2566);
  }

  public void set(quickfix.field.MDBookType value) {
    setField(value);
  }

  public quickfix.field.MDBookType get(quickfix.field.MDBookType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDBookType getMDBookType() throws FieldNotFound {
    return get(new quickfix.field.MDBookType());
  }

  public boolean isSet(quickfix.field.MDBookType field) {
    return isSetField(field);
  }

  public boolean isSetMDBookType() {
    return isSetField(1021);
  }

  public void set(quickfix.field.MDSubBookType value) {
    setField(value);
  }

  public quickfix.field.MDSubBookType get(quickfix.field.MDSubBookType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDSubBookType getMDSubBookType() throws FieldNotFound {
    return get(new quickfix.field.MDSubBookType());
  }

  public boolean isSet(quickfix.field.MDSubBookType field) {
    return isSetField(field);
  }

  public boolean isSetMDSubBookType() {
    return isSetField(1173);
  }

  public void set(quickfix.field.PrimaryServiceLocationID value) {
    setField(value);
  }

  public quickfix.field.PrimaryServiceLocationID get(quickfix.field.PrimaryServiceLocationID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PrimaryServiceLocationID getPrimaryServiceLocationID() throws FieldNotFound {
    return get(new quickfix.field.PrimaryServiceLocationID());
  }

  public boolean isSet(quickfix.field.PrimaryServiceLocationID field) {
    return isSetField(field);
  }

  public boolean isSetPrimaryServiceLocationID() {
    return isSetField(2567);
  }

  public void set(quickfix.field.SecondaryServiceLocationID value) {
    setField(value);
  }

  public quickfix.field.SecondaryServiceLocationID get(quickfix.field.SecondaryServiceLocationID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecondaryServiceLocationID getSecondaryServiceLocationID() throws FieldNotFound {
    return get(new quickfix.field.SecondaryServiceLocationID());
  }

  public boolean isSet(quickfix.field.SecondaryServiceLocationID field) {
    return isSetField(field);
  }

  public boolean isSetSecondaryServiceLocationID() {
    return isSetField(2568);
  }
}

  public void set(quickfix.fixlatest.component.MatchRules component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MatchRules get(quickfix.fixlatest.component.MatchRules component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MatchRules getMatchRulesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MatchRules());
  }

  public void set(quickfix.field.NoMatchRules value) {
    setField(value);
  }

  public quickfix.field.NoMatchRules get(quickfix.field.NoMatchRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMatchRules getNoMatchRules() throws FieldNotFound {
    return get(new quickfix.field.NoMatchRules());
  }

  public boolean isSet(quickfix.field.NoMatchRules field) {
    return isSetField(field);
  }

  public boolean isSetNoMatchRules() {
    return isSetField(1235);
  }

public static class NoMatchRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1142, 574, 2569, 2570, 0};

  public NoMatchRules() {
    super(1235, 1142, ORDER);
  }

  public void set(quickfix.field.MatchAlgorithm value) {
    setField(value);
  }

  public quickfix.field.MatchAlgorithm get(quickfix.field.MatchAlgorithm value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchAlgorithm getMatchAlgorithm() throws FieldNotFound {
    return get(new quickfix.field.MatchAlgorithm());
  }

  public boolean isSet(quickfix.field.MatchAlgorithm field) {
    return isSetField(field);
  }

  public boolean isSetMatchAlgorithm() {
    return isSetField(1142);
  }

  public void set(quickfix.field.MatchType value) {
    setField(value);
  }

  public quickfix.field.MatchType get(quickfix.field.MatchType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchType getMatchType() throws FieldNotFound {
    return get(new quickfix.field.MatchType());
  }

  public boolean isSet(quickfix.field.MatchType field) {
    return isSetField(field);
  }

  public boolean isSetMatchType() {
    return isSetField(574);
  }

  public void set(quickfix.field.MatchRuleProductComplex value) {
    setField(value);
  }

  public quickfix.field.MatchRuleProductComplex get(quickfix.field.MatchRuleProductComplex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchRuleProductComplex getMatchRuleProductComplex() throws FieldNotFound {
    return get(new quickfix.field.MatchRuleProductComplex());
  }

  public boolean isSet(quickfix.field.MatchRuleProductComplex field) {
    return isSetField(field);
  }

  public boolean isSetMatchRuleProductComplex() {
    return isSetField(2569);
  }

  public void set(quickfix.field.CustomerPriority value) {
    setField(value);
  }

  public quickfix.field.CustomerPriority get(quickfix.field.CustomerPriority value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CustomerPriority getCustomerPriority() throws FieldNotFound {
    return get(new quickfix.field.CustomerPriority());
  }

  public boolean isSet(quickfix.field.CustomerPriority field) {
    return isSetField(field);
  }

  public boolean isSetCustomerPriority() {
    return isSetField(2570);
  }
}

  public void set(quickfix.fixlatest.component.FlexProductEligibilityGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.FlexProductEligibilityGrp get(quickfix.fixlatest.component.FlexProductEligibilityGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.FlexProductEligibilityGrp getFlexProductEligibilityGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.FlexProductEligibilityGrp());
  }

  public void set(quickfix.field.NoFlexProductEligibilities value) {
    setField(value);
  }

  public quickfix.field.NoFlexProductEligibilities get(quickfix.field.NoFlexProductEligibilities value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoFlexProductEligibilities getNoFlexProductEligibilities() throws FieldNotFound {
    return get(new quickfix.field.NoFlexProductEligibilities());
  }

  public boolean isSet(quickfix.field.NoFlexProductEligibilities field) {
    return isSetField(field);
  }

  public boolean isSetNoFlexProductEligibilities() {
    return isSetField(2560);
  }

public static class NoFlexProductEligibilities extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1242, 2561, 0};

  public NoFlexProductEligibilities() {
    super(2560, 1242, ORDER);
  }

  public void set(quickfix.field.FlexProductEligibilityIndicator value) {
    setField(value);
  }

  public quickfix.field.FlexProductEligibilityIndicator get(quickfix.field.FlexProductEligibilityIndicator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FlexProductEligibilityIndicator getFlexProductEligibilityIndicator() throws FieldNotFound {
    return get(new quickfix.field.FlexProductEligibilityIndicator());
  }

  public boolean isSet(quickfix.field.FlexProductEligibilityIndicator field) {
    return isSetField(field);
  }

  public boolean isSetFlexProductEligibilityIndicator() {
    return isSetField(1242);
  }

  public void set(quickfix.field.FlexProductEligibilityComplex value) {
    setField(value);
  }

  public quickfix.field.FlexProductEligibilityComplex get(quickfix.field.FlexProductEligibilityComplex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FlexProductEligibilityComplex getFlexProductEligibilityComplex() throws FieldNotFound {
    return get(new quickfix.field.FlexProductEligibilityComplex());
  }

  public boolean isSet(quickfix.field.FlexProductEligibilityComplex field) {
    return isSetField(field);
  }

  public boolean isSetFlexProductEligibilityComplex() {
    return isSetField(2561);
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

  public void set(quickfix.field.EffectiveBusinessDate value) {
    setField(value);
  }

  public quickfix.field.EffectiveBusinessDate get(quickfix.field.EffectiveBusinessDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EffectiveBusinessDate getEffectiveBusinessDate() throws FieldNotFound {
    return get(new quickfix.field.EffectiveBusinessDate());
  }

  public boolean isSet(quickfix.field.EffectiveBusinessDate field) {
    return isSetField(field);
  }

  public boolean isSetEffectiveBusinessDate() {
    return isSetField(2400);
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

  public void set(quickfix.field.Text value) {
    setField(value);
  }

  public quickfix.field.Text get(quickfix.field.Text value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Text getText() throws FieldNotFound {
    return get(new quickfix.field.Text());
  }

  public boolean isSet(quickfix.field.Text field) {
    return isSetField(field);
  }

  public boolean isSetText() {
    return isSetField(58);
  }

  public void set(quickfix.field.EncodedTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedTextLen get(quickfix.field.EncodedTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedTextLen getEncodedTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedTextLen());
  }

  public boolean isSet(quickfix.field.EncodedTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedTextLen() {
    return isSetField(354);
  }

  public void set(quickfix.field.EncodedText value) {
    setField(value);
  }

  public quickfix.field.EncodedText get(quickfix.field.EncodedText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedText getEncodedText() throws FieldNotFound {
    return get(new quickfix.field.EncodedText());
  }

  public boolean isSet(quickfix.field.EncodedText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedText() {
    return isSetField(355);
  }
}
