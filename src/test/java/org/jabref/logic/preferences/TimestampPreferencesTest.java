package org.jabref.logic.preferences;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimestampPreferencesTest {
    TimestampPreferences sut;

    @Test
    void givenTimeStampPreferences_whenIncludeTimestamp_thenDisplayCorrectPreference() {
        sut = new TimestampPreferences(true, true,
                "test", "yyyy-mm-dd", true );
        Assert.assertEquals(true, sut.includeTimestamps());

        sut = new TimestampPreferences(false, true,
                "test", "yyyy-mm-dd", true );
        Assert.assertEquals(false, sut.includeTimestamps());
    }

    @Test
    void givenTimeStampPreferences_whenIncludeModifiedTimestamp_thenDisplayCorrectPreference() {
        sut = new TimestampPreferences(true, true,
                "test", "yyyy-mm-dd", true );
        Assert.assertEquals(true, sut.includeModifiedTimestamp());

        sut = new TimestampPreferences(true, false,
                "test", "yyyy-mm-dd", true );
        Assert.assertEquals(false, sut.includeModifiedTimestamp());
    }

    @Test
    void givenTimeStampPreferences_whenGettingTimeStampField_thenReturnCorrectTimestampField() {
        sut = new TimestampPreferences(true, true,
                "test", "yyyy-mm-dd", true );
        Assert.assertEquals("test", sut.getTimestampField());

        sut = new TimestampPreferences(true, true,
                "field name", "yyyy-mm-dd", true );
        Assert.assertEquals("field name", sut.getTimestampField());

        sut = new TimestampPreferences(true, true,
                "name123", "yyyy-mm-dd", true );
        Assert.assertEquals("name123", sut.getTimestampField());
    }

    @Test
    void givenTimeStampPreferences_whenGetTimestampFormat_thenReturnCorrectTimestampFormat() {
        sut = new TimestampPreferences(true, true,
                "name123", "yyyy-mm-dd", true );
        Assert.assertEquals("yyyy-mm-dd", sut.getTimestampFormat());

        sut = new TimestampPreferences(true, true,
                "name123", "MM/dd/YY", true );
        Assert.assertEquals("MM/dd/YY", sut.getTimestampFormat());
    }

    @Test
    void givenTimeStampPreferences_whenOverwriteTimestamp_returnCorrectPreference() {
        sut = new TimestampPreferences(true, true,
                "name123", "MM/dd/YY", true );
        Assert.assertEquals(true, sut.overwriteTimestamp());

        sut = new TimestampPreferences(true, true,
                "name123", "MM/dd/YY", false );
        Assert.assertEquals(false, sut.overwriteTimestamp());
    }

    @Test
    void givenTimeStampPreferences_whenIncludeTimestamps_thenReturnCorrectPreference() {
        sut = new TimestampPreferences(true, true,
                "name123", "MM/dd/YY", false );
        Assert.assertEquals(true, sut.includeTimestamps());

        sut = new TimestampPreferences(false, true,
                "name123", "MM/dd/YY", false );
        Assert.assertEquals(false, sut.includeTimestamps());

        sut = new TimestampPreferences(false, false,
                "name123", "MM/dd/YY", false );
        Assert.assertEquals(false, sut.includeTimestamps());

        sut = new TimestampPreferences(true, false,
                "name123", "MM/dd/YY", false );
        Assert.assertEquals(false, sut.includeTimestamps());
    }

    @Test
    void givenTimeStampPreference_whenNow_thenReturnCorrectStringDate() {
        sut = new TimestampPreferences(true, false,
                "name123", "MM/dd/YY", false );
        Assert.assertEquals(DateTimeFormatter.ofPattern("MM/dd/YY").format(LocalDate.now()), sut.now());

        sut = new TimestampPreferences(true, false,
                "name123", "MM-dd-YY", false );
        Assert.assertEquals(DateTimeFormatter.ofPattern("MM-dd-YY").format(LocalDate.now()), sut.now());

        sut = new TimestampPreferences(true, false,
                "name123", "yyyy-MM-dd", false );
        Assert.assertEquals(DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDate.now()), sut.now());
    }
}
