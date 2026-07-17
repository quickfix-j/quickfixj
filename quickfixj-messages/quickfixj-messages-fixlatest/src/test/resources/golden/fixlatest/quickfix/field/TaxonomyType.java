/* Generated Java Source File */
package quickfix.field;
import quickfix.CharField;

public class TaxonomyType extends CharField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 2375;

  public static final char ISINOR_ALT_INSTRMT_ID = 'I';

  public static final char INTERIM_TAXONOMY = 'E';

  public TaxonomyType() {
    super(2375);
  }

  public TaxonomyType(Character data) {
    super(2375, data);
  }

  public TaxonomyType(char data) {
    super(2375, data);
  }
}
