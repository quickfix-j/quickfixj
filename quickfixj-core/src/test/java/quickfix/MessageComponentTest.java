package quickfix;

import org.junit.Assert;
import org.junit.Test;
import quickfix.field.SecurityAltID;
import quickfix.field.Side;
import quickfix.field.Symbol;
import quickfix.fix44.QuoteRequest;
import quickfix.fix44.QuoteRequest.NoRelatedSym;
import quickfix.fix44.component.Instrument;

import java.security.Security;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MessageComponentTest {

    @Test
    public void shouldNotCopyToCustomComponentFieldsAndGroupsWhenFlagsAreDisabled() throws FieldNotFound {
        Instrument srcInstrument = createInstrumentComponent();
        Instrument dstInstrument = new Instrument();
        srcInstrument.copyTo(dstInstrument, false, false);

        assertEquals("EUR/USD", dstInstrument.getSymbol().getValue());
        assertEquals(false, dstInstrument.isSetField(10_000));
        assertEquals(false, dstInstrument.isSetField(10_001));

        assertEquals(1, dstInstrument.getGroups(454).size());
        assertEquals("security-id", dstInstrument.getGroups(454).get(0).getString(455));
        assertEquals("ccc", dstInstrument.getGroups(454).get(0).getString(20_000));
        assertEquals("ddd", dstInstrument.getGroups(454).get(0).getString(20_001));

        assertEquals(0, dstInstrument.getGroups(30_000).size());

        assertEquals(0, dstInstrument.getGroups(40_000).size());
    }

    @Test
    public void shouldNotCopyFromCustomComponentFieldsAndGroupsWhenFlagsAreDisabled() throws FieldNotFound {
        Instrument srcInstrument = createInstrumentComponent();
        Instrument dstInstrument = new Instrument();
        dstInstrument.copyFrom(srcInstrument, false, false);

        assertEquals("EUR/USD", dstInstrument.getSymbol().getValue());
        assertEquals(false, dstInstrument.isSetField(10_000));
        assertEquals(false, dstInstrument.isSetField(10_001));

        assertEquals(1, dstInstrument.getGroups(454).size());
        assertEquals("security-id", dstInstrument.getGroups(454).get(0).getString(455));
        assertEquals("ccc", dstInstrument.getGroups(454).get(0).getString(20_000));
        assertEquals("ddd", dstInstrument.getGroups(454).get(0).getString(20_001));

        assertEquals(0, dstInstrument.getGroups(30_000).size());

        assertEquals(0, dstInstrument.getGroups(40_000).size());
    }

    @Test
    public void shouldCopyToAllComponentFieldsAndGroupsWhenUsingDefaultMethod() throws FieldNotFound {
        Instrument srcInstrument = createInstrumentComponent();
        Instrument dstInstrument = new Instrument();
        srcInstrument.copyTo(dstInstrument);

        assertEquals("EUR/USD", dstInstrument.getSymbol().getValue());
        assertEquals("aaa", dstInstrument.getString(10_000));
        assertEquals("bbb", dstInstrument.getString(10_001));

        assertEquals(1, dstInstrument.getGroups(454).size());
        assertEquals("security-id", dstInstrument.getGroups(454).get(0).getString(455));
        assertEquals("ccc", dstInstrument.getGroups(454).get(0).getString(20_000));
        assertEquals("ddd", dstInstrument.getGroups(454).get(0).getString(20_001));

        assertEquals(1, dstInstrument.getGroups(30_000).size());
        assertEquals("eee", dstInstrument.getGroups(30_000).get(0).getString(30_001));
        assertEquals("fff", dstInstrument.getGroups(30_000).get(0).getString(30_002));
        assertEquals("ggg", dstInstrument.getGroups(30_000).get(0).getString(30_003));

        assertEquals(1, dstInstrument.getGroups(40_000).size());
        assertEquals("hhh", dstInstrument.getGroups(40_000).get(0).getString(40_001));
        assertEquals("iii", dstInstrument.getGroups(40_000).get(0).getString(40_002));
        assertEquals("jjj", dstInstrument.getGroups(40_000).get(0).getString(40_003));
    }

    @Test
    public void shouldCopyFromAllComponentFieldsAndGroupsWhenUsingDefaultMethod() throws FieldNotFound {
        Instrument srcInstrument = createInstrumentComponent();
        Instrument dstInstrument = new Instrument();
        dstInstrument.copyFrom(srcInstrument);

        assertEquals("EUR/USD", dstInstrument.getSymbol().getValue());
        assertEquals("aaa", dstInstrument.getString(10_000));
        assertEquals("bbb", dstInstrument.getString(10_001));

        assertEquals(1, dstInstrument.getGroups(454).size());
        assertEquals("security-id", dstInstrument.getGroups(454).get(0).getString(455));
        assertEquals("ccc", dstInstrument.getGroups(454).get(0).getString(20_000));
        assertEquals("ddd", dstInstrument.getGroups(454).get(0).getString(20_001));

        assertEquals(1, dstInstrument.getGroups(30_000).size());
        assertEquals("eee", dstInstrument.getGroups(30_000).get(0).getString(30_001));
        assertEquals("fff", dstInstrument.getGroups(30_000).get(0).getString(30_002));
        assertEquals("ggg", dstInstrument.getGroups(30_000).get(0).getString(30_003));

        assertEquals(1, dstInstrument.getGroups(40_000).size());
        assertEquals("hhh", dstInstrument.getGroups(40_000).get(0).getString(40_001));
        assertEquals("iii", dstInstrument.getGroups(40_000).get(0).getString(40_002));
        assertEquals("jjj", dstInstrument.getGroups(40_000).get(0).getString(40_003));
    }

    @Test
    public void shouldCopyToSelectedComponentFieldsAndGroupsWhenCriteriaSpecified() throws FieldNotFound {
        Instrument srcInstrument = createInstrumentComponent();
        Instrument dstInstrument = new Instrument();
        srcInstrument.copyTo(dstInstrument, new int[]{55, 10_001}, new int[]{40_000});

        assertEquals("EUR/USD", dstInstrument.getSymbol().getValue());
        assertEquals(false, dstInstrument.isSetField(10_000));
        assertEquals("bbb", dstInstrument.getString(10_001));

        assertEquals(0, dstInstrument.getGroups(454).size());

        assertEquals(0, dstInstrument.getGroups(30_000).size());

        assertEquals(1, dstInstrument.getGroups(40_000).size());
        assertEquals("hhh", dstInstrument.getGroups(40_000).get(0).getString(40_001));
        assertEquals("iii", dstInstrument.getGroups(40_000).get(0).getString(40_002));
        assertEquals("jjj", dstInstrument.getGroups(40_000).get(0).getString(40_003));
    }

    @Test
    public void shouldCopyFromSelectedComponentFieldsAndGroupsWhenCriteriaSpecified() throws FieldNotFound {
        Instrument srcInstrument = createInstrumentComponent();
        Instrument dstInstrument = new Instrument();
        dstInstrument.copyFrom(srcInstrument, new int[]{55, 10_001}, new int[]{40_000});

        assertEquals("EUR/USD", dstInstrument.getSymbol().getValue());
        assertEquals(false, dstInstrument.isSetField(10_000));
        assertEquals("bbb", dstInstrument.getString(10_001));

        assertEquals(0, dstInstrument.getGroups(454).size());

        assertEquals(0, dstInstrument.getGroups(30_000).size());

        assertEquals(1, dstInstrument.getGroups(40_000).size());
        assertEquals("hhh", dstInstrument.getGroups(40_000).get(0).getString(40_001));
        assertEquals("iii", dstInstrument.getGroups(40_000).get(0).getString(40_002));
        assertEquals("jjj", dstInstrument.getGroups(40_000).get(0).getString(40_003));
    }

    @Test
    public void shouldGetAndSetAllComponentFieldsAndGroupsWhenUsingDefaultMethod() throws FieldNotFound {
        NoRelatedSym noRelatedSym = new NoRelatedSym();
        noRelatedSym.set(createInstrumentComponent());
        Instrument instrument = noRelatedSym.getInstrument();

        assertEquals("EUR/USD", instrument.getSymbol().getValue());
        assertEquals("aaa", instrument.getString(10_000));
        assertEquals("bbb", instrument.getString(10_001));

        assertEquals(1, instrument.getGroups(454).size());
        assertEquals("security-id", instrument.getGroups(454).get(0).getString(455));
        assertEquals("ccc", instrument.getGroups(454).get(0).getString(20_000));
        assertEquals("ddd", instrument.getGroups(454).get(0).getString(20_001));

        assertEquals(1, instrument.getGroups(30_000).size());
        assertEquals("eee", instrument.getGroups(30_000).get(0).getString(30_001));
        assertEquals("fff", instrument.getGroups(30_000).get(0).getString(30_002));
        assertEquals("ggg", instrument.getGroups(30_000).get(0).getString(30_003));

        assertEquals(1, instrument.getGroups(40_000).size());
        assertEquals("hhh", instrument.getGroups(40_000).get(0).getString(40_001));
        assertEquals("iii", instrument.getGroups(40_000).get(0).getString(40_002));
        assertEquals("jjj", instrument.getGroups(40_000).get(0).getString(40_003));
    }

    @Test
    public void shouldGetAndSetSelectedComponentFieldsAndGroupsWhenCriteriaSpecified() throws FieldNotFound {
        NoRelatedSym noRelatedSym = new NoRelatedSym();
        noRelatedSym.set(createInstrumentComponent(), new int[]{55, 10_001}, new int[]{40_000});
        Instrument instrument = noRelatedSym.getInstrument(new int[]{55, 10_001}, new int[]{40_000});

        assertEquals("EUR/USD", instrument.getSymbol().getValue());
        assertEquals(false, instrument.isSetField(10_000));
        assertEquals("bbb", instrument.getString(10_001));

        assertEquals(0, instrument.getGroups(454).size());

        assertEquals(0, instrument.getGroups(30_000).size());

        assertEquals(1, instrument.getGroups(40_000).size());
        assertEquals("hhh", instrument.getGroups(40_000).get(0).getString(40_001));
        assertEquals("iii", instrument.getGroups(40_000).get(0).getString(40_002));
        assertEquals("jjj", instrument.getGroups(40_000).get(0).getString(40_003));
    }

    @Test
    public void shouldNotGetAndSetAllComponentFieldsAndGroupsWhenFlagsAreDisabled() throws FieldNotFound {
        NoRelatedSym noRelatedSym = new NoRelatedSym();
        noRelatedSym.set(createInstrumentComponent(), false, false);
        Instrument instrument = noRelatedSym.getInstrument(false, false);

        assertEquals("EUR/USD", instrument.getSymbol().getValue());
        assertEquals(false, instrument.isSetField(10_000));
        assertEquals(false, instrument.isSetField(10_001));

        assertEquals(1, instrument.getGroups(454).size());
        assertEquals("security-id", instrument.getGroups(454).get(0).getString(455));
        assertEquals("ccc", instrument.getGroups(454).get(0).getString(20_000));
        assertEquals("ddd", instrument.getGroups(454).get(0).getString(20_001));

        assertEquals(0, instrument.getGroups(30_000).size());

        assertEquals(0, instrument.getGroups(40_000).size());
    }

    private Instrument createInstrumentComponent() {
        Instrument.NoSecurityAltID noSecurityAltIDGroup = new Instrument.NoSecurityAltID();
        noSecurityAltIDGroup.set(new SecurityAltID("security-id"));
        noSecurityAltIDGroup.setString(20_000, "ccc");
        noSecurityAltIDGroup.setString(20_001, "ddd");

        Group customGroup1 = new Group(30_000, 30_001, new int[]{30_001, 30_002});
        customGroup1.setString(30_001, "eee");
        customGroup1.setString(30_002, "fff");
        customGroup1.setString(30_003, "ggg");

        Group customGroup2 = new Group(40_000, 40_001, new int[]{40_001, 40_002});
        customGroup2.setString(40_001, "hhh");
        customGroup2.setString(40_002, "iii");
        customGroup2.setString(40_003, "jjj");

        Instrument instrument = new Instrument();
        instrument.set(new Symbol("EUR/USD"));
        instrument.setString(10_000, "aaa");
        instrument.setString(10_001, "bbb");
        instrument.addGroup(noSecurityAltIDGroup);
        instrument.addGroup(customGroup1);
        instrument.addGroup(customGroup2);

        QuoteRequest.NoRelatedSym noRelatedSymGroup = new QuoteRequest.NoRelatedSym();
        noRelatedSymGroup.set(instrument);

        QuoteRequest quoteRequest = new QuoteRequest();
        quoteRequest.addGroup(noRelatedSymGroup);

        return instrument;
    }

}
