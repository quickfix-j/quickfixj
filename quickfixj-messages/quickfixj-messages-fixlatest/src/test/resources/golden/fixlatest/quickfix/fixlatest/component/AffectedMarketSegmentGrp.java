/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class AffectedMarketSegmentGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1791, };
  protected int[] getGroupFields() { return componentGroups; }

  public AffectedMarketSegmentGrp() {
    super();
  }

  public void set(quickfix.field.NoAffectedMarketSegments value) {
    setField(value);
  }

  public quickfix.field.NoAffectedMarketSegments get(quickfix.field.NoAffectedMarketSegments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAffectedMarketSegments getNoAffectedMarketSegments() throws FieldNotFound {
    return get(new quickfix.field.NoAffectedMarketSegments());
  }

  public boolean isSet(quickfix.field.NoAffectedMarketSegments field) {
    return isSetField(field);
  }

  public boolean isSetNoAffectedMarketSegments() {
    return isSetField(1791);
  }

public static class NoAffectedMarketSegments extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1792, 0};

  public NoAffectedMarketSegments() {
    super(1791, 1792, ORDER);
  }

  public void set(quickfix.field.AffectedMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.AffectedMarketSegmentID get(quickfix.field.AffectedMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AffectedMarketSegmentID getAffectedMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.AffectedMarketSegmentID());
  }

  public boolean isSet(quickfix.field.AffectedMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetAffectedMarketSegmentID() {
    return isSetField(1792);
  }
}

  public void set(quickfix.field.AffectedMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.AffectedMarketSegmentID get(quickfix.field.AffectedMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AffectedMarketSegmentID getAffectedMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.AffectedMarketSegmentID());
  }

  public boolean isSet(quickfix.field.AffectedMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetAffectedMarketSegmentID() {
    return isSetField(1792);
  }
}
