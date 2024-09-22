package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import CrossBrowserTesting.CrossBrowserTesting;

/**
 * Aim: This program demonstrates how to send keystrokes using the Robot class in Java. 
 * It simulates keyboard inputs to navigate and type text in a web application.
 */
public class SendKeysUsing_RobotClass extends CrossBrowserTesting {

    public static void main(String[] args) throws InterruptedException, AWTException {
        
        // Setup WebDriver and launch browser with "chrome"
        preCondition("chrome");
        
        // Creating an instance of the Robot class to perform keyboard actions
        Robot r = new Robot();
        
        // Simulating TAB key presses to navigate to the desired input field
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);

        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);

        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);

        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);

        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        
        // Typing the name "AMEY" using the Robot class
        r.keyPress(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_M);
        r.keyPress(KeyEvent.VK_E);
        r.keyPress(KeyEvent.VK_Y);
        Thread.sleep(2000);
        
        // Releasing the keys after typing
        r.keyRelease(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_M);
        r.keyRelease(KeyEvent.VK_E);
        r.keyRelease(KeyEvent.VK_Y);
        r.keyRelease(KeyEvent.VK_TAB);
    }
}
