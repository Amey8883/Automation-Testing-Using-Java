package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {

    /**
     * Aim: This program demonstrates how to use Selenium WebDriver to interact with
     * a multi-select dropdown on a webpage. It specifically shows how to select
     * an option by visible text and then deselect the same option using the
     * `Select` class in Selenium.
     */
    public static void main(String[] args) throws InterruptedException {

        // Initialize the WebDriver for Chrome browser
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Wait for 3 seconds to allow the page to load
        Thread.sleep(3000);

        // Navigate to the local HTML file containing the multi-select dropdown
        driver.get("file:///C:/Users/Amey%20Deshpande/Downloads/demo.html");

        // Locate the multi-select dropdown element by its ID
        WebElement multi_Select = driver.findElement(By.id("multiple_cars"));

        // Wait for 3 seconds before interacting with the dropdown
        Thread.sleep(3000);

        // Create a Select object to interact with the multi-select dropdown
        Select sel = new Select(multi_Select);

        // Select the option with visible text "Jaguar" from the dropdown
        sel.selectByVisibleText("Jaguar");
        
        // Wait for 3 seconds to observe the selection
        Thread.sleep(3000);

        // Deselect the option with visible text "Jaguar" from the dropdown
        sel.deselectByVisibleText("Jaguar");

        // Wait for 3 seconds to observe the deselection
        Thread.sleep(3000);

        // Close the browser and quit the WebDriver session
        driver.quit();
    }
}
