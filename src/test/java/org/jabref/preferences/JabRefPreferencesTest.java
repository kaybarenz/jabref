package org.jabref.preferences;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class JabRefPreferencesTest {

    JabRefPreferences sut;

    @Test
    public void givenNoJabRefPreferences_whenGetInstance_thenJabRefCreated() {
        sut = JabRefPreferences.getInstance();
    }
    
}
