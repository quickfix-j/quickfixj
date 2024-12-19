package quickfix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidationSettingsTest {
    @Test
    public void copyConstructor_retains_settings() {
        final ValidationSettings validationSettings = new ValidationSettings();

        validationSettings.setAllowUnknownMessageFields(true);
        validationSettings.setCheckFieldsHaveValues(false);
        validationSettings.setCheckFieldsOutOfOrder(false);
        validationSettings.setCheckUnorderedGroupFields(false);
        validationSettings.setCheckUserDefinedFields(false);
        validationSettings.setFirstFieldInGroupIsDelimiter(true);

        ValidationSettings validationSettingsCopy = new ValidationSettings(validationSettings);

        assertEquals(validationSettingsCopy.isAllowUnknownMessageFields(), validationSettings.isAllowUnknownMessageFields());
        assertEquals(validationSettingsCopy.isCheckFieldsHaveValues(), validationSettings.isCheckFieldsHaveValues());
        assertEquals(validationSettingsCopy.isCheckFieldsOutOfOrder(), validationSettings.isCheckFieldsOutOfOrder());
        assertEquals(validationSettingsCopy.isCheckUnorderedGroupFields(), validationSettings.isCheckUnorderedGroupFields());
        assertEquals(validationSettingsCopy.isCheckUserDefinedFields(), validationSettings.isCheckUserDefinedFields());
        assertEquals(validationSettingsCopy.isFirstFieldInGroupIsDelimiter(), validationSettings.isFirstFieldInGroupIsDelimiter());
    }
}
