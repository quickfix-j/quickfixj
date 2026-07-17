/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UnderlyingSecurityXML extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {1874, 1875, 1876, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public UnderlyingSecurityXML() {
    super();
  }

  public void set(quickfix.field.UnderlyingSecurityXMLLen value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecurityXMLLen get(quickfix.field.UnderlyingSecurityXMLLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecurityXMLLen getUnderlyingSecurityXMLLen() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecurityXMLLen());
  }

  public boolean isSet(quickfix.field.UnderlyingSecurityXMLLen field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecurityXMLLen() {
    return isSetField(1874);
  }

  public void set(quickfix.field.UnderlyingSecurityXML value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecurityXML get(quickfix.field.UnderlyingSecurityXML value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecurityXML getUnderlyingSecurityXML() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecurityXML());
  }

  public boolean isSet(quickfix.field.UnderlyingSecurityXML field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecurityXML() {
    return isSetField(1875);
  }

  public void set(quickfix.field.UnderlyingSecurityXMLSchema value) {
    setField(value);
  }

  public quickfix.field.UnderlyingSecurityXMLSchema get(quickfix.field.UnderlyingSecurityXMLSchema value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.UnderlyingSecurityXMLSchema getUnderlyingSecurityXMLSchema() throws FieldNotFound {
    return get(new quickfix.field.UnderlyingSecurityXMLSchema());
  }

  public boolean isSet(quickfix.field.UnderlyingSecurityXMLSchema field) {
    return isSetField(field);
  }

  public boolean isSetUnderlyingSecurityXMLSchema() {
    return isSetField(1876);
  }
}
