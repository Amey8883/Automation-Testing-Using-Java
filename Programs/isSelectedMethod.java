package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedMethod {

    // Aim: This program demonstrates the use of the `isSelected()` method in Selenium WebDriver.
    // It navigates to a demo web shop, selects a radio button, and checks if the button is selected.

    public static void main(String[] args) throws InterruptedException {

        // Set up the ChromeDriver instance
        ChromeDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Wait for 3 seconds to simulate a pause (not recommended for real test cases)
        Thread.sleep(3000);

        // Navigate to the demo web shop website
        driver.navigate().to("https://demowebshop.tricentis.com/");

        // Locate the radio button element by its ID
        WebElement excellent = driver.findElement(By.id("pollanswers-1"));

        // Click the radio button to select it
        excellent.click();

        // Wait for 3 seconds to observe the change 
        Thread.sleep(3000);

        // Check if the radio button is selected and print the result
        if (excellent.isSelected()) {
            System.out.println("Element is selected.....");
        } else {
            System.out.println("Element is not selected....");
        }

        // Close the browser and end the session
        driver.quit();
    }
}
