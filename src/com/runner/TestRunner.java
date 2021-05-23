package com.runner;

import com.test.TestJunit;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import java.util.Arrays;

public class TestRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestJunit.class);
        System.out.println("Failure: " + Arrays.toString(result.getFailures().toArray()));
        System.out.println("Successful: " + result.wasSuccessful());
    }
}