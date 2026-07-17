/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegComplexEventCreditEventQualifierGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {41374, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegComplexEventCreditEventQualifierGrp() {
    super();
  }

  public void set(quickfix.field.NoLegComplexEventCreditEventQualifiers value) {
    setField(value);
  }

  public quickfix.field.NoLegComplexEventCreditEventQualifiers get(quickfix.field.NoLegComplexEventCreditEventQualifiers value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegComplexEventCreditEventQualifiers getNoLegComplexEventCreditEventQualifiers() throws FieldNotFound {
    return get(new quickfix.field.NoLegComplexEventCreditEventQualifiers());
  }

  public boolean isSet(quickfix.field.NoLegComplexEventCreditEventQualifiers field) {
    return isSetField(field);
  }

  public boolean isSetNoLegComplexEventCreditEventQualifiers() {
    return isSetField(41374);
  }

public static class NoLegComplexEventCreditEventQualifiers extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {41375, 0};

  public NoLegComplexEventCreditEventQualifiers() {
    super(41374, 41375, ORDER);
  }

  public void set(quickfix.field.LegComplexEventCreditEventQualifier value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventQualifier get(quickfix.field.LegComplexEventCreditEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventQualifier getLegComplexEventCreditEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventQualifier());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventQualifier() {
    return isSetField(41375);
  }
}

  public void set(quickfix.field.LegComplexEventCreditEventQualifier value) {
    setField(value);
  }

  public quickfix.field.LegComplexEventCreditEventQualifier get(quickfix.field.LegComplexEventCreditEventQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegComplexEventCreditEventQualifier getLegComplexEventCreditEventQualifier() throws FieldNotFound {
    return get(new quickfix.field.LegComplexEventCreditEventQualifier());
  }

  public boolean isSet(quickfix.field.LegComplexEventCreditEventQualifier field) {
    return isSetField(field);
  }

  public boolean isSetLegComplexEventCreditEventQualifier() {
    return isSetField(41375);
  }
}
