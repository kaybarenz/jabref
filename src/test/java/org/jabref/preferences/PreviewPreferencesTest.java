package org.jabref.preferences;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PreviewPreferencesTest {
    PreviewPreferences sut;

    @Test
    public void givenNoPreviewPreferences_when() {
        List<String> list = new ArrayList<String>();
        sut = new PreviewPreferences(list, 0, 1, true, "", "");
    }
}
