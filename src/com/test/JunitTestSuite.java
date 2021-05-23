package com.test;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class JunitTestSuite {
    public static void main(String[] args) {
        //add the test's in the suite
        TestSuite suite = new TestSuite(TestJunitAssert.class, TestJunitAddSetUpTearDown.class, TestJunitAddErrorFailure.class);
        TestResult result = new TestResult();
        suite.run(result);
        System.out.println("Number of test cases = " + result.runCount());
    }
}
