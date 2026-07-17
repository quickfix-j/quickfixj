/* Generated Java Source File */
package quickfix.field;
import quickfix.IntField;

public class PartyRelationship extends IntField {
  static final long serialVersionUID = 552892318L;

  public static final int FIELD = 1515;

  public static final int IS_ALSO = 0;

  public static final int CLEARS_FOR = 1;

  public static final int CLEARS_THROUGH = 2;

  public static final int TRADES_FOR = 3;

  public static final int TRADES_THROUGH = 4;

  public static final int SPONSORS = 5;

  public static final int SPONSORED_THROUGH = 6;

  public static final int PROVIDES_GUARANTEE_FOR = 7;

  public static final int IS_GUARANTEED_BY = 8;

  public static final int MEMBER_OF = 9;

  public static final int HAS_MEMBERS = 10;

  public static final int PROVIDES_MARKETPLACE_FOR = 11;

  public static final int PARTICIPANT_OF_MARKETPLACE = 12;

  public static final int CARRIES_POSITIONS_FOR = 13;

  public static final int POSTS_TRADES_TO = 14;

  public static final int ENTERS_TRADES_FOR = 15;

  public static final int ENTERS_TRADES_THROUGH = 16;

  public static final int PROVIDES_QUOTES_TO = 17;

  public static final int REQUESTS_QUOTES_FROM = 18;

  public static final int INVESTS_FOR = 19;

  public static final int INVESTS_THROUGH = 20;

  public static final int BROKERS_TRADES_FOR = 21;

  public static final int BROKERS_TRADES_THROUGH = 22;

  public static final int PROVIDES_TRADING_SERVICES_FOR = 23;

  public static final int USES_TRADING_SERVICES_OF = 24;

  public static final int APPROVES_OF = 25;

  public static final int APPROVED_BY = 26;

  public static final int PARENT_FIRM_FOR = 27;

  public static final int SUBSIDIARY_OF = 28;

  public static final int REGULATORY_OWNER_OF = 29;

  public static final int OWNED_BY_REGULATORY = 30;

  public static final int CONTROLS = 31;

  public static final int IS_CONTROLLED_BY = 32;

  public static final int LEGAL_OWNER_OF = 33;

  public static final int OWNED_BY_LEGAL = 34;

  public static final int BENEFICIAL_OWNER_OF = 35;

  public static final int OWNED_BY_BENEFICIAL = 36;

  public static final int SETTLES_FOR = 37;

  public static final int SETTLES_THROUGH = 38;

  public PartyRelationship() {
    super(1515);
  }

  public PartyRelationship(Integer data) {
    super(1515, data);
  }

  public PartyRelationship(int data) {
    super(1515, data);
  }
}
