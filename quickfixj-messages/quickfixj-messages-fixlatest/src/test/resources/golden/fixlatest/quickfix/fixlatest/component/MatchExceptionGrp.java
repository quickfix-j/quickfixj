/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class MatchExceptionGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {2772, };
  protected int[] getGroupFields() { return componentGroups; }

  public MatchExceptionGrp() {
    super();
  }

  public void set(quickfix.field.NoMatchExceptions value) {
    setField(value);
  }

  public quickfix.field.NoMatchExceptions get(quickfix.field.NoMatchExceptions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoMatchExceptions getNoMatchExceptions() throws FieldNotFound {
    return get(new quickfix.field.NoMatchExceptions());
  }

  public boolean isSet(quickfix.field.NoMatchExceptions field) {
    return isSetField(field);
  }

  public boolean isSetNoMatchExceptions() {
    return isSetField(2772);
  }

public static class NoMatchExceptions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {2773, 2774, 2775, 2776, 2777, 2778, 2779, 2780, 2797, 2798, 0};

  public NoMatchExceptions() {
    super(2772, 2773, ORDER);
  }

  public void set(quickfix.field.MatchExceptionType value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionType get(quickfix.field.MatchExceptionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionType getMatchExceptionType() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionType());
  }

  public boolean isSet(quickfix.field.MatchExceptionType field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionType() {
    return isSetField(2773);
  }

  public void set(quickfix.field.MatchExceptionElementType value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionElementType get(quickfix.field.MatchExceptionElementType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionElementType getMatchExceptionElementType() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionElementType());
  }

  public boolean isSet(quickfix.field.MatchExceptionElementType field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionElementType() {
    return isSetField(2774);
  }

  public void set(quickfix.field.MatchExceptionElementName value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionElementName get(quickfix.field.MatchExceptionElementName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionElementName getMatchExceptionElementName() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionElementName());
  }

  public boolean isSet(quickfix.field.MatchExceptionElementName field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionElementName() {
    return isSetField(2775);
  }

  public void set(quickfix.field.MatchExceptionAllocValue value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionAllocValue get(quickfix.field.MatchExceptionAllocValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionAllocValue getMatchExceptionAllocValue() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionAllocValue());
  }

  public boolean isSet(quickfix.field.MatchExceptionAllocValue field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionAllocValue() {
    return isSetField(2776);
  }

  public void set(quickfix.field.MatchExceptionConfirmValue value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionConfirmValue get(quickfix.field.MatchExceptionConfirmValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionConfirmValue getMatchExceptionConfirmValue() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionConfirmValue());
  }

  public boolean isSet(quickfix.field.MatchExceptionConfirmValue field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionConfirmValue() {
    return isSetField(2777);
  }

  public void set(quickfix.field.MatchExceptionToleranceValue value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionToleranceValue get(quickfix.field.MatchExceptionToleranceValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionToleranceValue getMatchExceptionToleranceValue() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionToleranceValue());
  }

  public boolean isSet(quickfix.field.MatchExceptionToleranceValue field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionToleranceValue() {
    return isSetField(2778);
  }

  public void set(quickfix.field.MatchExceptionToleranceValueType value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionToleranceValueType get(quickfix.field.MatchExceptionToleranceValueType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionToleranceValueType getMatchExceptionToleranceValueType() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionToleranceValueType());
  }

  public boolean isSet(quickfix.field.MatchExceptionToleranceValueType field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionToleranceValueType() {
    return isSetField(2779);
  }

  public void set(quickfix.field.MatchExceptionText value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionText get(quickfix.field.MatchExceptionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionText getMatchExceptionText() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionText());
  }

  public boolean isSet(quickfix.field.MatchExceptionText field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionText() {
    return isSetField(2780);
  }

  public void set(quickfix.field.EncodedMatchExceptionTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedMatchExceptionTextLen get(quickfix.field.EncodedMatchExceptionTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMatchExceptionTextLen getEncodedMatchExceptionTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedMatchExceptionTextLen());
  }

  public boolean isSet(quickfix.field.EncodedMatchExceptionTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMatchExceptionTextLen() {
    return isSetField(2797);
  }

  public void set(quickfix.field.EncodedMatchExecptionText value) {
    setField(value);
  }

  public quickfix.field.EncodedMatchExecptionText get(quickfix.field.EncodedMatchExecptionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMatchExecptionText getEncodedMatchExecptionText() throws FieldNotFound {
    return get(new quickfix.field.EncodedMatchExecptionText());
  }

  public boolean isSet(quickfix.field.EncodedMatchExecptionText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMatchExecptionText() {
    return isSetField(2798);
  }
}

  public void set(quickfix.field.MatchExceptionType value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionType get(quickfix.field.MatchExceptionType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionType getMatchExceptionType() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionType());
  }

  public boolean isSet(quickfix.field.MatchExceptionType field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionType() {
    return isSetField(2773);
  }

  public void set(quickfix.field.MatchExceptionElementType value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionElementType get(quickfix.field.MatchExceptionElementType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionElementType getMatchExceptionElementType() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionElementType());
  }

  public boolean isSet(quickfix.field.MatchExceptionElementType field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionElementType() {
    return isSetField(2774);
  }

  public void set(quickfix.field.MatchExceptionElementName value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionElementName get(quickfix.field.MatchExceptionElementName value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionElementName getMatchExceptionElementName() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionElementName());
  }

  public boolean isSet(quickfix.field.MatchExceptionElementName field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionElementName() {
    return isSetField(2775);
  }

  public void set(quickfix.field.MatchExceptionAllocValue value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionAllocValue get(quickfix.field.MatchExceptionAllocValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionAllocValue getMatchExceptionAllocValue() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionAllocValue());
  }

  public boolean isSet(quickfix.field.MatchExceptionAllocValue field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionAllocValue() {
    return isSetField(2776);
  }

  public void set(quickfix.field.MatchExceptionConfirmValue value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionConfirmValue get(quickfix.field.MatchExceptionConfirmValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionConfirmValue getMatchExceptionConfirmValue() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionConfirmValue());
  }

  public boolean isSet(quickfix.field.MatchExceptionConfirmValue field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionConfirmValue() {
    return isSetField(2777);
  }

  public void set(quickfix.field.MatchExceptionToleranceValue value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionToleranceValue get(quickfix.field.MatchExceptionToleranceValue value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionToleranceValue getMatchExceptionToleranceValue() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionToleranceValue());
  }

  public boolean isSet(quickfix.field.MatchExceptionToleranceValue field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionToleranceValue() {
    return isSetField(2778);
  }

  public void set(quickfix.field.MatchExceptionToleranceValueType value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionToleranceValueType get(quickfix.field.MatchExceptionToleranceValueType value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionToleranceValueType getMatchExceptionToleranceValueType() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionToleranceValueType());
  }

  public boolean isSet(quickfix.field.MatchExceptionToleranceValueType field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionToleranceValueType() {
    return isSetField(2779);
  }

  public void set(quickfix.field.MatchExceptionText value) {
    setField(value);
  }

  public quickfix.field.MatchExceptionText get(quickfix.field.MatchExceptionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.MatchExceptionText getMatchExceptionText() throws FieldNotFound {
    return get(new quickfix.field.MatchExceptionText());
  }

  public boolean isSet(quickfix.field.MatchExceptionText field) {
    return isSetField(field);
  }

  public boolean isSetMatchExceptionText() {
    return isSetField(2780);
  }

  public void set(quickfix.field.EncodedMatchExceptionTextLen value) {
    setField(value);
  }

  public quickfix.field.EncodedMatchExceptionTextLen get(quickfix.field.EncodedMatchExceptionTextLen value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMatchExceptionTextLen getEncodedMatchExceptionTextLen() throws FieldNotFound {
    return get(new quickfix.field.EncodedMatchExceptionTextLen());
  }

  public boolean isSet(quickfix.field.EncodedMatchExceptionTextLen field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMatchExceptionTextLen() {
    return isSetField(2797);
  }

  public void set(quickfix.field.EncodedMatchExecptionText value) {
    setField(value);
  }

  public quickfix.field.EncodedMatchExecptionText get(quickfix.field.EncodedMatchExecptionText value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.EncodedMatchExecptionText getEncodedMatchExecptionText() throws FieldNotFound {
    return get(new quickfix.field.EncodedMatchExecptionText());
  }

  public boolean isSet(quickfix.field.EncodedMatchExecptionText field) {
    return isSetField(field);
  }

  public boolean isSetEncodedMatchExecptionText() {
    return isSetField(2798);
  }
}
