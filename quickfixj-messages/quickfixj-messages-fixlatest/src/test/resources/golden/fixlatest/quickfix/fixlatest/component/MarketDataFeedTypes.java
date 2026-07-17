/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class MarketDataFeedTypes extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1141, };
  protected int[] getGroupFields() { return componentGroups; }

  public MarketDataFeedTypes() {
    super();
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
