/* Generated Java Source File */
package quickfix.fixlatest;
import quickfix.FieldNotFound;
import quickfix.field.*;
import quickfix.Group;

public class NewOrderCross extends Message {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "s";

  public NewOrderCross() {
    super();
    getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
  }

  public NewOrderCross (quickfix.field.CrossID crossID, quickfix.field.CrossType crossType, quickfix.field.CrossPrioritization crossPrioritization) {
    this();
    setField(crossID);
    setField(crossType);
    setField(crossPrioritization);
  }

  public void set(quickfix.field.CrossID value) {
    setField(value);
  }

  public quickfix.field.CrossID get(quickfix.field.CrossID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CrossID getCrossID() throws FieldNotFound {
    return get(new quickfix.field.CrossID());
  }

  public boolean isSet(quickfix.field.CrossID field) {
    return isSetField(field);
  }

  public boolean isSetCrossID() {
    return isSetField(548);
  }

  public void set(quickfix.field.CrossType value) {
    setField(value);
  }

  public quickfix.field.CrossType get(quickfix.field.CrossType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CrossType getCrossType() throws FieldNotFound {
    return get(new quickfix.field.CrossType());
  }

  public boolean isSet(quickfix.field.CrossType field) {
    return isSetField(field);
  }

  public boolean isSetCrossType() {
    return isSetField(549);
  }

  public void set(quickfix.field.CrossPrioritization value) {
    setField(value);
  }

  public quickfix.field.CrossPrioritization get(quickfix.field.CrossPrioritization value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CrossPrioritization getCrossPrioritization() throws FieldNotFound {
    return get(new quickfix.field.CrossPrioritization());
  }

  public boolean isSet(quickfix.field.CrossPrioritization field) {
    return isSetField(field);
  }

  public boolean isSetCrossPrioritization() {
    return isSetField(550);
  }

  public void set(quickfix.fixlatest.component.SideCrossOrdModGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.SideCrossOrdModGrp get(quickfix.fixlatest.component.SideCrossOrdModGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.SideCrossOrdModGrp getSideCrossOrdModGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.SideCrossOrdModGrp());
  }

  public void set(quickfix.field.NoSides value) {
    setField(value);
  }

  public quickfix.field.NoSides get(quickfix.field.NoSides value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSides getNoSides() throws FieldNotFound {
    return get(new quickfix.field.NoSides());
  }

  public boolean isSet(quickfix.field.NoSides field) {
    return isSetField(field);
  }

  public boolean isSetNoSides() {
    return isSetField(552);
  }

public static class NoSides extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {54, 11, 453, 0};

  public NoSides() {
    super(552, 54, ORDER);
  }

  public void set(quickfix.field.Side value) {
    setField(value);
  }

  public quickfix.field.Side get(quickfix.field.Side value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Side getSide() throws FieldNotFound {
    return get(new quickfix.field.Side());
  }

  public boolean isSet(quickfix.field.Side field) {
    return isSetField(field);
  }

  public boolean isSetSide() {
    return isSetField(54);
  }

  public void set(quickfix.field.ClOrdID value) {
    setField(value);
  }

  public quickfix.field.ClOrdID get(quickfix.field.ClOrdID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ClOrdID getClOrdID() throws FieldNotFound {
    return get(new quickfix.field.ClOrdID());
  }

  public boolean isSet(quickfix.field.ClOrdID field) {
    return isSetField(field);
  }

  public boolean isSetClOrdID() {
    return isSetField(11);
  }

  public void set(quickfix.fixlatest.component.Parties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.Parties get(quickfix.fixlatest.component.Parties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.Parties getPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.Parties());
  }

  public void set(quickfix.field.NoPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoPartyIDs get(quickfix.field.NoPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoPartyIDs getNoPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoPartyIDs());
  }

  public boolean isSet(quickfix.field.NoPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoPartyIDs() {
    return isSetField(453);
  }

public static class NoPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {448, 447, 452, 0};

  public NoPartyIDs() {
    super(453, 448, ORDER);
  }

  public void set(quickfix.field.PartyID value) {
    setField(value);
  }

  public quickfix.field.PartyID get(quickfix.field.PartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyID getPartyID() throws FieldNotFound {
    return get(new quickfix.field.PartyID());
  }

  public boolean isSet(quickfix.field.PartyID field) {
    return isSetField(field);
  }

  public boolean isSetPartyID() {
    return isSetField(448);
  }

  public void set(quickfix.field.PartyIDSource value) {
    setField(value);
  }

  public quickfix.field.PartyIDSource get(quickfix.field.PartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyIDSource getPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.PartyIDSource());
  }

  public boolean isSet(quickfix.field.PartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetPartyIDSource() {
    return isSetField(447);
  }

  public void set(quickfix.field.PartyRole value) {
    setField(value);
  }

  public quickfix.field.PartyRole get(quickfix.field.PartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.PartyRole getPartyRole() throws FieldNotFound {
    return get(new quickfix.field.PartyRole());
  }

  public boolean isSet(quickfix.field.PartyRole field) {
    return isSetField(field);
  }

  public boolean isSetPartyRole() {
    return isSetField(452);
  }
}
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
}
