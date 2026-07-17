/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegSecurityXML extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {1871, 1872, 1873, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegSecurityXML() {
    super();
  }

  public void set(quickfix.field.LegSecurityXMLLen value) {
    setField(value);
  }

  public quickfix.field.LegSecurityXMLLen get(quickfix.field.LegSecurityXMLLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecurityXMLLen getLegSecurityXMLLen() throws FieldNotFound {
    return get(new quickfix.field.LegSecurityXMLLen());
  }

  public boolean isSet(quickfix.field.LegSecurityXMLLen field) {
    return isSetField(field);
  }

  public boolean isSetLegSecurityXMLLen() {
    return isSetField(1871);
  }

  public void set(quickfix.field.LegSecurityXML value) {
    setField(value);
  }

  public quickfix.field.LegSecurityXML get(quickfix.field.LegSecurityXML value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecurityXML getLegSecurityXML() throws FieldNotFound {
    return get(new quickfix.field.LegSecurityXML());
  }

  public boolean isSet(quickfix.field.LegSecurityXML field) {
    return isSetField(field);
  }

  public boolean isSetLegSecurityXML() {
    return isSetField(1872);
  }

  public void set(quickfix.field.LegSecurityXMLSchema value) {
    setField(value);
  }

  public quickfix.field.LegSecurityXMLSchema get(quickfix.field.LegSecurityXMLSchema value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSecurityXMLSchema getLegSecurityXMLSchema() throws FieldNotFound {
    return get(new quickfix.field.LegSecurityXMLSchema());
  }

  public boolean isSet(quickfix.field.LegSecurityXMLSchema field) {
    return isSetField(field);
  }

  public boolean isSetLegSecurityXMLSchema() {
    return isSetField(1873);
  }
}
