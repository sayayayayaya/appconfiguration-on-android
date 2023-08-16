package com.azure.data.appconfiguration;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class AndroidTest {

    // We want it to error eventually, that will show the test is running in android -Saya
    @Test
    public void testMultilineString() {
        String multiline = """
                test
                """;

        assertNotNull(multiline);
    }
}
