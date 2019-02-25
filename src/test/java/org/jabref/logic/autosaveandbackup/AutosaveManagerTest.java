package org.jabref.logic.autosaveandbackup;

import org.jabref.model.database.BibDatabaseContext;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutosaveManagerTest {

    @Test
    public void givenNoAutosaveManager_whenAutosaveStarted_thenAutosaveManagerCreated() {
        AutosaveManager sut = AutosaveManager.start(new BibDatabaseContext());
    }
}
