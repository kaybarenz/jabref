package org.jabref.logic.undo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UndoRedoEventTest {
    @Test
    public void givenNoUndoRedoEvent_whenCreateUndoRedoEvent_thenUndoRedoEventCreated() {
        UndoRedoEvent sut = new UndoRedoEvent(true,"",true,"");
    }

    @Test
    public void givenUndoRedoEventWithcanUndoFalse_whenCallisCanUndo_thenReturnFalse() {
        UndoRedoEvent sut = new UndoRedoEvent(false,"",true,"");
        assertEquals(false,sut.isCanUndo());
    }

    @Test
    public void givenUndoRedoEventWithcanRedoFalse_whenCallisCanRedo_thenReturnFalse() {
        UndoRedoEvent sut = new UndoRedoEvent(true,"",false,"");
        assertEquals(false,sut.isCanRedo());
    }

    @Test
    public void givenUndoRedoEventWithUndoDescriptionString_whenCallgetUndoDescription_thenReturnString() {
        UndoRedoEvent sut = new UndoRedoEvent(true,"String",true,"");
        assertEquals("String",sut.getUndoDescription());
    }

    @Test
    public void givenUndoChangeEventWithRedoDescriptionString_whenCallgetRedoDescription_thenReturnString() {
        UndoRedoEvent sut = new UndoRedoEvent(true,"",true,"String");
        assertEquals("String",sut.getRedoDescription());
    }
}
