package ScrollingAndKeyboardAction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
   Aim: This program demonstrates scrolling up and down a web page using keyboard actions
   in Selenium WebDriver. The "Actions" class is used to simulate the keyboard actions
   such as PAGE_DOWN and PAGE_UP to navigate through the webpage.
 */

public class Scrolling {

    public static void main(String[] args) throws InterruptedException {
        
        // Set up WebDriver for Chrome browser
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Wait for 3 seconds to allow the window to maximize
        Thread.sleep(3000);
        
        // Navigate to the specified URL (Demo Web Shop)
        driver.get("https://demowebshop.tricentis.com/");
        
        // Wait for 3 seconds to ensure the page is fully loaded
        Thread.sleep(3000);
        
        // Create an instance of the Actions class to handle keyboard actions
        Actions act = new Actions(driver);
        
        // Perform the PAGE_DOWN action to scroll down the web page
        act.keyDown(Keys.PAGE_DOWN).build().perform();
        
        // Wait for 3 seconds to observe the scroll-down action
        Thread.sleep(3000);
        
        // Perform the PAGE_UP action to scroll back up the web page
        act.keyDown(Keys.PAGE_UP).build().perform();        
    }

}
