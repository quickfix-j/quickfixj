package quickfix.mina;

import quickfix.ConfigError;
import quickfix.DataDictionary;
import quickfix.DataDictionaryProvider;
import quickfix.field.ApplVerID;

public class TestDataDictionaryProvider implements DataDictionaryProvider {
    @Override
    public DataDictionary getSessionDataDictionary(String beginString) {
        try {
            return new DataDictionary("FIX42.xml", true);
        } catch (ConfigError configError) {
            throw new RuntimeException(configError);
        }
    }

    @Override
    public DataDictionary getApplicationDataDictionary(ApplVerID applVerID) {
        try {
            return new DataDictionary("FIX42.xml", true);
        } catch (ConfigError configError) {
            throw new RuntimeException(configError);
        }
    }
}
