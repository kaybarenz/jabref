package org.jabref.logic.logging;

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
    }
}
