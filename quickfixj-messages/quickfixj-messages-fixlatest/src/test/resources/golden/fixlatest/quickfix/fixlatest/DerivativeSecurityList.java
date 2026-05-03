/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class DerivativeSecurityList extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "AA";

  public DerivativeSecurityList() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public void set(quickfix.field.SecurityRequestResult value) {
    setField(value);
  }

  public quickfix.field.SecurityRequestResult get(quickfix.field.SecurityRequestResult value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SecurityRequestResult getSecurityRequestResult() throws FieldNotFound {
    return get(new quickfix.field.SecurityRequestResult());
  }

  public boolean isSet(quickfix.field.SecurityRequestResult field) {
    return isSetField(field);
  }

  public boolean isSetSecurityRequestResult() {
    return isSetField(560);
  }
}
