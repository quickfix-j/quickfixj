/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class TradingSessionRules extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public TradingSessionRules() {
    super();
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
}
