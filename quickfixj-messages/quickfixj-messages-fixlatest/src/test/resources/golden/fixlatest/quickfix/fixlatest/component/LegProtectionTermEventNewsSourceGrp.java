/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegProtectionTermEventNewsSourceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41614, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegProtectionTermEventNewsSourceGrp() {
    super();
  }

  public void set(quickfix.field.NoLegProtectionTermEventNewsSources value) {
    setField(value);
  }

  public quickfix.field.NoLegProtectionTermEventNewsSources get(quickfix.field.NoLegProtectionTermEventNewsSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegProtectionTermEventNewsSources getNoLegProtectionTermEventNewsSources() throws FieldNotFound {
    return get(new quickfix.field.NoLegProtectionTermEventNewsSources());
  }

  public boolean isSet(quickfix.field.NoLegProtectionTermEventNewsSources field) {
    return isSetField(field);
  }

  public boolean isSetNoLegProtectionTermEventNewsSources() {
    return isSetField(41614);
  }

public static class NoLegProtectionTermEventNewsSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41615, 0};

  public NoLegProtectionTermEventNewsSources() {
    super(41614, 41615, ORDER);
  }

  public void set(quickfix.field.LegProtectionTermEventNewsSource value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventNewsSource get(quickfix.field.LegProtectionTermEventNewsSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventNewsSource getLegProtectionTermEventNewsSource() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventNewsSource());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventNewsSource field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventNewsSource() {
    return isSetField(41615);
  }
}

  public void set(quickfix.field.LegProtectionTermEventNewsSource value) {
    setField(value);
  }

  public quickfix.field.LegProtectionTermEventNewsSource get(quickfix.field.LegProtectionTermEventNewsSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegProtectionTermEventNewsSource getLegProtectionTermEventNewsSource() throws FieldNotFound {
    return get(new quickfix.field.LegProtectionTermEventNewsSource());
  }

  public boolean isSet(quickfix.field.LegProtectionTermEventNewsSource field) {
    return isSetField(field);
  }

  public boolean isSetLegProtectionTermEventNewsSource() {
    return isSetField(41615);
  }
}
