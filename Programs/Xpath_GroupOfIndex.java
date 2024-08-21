package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
   Aim: To navigate to the Demo Web Shop, verify the presence of a newsletter subscription button, 
   and enter a name into a text field using Selenium WebDriver.
 */
public class Xpath_GroupOfIndex {

    public static void main(String[] args) throws InterruptedException {
        
        // Initialize ChromeDriver instance
        ChromeDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Navigate to the Demo Web Shop website
        driver.get("https://demowebshop.tricentis.com/");
        
        // Locate the newsletter subscription button by its ID
        WebElement text = driver.findElement(By.id("newsletter-subscribe-button"));
        
        // Check if the newsletter subscription button is displayed on the page
        if(text.isDisplayed()) {
            // If displayed, print a confirmation message to the console
            System.out.println("I am in DWS WebPage");
            
            // Locate the second input text field using XPath and enter the name "Amey"
            driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Amey");
            
            // Pause the execution for 3 seconds to observe the entered text
            Thread.sleep(3000);
        } else {
            // If the subscription button is not displayed, print an alternate confirmation message
            System.out.println("I am in DWS webpage");
        }
        
        // Close the browser
        driver.close();
    }
}
