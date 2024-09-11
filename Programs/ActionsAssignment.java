package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsAssignment {

    public static void main(String[] args) throws InterruptedException {

        // Aim: This script navigates to the Qspiders demo application, verifies the URL,
        // and performs a click action on the "UI Testing Concepts" link if the URL matches.

        // Expected URL for validation
        String expected_result = "https://demoapps.qspiders.com/";

        // Initialize Chrome WebDriver
        ChromeDriver driver = new ChromeDriver();

        // Maximize the browser window to ensure all elements are visible
        driver.manage().window().maximize();

        // Wait for a few seconds to allow the browser to load
        Thread.sleep(3000);

        // Navigate to the Qspiders demo application page
        driver.get("https://demoapps.qspiders.com/");

        // Get the current URL of the loaded page
        String actual_result = driver.getCurrentUrl();

        // Check if the current URL matches the expected URL
        if (expected_result.equals(actual_result)) {
            // Print a confirmation message
            System.out.println("Successfully navigated to the Qspiders demo page");

            // Click on the "UI Testing Concepts" link
            driver.findElement(By.linkText("UI Testing Concepts")).click();
        } else {
            // Print an error message if the URL does not match
            System.out.println("The URL did not match. Current URL: " + actual_result);
        }

        // Close the browser
        driver.quit();
    }
}
