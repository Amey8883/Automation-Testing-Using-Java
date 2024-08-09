package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
   Aim: This script automates the process of verifying the title of the
   Demo Web Shop homepage, then locating the search field by class name
   and entering "PS5" if the title matches.
 */
public class DisadvantagesOfClassName {

    public static void main(String[] args) throws InterruptedException {
        
        // Expected title of the Demo Web Shop homepage
        String expected_result = "Demo Web Shop";
        
        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Wait for 3 seconds
        Thread.sleep(3000);
        
        // Navigate to the Demo Web Shop homepage
        driver.get("https://demowebshop.tricentis.com/");
        
        // Get the title of the current page
        String actual_result = driver.getTitle();
        
        // Wait for 3 seconds
        Thread.sleep(3000);
        
        // Check if the actual title matches the expected title
        if(expected_result.equals(actual_result))
        {
            System.out.println("I am in the DWS home page");
            // Locate the search field by class name and enter "PS5"
            WebElement search_field = driver.findElement(By.className("search-box-text ui-autocomplete-input"));
            search_field.sendKeys("PS5");
            
        } else {
            System.out.println("I am not in the DWS");
            // Quit the browser if the title does not match
            driver.quit();
        }
        
        // Close the browser
        driver.close();
    }
}
