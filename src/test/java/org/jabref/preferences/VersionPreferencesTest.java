package org.jabref.preferences;

import org.jabref.logic.util.Version;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class VersionPreferencesTest {

    VersionPreferences sut;

    @Test
    public void givenIgnoredVersion_whenCreatingVersionPreference_thenVersionPreferencesCreated() {
        Version ignoredVersion = Version.parse("1");
        sut = new VersionPreferences(ignoredVersion);
    }

    @Test
    public void givenIgnoredVersion_whenGetVersionPreference_thenVersionPreferencesReturned() {
        Version ignoredVersion = Version.parse("1");
        sut = new VersionPreferences(ignoredVersion);
        assertEquals(ignoredVersion,sut.getIgnoredVersion());
    }
}
