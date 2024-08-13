package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/*
   Aim: This script automates the process of verifying the title of the
   Facebook login page and, if the title matches, fills in the login credentials.
 */
public class LinkedText_Locators_Click_On_The_Button {

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
            System.out.println("You landing on the fb");
            // Enter email into the email field
            
            facebook.findElement(By.linkText("Create new account")).click();
            Thread.sleep(10000);
        }
        else {
            System.out.println("You not landing on the fb");
            // Close the browser if the title does not match
            facebook.close();
        }
        
        // Quit the browser session
        facebook.quit();
    }
}
