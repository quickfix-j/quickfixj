/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class AuctionTypeRuleGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2548, };
  protected int[] getGroupFields() { return componentGroups; }

  public AuctionTypeRuleGrp() {
    super();
  }

  public void set(quickfix.field.NoAuctionTypeRules value) {
    setField(value);
  }

  public quickfix.field.NoAuctionTypeRules get(quickfix.field.NoAuctionTypeRules value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoAuctionTypeRules getNoAuctionTypeRules() throws FieldNotFound {
    return get(new quickfix.field.NoAuctionTypeRules());
  }

  public boolean isSet(quickfix.field.NoAuctionTypeRules field) {
    return isSetField(field);
  }

  public boolean isSetNoAuctionTypeRules() {
    return isSetField(2548);
  }

public static class NoAuctionTypeRules extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1803, 2549, 0};

  public NoAuctionTypeRules() {
    super(2548, 1803, ORDER);
  }

  public void set(quickfix.field.AuctionType value) {
    setField(value);
  }

  public quickfix.field.AuctionType get(quickfix.field.AuctionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AuctionType getAuctionType() throws FieldNotFound {
    return get(new quickfix.field.AuctionType());
  }

  public boolean isSet(quickfix.field.AuctionType field) {
    return isSetField(field);
  }

  public boolean isSetAuctionType() {
    return isSetField(1803);
  }

  public void set(quickfix.field.AuctionTypeProductComplex value) {
    setField(value);
  }

  public quickfix.field.AuctionTypeProductComplex get(quickfix.field.AuctionTypeProductComplex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AuctionTypeProductComplex getAuctionTypeProductComplex() throws FieldNotFound {
    return get(new quickfix.field.AuctionTypeProductComplex());
  }

  public boolean isSet(quickfix.field.AuctionTypeProductComplex field) {
    return isSetField(field);
  }

  public boolean isSetAuctionTypeProductComplex() {
    return isSetField(2549);
  }
}

  public void set(quickfix.field.AuctionType value) {
    setField(value);
  }

  public quickfix.field.AuctionType get(quickfix.field.AuctionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AuctionType getAuctionType() throws FieldNotFound {
    return get(new quickfix.field.AuctionType());
  }

  public boolean isSet(quickfix.field.AuctionType field) {
    return isSetField(field);
  }

  public boolean isSetAuctionType() {
    return isSetField(1803);
  }

  public void set(quickfix.field.AuctionTypeProductComplex value) {
    setField(value);
  }

  public quickfix.field.AuctionTypeProductComplex get(quickfix.field.AuctionTypeProductComplex value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AuctionTypeProductComplex getAuctionTypeProductComplex() throws FieldNotFound {
    return get(new quickfix.field.AuctionTypeProductComplex());
  }

  public boolean isSet(quickfix.field.AuctionTypeProductComplex field) {
    return isSetField(field);
  }

  public boolean isSetAuctionTypeProductComplex() {
    return isSetField(2549);
  }
}
