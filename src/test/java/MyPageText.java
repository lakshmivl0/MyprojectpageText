import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyPageText{
    public static void main(String[] args) {
        // Set the path to chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the URL
        driver.get("https://qamyprojects.ccbp.tech/");

        // Test the first project page
        System.out.println("Testing the first project page:");
        WebElement firstProject = driver.findElement(By.cssSelector("img:first-of-type"));
        firstProject.click();
        WebElement firstProjectTitle = driver.findElement(By.cssSelector("h1:first-child"));
        System.out.println("Project Title: " + firstProjectTitle.getText());
        WebElement firstProjectDescription = driver.findElement(By.cssSelector("p:nth-child(2)"));
        System.out.println("Project Description: " + firstProjectDescription.getText());
        driver.findElement(By.cssSelector("button:last-of-type")).click();

        // Test the second project page
        System.out.println("\nTesting the second project page:");
        WebElement secondProject = driver.findElement(By.cssSelector("img:nth-of-type(2)"));
        secondProject.click();
        // Add your test steps for the second project page here
        driver.findElement(By.cssSelector("button:last-of-type")).click();

        // Test the third project page
        System.out.println("\nTesting the third project page:");
        WebElement thirdProject = driver.findElement(By.cssSelector("img:nth-of-type(3)"));
        thirdProject.click();
        // Add your test steps for the third project page here
        driver.findElement(By.cssSelector("button:last-of-type")).click();

        // Test the fourth project page
        System.out.println("\nTesting the fourth project page:");
        WebElement fourthProject = driver.findElement(By.cssSelector("img:nth-of-type(4)"));
        fourthProject.click();
        // Add your test steps for the fourth project page here
        driver.findElement(By.cssSelector("button:last-of-type")).click();

        // Close the browser window
        driver.quit();
    }
}