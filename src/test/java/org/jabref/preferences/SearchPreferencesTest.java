package org.jabref.preferences;

import org.jabref.gui.search.SearchDisplayMode;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SearchPreferencesTest {
    SearchPreferences sut;

    @Test
    public void givenNoSearchPreferences_whenCreatingSearchPreferences_thenSearchPreferencesCreated() {
        JabRefPreferences preferences = JabRefPreferences.getInstance();
        sut = new SearchPreferences(preferences);
    }

    @Test
    public void givenSearchPreferences_whenPuttingDefaults_thenDefaultsPut() {
        Map<String, Object> defaults = new HashMap<>();
        Map<String, Object> expected = new HashMap<>();
        SearchPreferences.putDefaults(defaults);
        expected.put("searchGlobal", Boolean.FALSE);
        expected.put("searchDisplayMode", SearchDisplayMode.FILTER.toString());
        expected.put("caseSensitiveSearch", Boolean.FALSE);
        expected.put("regExpSearch", Boolean.FALSE);

        expected.put("searchDialogWidth", 650);
        expected.put("searchDialogHeight", 500);
        expected.put("searchDialogPosX", 0);
        expected.put("searchDialogPosY", 0);

        assertEquals(expected,defaults);
    }
}
