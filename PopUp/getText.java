package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import CrossBrowserTesting.CrossBrowserTesting;

/**
 * Aim: This program demonstrates how to retrieve and print the text from a JavaScript alert pop-up 
 * using Selenium WebDriver. It automates the process of triggering an alert, capturing its text, 
 * and then accepting the alert.
 */
public class getText extends CrossBrowserTesting {

    public static void main(String[] args) throws InterruptedException {
        
        // Setup WebDriver and launch browser with "chrome"
        preCondition("chrome");
        Thread.sleep(2000);
        
        // Clicking the 'Search' button which triggers a JavaScript alert
        driver.findElement(By.cssSelector("input[value='Search']")).click();
        Thread.sleep(2000);
        
        // Switching to the alert and capturing its text
        Alert alt = driver.switchTo().alert();
        System.out.println(alt.getText());
        
        Thread.sleep(2000);
        
        // Accepting the alert to close it
        alt.accept();
    }
}
