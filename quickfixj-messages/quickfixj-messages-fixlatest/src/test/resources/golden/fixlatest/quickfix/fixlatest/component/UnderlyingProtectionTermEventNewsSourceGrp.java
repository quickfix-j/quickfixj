/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingProtectionTermEventNewsSourceGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42090, };
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingProtectionTermEventNewsSourceGrp() {
    super();
  }

  public void set(quickfix.field.NoUnderlyingProtectionTermEventNewsSources value) {
    setField(value);
  }

  public quickfix.field.NoUnderlyingProtectionTermEventNewsSources get(quickfix.field.NoUnderlyingProtectionTermEventNewsSources value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUnderlyingProtectionTermEventNewsSources getNoUnderlyingProtectionTermEventNewsSources() throws FieldNotFound {
    return get(new quickfix.field.NoUnderlyingProtectionTermEventNewsSources());
  }

  public boolean isSet(quickfix.field.NoUnderlyingProtectionTermEventNewsSources field) {
    return isSetField(field);
  }

  public boolean isSetNoUnderlyingProtectionTermEventNewsSources() {
    return isSetField(42090);
  }

public static class NoUnderlyingProtectionTermEventNewsSources extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42091, 0};

  public NoUnderlyingProtectionTermEventNewsSources() {
    super(42090, 42091, ORDER);
  }

  public void set(quickfix.field.UnderlyingProtectionTermEventNewsSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventNewsSource get(quickfix.field.UnderlyingProtectionTermEventNewsSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventNewsSource getUnderlyingProtectionTermEventNewsSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventNewsSource());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventNewsSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventNewsSource() {
    return isSetField(42091);
  }
}

  public void set(quickfix.field.UnderlyingProtectionTermEventNewsSource value) {
    setField(value);
  }

  public quickfix.field.UnderlyingProtectionTermEventNewsSource get(quickfix.field.UnderlyingProtectionTermEventNewsSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingProtectionTermEventNewsSource getUnderlyingProtectionTermEventNewsSource() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingProtectionTermEventNewsSource());
  }

  public boolean isSet(quickfix.field.UnderlyingProtectionTermEventNewsSource field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingProtectionTermEventNewsSource() {
    return isSetField(42091);
  }
}
