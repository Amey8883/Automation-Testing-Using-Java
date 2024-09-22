package PopUp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Aim: This program demonstrates how to launch a Chrome browser using Selenium WebDriver 
 * with disabled notifications. It navigates to the EaseMyTrip website and maximizes the browser window.
 */
public class easemytrip {

    public static void main(String[] args) throws InterruptedException {

        // Setting Chrome options to disable notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        
        // Initializing the ChromeDriver with the specified options
        ChromeDriver driver = new ChromeDriver(options);
        
        // Maximizing the browser window
        driver.manage().window().maximize();
        
        // Navigating to the EaseMyTrip website
        driver.navigate().to("https://www.easemytrip.com/");
        
        // Wait for 3 seconds to observe the opened page
        Thread.sleep(3000);
    }
}
