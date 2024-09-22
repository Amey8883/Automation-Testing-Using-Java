package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import CrossBrowserTesting.CrossBrowserTesting;

/*
   Aim: This program automates handling child windows using Selenium WebDriver.
   It opens a parent window, navigates through the page, clicks on Facebook, switches to the child window,
   clicks on 'Create new account', and then switches between windows for further interaction.
 */
public class ChildWindowDWS extends CrossBrowserTesting {

    public static void main(String[] args) throws InterruptedException {
        
        // Setup WebDriver and launch browser with "chrome"
        preCondition("chrome");
        Thread.sleep(1000);
        
        // Storing the parent window handle
        String parent = driver.getWindowHandle();
        
        // Creating Actions object for keyboard actions
        Actions act = new Actions(driver);
        
        // Simulating Page Down action twice to scroll the page
        act.keyDown(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        act.keyDown(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        
        // Clicking on the "Facebook" link which opens in a new window
        driver.findElement(By.linkText("Facebook")).click();
        Thread.sleep(2000);
        
        // Capturing all window handles and removing the parent handle
        Set<String> childs = driver.getWindowHandles();
        childs.remove(parent);
        
        // Switching to the first child window (Facebook window)
        for (String str : childs) {
            driver.switchTo().window(str);
        }
        
        // Printing the child window handles for reference
        System.out.println("Child Window Handles (First Set): " + childs);
        Thread.sleep(2000);
        
        // Clicking on "Create new account" in the Facebook window
        driver.findElement(By.xpath("//span[text()='Create new account']")).click();
        
        // Capturing all window handles after the 'Create new account' click
        Set<String> child1 = driver.getWindowHandles();
        child1.remove(childs);  // Remove the previous child window handles
        
        // Switching to the new child window (if any)
        for (String str : child1) {
            driver.switchTo().window(str);
        }
        
        // Printing the updated child window handles
        System.out.println("Child Window Handles (Second Set): " + child1);
        Thread.sleep(2000);
        
        // Clicking on the "Twitter" link (assuming it's on the current window)
        driver.findElement(By.linkText("Twitter")).click();
    }
}
