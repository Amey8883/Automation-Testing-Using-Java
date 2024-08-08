package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

    // Aim: The purpose of this program is to verify if the browser navigates correctly 
    // to the Demo Web Shop page and then locate an input field using its tag name to enter the text "Manikandan".

    public static void main(String[] args) throws InterruptedException {

        // Define the expected URL to verify navigation
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

        // Pause the execution for 4 seconds to ensure the page is fully loaded
        Thread.sleep(4000);

        // Compare the expected URL with the actual URL and take action based on the result
        if (expected_result.equals(actual_result)) {
            System.out.println("I am in dws");

            // Locate the input field using the tag name "input" and enter the text "Manikandan"
            WebElement search_field = driver.findElement(By.tagName("input"));
            search_field.sendKeys("Manikandan");
        } else {
            System.out.println("I am not in dws");
            // Close the browser if the URL does not match
            driver.close();
        }

        // Pause the execution for 4 seconds to observe the input action
        Thread.sleep(4000);

        // Close the browser
        driver.close();
    }
}
