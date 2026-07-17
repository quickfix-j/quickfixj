/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class NotAffectedMarketSegmentGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1793, };
  protected int[] getGroupFields() { return componentGroups; }

  public NotAffectedMarketSegmentGrp() {
    super();
  }

  public void set(quickfix.field.NoNotAffectedMarketSegments value) {
    setField(value);
  }

  public quickfix.field.NoNotAffectedMarketSegments get(quickfix.field.NoNotAffectedMarketSegments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNotAffectedMarketSegments getNoNotAffectedMarketSegments() throws FieldNotFound {
    return get(new quickfix.field.NoNotAffectedMarketSegments());
  }

  public boolean isSet(quickfix.field.NoNotAffectedMarketSegments field) {
    return isSetField(field);
  }

  public boolean isSetNoNotAffectedMarketSegments() {
    return isSetField(1793);
  }

public static class NoNotAffectedMarketSegments extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1794, 0};

  public NoNotAffectedMarketSegments() {
    super(1793, 1794, ORDER);
  }

  public void set(quickfix.field.NotAffectedMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.NotAffectedMarketSegmentID get(quickfix.field.NotAffectedMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NotAffectedMarketSegmentID getNotAffectedMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.NotAffectedMarketSegmentID());
  }

  public boolean isSet(quickfix.field.NotAffectedMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetNotAffectedMarketSegmentID() {
    return isSetField(1794);
  }
}

  public void set(quickfix.field.NotAffectedMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.NotAffectedMarketSegmentID get(quickfix.field.NotAffectedMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NotAffectedMarketSegmentID getNotAffectedMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.NotAffectedMarketSegmentID());
  }

  public boolean isSet(quickfix.field.NotAffectedMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetNotAffectedMarketSegmentID() {
    return isSetField(1794);
  }
}
