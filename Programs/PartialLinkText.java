package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/*
  Aim: This code is designed to automate the process of verifying whether the user has successfully landed 
       on Facebook's homepage and then attempt to create a new account by clicking on the 'Create new account' link 
       using the Selenium WebDriver. 
 */
public class PartialLinkText {

    public static void main(String[] args) throws InterruptedException {

        // Expected URL after navigating to Facebook's homepage
        String expected_result = "https://www.facebook.com/";
        
        // Initialize the ChromeDriver
        ChromeDriver facebook = new ChromeDriver();
        
        // Maximize the browser window for better visibility
        facebook.manage().window().maximize();
        
        // Navigate to Facebook's homepage
        facebook.get("https://www.facebook.com/");
        
        // Pause the execution for 3 seconds to allow the page to load
        Thread.sleep(2000);
        
        // Get the actual URL after the page has loaded
        String actual_result = facebook.getCurrentUrl();
        
        // Compare the actual URL with the expected URL
        if(actual_result.equals(expected_result))
        {
            // If the URLs match, print confirmation and proceed to click on the 'Create new account' link
            System.out.println("I am in the Facebook landing page...");
            facebook.findElement(By.partialLinkText("new account")).click();
            
            // Pause the execution for 5 seconds to allow the next page to load
            Thread.sleep(3000);
        } else {
            // If the URLs do not match, print an error message and close the browser
            System.out.println("I am not in the Facebook landing page...");
            facebook.close();
        }
        
        // Close all browser windows and terminate the WebDriver session
        facebook.quit();
    }
}
