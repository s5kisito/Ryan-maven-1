package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CoreModuleTest {
    @Test
    public void testGetMessage() {
        CoreModule coreModule = new CoreModule();
        assertEquals("Hello from Core Module!", coreModule.getMessage());
    }
}

