package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAssignment {

    // Aim: The aim of this program is to automate the process of creating a new account on Facebook using Selenium WebDriver. 
    // It navigates to the Facebook landing page, verifies the URL, and then fills in the registration form.

    public static void main(String[] args) throws InterruptedException {
        
        String expected_result = "https://www.facebook.com/";  // Expected URL of the Facebook landing page
        
        ChromeDriver facebook = new ChromeDriver();  // Initialize a new ChromeDriver instance
        
        facebook.manage().window().maximize();  // Maximize the browser window
        
        facebook.get("https://www.facebook.com/");  // Navigate to Facebook's URL
        
        String actual_result = facebook.getCurrentUrl();  // Get the current URL of the page
        
        // Check if the actual URL matches the expected URL
        if(actual_result.equals(expected_result))
        {
            System.out.println("You are in Facebook landing page");
            Thread.sleep(2000);  // Pause execution for 2 seconds
            
            // Click on the "Create new account" link
            facebook.findElement(By.partialLinkText("Create new account")).click();
            Thread.sleep(1000);  // Pause execution for 1 second
            
            // Enter "Welcome" into the first name field
            facebook.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Welcome");
            Thread.sleep(1000);  // Pause execution for 1 second
            
            // Enter "Facebook" into the last name field
            facebook.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Facebook");
            Thread.sleep(1000);  // Pause execution for 1 second

            // Enter a mobile number into the email/phone field
            facebook.findElement(By.name("reg_email__")).sendKeys("8833437359");
            Thread.sleep(1000);  // Pause execution for 1 second

            // Enter a password into the password field
            facebook.findElement(By.cssSelector("input[autocomplete='new-password']")).sendKeys("Goodboy@89");
            Thread.sleep(1000);  // Pause execution for 1 second

            // Select the gender (assumed to be Female, value='2')
            facebook.findElement(By.cssSelector("input[value='2']")).click();
            Thread.sleep(1000);  // Pause execution for 1 second
            
            // Quit the browser
            facebook.quit();
        }
        else {
            System.out.println("You are not in Facebook landing page");
            facebook.quit();  // Quit the browser if the URL does not match
        }
    }
}
