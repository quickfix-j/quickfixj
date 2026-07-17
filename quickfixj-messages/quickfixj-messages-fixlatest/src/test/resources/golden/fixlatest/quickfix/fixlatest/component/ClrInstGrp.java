/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class ClrInstGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {576, };
  protected int[] getGroupFields() { return componentGroups; }

  public ClrInstGrp() {
    super();
  }

  public void set(quickfix.field.NoClearingInstructions value) {
    setField(value);
  }

  public quickfix.field.NoClearingInstructions get(quickfix.field.NoClearingInstructions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoClearingInstructions getNoClearingInstructions() throws FieldNotFound {
    return get(new quickfix.field.NoClearingInstructions());
  }

  public boolean isSet(quickfix.field.NoClearingInstructions field) {
    return isSetField(field);
  }

  public boolean isSetNoClearingInstructions() {
    return isSetField(576);
  }

public static class NoClearingInstructions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {577, 0};

  public NoClearingInstructions() {
    super(576, 577, ORDER);
  }

  public void set(quickfix.field.ClearingInstruction value) {
    setField(value);
  }

  public quickfix.field.ClearingInstruction get(quickfix.field.ClearingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingInstruction getClearingInstruction() throws FieldNotFound {
    return get(new quickfix.field.ClearingInstruction());
  }

  public boolean isSet(quickfix.field.ClearingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetClearingInstruction() {
    return isSetField(577);
  }
}

  public void set(quickfix.field.ClearingInstruction value) {
    setField(value);
  }

  public quickfix.field.ClearingInstruction get(quickfix.field.ClearingInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingInstruction getClearingInstruction() throws FieldNotFound {
    return get(new quickfix.field.ClearingInstruction());
  }

  public boolean isSet(quickfix.field.ClearingInstruction field) {
    return isSetField(field);
  }

  public boolean isSetClearingInstruction() {
    return isSetField(577);
  }
}
