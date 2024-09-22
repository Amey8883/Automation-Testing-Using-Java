package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Aim: This program demonstrates how to automate the selection of dates from a calendar 
 * on the EaseMyTrip website using Selenium WebDriver. It disables notifications and performs 
 * clicks on specific date elements in the calendar.
 */
public class SimpleClickCalender {

    public static void main(String[] args) throws InterruptedException {

        // Setting Chrome options to disable notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        
        // Initializing the ChromeDriver with the specified options
        ChromeDriver driver = new ChromeDriver(options);
        
        // Maximizing the browser window
        driver.manage().window().maximize();
        
        // Wait for 3 seconds to observe the opened page
        Thread.sleep(3000);
        
        // Navigating to the EaseMyTrip website
        driver.navigate().to("https://www.easemytrip.com/");
        
        // Wait for 3 seconds to ensure the page loads completely
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
        
        // Selecting the return date
        driver.findElement(By.id("26/09/2024")).click();
        Thread.sleep(2000);
        
        // Closing the browser
        driver.quit();
    }
}
