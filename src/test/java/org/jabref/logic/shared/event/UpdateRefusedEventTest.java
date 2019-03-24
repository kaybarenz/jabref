package org.jabref.logic.shared.event;

import org.jabref.model.database.BibDatabaseContext;
import org.jabref.model.entry.BibEntry;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpdateRefusedEventTest {
    private BibDatabaseContext bibDatabaseContext;
    private BibEntry localBibEntry;
    private BibEntry sharedBibEntry;
    private UpdateRefusedEvent sut;

    @BeforeEach
    public void init() {
        bibDatabaseContext = new BibDatabaseContext();
        localBibEntry = new BibEntry();
        sharedBibEntry = new BibEntry();
        sut = new UpdateRefusedEvent(bibDatabaseContext,localBibEntry, sharedBibEntry);
    }

    @Test
    public void givenBibDatabaseContext_whenUpdateRefusedEvent_thenReturnBibDatabaseContext() {
        assertEquals(bibDatabaseContext, sut.getBibDatabaseContext());
    }

    @Test
    public void givenLocalBibEntry_whenUpdateRefusedEvent_thenReturnLocalBibEntry() {
        assertEquals(localBibEntry, sut.getLocalBibEntry());
    }

    @Test
    public void givenSharedBibEntry_whenUpdateRefusedEvent_thenSharedBibEntry() {
        assertEquals(sharedBibEntry, sut.getSharedBibEntry());
    }
}
