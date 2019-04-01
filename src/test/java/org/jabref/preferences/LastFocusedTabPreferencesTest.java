package org.jabref.preferences;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.*;

public class LastFocusedTabPreferencesTest {

    @Test
    public void givenJabRefPreferences_whenCreatingLastFocusedTabPreferences_thenCreated() {
        JabRefPreferences prefs = JabRefPreferences.getInstance();
        LastFocusedTabPreferences sut = new LastFocusedTabPreferences(prefs);
    }

    @Test
    public void givenLastFocusedTabPreferences_whenSetLastFocusedTab_thenSet() {
        JabRefPreferences prefs = JabRefPreferences.getInstance();
        LastFocusedTabPreferences sut = new LastFocusedTabPreferences(prefs);
        File fakeFile = new File("");

        sut.setLastFocusedTab(fakeFile);
    }

    @Test
    public void givenLastFocusedTabPreferences_whenhadLastFocusWithoutSettingALastFocus_thenReturnFalse() {
        JabRefPreferences prefs = JabRefPreferences.getInstance();
        LastFocusedTabPreferences sut = new LastFocusedTabPreferences(prefs);
        File fakeFile = new File("");

        assertEquals(true, sut.hadLastFocus(fakeFile));
    }
}
