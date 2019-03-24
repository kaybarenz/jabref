package org.jabref.logic.logging;

import org.jabref.logic.logging.LogMessages;

import org.junit.jupiter.api.Test;

public class LogMessagesTest {

    @Test
    public void givenLogMessages_whenGetInstance_thenInstanceReturned() {
        LogMessages.getInstance();
    }
    
}
