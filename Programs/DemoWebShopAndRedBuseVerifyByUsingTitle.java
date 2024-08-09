package BasicNa;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Aim: The goal of this script is to automate the process of verifying the titles
 * and URLs of two websites: Demo Web Shop and Redbus, using Selenium WebDriver.
 */
public class DemoWebShopAndRedBuseVerifyByUsingTitle {

    public static void main(String[] args) throws InterruptedException {
        
        // Expected title for Demo Web Shop
        String dws = "Demo Web Shop";
        
        // URL for Redbus
        String redbus = "https://www.redbus.in/";
        
        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Navigate to Demo Web Shop
        driver.navigate().to("https://demowebshop.tricentis.com/");
        
        // Get the title of the current page
        String expected = driver.getTitle();
        
        // Verify if the title matches the expected title for Demo Web Shop
        if(dws.equals(expected))
        {
            System.out.println("in the dws"); // Title matches Demo Web Shop
        }else
        {
            System.out.println("not in the dws"); // Title does not match Demo Web Shop
        }
    
        // Pause for 2 seconds
        Thread.sleep(2000);
        
        // Navigate to Redbus
        driver.get(redbus);
        
        // Get the current URL of the page
        String actual_url = driver.getCurrentUrl();
        
        // Verify if the current URL matches the expected Redbus URL
        if(redbus.equals(actual_url))
        {
            System.out.println("in the redbus"); // URL matches Redbus
        }
        
        else {
            System.out.println("not in the redbus"); // URL does not match Redbus
        }
        
        // Close the browser
        driver.quit();
    }
}
