import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/thebeast/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://rahulshettyacademy.com/locatorspractice");
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Yousufzai");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        //traversing from parent to child element using xpath
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("912094345");
    }
}
