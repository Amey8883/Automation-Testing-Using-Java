package BasicNa;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

    // Aim: To automate basic browser navigation actions using Selenium WebDriver.
    public static void main(String[] args) throws InterruptedException {

        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();
    
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Navigate to Demo Web Shop
        driver.navigate().to("https://demowebshop.tricentis.com/");
        Thread.sleep(5000);
        
        // Navigate to Flipkart
        driver.get("https://www.flipkart.com/");
        Thread.sleep(5000);
        
        // Navigate back to the previous page
        driver.navigate().back();
        Thread.sleep(5000);
        
        // Refresh the current page
        driver.navigate().refresh();
        Thread.sleep(5000);
        
        // Navigate forward to the next page
        driver.navigate().forward();
        Thread.sleep(5000);
        
        // Close the browser
        driver.close();
    }
}
