package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/*
   Aim: This script automates the process of verifying the title of the
   Facebook login page and, if the title matches, fills in the login credentials.
 */
public class Fill_Facebook_Login_Credentials {

    public static void main(String[] args) throws InterruptedException {

        // Expected title of the Facebook login page
        String expected_result = "Facebook – log in or sign up";
        
        // Initialize ChromeDriver for Facebook
        ChromeDriver facebook = new ChromeDriver();
        
        // Maximize the browser window
        facebook.manage().window().maximize();
        
        // Navigate to the Facebook login page
        facebook.get("https://www.facebook.com/");
        
        // Wait for 5 seconds to ensure the page loads completely
        Thread.sleep(5000);        
        
        // Get the title of the current page
        String actual_result = facebook.getTitle();
        
        // Check if the actual title matches the expected title
        if(actual_result.equals(expected_result))
        {
            System.out.println("You can login");
            // Enter email into the email field
            facebook.findElement(By.id("email")).sendKeys("swagboy20@gmail.com");
            // Enter password into the password field
            facebook.findElement(By.id("pass")).sendKeys("Nuttertools@15");
            // Wait for 5 seconds to observe the filled credentials
            Thread.sleep(5000);
            
        }
        else {
            System.out.println("You cannot Login");
            // Close the browser if the title does not match
            facebook.close();
        }
        
        // Quit the browser session
        facebook.quit();
    }
}
