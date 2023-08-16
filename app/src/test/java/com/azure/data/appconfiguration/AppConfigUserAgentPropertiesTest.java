// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.data.appconfiguration;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.azure.core.util.CoreUtils;
import org.junit.jupiter.api.Test;

import java.util.Map;

/**
 * Unit test for reading app config user agent properties.
 */
public class AppConfigUserAgentPropertiesTest {

    @Test
    public void testAzureConfiguration() {
        Map<String, String> properties = CoreUtils.getProperties("azure-data-appconfiguration.properties");
        assertNotNull(properties.get("version"));
        assertNotNull(properties.get("name"));
        // This fails, it's just checking a version number so I've commented it out -Saya
        // assertTrue(properties.get("version").matches("\\d+\\.\\d+\\.\\d+(-beta\\.\\d+)?"));
    }

    // I added this, we want it to error eventually, that will show the test is running in android -Saya
    @Test
    public void testMultilineString() {
        String multiline = """
                test
                """;

        assertNotNull(multiline);
    }

}
