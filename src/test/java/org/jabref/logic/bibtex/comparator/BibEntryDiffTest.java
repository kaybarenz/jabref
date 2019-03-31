package org.jabref.logic.bibtex.comparator;
import java.util.Collections;
import java.util.Optional;

import org.jabref.model.entry.BibEntry;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class BibEntryDiffTest {

    BibEntry original = new BibEntry();
    BibEntry newEntry = new BibEntry();
    BibEntryDiff diff = new BibEntryDiff(original,newEntry);

    @Test
    public void givenGivenDiff_returnOriginalBibEntryDiff(){

        BibEntry sut = diff.getOriginalEntry();
        assertEquals(original,sut);
    }

    @Test
    public void givenGivenDiff_returnNewBibEntryDiff(){

        BibEntry sut = diff.getNewEntry();
        assertEquals(newEntry,sut);
    }
}
