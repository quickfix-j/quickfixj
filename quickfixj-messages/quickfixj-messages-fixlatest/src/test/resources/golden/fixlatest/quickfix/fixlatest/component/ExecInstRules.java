/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ExecInstRules extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1232, };
  protected int[] getGroupFields() { return componentGroups; }

  public ExecInstRules() {
    super();
  }

  public void set(quickfix.field.NoExecInstRules value) {
    setField(value);
  }

  public quickfix.field.NoExecInstRules get(quickfix.field.NoExecInstRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoExecInstRules getNoExecInstRules() throws FieldNotFound {
    return get(new quickfix.field.NoExecInstRules());
  }

  public boolean isSet(quickfix.field.NoExecInstRules field) {
    return isSetField(field);
  }

  public boolean isSetNoExecInstRules() {
    return isSetField(1232);
  }

public static class NoExecInstRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1308, 0};

  public NoExecInstRules() {
    super(1232, 1308, ORDER);
  }

  public void set(quickfix.field.ExecInstValue value) {
    setField(value);
  }

  public quickfix.field.ExecInstValue get(quickfix.field.ExecInstValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecInstValue getExecInstValue() throws FieldNotFound {
    return get(new quickfix.field.ExecInstValue());
  }

  public boolean isSet(quickfix.field.ExecInstValue field) {
    return isSetField(field);
  }

  public boolean isSetExecInstValue() {
    return isSetField(1308);
  }
}

  public void set(quickfix.field.ExecInstValue value) {
    setField(value);
  }

  public quickfix.field.ExecInstValue get(quickfix.field.ExecInstValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecInstValue getExecInstValue() throws FieldNotFound {
    return get(new quickfix.field.ExecInstValue());
  }

  public boolean isSet(quickfix.field.ExecInstValue field) {
    return isSetField(field);
  }

  public boolean isSetExecInstValue() {
    return isSetField(1308);
  }
}
