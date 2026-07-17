/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class IOIQualGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {199, };
  protected int[] getGroupFields() { return componentGroups; }

  public IOIQualGrp() {
    super();
  }

  public void set(quickfix.field.NoIOIQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoIOIQualifiers get(quickfix.field.NoIOIQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoIOIQualifiers getNoIOIQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoIOIQualifiers());
  }

  public boolean isSet(quickfix.field.NoIOIQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoIOIQualifiers() {
    return isSetField(199);
  }

public static class NoIOIQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {104, 0};

  public NoIOIQualifiers() {
    super(199, 104, ORDER);
  }

  public void set(quickfix.field.IOIQualifier value) {
    setField(value);
  }

  public quickfix.field.IOIQualifier get(quickfix.field.IOIQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IOIQualifier getIOIQualifier() throws FieldNotFound {
    return get(new quickfix.field.IOIQualifier());
  }

  public boolean isSet(quickfix.field.IOIQualifier field) {
    return isSetField(field);
  }

  public boolean isSetIOIQualifier() {
    return isSetField(104);
  }
}

  public void set(quickfix.field.IOIQualifier value) {
    setField(value);
  }

  public quickfix.field.IOIQualifier get(quickfix.field.IOIQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.IOIQualifier getIOIQualifier() throws FieldNotFound {
    return get(new quickfix.field.IOIQualifier());
  }

  public boolean isSet(quickfix.field.IOIQualifier field) {
    return isSetField(field);
  }

  public boolean isSetIOIQualifier() {
    return isSetField(104);
  }
}
