/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class FinancingDetails extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {913, 914, 1961, 915, 918, 1962, 1963, 1964, 1965, 1966, 1967, 1968, 1969, 1970, 1513, 1525, 1527, 788, 916, 917, 919, 898, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public FinancingDetails() {
    super();
  }

  public void set(quickfix.field.AgreementDesc value) {
    setField(value);
  }

  public quickfix.field.AgreementDesc get(quickfix.field.AgreementDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AgreementDesc getAgreementDesc() throws FieldNotFound {
    return get(new quickfix.field.AgreementDesc());
  }

  public boolean isSet(quickfix.field.AgreementDesc field) {
    return isSetField(field);
  }

  public boolean isSetAgreementDesc() {
    return isSetField(913);
  }

  public void set(quickfix.field.AgreementID value) {
    setField(value);
  }

  public quickfix.field.AgreementID get(quickfix.field.AgreementID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AgreementID getAgreementID() throws FieldNotFound {
    return get(new quickfix.field.AgreementID());
  }

  public boolean isSet(quickfix.field.AgreementID field) {
    return isSetField(field);
  }

  public boolean isSetAgreementID() {
    return isSetField(914);
  }

  public void set(quickfix.field.AgreementVersion value) {
    setField(value);
  }

  public quickfix.field.AgreementVersion get(quickfix.field.AgreementVersion value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AgreementVersion getAgreementVersion() throws FieldNotFound {
    return get(new quickfix.field.AgreementVersion());
  }

  public boolean isSet(quickfix.field.AgreementVersion field) {
    return isSetField(field);
  }

  public boolean isSetAgreementVersion() {
    return isSetField(1961);
  }

  public void set(quickfix.field.AgreementDate value) {
    setField(value);
  }

  public quickfix.field.AgreementDate get(quickfix.field.AgreementDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AgreementDate getAgreementDate() throws FieldNotFound {
    return get(new quickfix.field.AgreementDate());
  }

  public boolean isSet(quickfix.field.AgreementDate field) {
    return isSetField(field);
  }

  public boolean isSetAgreementDate() {
    return isSetField(915);
  }

  public void set(quickfix.field.AgreementCurrency value) {
    setField(value);
  }

  public quickfix.field.AgreementCurrency get(quickfix.field.AgreementCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.AgreementCurrency getAgreementCurrency() throws FieldNotFound {
    return get(new quickfix.field.AgreementCurrency());
  }

  public boolean isSet(quickfix.field.AgreementCurrency field) {
    return isSetField(field);
  }

  public boolean isSetAgreementCurrency() {
    return isSetField(918);
  }

  public void set(quickfix.field.MasterConfirmationDesc value) {
    setField(value);
  }

  public quickfix.field.MasterConfirmationDesc get(quickfix.field.MasterConfirmationDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MasterConfirmationDesc getMasterConfirmationDesc() throws FieldNotFound {
    return get(new quickfix.field.MasterConfirmationDesc());
  }

  public boolean isSet(quickfix.field.MasterConfirmationDesc field) {
    return isSetField(field);
  }

  public boolean isSetMasterConfirmationDesc() {
    return isSetField(1962);
  }

  public void set(quickfix.field.MasterConfirmationDate value) {
    setField(value);
  }

  public quickfix.field.MasterConfirmationDate get(quickfix.field.MasterConfirmationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MasterConfirmationDate getMasterConfirmationDate() throws FieldNotFound {
    return get(new quickfix.field.MasterConfirmationDate());
  }

  public boolean isSet(quickfix.field.MasterConfirmationDate field) {
    return isSetField(field);
  }

  public boolean isSetMasterConfirmationDate() {
    return isSetField(1963);
  }

  public void set(quickfix.field.MasterConfirmationAnnexDesc value) {
    setField(value);
  }

  public quickfix.field.MasterConfirmationAnnexDesc get(quickfix.field.MasterConfirmationAnnexDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MasterConfirmationAnnexDesc getMasterConfirmationAnnexDesc() throws FieldNotFound {
    return get(new quickfix.field.MasterConfirmationAnnexDesc());
  }

  public boolean isSet(quickfix.field.MasterConfirmationAnnexDesc field) {
    return isSetField(field);
  }

  public boolean isSetMasterConfirmationAnnexDesc() {
    return isSetField(1964);
  }

  public void set(quickfix.field.MasterConfirmationAnnexDate value) {
    setField(value);
  }

  public quickfix.field.MasterConfirmationAnnexDate get(quickfix.field.MasterConfirmationAnnexDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MasterConfirmationAnnexDate getMasterConfirmationAnnexDate() throws FieldNotFound {
    return get(new quickfix.field.MasterConfirmationAnnexDate());
  }

  public boolean isSet(quickfix.field.MasterConfirmationAnnexDate field) {
    return isSetField(field);
  }

  public boolean isSetMasterConfirmationAnnexDate() {
    return isSetField(1965);
  }

  public void set(quickfix.field.BrokerConfirmationDesc value) {
    setField(value);
  }

  public quickfix.field.BrokerConfirmationDesc get(quickfix.field.BrokerConfirmationDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.BrokerConfirmationDesc getBrokerConfirmationDesc() throws FieldNotFound {
    return get(new quickfix.field.BrokerConfirmationDesc());
  }

  public boolean isSet(quickfix.field.BrokerConfirmationDesc field) {
    return isSetField(field);
  }

  public boolean isSetBrokerConfirmationDesc() {
    return isSetField(1966);
  }

  public void set(quickfix.fixlatest.component.FinancingContractualDefinitionGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.FinancingContractualDefinitionGrp get(quickfix.fixlatest.component.FinancingContractualDefinitionGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.FinancingContractualDefinitionGrp getFinancingContractualDefinitionGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.FinancingContractualDefinitionGrp());
  }

  public void set(quickfix.field.NoContractualDefinitions value) {
    setField(value);
  }

  public quickfix.field.NoContractualDefinitions get(quickfix.field.NoContractualDefinitions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoContractualDefinitions getNoContractualDefinitions() throws FieldNotFound {
    return get(new quickfix.field.NoContractualDefinitions());
  }

  public boolean isSet(quickfix.field.NoContractualDefinitions field) {
    return isSetField(field);
  }

  public boolean isSetNoContractualDefinitions() {
    return isSetField(40040);
  }

public static class NoContractualDefinitions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40041, 0};

  public NoContractualDefinitions() {
    super(40040, 40041, ORDER);
  }

  public void set(quickfix.field.ContractualDefinition value) {
    setField(value);
  }

  public quickfix.field.ContractualDefinition get(quickfix.field.ContractualDefinition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContractualDefinition getContractualDefinition() throws FieldNotFound {
    return get(new quickfix.field.ContractualDefinition());
  }

  public boolean isSet(quickfix.field.ContractualDefinition field) {
    return isSetField(field);
  }

  public boolean isSetContractualDefinition() {
    return isSetField(40041);
  }
}

  public void set(quickfix.fixlatest.component.FinancingTermSupplementGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.FinancingTermSupplementGrp get(quickfix.fixlatest.component.FinancingTermSupplementGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.FinancingTermSupplementGrp getFinancingTermSupplementGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.FinancingTermSupplementGrp());
  }

  public void set(quickfix.field.NoFinancingTermSupplements value) {
    setField(value);
  }

  public quickfix.field.NoFinancingTermSupplements get(quickfix.field.NoFinancingTermSupplements value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoFinancingTermSupplements getNoFinancingTermSupplements() throws FieldNotFound {
    return get(new quickfix.field.NoFinancingTermSupplements());
  }

  public boolean isSet(quickfix.field.NoFinancingTermSupplements field) {
    return isSetField(field);
  }

  public boolean isSetNoFinancingTermSupplements() {
    return isSetField(40046);
  }

public static class NoFinancingTermSupplements extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40047, 40048, 0};

  public NoFinancingTermSupplements() {
    super(40046, 40047, ORDER);
  }

  public void set(quickfix.field.FinancingTermSupplementDesc value) {
    setField(value);
  }

  public quickfix.field.FinancingTermSupplementDesc get(quickfix.field.FinancingTermSupplementDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FinancingTermSupplementDesc getFinancingTermSupplementDesc() throws FieldNotFound {
    return get(new quickfix.field.FinancingTermSupplementDesc());
  }

  public boolean isSet(quickfix.field.FinancingTermSupplementDesc field) {
    return isSetField(field);
  }

  public boolean isSetFinancingTermSupplementDesc() {
    return isSetField(40047);
  }

  public void set(quickfix.field.FinancingTermSupplementDate value) {
    setField(value);
  }

  public quickfix.field.FinancingTermSupplementDate get(quickfix.field.FinancingTermSupplementDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.FinancingTermSupplementDate getFinancingTermSupplementDate() throws FieldNotFound {
    return get(new quickfix.field.FinancingTermSupplementDate());
  }

  public boolean isSet(quickfix.field.FinancingTermSupplementDate field) {
    return isSetField(field);
  }

  public boolean isSetFinancingTermSupplementDate() {
    return isSetField(40048);
  }
}

  public void set(quickfix.fixlatest.component.FinancingContractualMatrixGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.FinancingContractualMatrixGrp get(quickfix.fixlatest.component.FinancingContractualMatrixGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.FinancingContractualMatrixGrp getFinancingContractualMatrixGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.FinancingContractualMatrixGrp());
  }

  public void set(quickfix.field.NoContractualMatrices value) {
    setField(value);
  }

  public quickfix.field.NoContractualMatrices get(quickfix.field.NoContractualMatrices value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoContractualMatrices getNoContractualMatrices() throws FieldNotFound {
    return get(new quickfix.field.NoContractualMatrices());
  }

  public boolean isSet(quickfix.field.NoContractualMatrices field) {
    return isSetField(field);
  }

  public boolean isSetNoContractualMatrices() {
    return isSetField(40042);
  }

public static class NoContractualMatrices extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {40043, 40044, 40045, 0};

  public NoContractualMatrices() {
    super(40042, 40043, ORDER);
  }

  public void set(quickfix.field.ContractualMatrixSource value) {
    setField(value);
  }

  public quickfix.field.ContractualMatrixSource get(quickfix.field.ContractualMatrixSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContractualMatrixSource getContractualMatrixSource() throws FieldNotFound {
    return get(new quickfix.field.ContractualMatrixSource());
  }

  public boolean isSet(quickfix.field.ContractualMatrixSource field) {
    return isSetField(field);
  }

  public boolean isSetContractualMatrixSource() {
    return isSetField(40043);
  }

  public void set(quickfix.field.ContractualMatrixDate value) {
    setField(value);
  }

  public quickfix.field.ContractualMatrixDate get(quickfix.field.ContractualMatrixDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContractualMatrixDate getContractualMatrixDate() throws FieldNotFound {
    return get(new quickfix.field.ContractualMatrixDate());
  }

  public boolean isSet(quickfix.field.ContractualMatrixDate field) {
    return isSetField(field);
  }

  public boolean isSetContractualMatrixDate() {
    return isSetField(40044);
  }

  public void set(quickfix.field.ContractualMatrixTerm value) {
    setField(value);
  }

  public quickfix.field.ContractualMatrixTerm get(quickfix.field.ContractualMatrixTerm value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.ContractualMatrixTerm getContractualMatrixTerm() throws FieldNotFound {
    return get(new quickfix.field.ContractualMatrixTerm());
  }

  public boolean isSet(quickfix.field.ContractualMatrixTerm field) {
    return isSetField(field);
  }

  public boolean isSetContractualMatrixTerm() {
    return isSetField(40045);
  }
}

  public void set(quickfix.field.CreditSupportAgreementDesc value) {
    setField(value);
  }

  public quickfix.field.CreditSupportAgreementDesc get(quickfix.field.CreditSupportAgreementDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CreditSupportAgreementDesc getCreditSupportAgreementDesc() throws FieldNotFound {
    return get(new quickfix.field.CreditSupportAgreementDesc());
  }

  public boolean isSet(quickfix.field.CreditSupportAgreementDesc field) {
    return isSetField(field);
  }

  public boolean isSetCreditSupportAgreementDesc() {
    return isSetField(1967);
  }

  public void set(quickfix.field.CreditSupportAgreementDate value) {
    setField(value);
  }

  public quickfix.field.CreditSupportAgreementDate get(quickfix.field.CreditSupportAgreementDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CreditSupportAgreementDate getCreditSupportAgreementDate() throws FieldNotFound {
    return get(new quickfix.field.CreditSupportAgreementDate());
  }

  public boolean isSet(quickfix.field.CreditSupportAgreementDate field) {
    return isSetField(field);
  }

  public boolean isSetCreditSupportAgreementDate() {
    return isSetField(1968);
  }

  public void set(quickfix.field.CreditSupportAgreementID value) {
    setField(value);
  }

  public quickfix.field.CreditSupportAgreementID get(quickfix.field.CreditSupportAgreementID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.CreditSupportAgreementID getCreditSupportAgreementID() throws FieldNotFound {
    return get(new quickfix.field.CreditSupportAgreementID());
  }

  public boolean isSet(quickfix.field.CreditSupportAgreementID field) {
    return isSetField(field);
  }

  public boolean isSetCreditSupportAgreementID() {
    return isSetField(1969);
  }

  public void set(quickfix.field.GoverningLaw value) {
    setField(value);
  }

  public quickfix.field.GoverningLaw get(quickfix.field.GoverningLaw value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.GoverningLaw getGoverningLaw() throws FieldNotFound {
    return get(new quickfix.field.GoverningLaw());
  }

  public boolean isSet(quickfix.field.GoverningLaw field) {
    return isSetField(field);
  }

  public boolean isSetGoverningLaw() {
    return isSetField(1970);
  }

  public void set(quickfix.field.DocumentationText value) {
    setField(value);
  }

  public quickfix.field.DocumentationText get(quickfix.field.DocumentationText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DocumentationText getDocumentationText() throws FieldNotFound {
    return get(new quickfix.field.DocumentationText());
  }

  public boolean isSet(quickfix.field.DocumentationText field) {
    return isSetField(field);
  }

  public boolean isSetDocumentationText() {
    return isSetField(1513);
  }

  public void set(quickfix.field.EncodedDocumentationTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedDocumentationTextLen get(quickfix.field.EncodedDocumentationTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedDocumentationTextLen getEncodedDocumentationTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedDocumentationTextLen());
  }

  public boolean isSet(quickfix.field.EncodedDocumentationTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedDocumentationTextLen() {
    return isSetField(1525);
  }

  public void set(quickfix.field.EncodedDocumentationText value) {
    setField(value);
  }

  public quickfix.field.EncodedDocumentationText get(quickfix.field.EncodedDocumentationText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedDocumentationText getEncodedDocumentationText() throws FieldNotFound {
    return get(new quickfix.field.EncodedDocumentationText());
  }

  public boolean isSet(quickfix.field.EncodedDocumentationText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedDocumentationText() {
    return isSetField(1527);
  }

  public void set(quickfix.field.TerminationType value) {
    setField(value);
  }

  public quickfix.field.TerminationType get(quickfix.field.TerminationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.TerminationType getTerminationType() throws FieldNotFound {
    return get(new quickfix.field.TerminationType());
  }

  public boolean isSet(quickfix.field.TerminationType field) {
    return isSetField(field);
  }

  public boolean isSetTerminationType() {
    return isSetField(788);
  }

  public void set(quickfix.field.StartDate value) {
    setField(value);
  }

  public quickfix.field.StartDate get(quickfix.field.StartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.StartDate getStartDate() throws FieldNotFound {
    return get(new quickfix.field.StartDate());
  }

  public boolean isSet(quickfix.field.StartDate field) {
    return isSetField(field);
  }

  public boolean isSetStartDate() {
    return isSetField(916);
  }

  public void set(quickfix.field.EndDate value) {
    setField(value);
  }

  public quickfix.field.EndDate get(quickfix.field.EndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EndDate getEndDate() throws FieldNotFound {
    return get(new quickfix.field.EndDate());
  }

  public boolean isSet(quickfix.field.EndDate field) {
    return isSetField(field);
  }

  public boolean isSetEndDate() {
    return isSetField(917);
  }

  public void set(quickfix.field.DeliveryType value) {
    setField(value);
  }

  public quickfix.field.DeliveryType get(quickfix.field.DeliveryType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.DeliveryType getDeliveryType() throws FieldNotFound {
    return get(new quickfix.field.DeliveryType());
  }

  public boolean isSet(quickfix.field.DeliveryType field) {
    return isSetField(field);
  }

  public boolean isSetDeliveryType() {
    return isSetField(919);
  }

  public void set(quickfix.field.MarginRatio value) {
    setField(value);
  }

  public quickfix.field.MarginRatio get(quickfix.field.MarginRatio value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MarginRatio getMarginRatio() throws FieldNotFound {
    return get(new quickfix.field.MarginRatio());
  }

  public boolean isSet(quickfix.field.MarginRatio field) {
    return isSetField(field);
  }

  public boolean isSetMarginRatio() {
    return isSetField(898);
  }
}
