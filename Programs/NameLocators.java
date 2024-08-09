package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/*
   Aim: This script automates the process of verifying the title of the
   Demo Web Shop homepage. If the title matches, it locates the search field
   by name and enters "iPhone". The browser will then close after a short delay.
 */
public class NameLocators {

    public static void main(String[] args) throws InterruptedException {
        
        // Expected title of the Demo Web Shop homepage
        String expected_result = "Demo Web Shop";
        
        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Navigate to the Demo Web Shop homepage
        driver.get("https://demowebshop.tricentis.com/");
        
        // Wait for 3 seconds to ensure the page is fully loaded
        Thread.sleep(3000);
        
        // Get the title of the current page
        String actual_result = driver.getTitle();
        
        // Check if the actual title matches the expected title
        if(actual_result.equals(expected_result))
        {
            System.out.println("I am in the DWS homepage");
            // Locate the search field by name and enter "iPhone"
            driver.findElement(By.name("q")).sendKeys("iPhone");
            // Wait for 5 seconds to observe the result
            Thread.sleep(5000);
            // Quit the browser
            driver.quit();
        }
        else {
            System.out.println("I am not in the DWS homepage");
            // Close the browser if the title does not match
            driver.close();
        }
    }
}
