package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/*
    Aim: This script automates the login process for the Demo Web Shop website. 
         It verifies that the user has reached the correct homepage URL, 
         navigates to the login page, inputs the user's credentials, 
         clicks the "Remember Me" checkbox, attempts to reset the password, 
         and then navigates back to the login page.
 */
public class DWS_LoginPage {

    public static void main(String[] args) throws InterruptedException {

        // The expected URL of the Demo Web Shop homepage
        String expected_result = "https://demowebshop.tricentis.com/";
        
        // Initialize the ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Maximize the browser window for better visibility
        driver.manage().window().maximize();
        
        // Navigate to the Demo Web Shop homepage
        driver.get("https://demowebshop.tricentis.com/");
        
        // Get the current URL to verify if the navigation was successful
        String actual_result = driver.getCurrentUrl();
        
        // Compare the actual URL with the expected URL
        if(actual_result.equals(expected_result))
        {
            // Click on the "Log in" link if the URLs match
            driver.findElement(By.partialLinkText("Log in")).click();
            Thread.sleep(1000); // Pause to allow the login page to load
            
            // Enter the email address into the "Email" input field
            driver.findElement(By.name("Email")).sendKeys("Swagboy20@gmail.com");
            Thread.sleep(1000); // Pause for better visibility
            
            // Enter the password into the "Password" input field
            driver.findElement(By.name("Password")).sendKeys("Nuttertools@12");
            Thread.sleep(1000); // Pause for better visibility
            
            // Click on the "Remember Me" checkbox
            driver.findElement(By.name("RememberMe")).click();
            Thread.sleep(1000); // Pause for better visibility
            
            // Click on the "Forgot password?" link
            driver.findElement(By.partialLinkText("Forgot password?")).click();
            Thread.sleep(2000); // Pause to allow the password reset page to load
            
            // Navigate back to the login page
            driver.navigate().back();
            Thread.sleep(2000); // Pause to ensure the page has reloaded
        }
        else {
            // If the URL does not match the expected result, print an error message
            System.out.println("Check URL");
        }
        
        // Close all browser windows and terminate the WebDriver session
        driver.quit();
        
        Thread.sleep(3000); // Final pause before ending the program
    }
}
