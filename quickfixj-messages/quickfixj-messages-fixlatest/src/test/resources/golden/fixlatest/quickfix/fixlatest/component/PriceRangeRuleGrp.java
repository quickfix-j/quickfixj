/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class PriceRangeRuleGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2550, };
  protected int[] getGroupFields() { return componentGroups; }

  public PriceRangeRuleGrp() {
    super();
  }

  public void set(quickfix.field.NoPriceRangeRules value) {
    setField(value);
  }

  public quickfix.field.NoPriceRangeRules get(quickfix.field.NoPriceRangeRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPriceRangeRules getNoPriceRangeRules() throws FieldNotFound {
    return get(new quickfix.field.NoPriceRangeRules());
  }

  public boolean isSet(quickfix.field.NoPriceRangeRules field) {
    return isSetField(field);
  }

  public boolean isSetNoPriceRangeRules() {
    return isSetField(2550);
  }

public static class NoPriceRangeRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2551, 2552, 2553, 2554, 2556, 2555, 0};

  public NoPriceRangeRules() {
    super(2550, 2551, ORDER);
  }

  public void set(quickfix.field.StartPriceRange value) {
    setField(value);
  }

  public quickfix.field.StartPriceRange get(quickfix.field.StartPriceRange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StartPriceRange getStartPriceRange() throws FieldNotFound {
    return get(new quickfix.field.StartPriceRange());
  }

  public boolean isSet(quickfix.field.StartPriceRange field) {
    return isSetField(field);
  }

  public boolean isSetStartPriceRange() {
    return isSetField(2551);
  }

  public void set(quickfix.field.EndPriceRange value) {
    setField(value);
  }

  public quickfix.field.EndPriceRange get(quickfix.field.EndPriceRange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EndPriceRange getEndPriceRange() throws FieldNotFound {
    return get(new quickfix.field.EndPriceRange());
  }

  public boolean isSet(quickfix.field.EndPriceRange field) {
    return isSetField(field);
  }

  public boolean isSetEndPriceRange() {
    return isSetField(2552);
  }

  public void set(quickfix.field.PriceRangeValue value) {
    setField(value);
  }

  public quickfix.field.PriceRangeValue get(quickfix.field.PriceRangeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceRangeValue getPriceRangeValue() throws FieldNotFound {
    return get(new quickfix.field.PriceRangeValue());
  }

  public boolean isSet(quickfix.field.PriceRangeValue field) {
    return isSetField(field);
  }

  public boolean isSetPriceRangeValue() {
    return isSetField(2553);
  }

  public void set(quickfix.field.PriceRangePercentage value) {
    setField(value);
  }

  public quickfix.field.PriceRangePercentage get(quickfix.field.PriceRangePercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceRangePercentage getPriceRangePercentage() throws FieldNotFound {
    return get(new quickfix.field.PriceRangePercentage());
  }

  public boolean isSet(quickfix.field.PriceRangePercentage field) {
    return isSetField(field);
  }

  public boolean isSetPriceRangePercentage() {
    return isSetField(2554);
  }

  public void set(quickfix.field.PriceRangeRuleID value) {
    setField(value);
  }

  public quickfix.field.PriceRangeRuleID get(quickfix.field.PriceRangeRuleID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceRangeRuleID getPriceRangeRuleID() throws FieldNotFound {
    return get(new quickfix.field.PriceRangeRuleID());
  }

  public boolean isSet(quickfix.field.PriceRangeRuleID field) {
    return isSetField(field);
  }

  public boolean isSetPriceRangeRuleID() {
    return isSetField(2556);
  }

  public void set(quickfix.field.PriceRangeProductComplex value) {
    setField(value);
  }

  public quickfix.field.PriceRangeProductComplex get(quickfix.field.PriceRangeProductComplex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceRangeProductComplex getPriceRangeProductComplex() throws FieldNotFound {
    return get(new quickfix.field.PriceRangeProductComplex());
  }

  public boolean isSet(quickfix.field.PriceRangeProductComplex field) {
    return isSetField(field);
  }

  public boolean isSetPriceRangeProductComplex() {
    return isSetField(2555);
  }
}

  public void set(quickfix.field.StartPriceRange value) {
    setField(value);
  }

  public quickfix.field.StartPriceRange get(quickfix.field.StartPriceRange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StartPriceRange getStartPriceRange() throws FieldNotFound {
    return get(new quickfix.field.StartPriceRange());
  }

  public boolean isSet(quickfix.field.StartPriceRange field) {
    return isSetField(field);
  }

  public boolean isSetStartPriceRange() {
    return isSetField(2551);
  }

  public void set(quickfix.field.EndPriceRange value) {
    setField(value);
  }

  public quickfix.field.EndPriceRange get(quickfix.field.EndPriceRange value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EndPriceRange getEndPriceRange() throws FieldNotFound {
    return get(new quickfix.field.EndPriceRange());
  }

  public boolean isSet(quickfix.field.EndPriceRange field) {
    return isSetField(field);
  }

  public boolean isSetEndPriceRange() {
    return isSetField(2552);
  }

  public void set(quickfix.field.PriceRangeValue value) {
    setField(value);
  }

  public quickfix.field.PriceRangeValue get(quickfix.field.PriceRangeValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceRangeValue getPriceRangeValue() throws FieldNotFound {
    return get(new quickfix.field.PriceRangeValue());
  }

  public boolean isSet(quickfix.field.PriceRangeValue field) {
    return isSetField(field);
  }

  public boolean isSetPriceRangeValue() {
    return isSetField(2553);
  }

  public void set(quickfix.field.PriceRangePercentage value) {
    setField(value);
  }

  public quickfix.field.PriceRangePercentage get(quickfix.field.PriceRangePercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceRangePercentage getPriceRangePercentage() throws FieldNotFound {
    return get(new quickfix.field.PriceRangePercentage());
  }

  public boolean isSet(quickfix.field.PriceRangePercentage field) {
    return isSetField(field);
  }

  public boolean isSetPriceRangePercentage() {
    return isSetField(2554);
  }

  public void set(quickfix.field.PriceRangeRuleID value) {
    setField(value);
  }

  public quickfix.field.PriceRangeRuleID get(quickfix.field.PriceRangeRuleID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceRangeRuleID getPriceRangeRuleID() throws FieldNotFound {
    return get(new quickfix.field.PriceRangeRuleID());
  }

  public boolean isSet(quickfix.field.PriceRangeRuleID field) {
    return isSetField(field);
  }

  public boolean isSetPriceRangeRuleID() {
    return isSetField(2556);
  }

  public void set(quickfix.field.PriceRangeProductComplex value) {
    setField(value);
  }

  public quickfix.field.PriceRangeProductComplex get(quickfix.field.PriceRangeProductComplex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PriceRangeProductComplex getPriceRangeProductComplex() throws FieldNotFound {
    return get(new quickfix.field.PriceRangeProductComplex());
  }

  public boolean isSet(quickfix.field.PriceRangeProductComplex field) {
    return isSetField(field);
  }

  public boolean isSetPriceRangeProductComplex() {
    return isSetField(2555);
  }
}
