/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegFinancingContractualDefinitionsGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42198, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegFinancingContractualDefinitionsGrp() {
    super();
  }

  public void set(quickfix.field.NoLegContractualDefinitions value) {
    setField(value);
  }

  public quickfix.field.NoLegContractualDefinitions get(quickfix.field.NoLegContractualDefinitions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegContractualDefinitions getNoLegContractualDefinitions() throws FieldNotFound {
    return get(new quickfix.field.NoLegContractualDefinitions());
  }

  public boolean isSet(quickfix.field.NoLegContractualDefinitions field) {
    return isSetField(field);
  }

  public boolean isSetNoLegContractualDefinitions() {
    return isSetField(42198);
  }

public static class NoLegContractualDefinitions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42199, 0};

  public NoLegContractualDefinitions() {
    super(42198, 42199, ORDER);
  }

  public void set(quickfix.field.LegContractualDefinition value) {
    setField(value);
  }

  public quickfix.field.LegContractualDefinition get(quickfix.field.LegContractualDefinition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegContractualDefinition getLegContractualDefinition() throws FieldNotFound {
    return get(new quickfix.field.LegContractualDefinition());
  }

  public boolean isSet(quickfix.field.LegContractualDefinition field) {
    return isSetField(field);
  }

  public boolean isSetLegContractualDefinition() {
    return isSetField(42199);
  }
}

  public void set(quickfix.field.LegContractualDefinition value) {
    setField(value);
  }

  public quickfix.field.LegContractualDefinition get(quickfix.field.LegContractualDefinition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegContractualDefinition getLegContractualDefinition() throws FieldNotFound {
    return get(new quickfix.field.LegContractualDefinition());
  }

  public boolean isSet(quickfix.field.LegContractualDefinition field) {
    return isSetField(field);
  }

  public boolean isSetLegContractualDefinition() {
    return isSetField(42199);
  }
}
