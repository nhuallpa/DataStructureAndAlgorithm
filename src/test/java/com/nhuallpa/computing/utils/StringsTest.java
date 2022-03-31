package com.nhuallpa.computing.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringsTest {

    @Test
    void hasDuplicateChars() {
        assertTrue(Strings.hasDuplicateChars("anaconda"), "anaconda has duplicates caracters");
        assertTrue(Strings.hasDuplicateChars("ingrid"), "ingrid has duplicates caracters");
        assertTrue(Strings.hasDuplicateChars("Santiago"), "Santiago has duplicates caracters");
        assertTrue(Strings.hasDuplicateChars("D'allesandro"), "D'allesandro has duplicates caracters");
        assertTrue(Strings.hasDuplicateChars("D'allesandrozz"), "D'allesandrozz has duplicates caracters");
        assertTrue(Strings.hasDuplicateChars("aaD'allesandro"), "aaD'allesandro has duplicates caracters");
    }
    @Test
    void hasNonDuplicateChars() {
        assertFalse(Strings.hasDuplicateChars("nestor"), "nestor has not duplicate charaters");
        assertFalse(Strings.hasDuplicateChars("Santi "), "Santi has not duplicate charaters");
        assertFalse(Strings.hasDuplicateChars(""), "blank has not duplicate charaters");
    }

    @Test
    void theseAreAnagram() {
        assertTrue(Strings.areAnagram("gato", "gota"));
    }

    @Test
    void theseAreNotAnagram() {
        assertFalse(Strings.areAnagram("gato", "pato"));
    }
}