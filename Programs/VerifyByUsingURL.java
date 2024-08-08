package BasicNa;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByUsingURL {

    // Aim: The purpose of this program is to verify whether the browser is navigating 
    // to the correct URL of the demo webshop by comparing the expected URL with the actual URL.

    public static void main(String[] args) throws InterruptedException {

        // Define the expected URL that we want to verify
        String expected_result = "https://demowebshop.tricentis.com/";

        // Create a new instance of the ChromeDriver to control the Chrome browser
        ChromeDriver driver = new ChromeDriver();

        // Maximize the browser window to ensure all elements are visible
        driver.manage().window().maximize();

        // Pause the execution for 3 seconds to allow the browser to load
        Thread.sleep(3000);

        // Navigate to the expected URL
        driver.get(expected_result);

        // Get the current URL of the page after navigation
        String actual_result = driver.getCurrentUrl();

        // Compare the expected URL with the actual URL and print the result
        if (expected_result.equals(actual_result)) {
            System.out.println("I am in dws page");
        } else {
            System.out.println("I am not in dws page");
        }

        // Close the browser
        driver.close();
    }
}
