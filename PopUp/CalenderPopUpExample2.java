package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Aim: This program demonstrates how to automate date selection from a calendar 
 * on the EaseMyTrip website using Selenium WebDriver. It handles the calendar popup 
 * to select a specific date for travel, even if the date is not initially visible.
 */
public class CalenderPopUpExample2 {

    public static void main(String[] args) throws InterruptedException {

        // Setting Chrome options to disable notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        
        // Initializing the ChromeDriver with the specified options
        ChromeDriver driver = new ChromeDriver(options);
        
        // Maximizing the browser window
        driver.manage().window().maximize();
        
        // Wait for 2 seconds to observe the opened page
        Thread.sleep(2000);
        
        // Navigating to the EaseMyTrip website
        driver.get("https://www.easemytrip.com/");
        Thread.sleep(3000);
        
        // Clicking on the calendar element to open the date picker
        driver.findElement(By.xpath("//div[@id='dvfarecal']")).click();
        Thread.sleep(2000);
        
        // Selecting the departure date
        driver.findElement(By.id("25/09/2024")).click();
        Thread.sleep(2000);
        
        // Clicking on the return date label
        driver.findElement(By.id("rdatelbl")).click();
        Thread.sleep(2000);
        
        // Loop to select the return date, handling the case when it is not visible
        for (;;) {
            try {
                // Attempt to click on the desired return date
                driver.findElement(By.id("fiv_1_26/01/2026")).click();
                break;    
            } catch (Exception e) {
                // If the desired date is not found, navigate to the next month
                driver.findElement(By.id("img2Nex")).click();
                Thread.sleep(1000);
            }
        }
    }
}
