/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class RiskInstrumentScopeGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1534, };
  protected int[] getGroupFields() { return componentGroups; }

  public RiskInstrumentScopeGrp() {
    super();
  }

  public void set(quickfix.field.NoRiskInstrumentScopes value) {
    setField(value);
  }

  public quickfix.field.NoRiskInstrumentScopes get(quickfix.field.NoRiskInstrumentScopes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRiskInstrumentScopes getNoRiskInstrumentScopes() throws FieldNotFound {
    return get(new quickfix.field.NoRiskInstrumentScopes());
  }

  public boolean isSet(quickfix.field.NoRiskInstrumentScopes field) {
    return isSetField(field);
  }

  public boolean isSetNoRiskInstrumentScopes() {
    return isSetField(1534);
  }

public static class NoRiskInstrumentScopes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1535, 1536, 1537, 1538, 1539, 1540, 1543, 1544, 1545, 1546, 2895, 1547, 1548, 1549, 1550, 1551, 1552, 1553, 1554, 1555, 1616, 1556, 1620, 1621, 1557, 1558, 0};

  public NoRiskInstrumentScopes() {
    super(1534, 1535, ORDER);
  }

  public void set(quickfix.field.InstrumentScopeOperator value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeOperator get(quickfix.field.InstrumentScopeOperator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeOperator getInstrumentScopeOperator() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeOperator());
  }

  public boolean isSet(quickfix.field.InstrumentScopeOperator field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeOperator() {
    return isSetField(1535);
  }

  public void set(quickfix.fixlatest.component.InstrumentScope component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrumentScope get(quickfix.fixlatest.component.InstrumentScope component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrumentScope getInstrumentScopeComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrumentScope());
  }

  public void set(quickfix.field.RiskInstrumentMultiplier value) {
    setField(value);
  }

  public quickfix.field.RiskInstrumentMultiplier get(quickfix.field.RiskInstrumentMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskInstrumentMultiplier getRiskInstrumentMultiplier() throws FieldNotFound {
    return get(new quickfix.field.RiskInstrumentMultiplier());
  }

  public boolean isSet(quickfix.field.RiskInstrumentMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetRiskInstrumentMultiplier() {
    return isSetField(1558);
  }
}

  public void set(quickfix.field.InstrumentScopeOperator value) {
    setField(value);
  }

  public quickfix.field.InstrumentScopeOperator get(quickfix.field.InstrumentScopeOperator value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InstrumentScopeOperator getInstrumentScopeOperator() throws FieldNotFound {
    return get(new quickfix.field.InstrumentScopeOperator());
  }

  public boolean isSet(quickfix.field.InstrumentScopeOperator field) {
    return isSetField(field);
  }

  public boolean isSetInstrumentScopeOperator() {
    return isSetField(1535);
  }

  public void set(quickfix.fixlatest.component.InstrumentScope component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.InstrumentScope get(quickfix.fixlatest.component.InstrumentScope component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.InstrumentScope getInstrumentScopeComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.InstrumentScope());
  }

  public void set(quickfix.field.RiskInstrumentMultiplier value) {
    setField(value);
  }

  public quickfix.field.RiskInstrumentMultiplier get(quickfix.field.RiskInstrumentMultiplier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RiskInstrumentMultiplier getRiskInstrumentMultiplier() throws FieldNotFound {
    return get(new quickfix.field.RiskInstrumentMultiplier());
  }

  public boolean isSet(quickfix.field.RiskInstrumentMultiplier field) {
    return isSetField(field);
  }

  public boolean isSetRiskInstrumentMultiplier() {
    return isSetField(1558);
  }
}
