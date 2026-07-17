/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PriceMovementGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1919, };
  protected int[] getGroupFields() { return componentGroups; }

  public PriceMovementGrp() {
    super();
  }

  public void set(quickfix.field.NoPriceMovements value) {
    setField(value);
  }

  public quickfix.field.NoPriceMovements get(quickfix.field.NoPriceMovements value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPriceMovements getNoPriceMovements() throws FieldNotFound {
    return get(new quickfix.field.NoPriceMovements());
  }

  public boolean isSet(quickfix.field.NoPriceMovements field) {
    return isSetField(field);
  }

  public boolean isSetNoPriceMovements() {
    return isSetField(1919);
  }

public static class NoPriceMovements extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1920, 1918, 0};

  public NoPriceMovements() {
    super(1919, 1920, ORDER);
  }

  public void set(quickfix.fixlatest.component.PriceMovementValueGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PriceMovementValueGrp get(quickfix.fixlatest.component.PriceMovementValueGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PriceMovementValueGrp getPriceMovementValueGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PriceMovementValueGrp());
  }

  public void set(quickfix.field.NoPriceMovementValues value) {
    setField(value);
  }

  public quickfix.field.NoPriceMovementValues get(quickfix.field.NoPriceMovementValues value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPriceMovementValues getNoPriceMovementValues() throws FieldNotFound {
    return get(new quickfix.field.NoPriceMovementValues());
  }

  public boolean isSet(quickfix.field.NoPriceMovementValues field) {
    return isSetField(field);
  }

  public boolean isSetNoPriceMovementValues() {
    return isSetField(1920);
  }

public static class NoPriceMovementValues extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1921, 1922, 1923, 0};

  public NoPriceMovementValues() {
    super(1920, 1921, ORDER);
  }

  public void set(quickfix.field.PriceMovementValue value) {
    setField(value);
  }

  public quickfix.field.PriceMovementValue get(quickfix.field.PriceMovementValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceMovementValue getPriceMovementValue() throws FieldNotFound {
    return get(new quickfix.field.PriceMovementValue());
  }

  public boolean isSet(quickfix.field.PriceMovementValue field) {
    return isSetField(field);
  }

  public boolean isSetPriceMovementValue() {
    return isSetField(1921);
  }

  public void set(quickfix.field.PriceMovementPoint value) {
    setField(value);
  }

  public quickfix.field.PriceMovementPoint get(quickfix.field.PriceMovementPoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceMovementPoint getPriceMovementPoint() throws FieldNotFound {
    return get(new quickfix.field.PriceMovementPoint());
  }

  public boolean isSet(quickfix.field.PriceMovementPoint field) {
    return isSetField(field);
  }

  public boolean isSetPriceMovementPoint() {
    return isSetField(1922);
  }

  public void set(quickfix.field.PriceMovementType value) {
    setField(value);
  }

  public quickfix.field.PriceMovementType get(quickfix.field.PriceMovementType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceMovementType getPriceMovementType() throws FieldNotFound {
    return get(new quickfix.field.PriceMovementType());
  }

  public boolean isSet(quickfix.field.PriceMovementType field) {
    return isSetField(field);
  }

  public boolean isSetPriceMovementType() {
    return isSetField(1923);
  }
}

  public void set(quickfix.fixlatest.component.ClearingAccountTypeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ClearingAccountTypeGrp get(quickfix.fixlatest.component.ClearingAccountTypeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ClearingAccountTypeGrp getClearingAccountTypeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ClearingAccountTypeGrp());
  }

  public void set(quickfix.field.NoClearingAccountTypes value) {
    setField(value);
  }

  public quickfix.field.NoClearingAccountTypes get(quickfix.field.NoClearingAccountTypes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoClearingAccountTypes getNoClearingAccountTypes() throws FieldNotFound {
    return get(new quickfix.field.NoClearingAccountTypes());
  }

  public boolean isSet(quickfix.field.NoClearingAccountTypes field) {
    return isSetField(field);
  }

  public boolean isSetNoClearingAccountTypes() {
    return isSetField(1918);
  }

public static class NoClearingAccountTypes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1816, 0};

  public NoClearingAccountTypes() {
    super(1918, 1816, ORDER);
  }

  public void set(quickfix.field.ClearingAccountType value) {
    setField(value);
  }

  public quickfix.field.ClearingAccountType get(quickfix.field.ClearingAccountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingAccountType getClearingAccountType() throws FieldNotFound {
    return get(new quickfix.field.ClearingAccountType());
  }

  public boolean isSet(quickfix.field.ClearingAccountType field) {
    return isSetField(field);
  }

  public boolean isSetClearingAccountType() {
    return isSetField(1816);
  }
}
}

  public void set(quickfix.fixlatest.component.PriceMovementValueGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.PriceMovementValueGrp get(quickfix.fixlatest.component.PriceMovementValueGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.PriceMovementValueGrp getPriceMovementValueGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.PriceMovementValueGrp());
  }

  public void set(quickfix.field.NoPriceMovementValues value) {
    setField(value);
  }

  public quickfix.field.NoPriceMovementValues get(quickfix.field.NoPriceMovementValues value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPriceMovementValues getNoPriceMovementValues() throws FieldNotFound {
    return get(new quickfix.field.NoPriceMovementValues());
  }

  public boolean isSet(quickfix.field.NoPriceMovementValues field) {
    return isSetField(field);
  }

  public boolean isSetNoPriceMovementValues() {
    return isSetField(1920);
  }

public static class NoPriceMovementValues extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1921, 1922, 1923, 0};

  public NoPriceMovementValues() {
    super(1920, 1921, ORDER);
  }

  public void set(quickfix.field.PriceMovementValue value) {
    setField(value);
  }

  public quickfix.field.PriceMovementValue get(quickfix.field.PriceMovementValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceMovementValue getPriceMovementValue() throws FieldNotFound {
    return get(new quickfix.field.PriceMovementValue());
  }

  public boolean isSet(quickfix.field.PriceMovementValue field) {
    return isSetField(field);
  }

  public boolean isSetPriceMovementValue() {
    return isSetField(1921);
  }

  public void set(quickfix.field.PriceMovementPoint value) {
    setField(value);
  }

  public quickfix.field.PriceMovementPoint get(quickfix.field.PriceMovementPoint value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceMovementPoint getPriceMovementPoint() throws FieldNotFound {
    return get(new quickfix.field.PriceMovementPoint());
  }

  public boolean isSet(quickfix.field.PriceMovementPoint field) {
    return isSetField(field);
  }

  public boolean isSetPriceMovementPoint() {
    return isSetField(1922);
  }

  public void set(quickfix.field.PriceMovementType value) {
    setField(value);
  }

  public quickfix.field.PriceMovementType get(quickfix.field.PriceMovementType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceMovementType getPriceMovementType() throws FieldNotFound {
    return get(new quickfix.field.PriceMovementType());
  }

  public boolean isSet(quickfix.field.PriceMovementType field) {
    return isSetField(field);
  }

  public boolean isSetPriceMovementType() {
    return isSetField(1923);
  }
}

  public void set(quickfix.fixlatest.component.ClearingAccountTypeGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.ClearingAccountTypeGrp get(quickfix.fixlatest.component.ClearingAccountTypeGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.ClearingAccountTypeGrp getClearingAccountTypeGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.ClearingAccountTypeGrp());
  }

  public void set(quickfix.field.NoClearingAccountTypes value) {
    setField(value);
  }

  public quickfix.field.NoClearingAccountTypes get(quickfix.field.NoClearingAccountTypes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoClearingAccountTypes getNoClearingAccountTypes() throws FieldNotFound {
    return get(new quickfix.field.NoClearingAccountTypes());
  }

  public boolean isSet(quickfix.field.NoClearingAccountTypes field) {
    return isSetField(field);
  }

  public boolean isSetNoClearingAccountTypes() {
    return isSetField(1918);
  }

public static class NoClearingAccountTypes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1816, 0};

  public NoClearingAccountTypes() {
    super(1918, 1816, ORDER);
  }

  public void set(quickfix.field.ClearingAccountType value) {
    setField(value);
  }

  public quickfix.field.ClearingAccountType get(quickfix.field.ClearingAccountType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClearingAccountType getClearingAccountType() throws FieldNotFound {
    return get(new quickfix.field.ClearingAccountType());
  }

  public boolean isSet(quickfix.field.ClearingAccountType field) {
    return isSetField(field);
  }

  public boolean isSetClearingAccountType() {
    return isSetField(1816);
  }
}
}
