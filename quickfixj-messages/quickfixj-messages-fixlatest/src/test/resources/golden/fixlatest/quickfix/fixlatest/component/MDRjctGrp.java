/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class MDRjctGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {816, };
  protected int[] getGroupFields() { return componentGroups; }

  public MDRjctGrp() {
    super();
  }

  public void set(quickfix.field.NoAltMDSource value) {
    setField(value);
  }

  public quickfix.field.NoAltMDSource get(quickfix.field.NoAltMDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAltMDSource getNoAltMDSource() throws FieldNotFound {
    return get(new quickfix.field.NoAltMDSource());
  }

  public boolean isSet(quickfix.field.NoAltMDSource field) {
    return isSetField(field);
  }

  public boolean isSetNoAltMDSource() {
    return isSetField(816);
  }

public static class NoAltMDSource extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {817, 0};

  public NoAltMDSource() {
    super(816, 817, ORDER);
  }

  public void set(quickfix.field.AltMDSourceID value) {
    setField(value);
  }

  public quickfix.field.AltMDSourceID get(quickfix.field.AltMDSourceID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AltMDSourceID getAltMDSourceID() throws FieldNotFound {
    return get(new quickfix.field.AltMDSourceID());
  }

  public boolean isSet(quickfix.field.AltMDSourceID field) {
    return isSetField(field);
  }

  public boolean isSetAltMDSourceID() {
    return isSetField(817);
  }
}

  public void set(quickfix.field.AltMDSourceID value) {
    setField(value);
  }

  public quickfix.field.AltMDSourceID get(quickfix.field.AltMDSourceID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AltMDSourceID getAltMDSourceID() throws FieldNotFound {
    return get(new quickfix.field.AltMDSourceID());
  }

  public boolean isSet(quickfix.field.AltMDSourceID field) {
    return isSetField(field);
  }

  public boolean isSetAltMDSourceID() {
    return isSetField(817);
  }
}
