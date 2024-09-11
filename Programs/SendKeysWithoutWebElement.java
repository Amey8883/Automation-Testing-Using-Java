package Actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import CrossBrowserTesting.CrossBrowserTesting;

public class SendKeysWithoutWebElement extends CrossBrowserTesting {

    public static void main(String[] args) throws InterruptedException {

        // Aim: This script demonstrates how to use the Actions class to send keystrokes to a web page element
        // without directly interacting with it. It focuses on tabbing through fields and sending a value.

        // Set up the browser environment
        preCondition("chrome");
        Thread.sleep(2000);

        // Initialize the Actions class for performing complex user interactions
        Actions act = new Actions(driver);

        // Simulate pressing the TAB key multiple times to navigate through input fields
        act.keyDown(Keys.TAB).perform();
        Thread.sleep(2000);

        act.keyDown(Keys.TAB).perform();
        Thread.sleep(2000);

        act.keyDown(Keys.TAB).perform();
        Thread.sleep(2000);

        act.keyDown(Keys.TAB).perform();
        Thread.sleep(2000);

        act.keyDown(Keys.TAB).perform();
        Thread.sleep(2000);

        act.keyDown(Keys.TAB).perform();
        Thread.sleep(2000);

        // Simulate typing the text "Manikandan" into the currently focused field
        act.sendKeys("Manikandan").perform();
        Thread.sleep(2000);

        // Simulate pressing the ENTER key
        act.keyDown(Keys.ENTER).build().perform();
        Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }
}
