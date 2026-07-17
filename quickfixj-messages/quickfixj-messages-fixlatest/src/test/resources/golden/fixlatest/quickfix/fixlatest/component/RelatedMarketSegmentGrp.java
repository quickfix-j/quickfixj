/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class RelatedMarketSegmentGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2545, };
  protected int[] getGroupFields() { return componentGroups; }

  public RelatedMarketSegmentGrp() {
    super();
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
