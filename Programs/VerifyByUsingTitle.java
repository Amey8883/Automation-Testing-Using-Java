package BasicNa;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByUsingTitle {

    // Aim: The purpose of this program is to verify whether the browser has successfully 
    // navigated to the Demo Web Shop home page by comparing the expected page title with the actual page title.

    public static void main(String[] args) throws InterruptedException {

        // Define the expected page title that we want to verify
        String expected_result = "Demo Web Shop";

        // Create a new instance of the ChromeDriver to control the Chrome browser
        ChromeDriver driver = new ChromeDriver();

        // Maximize the browser window to ensure all elements are visible
        driver.manage().window().maximize();

        // Pause the execution for 3 seconds to allow the browser to load
        Thread.sleep(3000);

        // Navigate to the Demo Web Shop website
        driver.navigate().to("https://demowebshop.tricentis.com/");

        // Get the current title of the page after navigation
        String actual_result = driver.getTitle();

        // Compare the expected title with the actual title and print the result
        if (expected_result.equals(actual_result)) {
            System.out.println("I am in the home page");
        } else {
            System.out.println("I am not in the home page");
        }

        // Close all browser windows and safely end the session
        driver.quit();
    }
}
