package org.jabref.logic.logging;

import org.jabref.logic.logging.JabRefLogger;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JabRefLoggerTest {

    @Test
    public void givenJabRefLoggerNotSetDebug_whenSetDebug_thenJabRefLoggerSetToDebug() {
        JabRefLogger.setDebug();
    }
}
