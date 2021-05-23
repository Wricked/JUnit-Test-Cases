package com.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message + "2");

    @Test
    public void testPrintMessage() {
        assertEquals(message,messageUtil.printMessage());
    }
}