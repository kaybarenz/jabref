package org.jabref.preferences;

import org.junit.jupiter.api.Test;

public class CustomImportListTest {

    @Test
    public void givenJabRefPreferences_whenCreatingCustomImportList_thenCustomImportListCreated() {
        JabRefPreferences prefs = JabRefPreferences.getInstance();
        CustomImportList sut = new CustomImportList(prefs);
    }

}
