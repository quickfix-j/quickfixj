package quickfix;

public class DefaultDataDictionaryProviderHolder {
    public DefaultDataDictionaryProvider obtain() {
        return new DefaultDataDictionaryProvider();
    }
}
