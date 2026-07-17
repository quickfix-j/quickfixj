/* Generated Java Source File */
package quickfix.fixlatest.component;
import quickfix.FieldNotFound;
import quickfix.Group;

public class UsernameGrp extends quickfix.MessageComponent {
  static final long serialVersionUID = 552892318L;

  public static final String MSGTYPE = "";
  private int[] componentFields = {};
  protected int[] getFields() { return componentFields; }
  private int[] componentGroups = {809, };
  protected int[] getGroupFields() { return componentGroups; }

  public UsernameGrp() {
    super();
  }

  public void set(quickfix.field.NoUsernames value) {
    setField(value);
  }

  public quickfix.field.NoUsernames get(quickfix.field.NoUsernames value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.NoUsernames getNoUsernames() throws FieldNotFound {
    return get(new quickfix.field.NoUsernames());
  }

  public boolean isSet(quickfix.field.NoUsernames field) {
    return isSetField(field);
  }

  public boolean isSetNoUsernames() {
    return isSetField(809);
  }

public static class NoUsernames extends Group {
  static final long serialVersionUID = 552892318L;
  private static final int[]  ORDER = {553, 0};

  public NoUsernames() {
    super(809, 553, ORDER);
  }

  public void set(quickfix.field.Username value) {
    setField(value);
  }

  public quickfix.field.Username get(quickfix.field.Username value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Username getUsername() throws FieldNotFound {
    return get(new quickfix.field.Username());
  }

  public boolean isSet(quickfix.field.Username field) {
    return isSetField(field);
  }

  public boolean isSetUsername() {
    return isSetField(553);
  }
}

  public void set(quickfix.field.Username value) {
    setField(value);
  }

  public quickfix.field.Username get(quickfix.field.Username value) throws FieldNotFound {
    getField(value);
    return value;
  }

  public quickfix.field.Username getUsername() throws FieldNotFound {
    return get(new quickfix.field.Username());
  }

  public boolean isSet(quickfix.field.Username field) {
    return isSetField(field);
  }

  public boolean isSetUsername() {
    return isSetField(553);
  }
}
