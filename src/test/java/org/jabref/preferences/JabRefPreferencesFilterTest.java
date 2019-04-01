package org.jabref.preferences;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JabRefPreferencesFilterTest {

    @Test
    public void givenJabRefPreferences_whenCreatingJabRefPreferencesFilter_thenCreated() {
        JabRefPreferences prefs = JabRefPreferences.getInstance();
        JabRefPreferencesFilter sut = new JabRefPreferencesFilter(prefs);
    }

    @Test
    public void givenJabRefPreferencesFilter_whenGetPreferenceOptions_thenSomethingReturned() {
        JabRefPreferences prefs = JabRefPreferences.getInstance();
        JabRefPreferencesFilter sut = new JabRefPreferencesFilter(prefs);

        assertNotNull(sut.getPreferenceOptions());
    }

    @Test
    public void givenJabRefPreferencesFilter_whenGetDeviatingPreferences_thenSomethingReturned() {
        JabRefPreferences prefs = JabRefPreferences.getInstance();
        JabRefPreferencesFilter sut = new JabRefPreferencesFilter(prefs);

        assertNotNull(sut.getDeviatingPreferences());
    }
}
