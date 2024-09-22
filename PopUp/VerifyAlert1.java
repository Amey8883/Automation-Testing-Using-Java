package PopUp;

import org.openqa.selenium.By;

import CrossBrowserTesting.CrossBrowserTesting;

/**
 * Aim: This program verifies if an alert pop-up is displayed using Selenium WebDriver.
 * It attempts to click a link, and if the alert is present, it handles the exception and prints the relevant message.
 * If no alert is displayed, it proceeds with the click operation.
 */
public class VerifyAlert1 extends CrossBrowserTesting {

    public static void main(String[] args) throws InterruptedException {
        
        // Setup WebDriver and launch browser with "chrome"
        preCondition("chrome");
        Thread.sleep(2000);
        
        // Try to click on the 'Books' link and check for any pop-up presence
        try {
            driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
            System.out.println("PopUp is not displayed....");
        } 
        // Catch block to handle any exception in case the pop-up is displayed
        catch(Exception e) {
            System.out.println("PopUp is displayed....");
        }
    }
}
