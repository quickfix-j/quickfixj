/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class LegFinancingDetails extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {2497, 2498, 2499, 2496, 2495, 2511, 2510, 2512, 2509, 2500, 2502, 2501, 2503, 2507, 2505, 2494, 2493, 2514, 2513, 2506, 2504, 2508, };
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {};
  protected int[] getGroupFields() { return componentGroups; }

  public LegFinancingDetails() {
    super();
  }

  public void set(quickfix.field.LegAgreementDesc value) {
    setField(value);
  }

  public quickfix.field.LegAgreementDesc get(quickfix.field.LegAgreementDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAgreementDesc getLegAgreementDesc() throws FieldNotFound {
    return get(new quickfix.field.LegAgreementDesc());
  }

  public boolean isSet(quickfix.field.LegAgreementDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegAgreementDesc() {
    return isSetField(2497);
  }

  public void set(quickfix.field.LegAgreementID value) {
    setField(value);
  }

  public quickfix.field.LegAgreementID get(quickfix.field.LegAgreementID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAgreementID getLegAgreementID() throws FieldNotFound {
    return get(new quickfix.field.LegAgreementID());
  }

  public boolean isSet(quickfix.field.LegAgreementID field) {
    return isSetField(field);
  }

  public boolean isSetLegAgreementID() {
    return isSetField(2498);
  }

  public void set(quickfix.field.LegAgreementVersion value) {
    setField(value);
  }

  public quickfix.field.LegAgreementVersion get(quickfix.field.LegAgreementVersion value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAgreementVersion getLegAgreementVersion() throws FieldNotFound {
    return get(new quickfix.field.LegAgreementVersion());
  }

  public boolean isSet(quickfix.field.LegAgreementVersion field) {
    return isSetField(field);
  }

  public boolean isSetLegAgreementVersion() {
    return isSetField(2499);
  }

  public void set(quickfix.field.LegAgreementDate value) {
    setField(value);
  }

  public quickfix.field.LegAgreementDate get(quickfix.field.LegAgreementDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAgreementDate getLegAgreementDate() throws FieldNotFound {
    return get(new quickfix.field.LegAgreementDate());
  }

  public boolean isSet(quickfix.field.LegAgreementDate field) {
    return isSetField(field);
  }

  public boolean isSetLegAgreementDate() {
    return isSetField(2496);
  }

  public void set(quickfix.field.LegAgreementCurrency value) {
    setField(value);
  }

  public quickfix.field.LegAgreementCurrency get(quickfix.field.LegAgreementCurrency value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegAgreementCurrency getLegAgreementCurrency() throws FieldNotFound {
    return get(new quickfix.field.LegAgreementCurrency());
  }

  public boolean isSet(quickfix.field.LegAgreementCurrency field) {
    return isSetField(field);
  }

  public boolean isSetLegAgreementCurrency() {
    return isSetField(2495);
  }

  public void set(quickfix.field.LegMasterConfirmationDesc value) {
    setField(value);
  }

  public quickfix.field.LegMasterConfirmationDesc get(quickfix.field.LegMasterConfirmationDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMasterConfirmationDesc getLegMasterConfirmationDesc() throws FieldNotFound {
    return get(new quickfix.field.LegMasterConfirmationDesc());
  }

  public boolean isSet(quickfix.field.LegMasterConfirmationDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegMasterConfirmationDesc() {
    return isSetField(2511);
  }

  public void set(quickfix.field.LegMasterConfirmationDate value) {
    setField(value);
  }

  public quickfix.field.LegMasterConfirmationDate get(quickfix.field.LegMasterConfirmationDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMasterConfirmationDate getLegMasterConfirmationDate() throws FieldNotFound {
    return get(new quickfix.field.LegMasterConfirmationDate());
  }

  public boolean isSet(quickfix.field.LegMasterConfirmationDate field) {
    return isSetField(field);
  }

  public boolean isSetLegMasterConfirmationDate() {
    return isSetField(2510);
  }

  public void set(quickfix.field.LegMasterConfirmationAnnexDesc value) {
    setField(value);
  }

  public quickfix.field.LegMasterConfirmationAnnexDesc get(quickfix.field.LegMasterConfirmationAnnexDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMasterConfirmationAnnexDesc getLegMasterConfirmationAnnexDesc() throws FieldNotFound {
    return get(new quickfix.field.LegMasterConfirmationAnnexDesc());
  }

  public boolean isSet(quickfix.field.LegMasterConfirmationAnnexDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegMasterConfirmationAnnexDesc() {
    return isSetField(2512);
  }

  public void set(quickfix.field.LegMasterConfirmationAnnexDate value) {
    setField(value);
  }

  public quickfix.field.LegMasterConfirmationAnnexDate get(quickfix.field.LegMasterConfirmationAnnexDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMasterConfirmationAnnexDate getLegMasterConfirmationAnnexDate() throws FieldNotFound {
    return get(new quickfix.field.LegMasterConfirmationAnnexDate());
  }

  public boolean isSet(quickfix.field.LegMasterConfirmationAnnexDate field) {
    return isSetField(field);
  }

  public boolean isSetLegMasterConfirmationAnnexDate() {
    return isSetField(2509);
  }

  public void set(quickfix.field.LegBrokerConfirmationDesc value) {
    setField(value);
  }

  public quickfix.field.LegBrokerConfirmationDesc get(quickfix.field.LegBrokerConfirmationDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegBrokerConfirmationDesc getLegBrokerConfirmationDesc() throws FieldNotFound {
    return get(new quickfix.field.LegBrokerConfirmationDesc());
  }

  public boolean isSet(quickfix.field.LegBrokerConfirmationDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegBrokerConfirmationDesc() {
    return isSetField(2500);
  }

  public void set(quickfix.fixlatest.component.LegFinancingContractualDefinitionsGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegFinancingContractualDefinitionsGrp get(quickfix.fixlatest.component.LegFinancingContractualDefinitionsGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegFinancingContractualDefinitionsGrp getLegFinancingContractualDefinitionsGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegFinancingContractualDefinitionsGrp());
  }

  public void set(quickfix.field.NoLegContractualDefinitions value) {
    setField(value);
  }

  public quickfix.field.NoLegContractualDefinitions get(quickfix.field.NoLegContractualDefinitions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegContractualDefinitions getNoLegContractualDefinitions() throws FieldNotFound {
    return get(new quickfix.field.NoLegContractualDefinitions());
  }

  public boolean isSet(quickfix.field.NoLegContractualDefinitions field) {
    return isSetField(field);
  }

  public boolean isSetNoLegContractualDefinitions() {
    return isSetField(42198);
  }

public static class NoLegContractualDefinitions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42199, 0};

  public NoLegContractualDefinitions() {
    super(42198, 42199, ORDER);
  }

  public void set(quickfix.field.LegContractualDefinition value) {
    setField(value);
  }

  public quickfix.field.LegContractualDefinition get(quickfix.field.LegContractualDefinition value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegContractualDefinition getLegContractualDefinition() throws FieldNotFound {
    return get(new quickfix.field.LegContractualDefinition());
  }

  public boolean isSet(quickfix.field.LegContractualDefinition field) {
    return isSetField(field);
  }

  public boolean isSetLegContractualDefinition() {
    return isSetField(42199);
  }
}

  public void set(quickfix.fixlatest.component.LegFinancingTermSupplementGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegFinancingTermSupplementGrp get(quickfix.fixlatest.component.LegFinancingTermSupplementGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegFinancingTermSupplementGrp getLegFinancingTermSupplementGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegFinancingTermSupplementGrp());
  }

  public void set(quickfix.field.NoLegFinancingTermSupplements value) {
    setField(value);
  }

  public quickfix.field.NoLegFinancingTermSupplements get(quickfix.field.NoLegFinancingTermSupplements value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegFinancingTermSupplements getNoLegFinancingTermSupplements() throws FieldNotFound {
    return get(new quickfix.field.NoLegFinancingTermSupplements());
  }

  public boolean isSet(quickfix.field.NoLegFinancingTermSupplements field) {
    return isSetField(field);
  }

  public boolean isSetNoLegFinancingTermSupplements() {
    return isSetField(42200);
  }

public static class NoLegFinancingTermSupplements extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42201, 42202, 0};

  public NoLegFinancingTermSupplements() {
    super(42200, 42201, ORDER);
  }

  public void set(quickfix.field.LegFinancingTermSupplementDesc value) {
    setField(value);
  }

  public quickfix.field.LegFinancingTermSupplementDesc get(quickfix.field.LegFinancingTermSupplementDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegFinancingTermSupplementDesc getLegFinancingTermSupplementDesc() throws FieldNotFound {
    return get(new quickfix.field.LegFinancingTermSupplementDesc());
  }

  public boolean isSet(quickfix.field.LegFinancingTermSupplementDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegFinancingTermSupplementDesc() {
    return isSetField(42201);
  }

  public void set(quickfix.field.LegFinancingTermSupplementDate value) {
    setField(value);
  }

  public quickfix.field.LegFinancingTermSupplementDate get(quickfix.field.LegFinancingTermSupplementDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegFinancingTermSupplementDate getLegFinancingTermSupplementDate() throws FieldNotFound {
    return get(new quickfix.field.LegFinancingTermSupplementDate());
  }

  public boolean isSet(quickfix.field.LegFinancingTermSupplementDate field) {
    return isSetField(field);
  }

  public boolean isSetLegFinancingTermSupplementDate() {
    return isSetField(42202);
  }
}

  public void set(quickfix.fixlatest.component.LegFinancingContractualMatrixGrp component) {
    setComponent(component);
  }

  public quickfix.fixlatest.component.LegFinancingContractualMatrixGrp get(quickfix.fixlatest.component.LegFinancingContractualMatrixGrp component) throws FieldNotFound {
    getComponent(component);
    return component;
  }

  public quickfix.fixlatest.component.LegFinancingContractualMatrixGrp getLegFinancingContractualMatrixGrpComponent() throws FieldNotFound {
    return get(new quickfix.fixlatest.component.LegFinancingContractualMatrixGrp());
  }

  public void set(quickfix.field.NoLegContractualMatrices value) {
    setField(value);
  }

  public quickfix.field.NoLegContractualMatrices get(quickfix.field.NoLegContractualMatrices value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoLegContractualMatrices getNoLegContractualMatrices() throws FieldNotFound {
    return get(new quickfix.field.NoLegContractualMatrices());
  }

  public boolean isSet(quickfix.field.NoLegContractualMatrices field) {
    return isSetField(field);
  }

  public boolean isSetNoLegContractualMatrices() {
    return isSetField(42203);
  }

public static class NoLegContractualMatrices extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {42204, 42205, 42206, 0};

  public NoLegContractualMatrices() {
    super(42203, 42204, ORDER);
  }

  public void set(quickfix.field.LegContractualMatrixSource value) {
    setField(value);
  }

  public quickfix.field.LegContractualMatrixSource get(quickfix.field.LegContractualMatrixSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegContractualMatrixSource getLegContractualMatrixSource() throws FieldNotFound {
    return get(new quickfix.field.LegContractualMatrixSource());
  }

  public boolean isSet(quickfix.field.LegContractualMatrixSource field) {
    return isSetField(field);
  }

  public boolean isSetLegContractualMatrixSource() {
    return isSetField(42204);
  }

  public void set(quickfix.field.LegContractualMatrixDate value) {
    setField(value);
  }

  public quickfix.field.LegContractualMatrixDate get(quickfix.field.LegContractualMatrixDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegContractualMatrixDate getLegContractualMatrixDate() throws FieldNotFound {
    return get(new quickfix.field.LegContractualMatrixDate());
  }

  public boolean isSet(quickfix.field.LegContractualMatrixDate field) {
    return isSetField(field);
  }

  public boolean isSetLegContractualMatrixDate() {
    return isSetField(42205);
  }

  public void set(quickfix.field.LegContractualMatrixTerm value) {
    setField(value);
  }

  public quickfix.field.LegContractualMatrixTerm get(quickfix.field.LegContractualMatrixTerm value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegContractualMatrixTerm getLegContractualMatrixTerm() throws FieldNotFound {
    return get(new quickfix.field.LegContractualMatrixTerm());
  }

  public boolean isSet(quickfix.field.LegContractualMatrixTerm field) {
    return isSetField(field);
  }

  public boolean isSetLegContractualMatrixTerm() {
    return isSetField(42206);
  }
}

  public void set(quickfix.field.LegCreditSupportAgreementDesc value) {
    setField(value);
  }

  public quickfix.field.LegCreditSupportAgreementDesc get(quickfix.field.LegCreditSupportAgreementDesc value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCreditSupportAgreementDesc getLegCreditSupportAgreementDesc() throws FieldNotFound {
    return get(new quickfix.field.LegCreditSupportAgreementDesc());
  }

  public boolean isSet(quickfix.field.LegCreditSupportAgreementDesc field) {
    return isSetField(field);
  }

  public boolean isSetLegCreditSupportAgreementDesc() {
    return isSetField(2502);
  }

  public void set(quickfix.field.LegCreditSupportAgreementDate value) {
    setField(value);
  }

  public quickfix.field.LegCreditSupportAgreementDate get(quickfix.field.LegCreditSupportAgreementDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCreditSupportAgreementDate getLegCreditSupportAgreementDate() throws FieldNotFound {
    return get(new quickfix.field.LegCreditSupportAgreementDate());
  }

  public boolean isSet(quickfix.field.LegCreditSupportAgreementDate field) {
    return isSetField(field);
  }

  public boolean isSetLegCreditSupportAgreementDate() {
    return isSetField(2501);
  }

  public void set(quickfix.field.LegCreditSupportAgreementID value) {
    setField(value);
  }

  public quickfix.field.LegCreditSupportAgreementID get(quickfix.field.LegCreditSupportAgreementID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegCreditSupportAgreementID getLegCreditSupportAgreementID() throws FieldNotFound {
    return get(new quickfix.field.LegCreditSupportAgreementID());
  }

  public boolean isSet(quickfix.field.LegCreditSupportAgreementID field) {
    return isSetField(field);
  }

  public boolean isSetLegCreditSupportAgreementID() {
    return isSetField(2503);
  }

  public void set(quickfix.field.LegGoverningLaw value) {
    setField(value);
  }

  public quickfix.field.LegGoverningLaw get(quickfix.field.LegGoverningLaw value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegGoverningLaw getLegGoverningLaw() throws FieldNotFound {
    return get(new quickfix.field.LegGoverningLaw());
  }

  public boolean isSet(quickfix.field.LegGoverningLaw field) {
    return isSetField(field);
  }

  public boolean isSetLegGoverningLaw() {
    return isSetField(2507);
  }

  public void set(quickfix.field.LegDocumentationText value) {
    setField(value);
  }

  public quickfix.field.LegDocumentationText get(quickfix.field.LegDocumentationText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDocumentationText getLegDocumentationText() throws FieldNotFound {
    return get(new quickfix.field.LegDocumentationText());
  }

  public boolean isSet(quickfix.field.LegDocumentationText field) {
    return isSetField(field);
  }

  public boolean isSetLegDocumentationText() {
    return isSetField(2505);
  }

  public void set(quickfix.field.EncodedLegDocumentationTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedLegDocumentationTextLen get(quickfix.field.EncodedLegDocumentationTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegDocumentationTextLen getEncodedLegDocumentationTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegDocumentationTextLen());
  }

  public boolean isSet(quickfix.field.EncodedLegDocumentationTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegDocumentationTextLen() {
    return isSetField(2494);
  }

  public void set(quickfix.field.EncodedLegDocumentationText value) {
    setField(value);
  }

  public quickfix.field.EncodedLegDocumentationText get(quickfix.field.EncodedLegDocumentationText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedLegDocumentationText getEncodedLegDocumentationText() throws FieldNotFound {
    return get(new quickfix.field.EncodedLegDocumentationText());
  }

  public boolean isSet(quickfix.field.EncodedLegDocumentationText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedLegDocumentationText() {
    return isSetField(2493);
  }

  public void set(quickfix.field.LegTerminationType value) {
    setField(value);
  }

  public quickfix.field.LegTerminationType get(quickfix.field.LegTerminationType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegTerminationType getLegTerminationType() throws FieldNotFound {
    return get(new quickfix.field.LegTerminationType());
  }

  public boolean isSet(quickfix.field.LegTerminationType field) {
    return isSetField(field);
  }

  public boolean isSetLegTerminationType() {
    return isSetField(2514);
  }

  public void set(quickfix.field.LegStartDate value) {
    setField(value);
  }

  public quickfix.field.LegStartDate get(quickfix.field.LegStartDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegStartDate getLegStartDate() throws FieldNotFound {
    return get(new quickfix.field.LegStartDate());
  }

  public boolean isSet(quickfix.field.LegStartDate field) {
    return isSetField(field);
  }

  public boolean isSetLegStartDate() {
    return isSetField(2513);
  }

  public void set(quickfix.field.LegEndDate value) {
    setField(value);
  }

  public quickfix.field.LegEndDate get(quickfix.field.LegEndDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegEndDate getLegEndDate() throws FieldNotFound {
    return get(new quickfix.field.LegEndDate());
  }

  public boolean isSet(quickfix.field.LegEndDate field) {
    return isSetField(field);
  }

  public boolean isSetLegEndDate() {
    return isSetField(2506);
  }

  public void set(quickfix.field.LegDeliveryType value) {
    setField(value);
  }

  public quickfix.field.LegDeliveryType get(quickfix.field.LegDeliveryType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegDeliveryType getLegDeliveryType() throws FieldNotFound {
    return get(new quickfix.field.LegDeliveryType());
  }

  public boolean isSet(quickfix.field.LegDeliveryType field) {
    return isSetField(field);
  }

  public boolean isSetLegDeliveryType() {
    return isSetField(2504);
  }

  public void set(quickfix.field.LegMarginRatio value) {
    setField(value);
  }

  public quickfix.field.LegMarginRatio get(quickfix.field.LegMarginRatio value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.LegMarginRatio getLegMarginRatio() throws FieldNotFound {
    return get(new quickfix.field.LegMarginRatio());
  }

  public boolean isSet(quickfix.field.LegMarginRatio field) {
    return isSetField(field);
  }

  public boolean isSetLegMarginRatio() {
    return isSetField(2508);
  }
}
