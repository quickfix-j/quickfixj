/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ProtectionTermEventNewsSourceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40951, };
  protected int[] getGroupFields() { return componentGroups; }

  public ProtectionTermEventNewsSourceGrp() {
    super();
  }

  public void set(quickfix.field.NoProtectionTermEventNewsSources value) {
    setField(value);
  }

  public quickfix.field.NoProtectionTermEventNewsSources get(quickfix.field.NoProtectionTermEventNewsSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoProtectionTermEventNewsSources getNoProtectionTermEventNewsSources() throws FieldNotFound {
    return get(new quickfix.field.NoProtectionTermEventNewsSources());
  }

  public boolean isSet(quickfix.field.NoProtectionTermEventNewsSources field) {
    return isSetField(field);
  }

  public boolean isSetNoProtectionTermEventNewsSources() {
    return isSetField(40951);
  }

public static class NoProtectionTermEventNewsSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40189, 0};

  public NoProtectionTermEventNewsSources() {
    super(40951, 40189, ORDER);
  }

  public void set(quickfix.field.ProtectionTermEventNewsSource value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventNewsSource get(quickfix.field.ProtectionTermEventNewsSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventNewsSource getProtectionTermEventNewsSource() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventNewsSource());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventNewsSource field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventNewsSource() {
    return isSetField(40189);
  }
}

  public void set(quickfix.field.ProtectionTermEventNewsSource value) {
    setField(value);
  }

  public quickfix.field.ProtectionTermEventNewsSource get(quickfix.field.ProtectionTermEventNewsSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ProtectionTermEventNewsSource getProtectionTermEventNewsSource() throws FieldNotFound {
    return get(new quickfix.field.ProtectionTermEventNewsSource());
  }

  public boolean isSet(quickfix.field.ProtectionTermEventNewsSource field) {
    return isSetField(field);
  }

  public boolean isSetProtectionTermEventNewsSource() {
    return isSetField(40189);
  }
}
