package org.jabref.logic.logging;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
<<<<<<< HEAD

import org.apache.logging.log4j.core.LogEvent;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogMessagesTest {
    @Test
    void givenNewInstance_whenGetInstance_returnInstance() {
        Assert.assertNotNull(LogMessages.getInstance());
    }

    @Test
    void givenLogMessages_whenGetMessages_thenReturnMessages() {
        ObservableList<LogEvent> messages = FXCollections.observableArrayList();
        Assert.assertEquals(messages, LogMessages.getInstance().getMessages());
    }

    @Test
    void givenLogMessages_whenClear_thenReturnCorrectMessages() {
        ObservableList<LogEvent> messages = FXCollections.observableArrayList();
        Assert.assertEquals(messages, LogMessages.getInstance().getMessages());
    }
=======
import org.jabref.logic.logging.LogMessages;

import org.junit.jupiter.api.Test;

public class LogMessagesTest {

    @Test
    public void givenLogMessages_whenGetInstance_thenInstanceReturned() {
        LogMessages.getInstance();
    }

>>>>>>> unitTestingForLogging
}
