/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class MDReqGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {267, };
  protected int[] getGroupFields() { return componentGroups; }

  public MDReqGrp() {
    super();
  }

  public void set(quickfix.field.NoMDEntryTypes value) {
    setField(value);
  }

  public quickfix.field.NoMDEntryTypes get(quickfix.field.NoMDEntryTypes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMDEntryTypes getNoMDEntryTypes() throws FieldNotFound {
    return get(new quickfix.field.NoMDEntryTypes());
  }

  public boolean isSet(quickfix.field.NoMDEntryTypes field) {
    return isSetField(field);
  }

  public boolean isSetNoMDEntryTypes() {
    return isSetField(267);
  }

public static class NoMDEntryTypes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {269, 0};

  public NoMDEntryTypes() {
    super(267, 269, ORDER);
  }

  public void set(quickfix.field.MDEntryType value) {
    setField(value);
  }

  public quickfix.field.MDEntryType get(quickfix.field.MDEntryType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryType getMDEntryType() throws FieldNotFound {
    return get(new quickfix.field.MDEntryType());
  }

  public boolean isSet(quickfix.field.MDEntryType field) {
    return isSetField(field);
  }

  public boolean isSetMDEntryType() {
    return isSetField(269);
  }
}

  public void set(quickfix.field.MDEntryType value) {
    setField(value);
  }

  public quickfix.field.MDEntryType get(quickfix.field.MDEntryType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryType getMDEntryType() throws FieldNotFound {
    return get(new quickfix.field.MDEntryType());
  }

  public boolean isSet(quickfix.field.MDEntryType field) {
    return isSetField(field);
  }

  public boolean isSetMDEntryType() {
    return isSetField(269);
  }
}
