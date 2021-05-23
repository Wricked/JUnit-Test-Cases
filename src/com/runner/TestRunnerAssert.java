package com.runner;

import com.test.TestJunitAssert;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import java.util.Arrays;

public class TestRunnerAssert {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestJunitAssert.class);
        System.out.println("Failure: " + Arrays.toString(result.getFailures().toArray()));
        System.out.println("Successful: " + result.wasSuccessful());
    }
}