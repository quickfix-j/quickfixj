/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class AveragePriceDetail extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {2763, 2764, 2765, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public AveragePriceDetail() {
    super();
  }

  public void set(quickfix.field.AveragePriceType value) {
    setField(value);
  }

  public quickfix.field.AveragePriceType get(quickfix.field.AveragePriceType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AveragePriceType getAveragePriceType() throws FieldNotFound {
    return get(new quickfix.field.AveragePriceType());
  }

  public boolean isSet(quickfix.field.AveragePriceType field) {
    return isSetField(field);
  }

  public boolean isSetAveragePriceType() {
    return isSetField(2763);
  }

  public void set(quickfix.field.AveragePriceStartTime value) {
    setField(value);
  }

  public quickfix.field.AveragePriceStartTime get(quickfix.field.AveragePriceStartTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AveragePriceStartTime getAveragePriceStartTime() throws FieldNotFound {
    return get(new quickfix.field.AveragePriceStartTime());
  }

  public boolean isSet(quickfix.field.AveragePriceStartTime field) {
    return isSetField(field);
  }

  public boolean isSetAveragePriceStartTime() {
    return isSetField(2764);
  }

  public void set(quickfix.field.AveragePriceEndTime value) {
    setField(value);
  }

  public quickfix.field.AveragePriceEndTime get(quickfix.field.AveragePriceEndTime value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AveragePriceEndTime getAveragePriceEndTime() throws FieldNotFound {
    return get(new quickfix.field.AveragePriceEndTime());
  }

  public boolean isSet(quickfix.field.AveragePriceEndTime field) {
    return isSetField(field);
  }

  public boolean isSetAveragePriceEndTime() {
    return isSetField(2765);
  }
}
