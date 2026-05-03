/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class SecurityDefinition extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "d";

  public SecurityDefinition() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public void set(quickfix.field.SecurityReqID value) {
    setField(value);
  }

  public quickfix.field.SecurityReqID get(quickfix.field.SecurityReqID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityReqID getSecurityReqID() throws FieldNotFound {
    return get(new quickfix.field.SecurityReqID());
  }

  public boolean isSet(quickfix.field.SecurityReqID field) {
    return isSetField(field);
  }

  public boolean isSetSecurityReqID() {
    return isSetField(320);
  }

  public void set(quickfix.field.SecurityResponseID value) {
    setField(value);
  }

  public quickfix.field.SecurityResponseID get(quickfix.field.SecurityResponseID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityResponseID getSecurityResponseID() throws FieldNotFound {
    return get(new quickfix.field.SecurityResponseID());
  }

  public boolean isSet(quickfix.field.SecurityResponseID field) {
    return isSetField(field);
  }

  public boolean isSetSecurityResponseID() {
    return isSetField(322);
  }

  public void set(quickfix.field.SecurityResponseType value) {
    setField(value);
  }

  public quickfix.field.SecurityResponseType get(quickfix.field.SecurityResponseType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityResponseType getSecurityResponseType() throws FieldNotFound {
    return get(new quickfix.field.SecurityResponseType());
  }

  public boolean isSet(quickfix.field.SecurityResponseType field) {
    return isSetField(field);
  }

  public boolean isSetSecurityResponseType() {
    return isSetField(323);
  }

  public void set(quickfix.fixlatest.component.Instrument component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.Instrument get(quickfix.fixlatest.component.Instrument component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.Instrument getInstrumentComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.Instrument());
  }

  public void set(quickfix.field.Text value) {
    setField(value);
  }

  public quickfix.field.Text get(quickfix.field.Text value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Text getText() throws FieldNotFound {
    return get(new quickfix.field.Text());
  }

  public boolean isSet(quickfix.field.Text field) {
    return isSetField(field);
  }

  public boolean isSetText() {
    return isSetField(58);
  }
}
