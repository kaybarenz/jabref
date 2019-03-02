package org.jabref.model.entry.specialfields;

import java.util.Optional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SpecialFieldTest {

    @Test
    public void getSpecialFieldInstanceFromFieldNameValid() {
        assertEquals(Optional.of(SpecialField.RANKING),
                SpecialField.getSpecialFieldInstanceFromFieldName("ranking"));
    }

    @Test
    public void getSpecialFieldInstanceFromFieldNameEmptyForInvalidField() {
        assertEquals(Optional.empty(), SpecialField.getSpecialFieldInstanceFromFieldName("title"));
    }

    @Test
    public void isSpecialFieldTrueForValidField() {
        assertTrue(SpecialField.isSpecialField("ranking"));
    }

    @Test
    public void isSpecialFieldFalseForInvalidField() {
        assertFalse(SpecialField.isSpecialField("title"));
    }

    @Test
    public void givenIntValue_whenIntIs1_thenSpecialFieldRANK1()
    {
        SpecialFieldValue val = SpecialFieldValue.RANK_1;
        int intValue = 1;
        SpecialFieldValue sut = SpecialFieldValue.getRating(intValue);
        assertEquals(val,sut);
    }

    @Test
    public void givenIntValue_whenIntIs2_thenSpecialFieldRANK2()
    {
        SpecialFieldValue val = SpecialFieldValue.RANK_2;
        int intValue = 2;
        SpecialFieldValue sut = SpecialFieldValue.getRating(intValue);
        assertEquals(val,sut);
    }

    @Test
    public void givenIntValue_whenIntIs3_thenSpecialFieldRANK3()
    {
        SpecialFieldValue val = SpecialFieldValue.RANK_3;
        int intValue = 3;
        SpecialFieldValue sut = SpecialFieldValue.getRating(intValue);
        assertEquals(val,sut);
    }

    @Test
    public void givenIntValue_whenIntIs4_thenSpecialFieldRANK4()
    {
        SpecialFieldValue val = SpecialFieldValue.RANK_4;
        int intValue = 4;
        SpecialFieldValue sut = SpecialFieldValue.getRating(intValue);
        assertEquals(val,sut);
    }

    @Test
    public void givenIntValue_whenIntIs5_thenSpecialFieldRANK5()
    {
        SpecialFieldValue val = SpecialFieldValue.RANK_5;
        int intValue = 5;
        SpecialFieldValue sut = SpecialFieldValue.getRating(intValue);
        assertEquals(val,sut);
    }

    @Test()
    public void givenIntValue_whenIntIs6_thenReturnUnsupportedOperationExceptionException()
    {

        int intValue = 6;
        assertThrows(UnsupportedOperationException.class, () -> {
            SpecialFieldValue.getRating(intValue);
        });
    }

    @Test
    public void givenIntValue_whenSpecialFieldRANK1_thenIntIs1()
    {
        SpecialFieldValue sut = SpecialFieldValue.RANK_1;
        int expected = 1;
        int val = sut.toRating();
        assertEquals(expected,val);
    }

    @Test
    public void givenIntValue_whenSpecialFieldRANK2_thenIntIs2()
    {
        SpecialFieldValue sut = SpecialFieldValue.RANK_2;
        int expected = 2;
        int val = sut.toRating();
        assertEquals(expected,val);
    }

    @Test
    public void givenIntValue_whenSpecialFieldRANK3_thenIntIs3()
    {
        SpecialFieldValue sut = SpecialFieldValue.RANK_3;
        int expected = 3;
        int val = sut.toRating();
        assertEquals(expected,val);
    }

    @Test
    public void givenIntValue_whenSpecialFieldRANK4_thenIntIs4()
    {
        SpecialFieldValue sut = SpecialFieldValue.RANK_4;
        int expected = 4;
        int val = sut.toRating();
        assertEquals(expected,val);
    }

    @Test
    public void givenIntValue_whenSpecialFieldRANK5_thenIntIs5()
    {
        SpecialFieldValue sut = SpecialFieldValue.RANK_5;
        int expected = 5;
        int val = sut.toRating();
        assertEquals(expected,val);
    }

    @Test()
    public void givenIntValue_whenRANK_thenReturnUnsupportedOperationExceptionException()
    {

        SpecialFieldValue val = SpecialFieldValue.READ;
        assertThrows(UnsupportedOperationException.class, () -> {
            val.toRating();
        });
    }
}
