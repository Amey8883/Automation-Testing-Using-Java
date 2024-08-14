package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterFunction_Using_CssSelector {

    public static void main(String[] args) throws InterruptedException {

        // Aim: Verify that the user can successfully navigate to the registration page
        // of the Demo Web Shop and complete the registration process using CSS selectors.

        String expected_result = "https://demowebshop.tricentis.com/";
        String expected_result1 = "Demo Web Shop. Register";
        
        // Launch Chrome browser
        ChromeDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Navigate to the Demo Web Shop home page
        driver.get("https://demowebshop.tricentis.com/");
        
        // Wait for the page to load
        Thread.sleep(2000);
        
        // Get the current URL to verify if the navigation to the home page was successful
        String actual_result = driver.getCurrentUrl();
        
        // Verify that the user is on the Demo Web Shop home page
        if(actual_result.equals(expected_result)) {
            System.out.println("I am on the home page of DWS");
            
            // Click on the Register link using XPath
            driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div/ul/li/a")).click();
            
            // Get the title of the page to verify if the navigation to the Register page was successful
            String actual_result1 = driver.getTitle();
            
            // Verify that the user is on the Register page
            if(actual_result1.equals(expected_result1)) {
                System.out.println("I am on the Register page");
                
                // Select the gender (Male) using CSS selector
                driver.findElement(By.cssSelector("input[id='gender-male']")).click();
                Thread.sleep(1000);

                // Enter the first name using CSS selector
                driver.findElement(By.cssSelector("input[name='FirstName']")).sendKeys("Salman");
                Thread.sleep(1000);

                // Enter the last name using CSS selector
                driver.findElement(By.cssSelector("input[name='LastName']")).sendKeys("Khan");
                Thread.sleep(1000);

                // Enter the email using CSS selector
                driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("JustImage12@gmail.com");
                Thread.sleep(1000);

                // Enter the password using CSS selector
                driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("Seaways@123");
                Thread.sleep(1000);

                // Confirm the password using CSS selector
                driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("Seaways@123");
                Thread.sleep(1000);

                // Click on the Register button to complete the registration process
                driver.findElement(By.cssSelector("input[value='Register']")).click();
                Thread.sleep(3000);
                
                // Close the browser
                driver.quit();
                
            } else {
                System.out.println("Not on the Register page");
                driver.close();
            }
            
        } else {
            System.out.println("Not on the DWS home page");
            driver.close();
        }
    }
}
