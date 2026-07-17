/* Generated Java Source File */
package quickfix.field;
import quickfix.BooleanField;

public class AggregatedBook extends BooleanField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 266;

  public static final boolean BOOK_ENTRIES_TO_BE_AGGREGATED = true;

  public static final boolean BOOK_ENTRIES_SHOULD_NOT_BE_AGGREGATED = false;

  public AggregatedBook() {
    super(266);
  }

  public AggregatedBook(Boolean data) {
    super(266, data);
  }

  public AggregatedBook(boolean data) {
    super(266, data);
  }
}
