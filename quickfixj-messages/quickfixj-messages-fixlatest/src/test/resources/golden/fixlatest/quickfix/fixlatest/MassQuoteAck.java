/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class MassQuoteAck extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "b";

  public MassQuoteAck() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }
}
