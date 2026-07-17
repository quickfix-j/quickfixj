/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class RgstDistInstGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {510, };
  protected int[] getGroupFields() { return componentGroups; }

  public RgstDistInstGrp() {
    super();
  }

  public void set(quickfix.field.NoDistribInsts value) {
    setField(value);
  }

  public quickfix.field.NoDistribInsts get(quickfix.field.NoDistribInsts value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoDistribInsts getNoDistribInsts() throws FieldNotFound {
    return get(new quickfix.field.NoDistribInsts());
  }

  public boolean isSet(quickfix.field.NoDistribInsts field) {
    return isSetField(field);
  }

  public boolean isSetNoDistribInsts() {
    return isSetField(510);
  }

public static class NoDistribInsts extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {477, 512, 478, 498, 499, 500, 501, 502, 0};

  public NoDistribInsts() {
    super(510, 477, ORDER);
  }

  public void set(quickfix.field.DistribPaymentMethod value) {
    setField(value);
  }

  public quickfix.field.DistribPaymentMethod get(quickfix.field.DistribPaymentMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DistribPaymentMethod getDistribPaymentMethod() throws FieldNotFound {
    return get(new quickfix.field.DistribPaymentMethod());
  }

  public boolean isSet(quickfix.field.DistribPaymentMethod field) {
    return isSetField(field);
  }

  public boolean isSetDistribPaymentMethod() {
    return isSetField(477);
  }

  public void set(quickfix.field.DistribPercentage value) {
    setField(value);
  }

  public quickfix.field.DistribPercentage get(quickfix.field.DistribPercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DistribPercentage getDistribPercentage() throws FieldNotFound {
    return get(new quickfix.field.DistribPercentage());
  }

  public boolean isSet(quickfix.field.DistribPercentage field) {
    return isSetField(field);
  }

  public boolean isSetDistribPercentage() {
    return isSetField(512);
  }

  public void set(quickfix.field.CashDistribCurr value) {
    setField(value);
  }

  public quickfix.field.CashDistribCurr get(quickfix.field.CashDistribCurr value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashDistribCurr getCashDistribCurr() throws FieldNotFound {
    return get(new quickfix.field.CashDistribCurr());
  }

  public boolean isSet(quickfix.field.CashDistribCurr field) {
    return isSetField(field);
  }

  public boolean isSetCashDistribCurr() {
    return isSetField(478);
  }

  public void set(quickfix.field.CashDistribAgentName value) {
    setField(value);
  }

  public quickfix.field.CashDistribAgentName get(quickfix.field.CashDistribAgentName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashDistribAgentName getCashDistribAgentName() throws FieldNotFound {
    return get(new quickfix.field.CashDistribAgentName());
  }

  public boolean isSet(quickfix.field.CashDistribAgentName field) {
    return isSetField(field);
  }

  public boolean isSetCashDistribAgentName() {
    return isSetField(498);
  }

  public void set(quickfix.field.CashDistribAgentCode value) {
    setField(value);
  }

  public quickfix.field.CashDistribAgentCode get(quickfix.field.CashDistribAgentCode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashDistribAgentCode getCashDistribAgentCode() throws FieldNotFound {
    return get(new quickfix.field.CashDistribAgentCode());
  }

  public boolean isSet(quickfix.field.CashDistribAgentCode field) {
    return isSetField(field);
  }

  public boolean isSetCashDistribAgentCode() {
    return isSetField(499);
  }

  public void set(quickfix.field.CashDistribAgentAcctNumber value) {
    setField(value);
  }

  public quickfix.field.CashDistribAgentAcctNumber get(quickfix.field.CashDistribAgentAcctNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashDistribAgentAcctNumber getCashDistribAgentAcctNumber() throws FieldNotFound {
    return get(new quickfix.field.CashDistribAgentAcctNumber());
  }

  public boolean isSet(quickfix.field.CashDistribAgentAcctNumber field) {
    return isSetField(field);
  }

  public boolean isSetCashDistribAgentAcctNumber() {
    return isSetField(500);
  }

  public void set(quickfix.field.CashDistribPayRef value) {
    setField(value);
  }

  public quickfix.field.CashDistribPayRef get(quickfix.field.CashDistribPayRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashDistribPayRef getCashDistribPayRef() throws FieldNotFound {
    return get(new quickfix.field.CashDistribPayRef());
  }

  public boolean isSet(quickfix.field.CashDistribPayRef field) {
    return isSetField(field);
  }

  public boolean isSetCashDistribPayRef() {
    return isSetField(501);
  }

  public void set(quickfix.field.CashDistribAgentAcctName value) {
    setField(value);
  }

  public quickfix.field.CashDistribAgentAcctName get(quickfix.field.CashDistribAgentAcctName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashDistribAgentAcctName getCashDistribAgentAcctName() throws FieldNotFound {
    return get(new quickfix.field.CashDistribAgentAcctName());
  }

  public boolean isSet(quickfix.field.CashDistribAgentAcctName field) {
    return isSetField(field);
  }

  public boolean isSetCashDistribAgentAcctName() {
    return isSetField(502);
  }
}

  public void set(quickfix.field.DistribPaymentMethod value) {
    setField(value);
  }

  public quickfix.field.DistribPaymentMethod get(quickfix.field.DistribPaymentMethod value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DistribPaymentMethod getDistribPaymentMethod() throws FieldNotFound {
    return get(new quickfix.field.DistribPaymentMethod());
  }

  public boolean isSet(quickfix.field.DistribPaymentMethod field) {
    return isSetField(field);
  }

  public boolean isSetDistribPaymentMethod() {
    return isSetField(477);
  }

  public void set(quickfix.field.DistribPercentage value) {
    setField(value);
  }

  public quickfix.field.DistribPercentage get(quickfix.field.DistribPercentage value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DistribPercentage getDistribPercentage() throws FieldNotFound {
    return get(new quickfix.field.DistribPercentage());
  }

  public boolean isSet(quickfix.field.DistribPercentage field) {
    return isSetField(field);
  }

  public boolean isSetDistribPercentage() {
    return isSetField(512);
  }

  public void set(quickfix.field.CashDistribCurr value) {
    setField(value);
  }

  public quickfix.field.CashDistribCurr get(quickfix.field.CashDistribCurr value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashDistribCurr getCashDistribCurr() throws FieldNotFound {
    return get(new quickfix.field.CashDistribCurr());
  }

  public boolean isSet(quickfix.field.CashDistribCurr field) {
    return isSetField(field);
  }

  public boolean isSetCashDistribCurr() {
    return isSetField(478);
  }

  public void set(quickfix.field.CashDistribAgentName value) {
    setField(value);
  }

  public quickfix.field.CashDistribAgentName get(quickfix.field.CashDistribAgentName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashDistribAgentName getCashDistribAgentName() throws FieldNotFound {
    return get(new quickfix.field.CashDistribAgentName());
  }

  public boolean isSet(quickfix.field.CashDistribAgentName field) {
    return isSetField(field);
  }

  public boolean isSetCashDistribAgentName() {
    return isSetField(498);
  }

  public void set(quickfix.field.CashDistribAgentCode value) {
    setField(value);
  }

  public quickfix.field.CashDistribAgentCode get(quickfix.field.CashDistribAgentCode value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashDistribAgentCode getCashDistribAgentCode() throws FieldNotFound {
    return get(new quickfix.field.CashDistribAgentCode());
  }

  public boolean isSet(quickfix.field.CashDistribAgentCode field) {
    return isSetField(field);
  }

  public boolean isSetCashDistribAgentCode() {
    return isSetField(499);
  }

  public void set(quickfix.field.CashDistribAgentAcctNumber value) {
    setField(value);
  }

  public quickfix.field.CashDistribAgentAcctNumber get(quickfix.field.CashDistribAgentAcctNumber value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashDistribAgentAcctNumber getCashDistribAgentAcctNumber() throws FieldNotFound {
    return get(new quickfix.field.CashDistribAgentAcctNumber());
  }

  public boolean isSet(quickfix.field.CashDistribAgentAcctNumber field) {
    return isSetField(field);
  }

  public boolean isSetCashDistribAgentAcctNumber() {
    return isSetField(500);
  }

  public void set(quickfix.field.CashDistribPayRef value) {
    setField(value);
  }

  public quickfix.field.CashDistribPayRef get(quickfix.field.CashDistribPayRef value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashDistribPayRef getCashDistribPayRef() throws FieldNotFound {
    return get(new quickfix.field.CashDistribPayRef());
  }

  public boolean isSet(quickfix.field.CashDistribPayRef field) {
    return isSetField(field);
  }

  public boolean isSetCashDistribPayRef() {
    return isSetField(501);
  }

  public void set(quickfix.field.CashDistribAgentAcctName value) {
    setField(value);
  }

  public quickfix.field.CashDistribAgentAcctName get(quickfix.field.CashDistribAgentAcctName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CashDistribAgentAcctName getCashDistribAgentAcctName() throws FieldNotFound {
    return get(new quickfix.field.CashDistribAgentAcctName());
  }

  public boolean isSet(quickfix.field.CashDistribAgentAcctName field) {
    return isSetField(field);
  }

  public boolean isSetCashDistribAgentAcctName() {
    return isSetField(502);
  }
}
