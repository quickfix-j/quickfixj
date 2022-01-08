package quickfix;

import org.junit.Test;
import quickfix.field.AgreementCurrency;
import quickfix.field.Product;
import quickfix.field.SecurityType;
import quickfix.field.Symbol;
import quickfix.fixlatest.QuoteRequest;
import quickfix.fixlatest.component.FinancingDetails;
import quickfix.fixlatest.component.Instrument;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class MessageComponentTestFixLatest {

    @Test
    public void shouldCopyCustomTagsToComponent() throws FieldNotFound {
        Instrument instrument1 = new Instrument();
        instrument1.set(new Symbol("EURUSD"));
        instrument1.set(new Product(Product.CURRENCY));
        instrument1.set(new SecurityType(SecurityType.FOREIGN_EXCHANGE_CONTRACT));
        instrument1.setString(12345, "ABC");
        instrument1.setInt(54321, 0xCAFE);

        assertEquals("EURUSD", instrument1.getSymbol().getValue());
        assertEquals(Product.CURRENCY, instrument1.getProduct().getValue());
        assertEquals(SecurityType.FOREIGN_EXCHANGE_CONTRACT, instrument1.getSecurityType().getValue());
        assertEquals("ABC", instrument1.getString(12345));
        assertEquals(0xCAFE, instrument1.getInt(54321));

        Instrument instrument2 = new Instrument();
        instrument1.copyTo(instrument2);

        assertEquals("EURUSD", instrument2.getSymbol().getValue());
        assertEquals(Product.CURRENCY, instrument2.getProduct().getValue());
        assertEquals(SecurityType.FOREIGN_EXCHANGE_CONTRACT, instrument2.getSecurityType().getValue());

        assertEquals("ABC", instrument2.getString(12345));
        assertEquals(0xCAFE, instrument2.getInt(54321));
    }

    @Test
    public void shouldNotCopyCustomTagsFromComponent() throws FieldNotFound {
        Instrument instrument1 = new Instrument();
        instrument1.set(new Symbol("EURUSD"));
        instrument1.set(new Product(Product.CURRENCY));
        instrument1.set(new SecurityType(SecurityType.FOREIGN_EXCHANGE_CONTRACT));
        instrument1.setString(12345, "ABC");
        instrument1.setInt(54321, 0xCAFE);

        assertEquals("EURUSD", instrument1.getSymbol().getValue());
        assertEquals(Product.CURRENCY, instrument1.getProduct().getValue());
        assertEquals(SecurityType.FOREIGN_EXCHANGE_CONTRACT, instrument1.getSecurityType().getValue());
        assertEquals("ABC", instrument1.getString(12345));
        assertEquals(0xCAFE, instrument1.getInt(54321));

        Instrument instrument2 = new Instrument();
        instrument2.copyFrom(instrument1);

        assertEquals("EURUSD", instrument2.getSymbol().getValue());
        assertEquals(Product.CURRENCY, instrument2.getProduct().getValue());
        assertEquals(SecurityType.FOREIGN_EXCHANGE_CONTRACT, instrument2.getSecurityType().getValue());

        assertFalse(instrument2.isSetField(12345));
        assertFalse(instrument2.isSetField(54321));
    }

    @Test
    public void shouldSetComponentWithCustomTags() throws FieldNotFound {
        Instrument instrument = new Instrument();
        instrument.set(new Symbol("EURUSD"));
        instrument.set(new Product(Product.CURRENCY));
        instrument.set(new SecurityType(SecurityType.FOREIGN_EXCHANGE_CONTRACT));
        instrument.setString(12345, "ABC");
        instrument.setInt(54321, 0xCAFE);

        FinancingDetails financingDetails = new FinancingDetails();
        financingDetails.set(new AgreementCurrency("USD"));
        financingDetails.setString(111222, "DEF");

        QuoteRequest.NoRelatedSym noRelatedSym = new QuoteRequest.NoRelatedSym();
        noRelatedSym.set(instrument);
        noRelatedSym.set(financingDetails);

        assertEquals("EURUSD", noRelatedSym.getSymbol().getValue());
        assertEquals(Product.CURRENCY, noRelatedSym.getProduct().getValue());
        assertEquals(SecurityType.FOREIGN_EXCHANGE_CONTRACT, noRelatedSym.getSecurityType().getValue());
        assertEquals("ABC", noRelatedSym.getString(12345));
        assertEquals(0xCAFE, noRelatedSym.getInt(54321));

        assertEquals("USD", noRelatedSym.getFinancingDetailsComponent().getAgreementCurrency().getValue());
        assertEquals("DEF", noRelatedSym.getString(111222));
    }

    @Test
    public void shouldOverrideCustomComponentTags() throws FieldNotFound {
        Instrument instrument = new Instrument();
        instrument.set(new Symbol("EURUSD"));
        instrument.set(new Product(Product.CURRENCY));
        instrument.set(new SecurityType(SecurityType.FOREIGN_EXCHANGE_CONTRACT));
        instrument.setString(12345, "ABC");
        instrument.setInt(54321, 0xCAFE);

        FinancingDetails financingDetails = new FinancingDetails();
        financingDetails.set(new AgreementCurrency("USD"));
        financingDetails.setString(111222, "DEF");

        QuoteRequest.NoRelatedSym noRelatedSym = new QuoteRequest.NoRelatedSym();
        noRelatedSym.set(instrument);
        noRelatedSym.set(financingDetails);

        instrument.set(new Symbol("USDCAD"));
        instrument.setString(12345, "XYZ");
        noRelatedSym.set(instrument);

        financingDetails.set(new AgreementCurrency("CAD"));
        financingDetails.setString(111222, "GHI");
        financingDetails.setInt(54321, 0xBABE);
        noRelatedSym.set(financingDetails);

        assertEquals("USDCAD", noRelatedSym.getSymbol().getValue());
        assertEquals(Product.CURRENCY, noRelatedSym.getProduct().getValue());
        assertEquals(SecurityType.FOREIGN_EXCHANGE_CONTRACT, noRelatedSym.getSecurityType().getValue());
        assertEquals("XYZ", noRelatedSym.getString(12345));
        assertEquals(0xBABE, noRelatedSym.getInt(54321));

        assertEquals("CAD", noRelatedSym.getFinancingDetailsComponent().getAgreementCurrency().getValue());
        assertEquals("GHI", noRelatedSym.getString(111222));
    }

    @Test
    public void shouldNotGetComponentWithCustomTags() throws FieldNotFound {
        Instrument instrument = new Instrument();
        instrument.set(new Symbol("EURUSD"));
        instrument.set(new Product(Product.CURRENCY));
        instrument.set(new SecurityType(SecurityType.FOREIGN_EXCHANGE_CONTRACT));
        instrument.setString(12345, "ABC");
        instrument.setInt(54321, 0xCAFE);

        FinancingDetails financingDetails = new FinancingDetails();
        financingDetails.set(new AgreementCurrency("USD"));
        financingDetails.setString(111222, "DEF");

        QuoteRequest.NoRelatedSym noRelatedSym = new QuoteRequest.NoRelatedSym();
        noRelatedSym.set(instrument);
        noRelatedSym.set(financingDetails);

        instrument = noRelatedSym.getInstrumentComponent();

        assertEquals("EURUSD", instrument.getSymbol().getValue());
        assertEquals(Product.CURRENCY, instrument.getProduct().getValue());
        assertEquals(SecurityType.FOREIGN_EXCHANGE_CONTRACT, instrument.getSecurityType().getValue());
        assertFalse(instrument.isSetField(12345));
        assertFalse(instrument.isSetField(54321));

        financingDetails = noRelatedSym.getFinancingDetailsComponent();

        assertEquals("USD", financingDetails.getAgreementCurrency().getValue());
        assertFalse(instrument.isSetField(111222));
    }
}
