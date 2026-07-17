/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class DerivativeSecurityXML extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {1282, 1283, 1284, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public DerivativeSecurityXML() {
    super();
  }

  public void set(quickfix.field.DerivativeSecurityXMLLen value) {
    setField(value);
  }

  public quickfix.field.DerivativeSecurityXMLLen get(quickfix.field.DerivativeSecurityXMLLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeSecurityXMLLen getDerivativeSecurityXMLLen() throws FieldNotFound {
    return get(new quickfix.field.DerivativeSecurityXMLLen());
  }

  public boolean isSet(quickfix.field.DerivativeSecurityXMLLen field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeSecurityXMLLen() {
    return isSetField(1282);
  }

  public void set(quickfix.field.DerivativeSecurityXML value) {
    setField(value);
  }

  public quickfix.field.DerivativeSecurityXML get(quickfix.field.DerivativeSecurityXML value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeSecurityXML getDerivativeSecurityXML() throws FieldNotFound {
    return get(new quickfix.field.DerivativeSecurityXML());
  }

  public boolean isSet(quickfix.field.DerivativeSecurityXML field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeSecurityXML() {
    return isSetField(1283);
  }

  public void set(quickfix.field.DerivativeSecurityXMLSchema value) {
    setField(value);
  }

  public quickfix.field.DerivativeSecurityXMLSchema get(quickfix.field.DerivativeSecurityXMLSchema value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DerivativeSecurityXMLSchema getDerivativeSecurityXMLSchema() throws FieldNotFound {
    return get(new quickfix.field.DerivativeSecurityXMLSchema());
  }

  public boolean isSet(quickfix.field.DerivativeSecurityXMLSchema field) {
    return isSetField(field);
  }

  public boolean isSetDerivativeSecurityXMLSchema() {
    return isSetField(1284);
  }
}
