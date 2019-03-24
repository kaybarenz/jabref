package org.jabref.logic.logging;

<<<<<<< HEAD
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JabRefLoggerTest {

    @Test
    void givenJabRefLogger_whenSetDebug_thenSetConfigToDebug() {
        LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
        Configuration config = ctx.getConfiguration();
        LoggerConfig loggerConfig = config.getLoggerConfig("org.jabref");

        JabRefLogger.setDebug();
        Assert.assertEquals(Level.DEBUG, loggerConfig.getLevel());
=======
import org.jabref.logic.logging.JabRefLogger;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JabRefLoggerTest {

    @Test
    public void givenJabRefLoggerNotSetDebug_whenSetDebug_thenJabRefLoggerSetToDebug() {
        JabRefLogger.setDebug();
>>>>>>> unitTestingForLogging
    }
}
