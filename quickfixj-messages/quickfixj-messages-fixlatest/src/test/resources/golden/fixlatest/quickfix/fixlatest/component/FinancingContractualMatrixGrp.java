/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class FinancingContractualMatrixGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40042, };
  protected int[] getGroupFields() { return componentGroups; }

  public FinancingContractualMatrixGrp() {
    super();
  }

  public void set(quickfix.field.NoContractualMatrices value) {
    setField(value);
  }

  public quickfix.field.NoContractualMatrices get(quickfix.field.NoContractualMatrices value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoContractualMatrices getNoContractualMatrices() throws FieldNotFound {
    return get(new quickfix.field.NoContractualMatrices());
  }

  public boolean isSet(quickfix.field.NoContractualMatrices field) {
    return isSetField(field);
  }

  public boolean isSetNoContractualMatrices() {
    return isSetField(40042);
  }

public static class NoContractualMatrices extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40043, 40044, 40045, 0};

  public NoContractualMatrices() {
    super(40042, 40043, ORDER);
  }

  public void set(quickfix.field.ContractualMatrixSource value) {
    setField(value);
  }

  public quickfix.field.ContractualMatrixSource get(quickfix.field.ContractualMatrixSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContractualMatrixSource getContractualMatrixSource() throws FieldNotFound {
    return get(new quickfix.field.ContractualMatrixSource());
  }

  public boolean isSet(quickfix.field.ContractualMatrixSource field) {
    return isSetField(field);
  }

  public boolean isSetContractualMatrixSource() {
    return isSetField(40043);
  }

  public void set(quickfix.field.ContractualMatrixDate value) {
    setField(value);
  }

  public quickfix.field.ContractualMatrixDate get(quickfix.field.ContractualMatrixDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContractualMatrixDate getContractualMatrixDate() throws FieldNotFound {
    return get(new quickfix.field.ContractualMatrixDate());
  }

  public boolean isSet(quickfix.field.ContractualMatrixDate field) {
    return isSetField(field);
  }

  public boolean isSetContractualMatrixDate() {
    return isSetField(40044);
  }

  public void set(quickfix.field.ContractualMatrixTerm value) {
    setField(value);
  }

  public quickfix.field.ContractualMatrixTerm get(quickfix.field.ContractualMatrixTerm value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContractualMatrixTerm getContractualMatrixTerm() throws FieldNotFound {
    return get(new quickfix.field.ContractualMatrixTerm());
  }

  public boolean isSet(quickfix.field.ContractualMatrixTerm field) {
    return isSetField(field);
  }

  public boolean isSetContractualMatrixTerm() {
    return isSetField(40045);
  }
}

  public void set(quickfix.field.ContractualMatrixSource value) {
    setField(value);
  }

  public quickfix.field.ContractualMatrixSource get(quickfix.field.ContractualMatrixSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContractualMatrixSource getContractualMatrixSource() throws FieldNotFound {
    return get(new quickfix.field.ContractualMatrixSource());
  }

  public boolean isSet(quickfix.field.ContractualMatrixSource field) {
    return isSetField(field);
  }

  public boolean isSetContractualMatrixSource() {
    return isSetField(40043);
  }

  public void set(quickfix.field.ContractualMatrixDate value) {
    setField(value);
  }

  public quickfix.field.ContractualMatrixDate get(quickfix.field.ContractualMatrixDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContractualMatrixDate getContractualMatrixDate() throws FieldNotFound {
    return get(new quickfix.field.ContractualMatrixDate());
  }

  public boolean isSet(quickfix.field.ContractualMatrixDate field) {
    return isSetField(field);
  }

  public boolean isSetContractualMatrixDate() {
    return isSetField(40044);
  }

  public void set(quickfix.field.ContractualMatrixTerm value) {
    setField(value);
  }

  public quickfix.field.ContractualMatrixTerm get(quickfix.field.ContractualMatrixTerm value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContractualMatrixTerm getContractualMatrixTerm() throws FieldNotFound {
    return get(new quickfix.field.ContractualMatrixTerm());
  }

  public boolean isSet(quickfix.field.ContractualMatrixTerm field) {
    return isSetField(field);
  }

  public boolean isSetContractualMatrixTerm() {
    return isSetField(40045);
  }
}
