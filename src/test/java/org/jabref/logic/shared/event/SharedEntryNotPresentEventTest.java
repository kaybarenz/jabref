package org.jabref.logic.shared.event;

import org.jabref.model.entry.BibEntry;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharedEntryNotPresentEventTest {

    @Test
    void givenBibEntry_whenSharedEntryNotPresent_thenReturnBibEntry() {
        BibEntry sut = new BibEntry();

        SharedEntryNotPresentEvent sut1 = new SharedEntryNotPresentEvent(sut);

        Assert.assertEquals(sut, sut1.getBibEntry());

    }
}
