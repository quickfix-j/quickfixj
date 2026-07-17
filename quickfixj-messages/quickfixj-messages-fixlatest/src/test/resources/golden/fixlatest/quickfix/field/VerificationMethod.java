/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class VerificationMethod extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1931;

  public static final int NON_ELECTRONIC = 0;

  public static final int ELECTRONIC = 1;

  public VerificationMethod() {
    super(1931);
  }

  public VerificationMethod(Integer data) {
    super(1931, data);
  }

  public VerificationMethod(int data) {
    super(1931, data);
  }
}
