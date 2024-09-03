package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import CrossBrowserTesting.CrossBrowserTesting;

public class Assignment3new extends CrossBrowserTesting {

    public static void main(String[] args) throws InterruptedException {

        // Define the expected URL to verify if the driver is on the correct page
        String expected_result = "https://demowebshop.tricentis.com/";

        // Initialize the browser and navigate to the expected page
        preCondition("chrome");

        // Get the current URL of the page to verify if it matches the expected URL
        String actual_result = driver.getCurrentUrl();

        if (expected_result.equals(actual_result)) {
            // Confirm that we are on the correct page
            System.out.println("I am on the DWS page");

            // Click on the 'Digital downloads' link to navigate to that section
            driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
            Thread.sleep(3000); // Wait for 3 seconds to ensure the page loads completely

            // Sort options: Iterate through sorting options and select each one
            WebElement sort_By = driver.findElement(By.id("products-orderby"));
            Select sel = new Select(sort_By);
            int i = 0;
            List<WebElement> products = sel.getOptions();
            for (WebElement web : products) {
                sel.selectByIndex(i++);
                // Re-initialize the Select element to ensure it updates with new selection
                sort_By = driver.findElement(By.id("products-orderby"));
                sel = new Select(sort_By);
                Thread.sleep(2000); // Wait for 2 seconds to observe the sorting effect
            }

            // Page size options: Iterate through page size options and select each one
            WebElement display = driver.findElement(By.id("products-pagesize"));
            Select sel1 = new Select(display);
            int j = 0;
            List<WebElement> per_Page = sel1.getOptions();
            for (WebElement web : per_Page) {
                sel1.selectByIndex(j++);
                // Re-initialize the Select element to ensure it updates with new selection
                display = driver.findElement(By.id("products-pagesize"));
                sel1 = new Select(display);
                Thread.sleep(2000); // Wait for 2 seconds to observe the page size change
            }

            // View mode options: Iterate through view mode options and select each one
            WebElement view_as = driver.findElement(By.id("products-viewmode"));
            Thread.sleep(2000); // Wait for 2 seconds before changing view mode
            Select sel2 = new Select(view_as);
            int k = 0;
            List<WebElement> third = sel2.getOptions();
            for (WebElement web : third) {
                sel2.selectByIndex(k++);
                // Re-initialize the Select element to ensure it updates with new selection
                view_as = driver.findElement(By.id("products-viewmode"));
                sel2 = new Select(view_as);
                Thread.sleep(2000); // Wait for 2 seconds to observe the view mode change
            }

            // Close the browser
            driver.quit();

        } else {
            // If not on the expected page, output a message and close the browser
            System.out.println("I am not on the DWS page");
            driver.quit();
        }
    }
}
