package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunction_Using_CssSelector {
    public static void main(String[] args) throws InterruptedException {

        // Aim: This script automates the login process for the Demo Web Shop website.
        // It verifies if the user can successfully navigate to the login page, enter
        // valid credentials, and log in using Selenium WebDriver.

        String expected_result = "https://demowebshop.tricentis.com/"; // Expected URL of the home page
        String expected_result1 = "Demo Web Shop. Login"; // Expected title of the login page

        ChromeDriver driver = new ChromeDriver(); // Initialize the ChromeDriver

        driver.manage().window().maximize(); // Maximize the browser window

        Thread.sleep(1000); // Pause for 1 second

        driver.get("https://demowebshop.tricentis.com/"); // Navigate to the Demo Web Shop website

        Thread.sleep(1000); // Pause for 1 second

        String actual_result = driver.getCurrentUrl(); // Get the current URL

        if (actual_result.equals(expected_result)) {
            System.out.println("I am on the DWS home page");
            driver.findElement(By.linkText("Log in")).click(); // Click on the "Log in" link

            String actual_result1 = driver.getTitle(); // Get the title of the login page

            if (actual_result1.equals(expected_result1)) {
                // Enter the email address into the "Email" input field
                driver.findElement(By.name("Email")).sendKeys("Swagboy20@gmail.com");
                Thread.sleep(1000); // Pause for 1 second for better visibility

                // Enter the password into the "Password" input field
                driver.findElement(By.name("Password")).sendKeys("Nuttertools@12");
                Thread.sleep(1000); // Pause for 1 second for better visibility

                // Click on the "Remember Me" checkbox
                driver.findElement(By.name("RememberMe")).click();
                Thread.sleep(1000); // Pause for 1 second for better visibility

                // Click on the "Log in" button using CSS Selector
                driver.findElement(By.cssSelector("input[value='Log in']")).click();
                Thread.sleep(3000); // Pause for 3 seconds to observe the result

                driver.close(); // Close the browser
            } else {
                System.out.println("I am not on the DWS login page");
                driver.quit(); // Close the browser if the login page is not reached
            }
        } else {
            System.out.println("I am not on the DWS home page");
            driver.quit(); // Close the browser if the home page is not reached
        }
    }
}
