package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledMethod {

    // Aim: This program uses Selenium WebDriver to navigate to a web page, 
    // checks if a search input field is enabled, and interacts with it based on its state.

    public static void main(String[] args) throws InterruptedException {

        // Initialize the ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Maximize the browser window for better visibility
        driver.manage().window().maximize();
        
        // Pause the execution for 3 seconds to allow the browser to open properly
        Thread.sleep(3000);
        
        // Navigate to the Demo Web Shop website
        driver.navigate().to("https://demowebshop.tricentis.com/");
        
        // Locate the search field element by its ID
        WebElement search_field = driver.findElement(By.id("small-searchterms"));
        
        // Check if the search field is enabled for user interaction
        if (search_field.isEnabled()) {
            // If enabled, print a message and enter the text "Train" into the search field
            System.out.println("Element is enabled");
            search_field.sendKeys("Train");
        } else {
            // If not enabled, print a message and close the browser
            System.out.println("Element is disabled...");
            driver.close();
        }
        
        // Pause the execution for 3 seconds to observe the interaction
        Thread.sleep(3000);
        
        // Close the browser
        driver.close();
    }
}
