// Package declaration
package BasicNa;

// Importing necessary class from Selenium library
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Aim:
 * This program is designed to automate a sequence of browser navigation actions using a Chrome web browser.
 * The sequence includes maximizing the window, navigating to different URLs, going back and forward, refreshing the page, 
 * and then closing the browser.
 */
public class Navigate {

    public static void main(String[] args) throws InterruptedException {
        // Creating an instance of ChromeDriver to control the Chrome browser
        ChromeDriver driver = new ChromeDriver();
        
        // Maximizing the browser window
        driver.manage().window().maximize();
        
        // Pausing for 3 seconds
        Thread.sleep(3000);
        
        // Navigating to the Mercedes-Benz homepage
        driver.navigate().to("https://www.mercedes-benz.com/en/");
        Thread.sleep(3000); // Pausing for 3 seconds
        
        // Navigating to the Relaxo Footwear brand Sparx collection page
        driver.get("https://www.relaxofootwear.com/collection/brand-sparx");
        Thread.sleep(3000); // Pausing for 3 seconds
        
        // Navigating back to the previous page (Mercedes-Benz homepage)
        driver.navigate().back();
        Thread.sleep(3000); // Pausing for 3 seconds
        
        // Navigating forward to the Relaxo Footwear page
        driver.navigate().forward();
        Thread.sleep(3000); // Pausing for 3 seconds
        
        // Refreshing the current page
        driver.navigate().refresh();
        Thread.sleep(3000); // Pausing for 3 seconds
        
        // Closing the browser
        driver.close();
    }
}// Package declaration
package BasicNa;

// Importing necessary class from Selenium library
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Aim:
 * This program is designed to automate a sequence of browser navigation actions using a Chrome web browser.
 * The sequence includes maximizing the window, navigating to different URLs, going back and forward, refreshing the page, 
 * and then closing the browser.
 */
public class Navigate {

    public static void main(String[] args) throws InterruptedException {
        // Creating an instance of ChromeDriver to control the Chrome browser
        ChromeDriver driver = new ChromeDriver();
        
        // Maximizing the browser window
        driver.manage().window().maximize();
        
        // Pausing for 3 seconds
        Thread.sleep(3000);
        
        // Navigating to the Mercedes-Benz homepage
        driver.navigate().to("https://www.mercedes-benz.com/en/");
        Thread.sleep(3000); // Pausing for 3 seconds
        
        // Navigating to the Relaxo Footwear brand Sparx collection page
        driver.get("https://www.relaxofootwear.com/collection/brand-sparx");
        Thread.sleep(3000); // Pausing for 3 seconds
        
        // Navigating back to the previous page (Mercedes-Benz homepage)
        driver.navigate().back();
        Thread.sleep(3000); // Pausing for 3 seconds
        
        // Navigating forward to the Relaxo Footwear page
        driver.navigate().forward();
        Thread.sleep(3000); // Pausing for 3 seconds
        
        // Refreshing the current page
        driver.navigate().refresh();
        Thread.sleep(3000); // Pausing for 3 seconds
        
        // Closing the browser
        driver.close();
    }
}
