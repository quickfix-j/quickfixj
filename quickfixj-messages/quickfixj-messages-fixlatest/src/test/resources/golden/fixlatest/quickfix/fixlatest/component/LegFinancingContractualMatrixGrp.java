/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegFinancingContractualMatrixGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {42203, };
  protected int[] getGroupFields() { return componentGroups; }

  public LegFinancingContractualMatrixGrp() {
    super();
  }

  public void set(quickfix.field.NoLegContractualMatrices value) {
    setField(value);
  }

  public quickfix.field.NoLegContractualMatrices get(quickfix.field.NoLegContractualMatrices value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegContractualMatrices getNoLegContractualMatrices() throws FieldNotFound {
    return get(new quickfix.field.NoLegContractualMatrices());
  }

  public boolean isSet(quickfix.field.NoLegContractualMatrices field) {
    return isSetField(field);
  }

  public boolean isSetNoLegContractualMatrices() {
    return isSetField(42203);
  }

public static class NoLegContractualMatrices extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42204, 42205, 42206, 0};

  public NoLegContractualMatrices() {
    super(42203, 42204, ORDER);
  }

  public void set(quickfix.field.LegContractualMatrixSource value) {
    setField(value);
  }

  public quickfix.field.LegContractualMatrixSource get(quickfix.field.LegContractualMatrixSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegContractualMatrixSource getLegContractualMatrixSource() throws FieldNotFound {
    return get(new quickfix.field.LegContractualMatrixSource());
  }

  public boolean isSet(quickfix.field.LegContractualMatrixSource field) {
    return isSetField(field);
  }

  public boolean isSetLegContractualMatrixSource() {
    return isSetField(42204);
  }

  public void set(quickfix.field.LegContractualMatrixDate value) {
    setField(value);
  }

  public quickfix.field.LegContractualMatrixDate get(quickfix.field.LegContractualMatrixDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegContractualMatrixDate getLegContractualMatrixDate() throws FieldNotFound {
    return get(new quickfix.field.LegContractualMatrixDate());
  }

  public boolean isSet(quickfix.field.LegContractualMatrixDate field) {
    return isSetField(field);
  }

  public boolean isSetLegContractualMatrixDate() {
    return isSetField(42205);
  }

  public void set(quickfix.field.LegContractualMatrixTerm value) {
    setField(value);
  }

  public quickfix.field.LegContractualMatrixTerm get(quickfix.field.LegContractualMatrixTerm value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegContractualMatrixTerm getLegContractualMatrixTerm() throws FieldNotFound {
    return get(new quickfix.field.LegContractualMatrixTerm());
  }

  public boolean isSet(quickfix.field.LegContractualMatrixTerm field) {
    return isSetField(field);
  }

  public boolean isSetLegContractualMatrixTerm() {
    return isSetField(42206);
  }
}

  public void set(quickfix.field.LegContractualMatrixSource value) {
    setField(value);
  }

  public quickfix.field.LegContractualMatrixSource get(quickfix.field.LegContractualMatrixSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegContractualMatrixSource getLegContractualMatrixSource() throws FieldNotFound {
    return get(new quickfix.field.LegContractualMatrixSource());
  }

  public boolean isSet(quickfix.field.LegContractualMatrixSource field) {
    return isSetField(field);
  }

  public boolean isSetLegContractualMatrixSource() {
    return isSetField(42204);
  }

  public void set(quickfix.field.LegContractualMatrixDate value) {
    setField(value);
  }

  public quickfix.field.LegContractualMatrixDate get(quickfix.field.LegContractualMatrixDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegContractualMatrixDate getLegContractualMatrixDate() throws FieldNotFound {
    return get(new quickfix.field.LegContractualMatrixDate());
  }

  public boolean isSet(quickfix.field.LegContractualMatrixDate field) {
    return isSetField(field);
  }

  public boolean isSetLegContractualMatrixDate() {
    return isSetField(42205);
  }

  public void set(quickfix.field.LegContractualMatrixTerm value) {
    setField(value);
  }

  public quickfix.field.LegContractualMatrixTerm get(quickfix.field.LegContractualMatrixTerm value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegContractualMatrixTerm getLegContractualMatrixTerm() throws FieldNotFound {
    return get(new quickfix.field.LegContractualMatrixTerm());
  }

  public boolean isSet(quickfix.field.LegContractualMatrixTerm field) {
    return isSetField(field);
  }

  public boolean isSetLegContractualMatrixTerm() {
    return isSetField(42206);
  }
}
