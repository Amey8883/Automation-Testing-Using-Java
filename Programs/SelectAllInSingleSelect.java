package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllInSingleSelect {

    /*
       Aim: This program demonstrates how to select all options sequentially in a single-select dropdown
       using Selenium WebDriver in Java.
     */
    public static void main(String[] args) throws InterruptedException {
        
        // Set up WebDriver and launch the browser
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Wait for 3 seconds to allow the browser to launch and maximize properly
        Thread.sleep(3000);
        
        // Navigate to the local HTML file containing the dropdown
        driver.get("file:///C:/Users/Amey%20Deshpande/Downloads/demo.html");
        
        // Locate the single-select dropdown element by its ID
        WebElement single_Select = driver.findElement(By.id("standard_cars"));
        
        // Wait for 3 seconds to ensure the element is fully loaded
        Thread.sleep(3000);
        
        // Create a Select object for interacting with the dropdown
        Select sel = new Select(single_Select);
        
        // Loop through all available options in the dropdown (assuming there are 12 options)
        for (int i = 0; i < 12; i++) {
            // Select each option by its index
            sel.selectByIndex(i);
            // Wait for 2 seconds between each selection for demonstration purposes
            Thread.sleep(2000);
        }

        // Close the browser and quit the WebDriver
        driver.quit();
    }
}
