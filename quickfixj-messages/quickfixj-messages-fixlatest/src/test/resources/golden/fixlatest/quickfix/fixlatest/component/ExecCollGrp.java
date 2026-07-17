/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ExecCollGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {124, };
  protected int[] getGroupFields() { return componentGroups; }

  public ExecCollGrp() {
    super();
  }

  public void set(quickfix.field.NoExecs value) {
    setField(value);
  }

  public quickfix.field.NoExecs get(quickfix.field.NoExecs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoExecs getNoExecs() throws FieldNotFound {
    return get(new quickfix.field.NoExecs());
  }

  public boolean isSet(quickfix.field.NoExecs field) {
    return isSetField(field);
  }

  public boolean isSetNoExecs() {
    return isSetField(124);
  }

public static class NoExecs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {17, 0};

  public NoExecs() {
    super(124, 17, ORDER);
  }

  public void set(quickfix.field.ExecID value) {
    setField(value);
  }

  public quickfix.field.ExecID get(quickfix.field.ExecID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecID getExecID() throws FieldNotFound {
    return get(new quickfix.field.ExecID());
  }

  public boolean isSet(quickfix.field.ExecID field) {
    return isSetField(field);
  }

  public boolean isSetExecID() {
    return isSetField(17);
  }
}

  public void set(quickfix.field.ExecID value) {
    setField(value);
  }

  public quickfix.field.ExecID get(quickfix.field.ExecID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ExecID getExecID() throws FieldNotFound {
    return get(new quickfix.field.ExecID());
  }

  public boolean isSet(quickfix.field.ExecID field) {
    return isSetField(field);
  }

  public boolean isSetExecID() {
    return isSetField(17);
  }
}
