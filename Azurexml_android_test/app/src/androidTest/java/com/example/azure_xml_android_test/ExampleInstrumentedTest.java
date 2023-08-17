package com.example.azure_xml_android_test;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import com.azure.xml.XmlReader;
import com.azure.xml.implementation.DefaultXmlReader;

import javax.xml.stream.XMLStreamException;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    /*
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.azure_xml_android_test", appContext.getPackageName());
        //assertEquals("com.example.azure_xml_android_test", "hello");
    }
    */

    @Test
    public void instantiateDefaultXmlReader() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        String example = "<note>\n" +
                "<to>Tove</to>\n" +
                "<from>Jani</from>\n" +
                "<heading>Reminder</heading>\n" +
                "<body>Don't forget me this weekend!</body>\n" +
                "</note>";
        XmlReader reader = null;
        try {
            reader = DefaultXmlReader.fromString(example);
        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        }
        assertNotNull(reader);
    }
}