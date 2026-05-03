/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class MarketDataSnapshotFullRefresh extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "W";

  public MarketDataSnapshotFullRefresh() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
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

  public void set(quickfix.fixlatest.component.MDFullGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.MDFullGrp get(quickfix.fixlatest.component.MDFullGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.MDFullGrp getMDFullGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.MDFullGrp());
  }

  public void set(quickfix.field.NoMDEntries value) {
    setField(value);
  }

  public quickfix.field.NoMDEntries get(quickfix.field.NoMDEntries value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMDEntries getNoMDEntries() throws FieldNotFound {
    return get(new quickfix.field.NoMDEntries());
  }

  public boolean isSet(quickfix.field.NoMDEntries field) {
    return isSetField(field);
  }

  public boolean isSetNoMDEntries() {
    return isSetField(268);
  }

public static class NoMDEntries extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {269, 278, 270, 0};

  public NoMDEntries() {
    super(268, 269, ORDER);
  }

  public void set(quickfix.field.MDEntryType value) {
    setField(value);
  }

  public quickfix.field.MDEntryType get(quickfix.field.MDEntryType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryType getMDEntryType() throws FieldNotFound {
    return get(new quickfix.field.MDEntryType());
  }

  public boolean isSet(quickfix.field.MDEntryType field) {
    return isSetField(field);
  }

  public boolean isSetMDEntryType() {
    return isSetField(269);
  }

  public void set(quickfix.field.MDEntryID value) {
    setField(value);
  }

  public quickfix.field.MDEntryID get(quickfix.field.MDEntryID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryID getMDEntryID() throws FieldNotFound {
    return get(new quickfix.field.MDEntryID());
  }

  public boolean isSet(quickfix.field.MDEntryID field) {
    return isSetField(field);
  }

  public boolean isSetMDEntryID() {
    return isSetField(278);
  }

  public void set(quickfix.field.MDEntryPx value) {
    setField(value);
  }

  public quickfix.field.MDEntryPx get(quickfix.field.MDEntryPx value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MDEntryPx getMDEntryPx() throws FieldNotFound {
    return get(new quickfix.field.MDEntryPx());
  }

  public boolean isSet(quickfix.field.MDEntryPx field) {
    return isSetField(field);
  }

  public boolean isSetMDEntryPx() {
    return isSetField(270);
  }
}
}
