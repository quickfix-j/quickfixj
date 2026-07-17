/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class TradeCapLegUnderlyingsGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1342, };
  protected int[] getGroupFields() { return componentGroups; }

  public TradeCapLegUnderlyingsGrp() {
    super();
  }

  public void set(quickfix.field.NoOfLegUnderlyings value) {
    setField(value);
  }

  public quickfix.field.NoOfLegUnderlyings get(quickfix.field.NoOfLegUnderlyings value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoOfLegUnderlyings getNoOfLegUnderlyings() throws FieldNotFound {
    return get(new quickfix.field.NoOfLegUnderlyings());
  }

  public boolean isSet(quickfix.field.NoOfLegUnderlyings field) {
    return isSetField(field);
  }

  public boolean isSetNoOfLegUnderlyings() {
    return isSetField(1342);
  }

public static class NoOfLegUnderlyings extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1330, 1331, 1332, 1333, 1334, 1344, 1337, 1338, 1339, 1345, 1405, 1340, 1391, 1343, 1341, 1392, 0};

  public NoOfLegUnderlyings() {
    super(1342, 1330, ORDER);
  }

  public void set(quickfix.fixlatest.component.UnderlyingLegInstrument component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingLegInstrument get(quickfix.fixlatest.component.UnderlyingLegInstrument component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingLegInstrument getUnderlyingLegInstrumentComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingLegInstrument());
  }
}

  public void set(quickfix.fixlatest.component.UnderlyingLegInstrument component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.UnderlyingLegInstrument get(quickfix.fixlatest.component.UnderlyingLegInstrument component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.UnderlyingLegInstrument getUnderlyingLegInstrumentComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.UnderlyingLegInstrument());
  }
}
