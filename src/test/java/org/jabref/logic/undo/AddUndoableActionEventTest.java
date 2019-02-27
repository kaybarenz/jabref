package org.jabref.logic.undo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddUndoableActionEventTest {

    @Test
    public void givenNoAddUndoableActionEvent_whenCreateAddUndoableActionEvent_thenAddUndoableActionEventCreated() {
        AddUndoableActionEvent sut = new AddUndoableActionEvent(true,"",true,"");
    }

    @Test
    public void givenAddUndoableActionEventWithcanUndoFalse_whenCallisCanUndo_thenReturnFalse() {
        AddUndoableActionEvent sut = new AddUndoableActionEvent(false,"",true,"");
        assertEquals(false,sut.isCanUndo());
    }

    @Test
    public void givenAddUndoableActionEventWithcanRedoFalse_whenCallisCanRedo_thenReturnFalse() {
        AddUndoableActionEvent sut = new AddUndoableActionEvent(true,"",false,"");
        assertEquals(false,sut.isCanRedo());
    }

    @Test
    public void givenAddUndoableActionEventWithUndoDescriptionString_whenCallgetUndoDescription_thenReturnString() {
        AddUndoableActionEvent sut = new AddUndoableActionEvent(true,"String",true,"");
        assertEquals("String",sut.getUndoDescription());
    }

    @Test
    public void givenAddUndoableActionEventWithRedoDescriptionString_whenCallgetRedoDescription_thenReturnString() {
        AddUndoableActionEvent sut = new AddUndoableActionEvent(true,"",true,"String");
        assertEquals("String",sut.getRedoDescription());
    }
}
