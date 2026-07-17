/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DisclosureInstructionGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1812, };
  protected int[] getGroupFields() { return componentGroups; }

  public DisclosureInstructionGrp() {
    super();
  }

  public void set(quickfix.field.NoDisclosureInstructions value) {
    setField(value);
  }

  public quickfix.field.NoDisclosureInstructions get(quickfix.field.NoDisclosureInstructions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDisclosureInstructions getNoDisclosureInstructions() throws FieldNotFound {
    return get(new quickfix.field.NoDisclosureInstructions());
  }

  public boolean isSet(quickfix.field.NoDisclosureInstructions field) {
    return isSetField(field);
  }

  public boolean isSetNoDisclosureInstructions() {
    return isSetField(1812);
  }

public static class NoDisclosureInstructions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1813, 1814, 0};

  public NoDisclosureInstructions() {
    super(1812, 1813, ORDER);
  }

  public void set(quickfix.field.DisclosureType value) {
    setField(value);
  }

  public quickfix.field.DisclosureType get(quickfix.field.DisclosureType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DisclosureType getDisclosureType() throws FieldNotFound {
    return get(new quickfix.field.DisclosureType());
  }

  public boolean isSet(quickfix.field.DisclosureType field) {
    return isSetField(field);
  }

  public boolean isSetDisclosureType() {
    return isSetField(1813);
  }

  public void set(quickfix.field.DisclosureInstruction value) {
    setField(value);
  }

  public quickfix.field.DisclosureInstruction get(quickfix.field.DisclosureInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DisclosureInstruction getDisclosureInstruction() throws FieldNotFound {
    return get(new quickfix.field.DisclosureInstruction());
  }

  public boolean isSet(quickfix.field.DisclosureInstruction field) {
    return isSetField(field);
  }

  public boolean isSetDisclosureInstruction() {
    return isSetField(1814);
  }
}

  public void set(quickfix.field.DisclosureType value) {
    setField(value);
  }

  public quickfix.field.DisclosureType get(quickfix.field.DisclosureType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DisclosureType getDisclosureType() throws FieldNotFound {
    return get(new quickfix.field.DisclosureType());
  }

  public boolean isSet(quickfix.field.DisclosureType field) {
    return isSetField(field);
  }

  public boolean isSetDisclosureType() {
    return isSetField(1813);
  }

  public void set(quickfix.field.DisclosureInstruction value) {
    setField(value);
  }

  public quickfix.field.DisclosureInstruction get(quickfix.field.DisclosureInstruction value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DisclosureInstruction getDisclosureInstruction() throws FieldNotFound {
    return get(new quickfix.field.DisclosureInstruction());
  }

  public boolean isSet(quickfix.field.DisclosureInstruction field) {
    return isSetField(field);
  }

  public boolean isSetDisclosureInstruction() {
    return isSetField(1814);
  }
}
