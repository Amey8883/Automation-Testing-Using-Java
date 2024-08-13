package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/*
     Aim: This script automates the registration process on the Demo Web Shop website. 
          It verifies the user is on the correct homepage, navigates to the registration page, 
          inputs the user's registration details, and submits the registration form.
 */
public class DWS_RegisterPage {

    public static void main(String[] args) throws InterruptedException {

        // Expected title of the Demo Web Shop homepage
        String expected_result = "Demo Web Shop";
        
        // Expected URL of the registration page
        String expected_result2 = "https://demowebshop.tricentis.com/register";
        
        // Initialize the ChromeDriver
        ChromeDriver DWS = new ChromeDriver();
        
        // Maximize the browser window for better visibility
        DWS.manage().window().maximize();
        
        // Navigate to the Demo Web Shop homepage
        DWS.get("https://demowebshop.tricentis.com/");
        
        // Pause to allow the page to fully load
        Thread.sleep(3000);
        
        // Get the actual title of the current page
        String actual_result = DWS.getTitle();
        
        // Compare the actual title with the expected title
        if(actual_result.equals(expected_result)) {
            System.out.println("Welcome to the Demo Web Shop Home Page");
            
            // Click on the "Register" link if the titles match
            DWS.findElement(By.partialLinkText("Register")).click();
            
            // Get the actual URL after navigating to the registration page
            String actual_result2 = DWS.getCurrentUrl();
            
            // Compare the actual URL with the expected URL
            if(actual_result2.equals(expected_result2)) {
                // Select "Male" gender
                DWS.findElement(By.id("gender-male")).click();
                Thread.sleep(1000);
                
                // Enter the first name
                DWS.findElement(By.id("FirstName")).sendKeys("Ramesh");
                Thread.sleep(1000);
                
                // Enter the last name
                DWS.findElement(By.id("LastName")).sendKeys("Sharma");
                Thread.sleep(1000);
                
                // Enter the email address
                DWS.findElement(By.id("Email")).sendKeys("swagboy20@gmail.com");
                Thread.sleep(1000);
                
                // Enter the password
                DWS.findElement(By.id("Password")).sendKeys("Nuttertools@12");
                Thread.sleep(1000);
                
                // Confirm the password
                DWS.findElement(By.id("ConfirmPassword")).sendKeys("Nuttertools@12");
                Thread.sleep(1000);
                
                // Click the "Register" button to submit the form
                DWS.findElement(By.name("register-button")).click();
            }
            
        } else {
            // If the title does not match the expected result, print an error message
            System.out.println("Try again");
            DWS.close(); // Close the browser
        }
        
        // Close all browser windows and terminate the WebDriver session
        DWS.quit();
    }
}
