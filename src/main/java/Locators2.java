import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {
    public static void main(String[] args) throws InterruptedException {
        String name= "rahul";
        System.setProperty("webdriver.chrome.driver","/Users/thebeast/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://rahulshettyacademy.com/locatorspractice");

        //login to the site
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();

        //finding element using the xpath regular expression
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        Thread.sleep(1000);
        String successMessage = driver.findElement(By.tagName("p")).getText();
       // System.out.println(successMessage);
        Assert.assertEquals(successMessage,"You are successfully logged in.");

        String welcomeMessage= driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
        System.out.println(welcomeMessage);
        Assert.assertEquals(welcomeMessage,"Hello "+name+",");
    }
}
