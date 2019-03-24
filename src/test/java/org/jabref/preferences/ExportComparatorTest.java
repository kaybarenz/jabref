package org.jabref.preferences;

import org.junit.jupiter.api.Test;
import java.util.Comparator;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExportComparatorTest {

    @Test
    public void givenTwoLists_whenFirstComparedToSecond_thenFirstIsLarger() {
        ArrayList<String> s1 =  new ArrayList<>(10);
        ArrayList<String> s2 =  new ArrayList<>(10);

        s1.add(0,"1");
        s2.add(0,"0");

        ExportComparator sut = new ExportComparator();
        assertEquals(1,sut.compare(s1,s2));
    }
}
