package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ShinchanFBForm {

    public static void main(String[] args) throws InterruptedException {
        // Aim: Automate the process of filling out the Facebook sign-up form and verifying the page

        // Expected URL of the Facebook homepage
        String expected_result = "https://www.facebook.com/";

        // Set up ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Maximize browser window
        driver.manage().window().maximize();
        
        // Navigate to the Facebook homepage
        driver.get("https://www.facebook.com/");

        // Get the current URL of the page
        String actual_result = driver.getCurrentUrl();
                
        // Verify if the current URL matches the expected URL
        if (actual_result.equals(expected_result)) {
            // Find the "Create New Account" button using XPath
            WebElement create_account = driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]"));
            
            // Check if the "Create New Account" button is enabled
            if (create_account.isEnabled()) {
                System.out.println("Create new account button is displayed");
                
                // Click on the "Create New Account" button
                create_account.click();
                
                // Wait for 3 seconds to allow the form to load
                Thread.sleep(3000);

                // Fill in the first name
                driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Shinchan");
                Thread.sleep(1000);

                // Fill in the last name
                driver.findElement(By.name("lastname")).sendKeys("Nohara");
                Thread.sleep(1000);

                // Fill in the email address
                driver.findElement(By.name("reg_email__")).sendKeys("shinchan2005@gmail.com");
                Thread.sleep(1000);

                // Fill in the password
                driver.findElement(By.name("reg_passwd__")).sendKeys("Nuttertools@123");
                Thread.sleep(1000);

                // Select the day of birth from the dropdown
                WebElement day = driver.findElement(By.id("day"));
                Select sel = new Select(day);
                sel.selectByVisibleText("10");
                Thread.sleep(1000);

                // Select the month of birth from the dropdown
                WebElement month = driver.findElement(By.id("month"));
                Select sel2 = new Select(month);
                sel2.selectByValue("11");
                Thread.sleep(1000);

                // Select the year of birth from the dropdown
                WebElement year = driver.findElement(By.id("year"));
                Select sel3 = new Select(year);
                sel3.selectByIndex(8);
                Thread.sleep(1000);

                // Select the gender (female) from the radio buttons
                driver.findElement(By.cssSelector("input[value='2']")).click();
                Thread.sleep(1000);
                
                // Close the browser
                driver.close();
            } else {
                // Print message if the "Create New Account" button is not displayed
                System.out.println("Create new account button is not displayed");
                
                // Close the browser
                driver.close();
            }
        }
    }
}
