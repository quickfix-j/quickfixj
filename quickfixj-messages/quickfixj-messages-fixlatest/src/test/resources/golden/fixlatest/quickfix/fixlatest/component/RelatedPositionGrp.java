/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class RelatedPositionGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {1861, };
  protected int[] getGroupFields() { return componentGroups; }

  public RelatedPositionGrp() {
    super();
  }

  public void set(quickfix.field.NoRelatedPositions value) {
    setField(value);
  }

  public quickfix.field.NoRelatedPositions get(quickfix.field.NoRelatedPositions value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoRelatedPositions getNoRelatedPositions() throws FieldNotFound {
    return get(new quickfix.field.NoRelatedPositions());
  }

  public boolean isSet(quickfix.field.NoRelatedPositions field) {
    return isSetField(field);
  }

  public boolean isSetNoRelatedPositions() {
    return isSetField(1861);
  }

public static class NoRelatedPositions extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {1862, 1863, 1864, 0};

  public NoRelatedPositions() {
    super(1861, 1862, ORDER);
  }

  public void set(quickfix.field.RelatedPositionID value) {
    setField(value);
  }

  public quickfix.field.RelatedPositionID get(quickfix.field.RelatedPositionID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPositionID getRelatedPositionID() throws FieldNotFound {
    return get(new quickfix.field.RelatedPositionID());
  }

  public boolean isSet(quickfix.field.RelatedPositionID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPositionID() {
    return isSetField(1862);
  }

  public void set(quickfix.field.RelatedPositionIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedPositionIDSource get(quickfix.field.RelatedPositionIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPositionIDSource getRelatedPositionIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedPositionIDSource());
  }

  public boolean isSet(quickfix.field.RelatedPositionIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPositionIDSource() {
    return isSetField(1863);
  }

  public void set(quickfix.field.RelatedPositionDate value) {
    setField(value);
  }

  public quickfix.field.RelatedPositionDate get(quickfix.field.RelatedPositionDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPositionDate getRelatedPositionDate() throws FieldNotFound {
    return get(new quickfix.field.RelatedPositionDate());
  }

  public boolean isSet(quickfix.field.RelatedPositionDate field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPositionDate() {
    return isSetField(1864);
  }
}

  public void set(quickfix.field.RelatedPositionID value) {
    setField(value);
  }

  public quickfix.field.RelatedPositionID get(quickfix.field.RelatedPositionID value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPositionID getRelatedPositionID() throws FieldNotFound {
    return get(new quickfix.field.RelatedPositionID());
  }

  public boolean isSet(quickfix.field.RelatedPositionID field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPositionID() {
    return isSetField(1862);
  }

  public void set(quickfix.field.RelatedPositionIDSource value) {
    setField(value);
  }

  public quickfix.field.RelatedPositionIDSource get(quickfix.field.RelatedPositionIDSource value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPositionIDSource getRelatedPositionIDSource() throws FieldNotFound {
    return get(new quickfix.field.RelatedPositionIDSource());
  }

  public boolean isSet(quickfix.field.RelatedPositionIDSource field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPositionIDSource() {
    return isSetField(1863);
  }

  public void set(quickfix.field.RelatedPositionDate value) {
    setField(value);
  }

  public quickfix.field.RelatedPositionDate get(quickfix.field.RelatedPositionDate value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.RelatedPositionDate getRelatedPositionDate() throws FieldNotFound {
    return get(new quickfix.field.RelatedPositionDate());
  }

  public boolean isSet(quickfix.field.RelatedPositionDate field) {
    return isSetField(field);
  }

  public boolean isSetRelatedPositionDate() {
    return isSetField(1864);
  }
}
