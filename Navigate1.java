// Package declaration
package BasicNa;

// Importing necessary class from Selenium library
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Aim:
 * This program is designed to automate the process of launching a Chrome web browser,
 * navigating to the JioMart homepage, maximizing the browser window, and then closing the browser.
 */
public class Navigate1 {

    public static void main(String[] args) {
        // Creating an instance of ChromeDriver to control the Chrome browser
        ChromeDriver driver = new ChromeDriver();
        
        // Maximizing the browser window
        driver.manage().window().maximize();
        
        // Navigating to the specified URL using the navigate().to() method
        driver.navigate().to("https://www.jiomart.com/");
        
        // Closing the browser
        driver.close();
    }
}
