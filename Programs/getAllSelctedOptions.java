package BasicNa;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllSelctedOptions {

    // Aim: The aim of this script is to demonstrate how to interact with a multi-select dropdown
    // using Selenium WebDriver in Java, select multiple options, and retrieve all selected options.

    public static void main(String[] args) throws InterruptedException {

        // Set up WebDriver (ChromeDriver) and maximize the browser window
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Pause for 3 seconds to allow the browser to load properly
        Thread.sleep(3000);

        // Navigate to the local HTML file with the multi-select dropdown
        driver.get("file:///C:/Users/Amey%20Deshpande/Downloads/demo.html");

        // Locate the multi-select dropdown element by its ID
        WebElement cars = driver.findElement(By.id("multiple_cars"));

        // Create a Select object to interact with the multi-select dropdown
        Select sel = new Select(cars);

        // Select multiple options by their visible text
        sel.selectByVisibleText("Ford");
        sel.selectByVisibleText("Audi");
        sel.selectByVisibleText("Volvo");

        // Retrieve all selected options and store them in a list
        List<WebElement> selectedOptions = sel.getAllSelectedOptions();

        // Loop through the list of selected options and print the text of each option
        for (WebElement web : selectedOptions) {
            System.out.println(web.getText());
        }

        // Pause for 1 second before closing the browser
        Thread.sleep(1000);
        driver.quit(); // Close the browser and end the WebDriver session
    }
}
