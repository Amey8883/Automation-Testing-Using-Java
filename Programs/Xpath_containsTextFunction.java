package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
   This program demonstrates the use of the `contains()` function in XPath to locate elements by partial text.
   The aim is to navigate to the Demo Web Shop website, verify the presence of the newsletter subscribe button, 
   and if present, click on the "Gift Cards" link.
 */
public class Xpath_containsTextFunction {

    public static void main(String[] args) throws InterruptedException {

        // Initialize the ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Navigate to the Demo Web Shop website
        driver.get("https://demowebshop.tricentis.com/");
        
        // Locate the newsletter subscribe button by its ID
        WebElement text = driver.findElement(By.id("newsletter-subscribe-button"));
        
        // Check if the newsletter subscribe button is displayed on the page
        if(text.isDisplayed()) {
            System.out.println("I am in DWS page");
            // Wait for 3 seconds
            Thread.sleep(3000);
            // Click on the "Gift Cards" link using XPath with the `contains()` function
            driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
        } else {
            System.out.println("I am not in DWS page");
        }
        
        // Wait for 3 seconds before closing the browser
        Thread.sleep(3000);
        // Close the browser
        driver.close();
    }
}
