package PopUp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import CrossBrowserTesting.CrossBrowserTesting;

/*
   Aim: This program handles child browser pop-ups using Selenium WebDriver. 
   It automates the process of navigating a webpage, clicking on multiple links, verifying if a specific URL is opened, 
   and printing the window handles of both parent and child windows.
 */
public class ChiledBrowserPopUp extends CrossBrowserTesting {

    public static void main(String[] args) throws InterruptedException {
        
        // The URL we expect to be opened in a new window
        String expected_url = "https://demowebshop.tricentis.com/news/rss/1";
        
        // Setup WebDriver and launch browser with "chrome"
        preCondition("chrome");
        Thread.sleep(2000);
        
        // Capturing the parent window handle
        String parent = driver.getWindowHandle();
        System.out.println(parent);
        
        // Creating Actions object for performing keyboard actions
        Actions act = new Actions(driver);
        Thread.sleep(2000);
        
        // Scrolling down the page using the PAGE_DOWN key
        act.keyDown(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        
        // Finding all the links in the 'Follow Us' section
        List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']//a"));
        
        // Iterating over each link and performing actions
        for (WebElement web : links) {
            web.click();  // Clicking the link
            String actual_url = driver.getCurrentUrl();
            Thread.sleep(2000);
            
            // If the opened URL matches the expected URL, navigate back
            if (expected_url.equals(actual_url)) {
                driver.navigate().back();
            }
            Thread.sleep(5000);
        }
        
        // Capturing all window handles (both parent and child windows)
        Set<String> childs = driver.getWindowHandles();
        System.out.println(childs);
        
        // postCondition("quit");
    }
}
