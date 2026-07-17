/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class OwnershipType extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 517;

  public static final char JOINT_INVESTORS = 'J';

  public static final char TENANTS_IN_COMMON = 'T';

  public static final char JOINT_TRUSTEES = '2';

  public OwnershipType() {
    super(517);
  }

  public OwnershipType(Character data) {
    super(517, data);
  }

  public OwnershipType(char data) {
    super(517, data);
  }
}
