/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class SecTypesGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {558, };
  protected int[] getGroupFields() { return componentGroups; }

  public SecTypesGrp() {
    super();
  }

  public void set(quickfix.field.NoSecurityTypes value) {
    setField(value);
  }

  public quickfix.field.NoSecurityTypes get(quickfix.field.NoSecurityTypes value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSecurityTypes getNoSecurityTypes() throws FieldNotFound {
    return get(new quickfix.field.NoSecurityTypes());
  }

  public boolean isSet(quickfix.field.NoSecurityTypes field) {
    return isSetField(field);
  }

  public boolean isSetNoSecurityTypes() {
    return isSetField(558);
  }

public static class NoSecurityTypes extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {167, 762, 460, 461, 2891, 60, 0};

  public NoSecurityTypes() {
    super(558, 167, ORDER);
  }

  public void set(quickfix.field.SecurityType value) {
    setField(value);
  }

  public quickfix.field.SecurityType get(quickfix.field.SecurityType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityType getSecurityType() throws FieldNotFound {
    return get(new quickfix.field.SecurityType());
  }

  public boolean isSet(quickfix.field.SecurityType field) {
    return isSetField(field);
  }

  public boolean isSetSecurityType() {
    return isSetField(167);
  }

  public void set(quickfix.field.SecuritySubType value) {
    setField(value);
  }

  public quickfix.field.SecuritySubType get(quickfix.field.SecuritySubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecuritySubType getSecuritySubType() throws FieldNotFound {
    return get(new quickfix.field.SecuritySubType());
  }

  public boolean isSet(quickfix.field.SecuritySubType field) {
    return isSetField(field);
  }

  public boolean isSetSecuritySubType() {
    return isSetField(762);
  }

  public void set(quickfix.field.Product value) {
    setField(value);
  }

  public quickfix.field.Product get(quickfix.field.Product value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Product getProduct() throws FieldNotFound {
    return get(new quickfix.field.Product());
  }

  public boolean isSet(quickfix.field.Product field) {
    return isSetField(field);
  }

  public boolean isSetProduct() {
    return isSetField(460);
  }

  public void set(quickfix.field.CFICode value) {
    setField(value);
  }

  public quickfix.field.CFICode get(quickfix.field.CFICode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CFICode getCFICode() throws FieldNotFound {
    return get(new quickfix.field.CFICode());
  }

  public boolean isSet(quickfix.field.CFICode field) {
    return isSetField(field);
  }

  public boolean isSetCFICode() {
    return isSetField(461);
  }

  public void set(quickfix.field.UPICode value) {
    setField(value);
  }

  public quickfix.field.UPICode get(quickfix.field.UPICode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UPICode getUPICode() throws FieldNotFound {
    return get(new quickfix.field.UPICode());
  }

  public boolean isSet(quickfix.field.UPICode field) {
    return isSetField(field);
  }

  public boolean isSetUPICode() {
    return isSetField(2891);
  }

  public void set(quickfix.field.TransactTime value) {
    setField(value);
  }

  public quickfix.field.TransactTime get(quickfix.field.TransactTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransactTime getTransactTime() throws FieldNotFound {
    return get(new quickfix.field.TransactTime());
  }

  public boolean isSet(quickfix.field.TransactTime field) {
    return isSetField(field);
  }

  public boolean isSetTransactTime() {
    return isSetField(60);
  }
}

  public void set(quickfix.field.SecurityType value) {
    setField(value);
  }

  public quickfix.field.SecurityType get(quickfix.field.SecurityType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityType getSecurityType() throws FieldNotFound {
    return get(new quickfix.field.SecurityType());
  }

  public boolean isSet(quickfix.field.SecurityType field) {
    return isSetField(field);
  }

  public boolean isSetSecurityType() {
    return isSetField(167);
  }

  public void set(quickfix.field.SecuritySubType value) {
    setField(value);
  }

  public quickfix.field.SecuritySubType get(quickfix.field.SecuritySubType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecuritySubType getSecuritySubType() throws FieldNotFound {
    return get(new quickfix.field.SecuritySubType());
  }

  public boolean isSet(quickfix.field.SecuritySubType field) {
    return isSetField(field);
  }

  public boolean isSetSecuritySubType() {
    return isSetField(762);
  }

  public void set(quickfix.field.Product value) {
    setField(value);
  }

  public quickfix.field.Product get(quickfix.field.Product value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Product getProduct() throws FieldNotFound {
    return get(new quickfix.field.Product());
  }

  public boolean isSet(quickfix.field.Product field) {
    return isSetField(field);
  }

  public boolean isSetProduct() {
    return isSetField(460);
  }

  public void set(quickfix.field.CFICode value) {
    setField(value);
  }

  public quickfix.field.CFICode get(quickfix.field.CFICode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CFICode getCFICode() throws FieldNotFound {
    return get(new quickfix.field.CFICode());
  }

  public boolean isSet(quickfix.field.CFICode field) {
    return isSetField(field);
  }

  public boolean isSetCFICode() {
    return isSetField(461);
  }

  public void set(quickfix.field.UPICode value) {
    setField(value);
  }

  public quickfix.field.UPICode get(quickfix.field.UPICode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UPICode getUPICode() throws FieldNotFound {
    return get(new quickfix.field.UPICode());
  }

  public boolean isSet(quickfix.field.UPICode field) {
    return isSetField(field);
  }

  public boolean isSetUPICode() {
    return isSetField(2891);
  }

  public void set(quickfix.field.TransactTime value) {
    setField(value);
  }

  public quickfix.field.TransactTime get(quickfix.field.TransactTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TransactTime getTransactTime() throws FieldNotFound {
    return get(new quickfix.field.TransactTime());
  }

  public boolean isSet(quickfix.field.TransactTime field) {
    return isSetField(field);
  }

  public boolean isSetTransactTime() {
    return isSetField(60);
  }
}
