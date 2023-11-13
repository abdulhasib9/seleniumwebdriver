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
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        //using the css regular expression
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();

        //finding element using the xpath regular expression
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
    }
}
