/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class SideCollateralReinvestmentGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2864, };
  protected int[] getGroupFields() { return componentGroups; }

  public SideCollateralReinvestmentGrp() {
    super();
  }

  public void set(quickfix.field.NoSideCollateralReinvestments value) {
    setField(value);
  }

  public quickfix.field.NoSideCollateralReinvestments get(quickfix.field.NoSideCollateralReinvestments value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoSideCollateralReinvestments getNoSideCollateralReinvestments() throws FieldNotFound {
    return get(new quickfix.field.NoSideCollateralReinvestments());
  }

  public boolean isSet(quickfix.field.NoSideCollateralReinvestments field) {
    return isSetField(field);
  }

  public boolean isSetNoSideCollateralReinvestments() {
    return isSetField(2864);
  }

public static class NoSideCollateralReinvestments extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2867, 2865, 2866, 0};

  public NoSideCollateralReinvestments() {
    super(2864, 2867, ORDER);
  }

  public void set(quickfix.field.SideCollateralReinvestmentType value) {
    setField(value);
  }

  public quickfix.field.SideCollateralReinvestmentType get(quickfix.field.SideCollateralReinvestmentType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralReinvestmentType getSideCollateralReinvestmentType() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralReinvestmentType());
  }

  public boolean isSet(quickfix.field.SideCollateralReinvestmentType field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralReinvestmentType() {
    return isSetField(2867);
  }

  public void set(quickfix.field.SideCollateralReinvestmentAmount value) {
    setField(value);
  }

  public quickfix.field.SideCollateralReinvestmentAmount get(quickfix.field.SideCollateralReinvestmentAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralReinvestmentAmount getSideCollateralReinvestmentAmount() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralReinvestmentAmount());
  }

  public boolean isSet(quickfix.field.SideCollateralReinvestmentAmount field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralReinvestmentAmount() {
    return isSetField(2865);
  }

  public void set(quickfix.field.SideCollateralReinvestmentCurrency value) {
    setField(value);
  }

  public quickfix.field.SideCollateralReinvestmentCurrency get(quickfix.field.SideCollateralReinvestmentCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralReinvestmentCurrency getSideCollateralReinvestmentCurrency() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralReinvestmentCurrency());
  }

  public boolean isSet(quickfix.field.SideCollateralReinvestmentCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralReinvestmentCurrency() {
    return isSetField(2866);
  }
}

  public void set(quickfix.field.SideCollateralReinvestmentType value) {
    setField(value);
  }

  public quickfix.field.SideCollateralReinvestmentType get(quickfix.field.SideCollateralReinvestmentType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralReinvestmentType getSideCollateralReinvestmentType() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralReinvestmentType());
  }

  public boolean isSet(quickfix.field.SideCollateralReinvestmentType field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralReinvestmentType() {
    return isSetField(2867);
  }

  public void set(quickfix.field.SideCollateralReinvestmentAmount value) {
    setField(value);
  }

  public quickfix.field.SideCollateralReinvestmentAmount get(quickfix.field.SideCollateralReinvestmentAmount value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralReinvestmentAmount getSideCollateralReinvestmentAmount() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralReinvestmentAmount());
  }

  public boolean isSet(quickfix.field.SideCollateralReinvestmentAmount field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralReinvestmentAmount() {
    return isSetField(2865);
  }

  public void set(quickfix.field.SideCollateralReinvestmentCurrency value) {
    setField(value);
  }

  public quickfix.field.SideCollateralReinvestmentCurrency get(quickfix.field.SideCollateralReinvestmentCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.SideCollateralReinvestmentCurrency getSideCollateralReinvestmentCurrency() throws FieldNotFound {
    return get(new quickfix.field.SideCollateralReinvestmentCurrency());
  }

  public boolean isSet(quickfix.field.SideCollateralReinvestmentCurrency field) {
    return isSetField(field);
  }

  public boolean isSetSideCollateralReinvestmentCurrency() {
    return isSetField(2866);
  }
}
