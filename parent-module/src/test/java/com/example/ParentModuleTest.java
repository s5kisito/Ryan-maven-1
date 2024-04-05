package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ParentModuleTest {
    @Test
    public void testGetParentMessage() {
        ParentModule parentModule = new ParentModule();
        assertEquals("Hello from Parent Module!", parentModule.getParentMessage());
    }
}

