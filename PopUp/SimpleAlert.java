package PopUp;

import org.openqa.selenium.By;

import CrossBrowserTesting.CrossBrowserTesting;

/*
  Aim: This program demonstrates handling a simple JavaScript alert pop-up using Selenium WebDriver.
  It automates clicking on a button that triggers an alert and then accepts the alert using the `switchTo().alert().accept()` method.
 */
public class SimpleAlert extends CrossBrowserTesting {

    public static void main(String[] args) throws InterruptedException {
        
        // Setup WebDriver and launch browser with "chrome"
        preCondition("chrome");
        Thread.sleep(2000);
        
        // Clicking the 'Search' button which triggers a simple alert
        driver.findElement(By.cssSelector("input[value='Search']")).click();
        Thread.sleep(2000);
        
        // Switching to the alert pop-up and accepting it
        driver.switchTo().alert().accept();
    }
}
