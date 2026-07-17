/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class StreamCalculationPeriodBusinessCenterGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {40958, };
  protected int[] getGroupFields() { return componentGroups; }

  public StreamCalculationPeriodBusinessCenterGrp() {
    super();
  }

  public void set(quickfix.field.NoStreamCalculationPeriodBusinessCenters value) {
    setField(value);
  }

  public quickfix.field.NoStreamCalculationPeriodBusinessCenters get(quickfix.field.NoStreamCalculationPeriodBusinessCenters value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoStreamCalculationPeriodBusinessCenters getNoStreamCalculationPeriodBusinessCenters() throws FieldNotFound {
    return get(new quickfix.field.NoStreamCalculationPeriodBusinessCenters());
  }

  public boolean isSet(quickfix.field.NoStreamCalculationPeriodBusinessCenters field) {
    return isSetField(field);
  }

  public boolean isSetNoStreamCalculationPeriodBusinessCenters() {
    return isSetField(40958);
  }

public static class NoStreamCalculationPeriodBusinessCenters extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40074, 0};

  public NoStreamCalculationPeriodBusinessCenters() {
    super(40958, 40074, ORDER);
  }

  public void set(quickfix.field.StreamCalculationPeriodBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.StreamCalculationPeriodBusinessCenter get(quickfix.field.StreamCalculationPeriodBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCalculationPeriodBusinessCenter getStreamCalculationPeriodBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.StreamCalculationPeriodBusinessCenter());
  }

  public boolean isSet(quickfix.field.StreamCalculationPeriodBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetStreamCalculationPeriodBusinessCenter() {
    return isSetField(40074);
  }
}

  public void set(quickfix.field.StreamCalculationPeriodBusinessCenter value) {
    setField(value);
  }

  public quickfix.field.StreamCalculationPeriodBusinessCenter get(quickfix.field.StreamCalculationPeriodBusinessCenter value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StreamCalculationPeriodBusinessCenter getStreamCalculationPeriodBusinessCenter() throws FieldNotFound {
    return get(new quickfix.field.StreamCalculationPeriodBusinessCenter());
  }

  public boolean isSet(quickfix.field.StreamCalculationPeriodBusinessCenter field) {
    return isSetField(field);
  }

  public boolean isSetStreamCalculationPeriodBusinessCenter() {
    return isSetField(40074);
  }
}
