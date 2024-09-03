package BasicNa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectandDeselectInMultiple {

    // Aim: This program demonstrates how to select and then deselect all options in a multi-select dropdown
    // on a webpage using Selenium WebDriver in Java. It opens a local HTML file, selects each option in the 
    // dropdown one by one, waits for a short period, and finally deselects all options.

    public static void main(String[] args) throws InterruptedException {
        
        // Set up WebDriver and launch Chrome browser
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Pause execution for 3 seconds to allow the browser to fully open (for demo purposes)
        Thread.sleep(3000);
        
        // Open the local HTML file containing the multi-select dropdown
        driver.get("file:///C:/Users/Amey%20Deshpande/Downloads/demo.html");
        
        // Locate the multi-select dropdown element by its ID
        WebElement multi_Select = driver.findElement(By.id("multiple_cars"));
        
        // Initialize the Select object to interact with the multi-select dropdown
        Select sel = new Select(multi_Select);
        
        // Pause execution for 3 seconds to ensure the dropdown is fully loaded (for demo purposes)
        Thread.sleep(3000);
        
        // Initialize a counter for indexing and get all options available in the dropdown
        int i = 0;
        List<WebElement> cars = sel.getOptions();
        
        // Loop through each option in the dropdown, select it by index, and pause for 1 second
        for(WebElement web : cars) {
            sel.selectByIndex(i++);
            Thread.sleep(1000); // Pause execution for 1 second between selections
        }

        // Pause execution for 3 seconds to view the selected options (for demo purposes)
        Thread.sleep(3000);
        
        // Deselect all options in the dropdown
        sel.deselectAll();
        
        // Close the browser after completing the actions
        driver.quit();
    }

}
