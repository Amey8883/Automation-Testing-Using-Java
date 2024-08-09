package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Aim: This script is designed to automate the process of verifying the title of the
 * Demo Web Shop homepage and clicking on the "Register" link if the title matches.
 */
public final class RegisterclassName {

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
        
        // Wait for 3 seconds
        Thread.sleep(3000);
        
        // Get the title of the current page
        String actual_result = driver.getTitle();
        
        // Check if the actual title matches the expected title
        if(actual_result.equals(expected_result))
        {
            System.out.println("I am in the DWS homepage and clicked on the Register");
            // Find the "Register" link by class name and click it
            driver.findElement(By.className("ico-register")).click();
        }
        else
        {
            System.out.println("I am not in the DWS homepage");
            // Close the browser if the title does not match
            driver.close();    
        }
        
        // Close the browser
        driver.close();
    }
}
