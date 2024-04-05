package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class WebModuleTest {
    @Test
    public void testGetWebMessage() {
        WebModule webModule = new WebModule();
        assertEquals("Hello from Web Module!", webModule.getWebMessage());
    }
}

