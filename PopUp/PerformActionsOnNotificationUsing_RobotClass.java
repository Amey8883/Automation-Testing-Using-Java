package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Aim: This program demonstrates how to perform actions on notifications using the Robot class in Java. 
 * It automates navigating to the EaseMyTrip website and simulates keyboard inputs to interact with a notification.
 */
public class PerformActionsOnNotificationUsing_RobotClass {

    public static void main(String[] args) throws InterruptedException, AWTException {

        // Initializing the ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Maximizing the browser window
        driver.manage().window().maximize();
        
        // Navigating to the EaseMyTrip website
        driver.navigate().to("https://www.easemytrip.com/");
        
        // Wait for 3 seconds to observe the opened page
        Thread.sleep(3000);
                
        // Creating an instance of Robot class to perform keyboard actions
        Robot r = new Robot();
        
        // Simulating TAB key presses to navigate through the notification
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        
        // Simulating the ENTER key to interact with the notification
        r.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        // Releasing the keys
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        // Optional: Close the browser (commented out)
        // driver.close();		
    }
}
