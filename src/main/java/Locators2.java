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

        String url="https://rahulshettyacademy.com/locatorspractice";
       String dynamicPassword= getPassword(driver,url);
        driver.get(url);
        Thread.sleep(2000);

        //login to the site
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(dynamicPassword);
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
        driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
        Thread.sleep(2000);
        driver.close();
    }
    public static String getPassword(WebDriver driver,String url) throws InterruptedException {
        driver.get(url);
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String successResetMessage = driver.findElement(By.cssSelector("form p")).getText();
        String password[] = successResetMessage.split("'");
        String passwordText = password[1].split("'")[0];
        System.out.println(passwordText);
        return passwordText;

    }
}
