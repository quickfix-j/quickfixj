/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class FinancingContractualDefinitionGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40040, };
  protected int[] getGroupFields() { return componentGroups; }

  public FinancingContractualDefinitionGrp() {
    super();
  }

  public void set(quickfix.field.NoContractualDefinitions value) {
    setField(value);
  }

  public quickfix.field.NoContractualDefinitions get(quickfix.field.NoContractualDefinitions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoContractualDefinitions getNoContractualDefinitions() throws FieldNotFound {
    return get(new quickfix.field.NoContractualDefinitions());
  }

  public boolean isSet(quickfix.field.NoContractualDefinitions field) {
    return isSetField(field);
  }

  public boolean isSetNoContractualDefinitions() {
    return isSetField(40040);
  }

public static class NoContractualDefinitions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40041, 0};

  public NoContractualDefinitions() {
    super(40040, 40041, ORDER);
  }

  public void set(quickfix.field.ContractualDefinition value) {
    setField(value);
  }

  public quickfix.field.ContractualDefinition get(quickfix.field.ContractualDefinition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContractualDefinition getContractualDefinition() throws FieldNotFound {
    return get(new quickfix.field.ContractualDefinition());
  }

  public boolean isSet(quickfix.field.ContractualDefinition field) {
    return isSetField(field);
  }

  public boolean isSetContractualDefinition() {
    return isSetField(40041);
  }
}

  public void set(quickfix.field.ContractualDefinition value) {
    setField(value);
  }

  public quickfix.field.ContractualDefinition get(quickfix.field.ContractualDefinition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContractualDefinition getContractualDefinition() throws FieldNotFound {
    return get(new quickfix.field.ContractualDefinition());
  }

  public boolean isSet(quickfix.field.ContractualDefinition field) {
    return isSetField(field);
  }

  public boolean isSetContractualDefinition() {
    return isSetField(40041);
  }
}
