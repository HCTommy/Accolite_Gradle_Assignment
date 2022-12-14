/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.au;

import org.apache.commons.lang3.text.WordUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.cli.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    void testCommons() throws ParseException {

       assertEquals("Abc",App.commonsTest("abc"));

    }

    @Test
    void testCommons2() throws ParseException {

        assertEquals("Accolite",App.commonsTest("accolite"));
    }

}
