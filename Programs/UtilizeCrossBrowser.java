package BasicNa;

import CrossBrowserTesting.CrossBrowserTesting;

/*
   Aim: This program demonstrates the utilization of a cross-browser testing framework.
   It initializes a test in a specified browser, simulates a delay to represent a test execution,
   and then closes the browser.
 */

public class UtilizeCrossBrowser extends CrossBrowserTesting {

    public static void main(String[] args) throws InterruptedException {
        
        // Precondition: Initialize the browser for testing (e.g., CHROME)
        preCondition("CHROME");
        
        // Simulate a delay to represent test case execution
        Thread.sleep(3000);
        
        // Log message indicating the current page
        System.out.println("I am in DWS page");
        
        // Log message indicating the test case is being performed
        System.out.println("Test case is performing...");
        
        // Postcondition: Close the browser after test execution
        postCondition("close");
    }
}
