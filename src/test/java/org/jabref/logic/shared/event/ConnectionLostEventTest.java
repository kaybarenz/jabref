package org.jabref.logic.shared.event;

import org.jabref.model.database.BibDatabaseContext;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionLostEventTest {

    @Test
    void givenBibDatabaseContext_whenConnectionLost_thenReturnCorrectBibDatabaseContext() {
        BibDatabaseContext sut = new BibDatabaseContext();

        ConnectionLostEvent sut1 = new ConnectionLostEvent(sut);

        Assert.assertEquals(sut, sut1.getBibDatabaseContext());
    }
}
