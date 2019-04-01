package org.jabref.preferences;

import org.jabref.logic.importer.Importer;
import org.jabref.logic.importer.fileformat.CopacImporter;
import org.junit.jupiter.api.Test;
import org.jabref.logic.importer.fileformat.CustomImporter;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CustomImportListTest {

    @Test
    public void givenJabRefPreferences_whenCreatingCustomImportList_thenCustomImportListCreated() {
        JabRefPreferences prefs = JabRefPreferences.getInstance();
        CustomImportList sut = new CustomImportList(prefs);
    }

}
