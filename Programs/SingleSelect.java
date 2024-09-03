package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
   Aim: 
   This program demonstrates how to automate the selection of an option from a 
   single-select dropdown menu using Selenium WebDriver. The example involves 
   selecting the "Mercedes" option from a dropdown list on a local HTML page.
 */
public class SingleSelect{

    public static void main(String[] args) throws InterruptedException {

        // Set up WebDriver for Chrome browser
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Pause execution for 3 seconds to allow the browser to open
        Thread.sleep(3000);
        
        // Navigate to the local HTML file containing the dropdown menu
        driver.get("file:///C:/Users/Amey%20Deshpande/Downloads/demo.html");
        
        // Locate the dropdown element by its ID
        WebElement single_Select = driver.findElement(By.id("standard_cars"));
        
        // Pause execution for 3 seconds to ensure the page loads fully
        Thread.sleep(3000);
        
        // Create a Select object to interact with the dropdown
        Select sel = new Select(single_Select);
        
        // Select the "Mercedes" option by its visible text
        sel.selectByVisibleText("Mercedes");
        
        // Pause execution for 2 seconds to observe the selection
        Thread.sleep(3000);
        
        sel.selectByValue("vol");
        
        Thread.sleep(3000);
        
        sel.selectByIndex(2);
        
        Thread.sleep(2000);
        
        // Close the browser window
        driver.close();
    }
}
