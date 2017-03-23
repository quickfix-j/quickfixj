package quickfix;


import quickfix.field.ApplVerID;

/**
 * Editable dictionary provider used by the DefaultSessionFactory
 */
public interface EditableDataDictionaryProvider extends DataDictionaryProvider {
    void addTransportDictionary(String beginString, DataDictionary dataDictionary);

    void addApplicationDictionary(ApplVerID applVerID, DataDictionary dd);
}
