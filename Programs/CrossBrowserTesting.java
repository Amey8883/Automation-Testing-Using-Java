package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

/* 
   Aim: This class is designed to perform cross-browser testing using Selenium WebDriver.
   It supports multiple browsers such as Chrome, Firefox, Safari, Internet Explorer, and Edge.
   The class includes methods to initialize the browser, navigate to a specified URL,
   and close the browser after the tests are completed.
 */
public class CrossBrowserTesting {
    
    // Declare the WebDriver instance
    public static WebDriver driver;
    
    /*
       Precondition method to initialize the WebDriver based on the browser specified.
       The name of the browser to use (e.g., "chrome", "firefox", "safari", "InternetExplorer", "EdgeDriver").
       InterruptedException In case the thread sleep is interrupted.
     */
    public static void preCondition(String browser) throws InterruptedException {
        // Initialize the WebDriver based on the browser name
        if(browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        } else if(browser.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        } else if(browser.equalsIgnoreCase("InternetExplorer")) {
            driver = new InternetExplorerDriver();
        } else if(browser.equalsIgnoreCase("EdgeDriver")) {
            driver = new EdgeDriver();
        } else {
            // Default to ChromeDriver if no matching browser is found
            driver = new ChromeDriver();
        }
        
        // Maximize the browser window
        driver.manage().window().maximize();
        // Wait for 3 seconds
        Thread.sleep(3000);
        // Navigate to the specified URL
        driver.get("https://demowebshop.tricentis.com/");
    }
    
    /*
       Postcondition method to close or quit the WebDriver based on the status specified.
       status The status indicating whether to close or quit the browser ("close" or "quite").
     */
    public static void postCondition(String status) {
        // Close or quit the browser based on the status
        if(status.equalsIgnoreCase("close")) {
            driver.close();
        } else if(status.equalsIgnoreCase("quite")) {
            driver.quit();
        } else {
            driver.quit();
        }
        
        // Print a message indicating the end of the test
        System.out.println("Thank you, come again");
    }
}
