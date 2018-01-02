package quickfix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidationSettingsTest {
    @Test
    public void copyConstructor_retains_false_settings() {
        final ValidationSettings validationSettings = new ValidationSettings();

        validationSettings.setAllowUnknownMessageFields(false);
        validationSettings.setCheckFieldsHaveValues(false);
        validationSettings.setCheckFieldsOutOfOrder(false);
        validationSettings.setCheckUnorderedGroupFields(false);
        validationSettings.setCheckUserDefinedFields(false);
        validationSettings.setOnlyAllowSeenOrKnownFieldsInLastGroup(false);

        ValidationSettings validationSettingsCopy = new ValidationSettings(validationSettings);

        assertEquals(validationSettingsCopy.isAllowUnknownMessageFields(), validationSettings.isAllowUnknownMessageFields());
        assertEquals(validationSettingsCopy.isCheckFieldsHaveValues(), validationSettings.isCheckFieldsHaveValues());
        assertEquals(validationSettingsCopy.isCheckFieldsOutOfOrder(), validationSettings.isCheckFieldsOutOfOrder());
        assertEquals(validationSettingsCopy.isCheckUnorderedGroupFields(), validationSettings.isCheckUnorderedGroupFields());
        assertEquals(validationSettingsCopy.isCheckUserDefinedFields(), validationSettings.isCheckUserDefinedFields());
        assertEquals(validationSettingsCopy.isUseFirstTagAsGroupDelimiter(), validationSettings.isUseFirstTagAsGroupDelimiter());
        assertEquals(validationSettingsCopy.isOnlyAllowSeenOrKnownFieldsInLastGroup(), validationSettings.isOnlyAllowSeenOrKnownFieldsInLastGroup());
    }
    @Test
    public void copyConstructor_retains_true_settings() {
        final ValidationSettings validationSettings = new ValidationSettings();

        validationSettings.setAllowUnknownMessageFields(true);
        validationSettings.setCheckFieldsHaveValues(true);
        validationSettings.setCheckFieldsOutOfOrder(true);
        validationSettings.setCheckUnorderedGroupFields(true);
        validationSettings.setCheckUserDefinedFields(true);
        validationSettings.setUseFirstTagAsGroupDelimiter(true);
        validationSettings.setOnlyAllowSeenOrKnownFieldsInLastGroup(true);

        ValidationSettings validationSettingsCopy = new ValidationSettings(validationSettings);

        assertEquals(validationSettingsCopy.isAllowUnknownMessageFields(), validationSettings.isAllowUnknownMessageFields());
        assertEquals(validationSettingsCopy.isCheckFieldsHaveValues(), validationSettings.isCheckFieldsHaveValues());
        assertEquals(validationSettingsCopy.isCheckFieldsOutOfOrder(), validationSettings.isCheckFieldsOutOfOrder());
        assertEquals(validationSettingsCopy.isCheckUnorderedGroupFields(), validationSettings.isCheckUnorderedGroupFields());
        assertEquals(validationSettingsCopy.isCheckUserDefinedFields(), validationSettings.isCheckUserDefinedFields());
        assertEquals(validationSettingsCopy.isUseFirstTagAsGroupDelimiter(), validationSettings.isUseFirstTagAsGroupDelimiter());
        assertEquals(validationSettingsCopy.isOnlyAllowSeenOrKnownFieldsInLastGroup(), validationSettings.isOnlyAllowSeenOrKnownFieldsInLastGroup());
    }
}
