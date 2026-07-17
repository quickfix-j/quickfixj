/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class RgstDtlsGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {473, };
  protected int[] getGroupFields() { return componentGroups; }

  public RgstDtlsGrp() {
    super();
  }

  public void set(quickfix.field.NoRegistDtls value) {
    setField(value);
  }

  public quickfix.field.NoRegistDtls get(quickfix.field.NoRegistDtls value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRegistDtls getNoRegistDtls() throws FieldNotFound {
    return get(new quickfix.field.NoRegistDtls());
  }

  public boolean isSet(quickfix.field.NoRegistDtls field) {
    return isSetField(field);
  }

  public boolean isSetNoRegistDtls() {
    return isSetField(473);
  }

public static class NoRegistDtls extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {509, 511, 474, 482, 539, 522, 486, 475, 0};

  public NoRegistDtls() {
    super(473, 509, ORDER);
  }

  public void set(quickfix.field.RegistDtls value) {
    setField(value);
  }

  public quickfix.field.RegistDtls get(quickfix.field.RegistDtls value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegistDtls getRegistDtls() throws FieldNotFound {
    return get(new quickfix.field.RegistDtls());
  }

  public boolean isSet(quickfix.field.RegistDtls field) {
    return isSetField(field);
  }

  public boolean isSetRegistDtls() {
    return isSetField(509);
  }

  public void set(quickfix.field.RegistEmail value) {
    setField(value);
  }

  public quickfix.field.RegistEmail get(quickfix.field.RegistEmail value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegistEmail getRegistEmail() throws FieldNotFound {
    return get(new quickfix.field.RegistEmail());
  }

  public boolean isSet(quickfix.field.RegistEmail field) {
    return isSetField(field);
  }

  public boolean isSetRegistEmail() {
    return isSetField(511);
  }

  public void set(quickfix.field.MailingDtls value) {
    setField(value);
  }

  public quickfix.field.MailingDtls get(quickfix.field.MailingDtls value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MailingDtls getMailingDtls() throws FieldNotFound {
    return get(new quickfix.field.MailingDtls());
  }

  public boolean isSet(quickfix.field.MailingDtls field) {
    return isSetField(field);
  }

  public boolean isSetMailingDtls() {
    return isSetField(474);
  }

  public void set(quickfix.field.MailingInst value) {
    setField(value);
  }

  public quickfix.field.MailingInst get(quickfix.field.MailingInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MailingInst getMailingInst() throws FieldNotFound {
    return get(new quickfix.field.MailingInst());
  }

  public boolean isSet(quickfix.field.MailingInst field) {
    return isSetField(field);
  }

  public boolean isSetMailingInst() {
    return isSetField(482);
  }

  public void set(quickfix.fixlatest.component.NestedParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NestedParties get(quickfix.fixlatest.component.NestedParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NestedParties getNestedPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NestedParties());
  }

  public void set(quickfix.field.NoNestedPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoNestedPartyIDs get(quickfix.field.NoNestedPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNestedPartyIDs getNoNestedPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNestedPartyIDs());
  }

  public boolean isSet(quickfix.field.NoNestedPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNestedPartyIDs() {
    return isSetField(539);
  }

public static class NoNestedPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {524, 525, 538, 2384, 804, 0};

  public NoNestedPartyIDs() {
    super(539, 524, ORDER);
  }

  public void set(quickfix.field.NestedPartyID value) {
    setField(value);
  }

  public quickfix.field.NestedPartyID get(quickfix.field.NestedPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyID getNestedPartyID() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyID());
  }

  public boolean isSet(quickfix.field.NestedPartyID field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyID() {
    return isSetField(524);
  }

  public void set(quickfix.field.NestedPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.NestedPartyIDSource get(quickfix.field.NestedPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyIDSource getNestedPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyIDSource());
  }

  public boolean isSet(quickfix.field.NestedPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyIDSource() {
    return isSetField(525);
  }

  public void set(quickfix.field.NestedPartyRole value) {
    setField(value);
  }

  public quickfix.field.NestedPartyRole get(quickfix.field.NestedPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyRole getNestedPartyRole() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyRole());
  }

  public boolean isSet(quickfix.field.NestedPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyRole() {
    return isSetField(538);
  }

  public void set(quickfix.field.NestedPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.NestedPartyRoleQualifier get(quickfix.field.NestedPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyRoleQualifier getNestedPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.NestedPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyRoleQualifier() {
    return isSetField(2384);
  }

  public void set(quickfix.fixlatest.component.NstdPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtysSubGrp get(quickfix.fixlatest.component.NstdPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtysSubGrp getNstdPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtysSubGrp());
  }

  public void set(quickfix.field.NoNestedPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoNestedPartySubIDs get(quickfix.field.NoNestedPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNestedPartySubIDs getNoNestedPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNestedPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoNestedPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNestedPartySubIDs() {
    return isSetField(804);
  }

public static class NoNestedPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {545, 805, 0};

  public NoNestedPartySubIDs() {
    super(804, 545, ORDER);
  }

  public void set(quickfix.field.NestedPartySubID value) {
    setField(value);
  }

  public quickfix.field.NestedPartySubID get(quickfix.field.NestedPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartySubID getNestedPartySubID() throws FieldNotFound {
    return get(new quickfix.field.NestedPartySubID());
  }

  public boolean isSet(quickfix.field.NestedPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartySubID() {
    return isSetField(545);
  }

  public void set(quickfix.field.NestedPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.NestedPartySubIDType get(quickfix.field.NestedPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartySubIDType getNestedPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.NestedPartySubIDType());
  }

  public boolean isSet(quickfix.field.NestedPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartySubIDType() {
    return isSetField(805);
  }
}
}

  public void set(quickfix.field.OwnerType value) {
    setField(value);
  }

  public quickfix.field.OwnerType get(quickfix.field.OwnerType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OwnerType getOwnerType() throws FieldNotFound {
    return get(new quickfix.field.OwnerType());
  }

  public boolean isSet(quickfix.field.OwnerType field) {
    return isSetField(field);
  }

  public boolean isSetOwnerType() {
    return isSetField(522);
  }

  public void set(quickfix.field.DateOfBirth value) {
    setField(value);
  }

  public quickfix.field.DateOfBirth get(quickfix.field.DateOfBirth value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DateOfBirth getDateOfBirth() throws FieldNotFound {
    return get(new quickfix.field.DateOfBirth());
  }

  public boolean isSet(quickfix.field.DateOfBirth field) {
    return isSetField(field);
  }

  public boolean isSetDateOfBirth() {
    return isSetField(486);
  }

  public void set(quickfix.field.InvestorCountryOfResidence value) {
    setField(value);
  }

  public quickfix.field.InvestorCountryOfResidence get(quickfix.field.InvestorCountryOfResidence value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InvestorCountryOfResidence getInvestorCountryOfResidence() throws FieldNotFound {
    return get(new quickfix.field.InvestorCountryOfResidence());
  }

  public boolean isSet(quickfix.field.InvestorCountryOfResidence field) {
    return isSetField(field);
  }

  public boolean isSetInvestorCountryOfResidence() {
    return isSetField(475);
  }
}

  public void set(quickfix.field.RegistDtls value) {
    setField(value);
  }

  public quickfix.field.RegistDtls get(quickfix.field.RegistDtls value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegistDtls getRegistDtls() throws FieldNotFound {
    return get(new quickfix.field.RegistDtls());
  }

  public boolean isSet(quickfix.field.RegistDtls field) {
    return isSetField(field);
  }

  public boolean isSetRegistDtls() {
    return isSetField(509);
  }

  public void set(quickfix.field.RegistEmail value) {
    setField(value);
  }

  public quickfix.field.RegistEmail get(quickfix.field.RegistEmail value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RegistEmail getRegistEmail() throws FieldNotFound {
    return get(new quickfix.field.RegistEmail());
  }

  public boolean isSet(quickfix.field.RegistEmail field) {
    return isSetField(field);
  }

  public boolean isSetRegistEmail() {
    return isSetField(511);
  }

  public void set(quickfix.field.MailingDtls value) {
    setField(value);
  }

  public quickfix.field.MailingDtls get(quickfix.field.MailingDtls value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MailingDtls getMailingDtls() throws FieldNotFound {
    return get(new quickfix.field.MailingDtls());
  }

  public boolean isSet(quickfix.field.MailingDtls field) {
    return isSetField(field);
  }

  public boolean isSetMailingDtls() {
    return isSetField(474);
  }

  public void set(quickfix.field.MailingInst value) {
    setField(value);
  }

  public quickfix.field.MailingInst get(quickfix.field.MailingInst value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MailingInst getMailingInst() throws FieldNotFound {
    return get(new quickfix.field.MailingInst());
  }

  public boolean isSet(quickfix.field.MailingInst field) {
    return isSetField(field);
  }

  public boolean isSetMailingInst() {
    return isSetField(482);
  }

  public void set(quickfix.fixlatest.component.NestedParties component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NestedParties get(quickfix.fixlatest.component.NestedParties component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NestedParties getNestedPartiesComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NestedParties());
  }

  public void set(quickfix.field.NoNestedPartyIDs value) {
    setField(value);
  }

  public quickfix.field.NoNestedPartyIDs get(quickfix.field.NoNestedPartyIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNestedPartyIDs getNoNestedPartyIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNestedPartyIDs());
  }

  public boolean isSet(quickfix.field.NoNestedPartyIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNestedPartyIDs() {
    return isSetField(539);
  }

public static class NoNestedPartyIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {524, 525, 538, 2384, 804, 0};

  public NoNestedPartyIDs() {
    super(539, 524, ORDER);
  }

  public void set(quickfix.field.NestedPartyID value) {
    setField(value);
  }

  public quickfix.field.NestedPartyID get(quickfix.field.NestedPartyID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyID getNestedPartyID() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyID());
  }

  public boolean isSet(quickfix.field.NestedPartyID field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyID() {
    return isSetField(524);
  }

  public void set(quickfix.field.NestedPartyIDSource value) {
    setField(value);
  }

  public quickfix.field.NestedPartyIDSource get(quickfix.field.NestedPartyIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyIDSource getNestedPartyIDSource() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyIDSource());
  }

  public boolean isSet(quickfix.field.NestedPartyIDSource field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyIDSource() {
    return isSetField(525);
  }

  public void set(quickfix.field.NestedPartyRole value) {
    setField(value);
  }

  public quickfix.field.NestedPartyRole get(quickfix.field.NestedPartyRole value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyRole getNestedPartyRole() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyRole());
  }

  public boolean isSet(quickfix.field.NestedPartyRole field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyRole() {
    return isSetField(538);
  }

  public void set(quickfix.field.NestedPartyRoleQualifier value) {
    setField(value);
  }

  public quickfix.field.NestedPartyRoleQualifier get(quickfix.field.NestedPartyRoleQualifier value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartyRoleQualifier getNestedPartyRoleQualifier() throws FieldNotFound {
    return get(new quickfix.field.NestedPartyRoleQualifier());
  }

  public boolean isSet(quickfix.field.NestedPartyRoleQualifier field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartyRoleQualifier() {
    return isSetField(2384);
  }

  public void set(quickfix.fixlatest.component.NstdPtysSubGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.NstdPtysSubGrp get(quickfix.fixlatest.component.NstdPtysSubGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.NstdPtysSubGrp getNstdPtysSubGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.NstdPtysSubGrp());
  }

  public void set(quickfix.field.NoNestedPartySubIDs value) {
    setField(value);
  }

  public quickfix.field.NoNestedPartySubIDs get(quickfix.field.NoNestedPartySubIDs value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoNestedPartySubIDs getNoNestedPartySubIDs() throws FieldNotFound {
    return get(new quickfix.field.NoNestedPartySubIDs());
  }

  public boolean isSet(quickfix.field.NoNestedPartySubIDs field) {
    return isSetField(field);
  }

  public boolean isSetNoNestedPartySubIDs() {
    return isSetField(804);
  }

public static class NoNestedPartySubIDs extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {545, 805, 0};

  public NoNestedPartySubIDs() {
    super(804, 545, ORDER);
  }

  public void set(quickfix.field.NestedPartySubID value) {
    setField(value);
  }

  public quickfix.field.NestedPartySubID get(quickfix.field.NestedPartySubID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartySubID getNestedPartySubID() throws FieldNotFound {
    return get(new quickfix.field.NestedPartySubID());
  }

  public boolean isSet(quickfix.field.NestedPartySubID field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartySubID() {
    return isSetField(545);
  }

  public void set(quickfix.field.NestedPartySubIDType value) {
    setField(value);
  }

  public quickfix.field.NestedPartySubIDType get(quickfix.field.NestedPartySubIDType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NestedPartySubIDType getNestedPartySubIDType() throws FieldNotFound {
    return get(new quickfix.field.NestedPartySubIDType());
  }

  public boolean isSet(quickfix.field.NestedPartySubIDType field) {
    return isSetField(field);
  }

  public boolean isSetNestedPartySubIDType() {
    return isSetField(805);
  }
}
}

  public void set(quickfix.field.OwnerType value) {
    setField(value);
  }

  public quickfix.field.OwnerType get(quickfix.field.OwnerType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.OwnerType getOwnerType() throws FieldNotFound {
    return get(new quickfix.field.OwnerType());
  }

  public boolean isSet(quickfix.field.OwnerType field) {
    return isSetField(field);
  }

  public boolean isSetOwnerType() {
    return isSetField(522);
  }

  public void set(quickfix.field.DateOfBirth value) {
    setField(value);
  }

  public quickfix.field.DateOfBirth get(quickfix.field.DateOfBirth value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DateOfBirth getDateOfBirth() throws FieldNotFound {
    return get(new quickfix.field.DateOfBirth());
  }

  public boolean isSet(quickfix.field.DateOfBirth field) {
    return isSetField(field);
  }

  public boolean isSetDateOfBirth() {
    return isSetField(486);
  }

  public void set(quickfix.field.InvestorCountryOfResidence value) {
    setField(value);
  }

  public quickfix.field.InvestorCountryOfResidence get(quickfix.field.InvestorCountryOfResidence value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.InvestorCountryOfResidence getInvestorCountryOfResidence() throws FieldNotFound {
    return get(new quickfix.field.InvestorCountryOfResidence());
  }

  public boolean isSet(quickfix.field.InvestorCountryOfResidence field) {
    return isSetField(field);
  }

  public boolean isSetInvestorCountryOfResidence() {
    return isSetField(475);
  }
}
