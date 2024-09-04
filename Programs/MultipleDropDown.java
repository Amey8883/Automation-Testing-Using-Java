package Assignments;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {

    public static void main(String[] args) throws InterruptedException {
        
        // Aim: The objective of this program is to automate the selection of all options in a multiple-selection dropdown menu using Selenium WebDriver.
        
        // Initialize the WebDriver for Chrome browser
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window for better visibility
        driver.manage().window().maximize();
        
        // Pause execution for 3 seconds to allow the browser to fully load
        Thread.sleep(3000);
        
        // Navigate to the local HTML file containing the dropdown menu
        driver.get("file:///C:/Users/Amey%20Deshpande/Downloads/demo.html");
        
        // Locate the dropdown menu element by its ID
        WebElement single = driver.findElement(By.id("multiple_cars"));
        Thread.sleep(2000);  // Pause for 2 seconds to ensure the element is ready for interaction
        
        // Initialize the Select class for interacting with the dropdown menu
        Select sel = new Select(single);
        
        // Retrieve all options within the dropdown menu
        List<WebElement> s_menu = sel.getOptions();
        
        // Loop through each option and select it by its index
        int i = 0;
        for(WebElement web : s_menu) {
            sel.selectByIndex(i++);
        }
        
        Thread.sleep(2000);  // Pause for 2 seconds to observe the selections
        
        // Close the browser to end the session
        driver.quit();
    }

}
