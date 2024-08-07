// Package declaration
package BasicNa;

// Importing necessary class from Selenium library
import org.openqa.selenium.chrome.ChromeDriver;

/*
   Aim:
   This program is designed to automate the process of launching a web browser, 
   navigating to a specific URL (Relaxo Footwear brand Sparx collection), 
   maximizing the browser window, and then closing the browser.
 */
public class StartUpProgram {

    public static void main(String[] args) {
        // Creating an instance of ChromeDriver to control the Chrome browser
        ChromeDriver driver = new ChromeDriver();
        
        // Maximizing the browser window
        driver.manage().window().maximize();
        
        // Navigating to the specified URL
        driver.get("https://www.relaxofootwear.com/collection/brand-sparx");
        
        // Closing the browser
        driver.close();
    }
}
