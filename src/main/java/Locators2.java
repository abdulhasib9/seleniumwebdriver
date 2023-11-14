import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/thebeast/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://rahulshettyacademy.com/locatorspractice");

        //login to the site
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();

        //finding element using the xpath regular expression
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
    }
}
