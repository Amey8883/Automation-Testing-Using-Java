package UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/*
   The BaseClassDWS class provides common setup and teardown methods for initializing WebDriver 
   instances for different browsers and performing basic browser operations in Selenium tests.
 */
public class BaseClassDWS {

    public static WebDriver driver;

    /*
       Initializes a WebDriver instance for Chrome, maximizes the browser window, and navigates to 
       the Demo Web Shop website.
       
       @throws InterruptedException If the thread is interrupted while sleeping.
     */
    public static void preCondition1() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000); // Wait for the page to load properly
        driver.get("https://demowebshop.tricentis.com/");
    }

    /*
       Initializes a WebDriver instance for Firefox, maximizes the browser window, and navigates to 
       the Demo Web Shop website.
       
       @throws InterruptedException If the thread is interrupted while sleeping.
     */
    public static void preCondition2() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000); // Wait for the page to load properly
        driver.get("https://demowebshop.tricentis.com/");
    }

    /*
       Initializes a WebDriver instance for Safari, maximizes the browser window, and navigates to 
       the Demo Web Shop website.
       
       @throws InterruptedException If the thread is interrupted while sleeping.
     */
    public static void preCondition3() throws InterruptedException {
        driver = new SafariDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000); // Wait for the page to load properly
        driver.get("https://demowebshop.tricentis.com/");
    }

    /*
       Closes the current browser window after a short delay and prints a thank you message.
       
       @throws InterruptedException If the thread is interrupted while sleeping.
     */
    public static void postCondition1() throws InterruptedException {
        System.out.println("Thanks, come daily"); // Print a thank you message
        Thread.sleep(2000); // Wait for 2 seconds before closing
        driver.close(); // Close the browser
    }

    /*
       Quits the WebDriver session, closing all associated browser windows, after a short delay 
       and prints a thank you message.
       
       @throws InterruptedException If the thread is interrupted while sleeping.
     */
    public static void postCondition2() throws InterruptedException {
        System.out.println("Thanks, come daily"); // Print a thank you message
        Thread.sleep(2000); // Wait for 2 seconds before quitting
        driver.quit(); // Quit the WebDriver session
    }
}
