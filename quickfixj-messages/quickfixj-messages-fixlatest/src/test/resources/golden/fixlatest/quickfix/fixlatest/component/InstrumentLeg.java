/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class InstrumentLeg extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {600, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public InstrumentLeg() {
    super();
  }

  public void set(quickfix.field.LegSymbol value) {
    setField(value);
  }

  public quickfix.field.LegSymbol get(quickfix.field.LegSymbol value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegSymbol getLegSymbol() throws FieldNotFound {
    return get(new quickfix.field.LegSymbol());
  }

  public boolean isSet(quickfix.field.LegSymbol field) {
    return isSetField(field);
  }

  public boolean isSetLegSymbol() {
    return isSetField(600);
  }
}
