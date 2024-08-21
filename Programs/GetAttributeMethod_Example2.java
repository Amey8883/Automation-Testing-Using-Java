package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This example demonstrates the use of the `getAttribute()` method in Selenium WebDriver.
 * The program performs the following steps:
 * 1. Launches a Chrome browser.
 * 2. Navigates to the Demo Web Shop website.
 * 3. Finds the search field on the page.
 * 4. Enters the search term "Mobile" into the search field.
 * 5. Retrieves the value of the search field using `getAttribute("value")`.
 * 6. Compares the retrieved value with the entered search term to verify if it matches.
 * 7. Prints a success or failure message based on the comparison result.
 * 8. Closes the browser.
 */
public class GetAttributeMethod_Example2 {

    public static void main(String[] args) throws InterruptedException {
        
        String data = "Mobile";
        
        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Wait for 3 seconds
        Thread.sleep(3000);
        
        // Navigate to the Demo Web Shop website
        driver.navigate().to("https://demowebshop.tricentis.com/");
        
        // Locate the search field element by its name attribute
        WebElement search_field = driver.findElement(By.name("q"));
        
        // Enter the search term into the search field
        search_field.sendKeys(data);
        
        // Retrieve the value of the search field
        String data1 = search_field.getAttribute("value");

        // Compare the entered search term with the retrieved value
        if(data.equals(data1)) {
            System.out.println("Data is successfully passed...");
        } else {
            System.out.println("Passing the data was unsuccessful...");
        }

        // Close the browser
        driver.quit();
    }
}
