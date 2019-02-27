package org.jabref.logic.undo;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UndoChangeEventTest {

    @Test
    public void givenNoUndoChangeEvent_whenCreateUndoChangeEvent_thenUndoChangeEventCreated() {
        UndoChangeEvent sut = new UndoChangeEvent(true,"",true,"");
    }

    @Test
    public void givenUndoChangeEventWithcanUndoFalse_whenCallisCanUndo_thenReturnFalse() {
        UndoChangeEvent sut = new UndoChangeEvent(false,"",true,"");
        assertEquals(false,sut.isCanUndo());
    }

    @Test
    public void givenUndoChangeEventWithcanRedoFalse_whenCallisCanRedo_thenReturnFalse() {
        UndoChangeEvent sut = new UndoChangeEvent(true,"",false,"");
        assertEquals(false,sut.isCanRedo());
    }

    @Test
    public void givenUndoChangeEventWithUndoDescriptionString_whenCallgetUndoDescription_thenReturnString() {
        UndoChangeEvent sut = new UndoChangeEvent(true,"String",true,"");
        assertEquals("String",sut.getUndoDescription());
    }

    @Test
    public void givenUndoChangeEventWithRedoDescriptionString_whenCallgetRedoDescription_thenReturnString() {
        UndoChangeEvent sut = new UndoChangeEvent(true,"",true,"String");
        assertEquals("String",sut.getRedoDescription());
    }
}
