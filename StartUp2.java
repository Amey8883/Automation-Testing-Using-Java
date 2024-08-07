// Package declaration
package BasicNa;

// Importing necessary class from Selenium library
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Aim:
 * This program is designed to automate the process of launching a Chrome web browser,
 * navigating to the Mercedes-Benz homepage, maximizing the browser window, 
 * waiting for 3 seconds, and then closing the browser.
 */
public class StartUp2 {

    public static void main(String[] args) throws InterruptedException {
        // Creating an instance of ChromeDriver to control the Chrome browser
        ChromeDriver driver = new ChromeDriver();
        
        // Maximizing the browser window
        driver.manage().window().maximize();
        
        // Navigating to the specified URL
        driver.get("https://www.mercedes-benz.com/en/");
        
        // Waiting for 3 seconds
        Thread.sleep(3000);
        
        // Closing the browser
        driver.close();
    }
}
