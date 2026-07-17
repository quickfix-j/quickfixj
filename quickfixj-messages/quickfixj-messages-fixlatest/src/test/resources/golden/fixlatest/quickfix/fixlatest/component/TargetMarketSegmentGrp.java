/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class TargetMarketSegmentGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1789, };
  protected int[] getGroupFields() { return componentGroups; }

  public TargetMarketSegmentGrp() {
    super();
  }

  public void set(quickfix.field.NoTargetMarketSegments value) {
    setField(value);
  }

  public quickfix.field.NoTargetMarketSegments get(quickfix.field.NoTargetMarketSegments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoTargetMarketSegments getNoTargetMarketSegments() throws FieldNotFound {
    return get(new quickfix.field.NoTargetMarketSegments());
  }

  public boolean isSet(quickfix.field.NoTargetMarketSegments field) {
    return isSetField(field);
  }

  public boolean isSetNoTargetMarketSegments() {
    return isSetField(1789);
  }

public static class NoTargetMarketSegments extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1790, 0};

  public NoTargetMarketSegments() {
    super(1789, 1790, ORDER);
  }

  public void set(quickfix.field.TargetMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.TargetMarketSegmentID get(quickfix.field.TargetMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TargetMarketSegmentID getTargetMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.TargetMarketSegmentID());
  }

  public boolean isSet(quickfix.field.TargetMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetTargetMarketSegmentID() {
    return isSetField(1790);
  }
}

  public void set(quickfix.field.TargetMarketSegmentID value) {
    setField(value);
  }

  public quickfix.field.TargetMarketSegmentID get(quickfix.field.TargetMarketSegmentID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TargetMarketSegmentID getTargetMarketSegmentID() throws FieldNotFound {
    return get(new quickfix.field.TargetMarketSegmentID());
  }

  public boolean isSet(quickfix.field.TargetMarketSegmentID field) {
    return isSetField(field);
  }

  public boolean isSetTargetMarketSegmentID() {
    return isSetField(1790);
  }
}
