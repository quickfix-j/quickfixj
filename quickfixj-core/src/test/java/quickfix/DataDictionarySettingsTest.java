package quickfix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataDictionarySettingsTest {
    @Test
    public void copy() {
        final DataDictionarySettings dataDictionarySettings = new DataDictionarySettings();

        dataDictionarySettings.setAllowUnknownMessageFields(true);
        dataDictionarySettings.setCheckFieldsHaveValues(false);
        dataDictionarySettings.setCheckFieldsOutOfOrder(false);
        dataDictionarySettings.setCheckUnorderedGroupFields(false);
        dataDictionarySettings.setCheckUserDefinedFields(false);

        DataDictionarySettings dataDictionarySettingsCopy = new DataDictionarySettings(dataDictionarySettings);

        assertEquals(dataDictionarySettingsCopy.isAllowUnknownMessageFields(),dataDictionarySettings.isAllowUnknownMessageFields());
        assertEquals(dataDictionarySettingsCopy.isCheckFieldsHaveValues(),dataDictionarySettings.isCheckFieldsHaveValues());
        assertEquals(dataDictionarySettingsCopy.isCheckFieldsOutOfOrder(),dataDictionarySettings.isCheckFieldsOutOfOrder());
        assertEquals(dataDictionarySettingsCopy.isCheckUnorderedGroupFields(),dataDictionarySettings.isCheckUnorderedGroupFields());
        assertEquals(dataDictionarySettingsCopy.isCheckUserDefinedFields(),dataDictionarySettings.isCheckUserDefinedFields());
    }
}
