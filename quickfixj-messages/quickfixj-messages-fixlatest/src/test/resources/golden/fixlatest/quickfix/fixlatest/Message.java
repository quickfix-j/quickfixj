/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.field.*;

public class Message extends quickfix.Message {
  static final long serialVersionUID = 552892318L;

  public Message() {
    this(null);
  }
  protected Message(int[] fieldOrder) {
    super(fieldOrder);
    header = new Header(this);
    trailer = new Trailer();
    getHeader().setField(new BeginString("FIXT.1.1"));
  }

  @Override
  protected Header newHeader() {
    return new Header(this);
  }

  @Override
  public Header getHeader() {
    return (Message.Header)header;
  }

public static class Header extends quickfix.Message.Header {
  static final long serialVersionUID = 552892318L;

  public Header(Message msg) {

  }
}
}
