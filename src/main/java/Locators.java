import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //open url
        driver.get("http://localhost/sdetpractice.com");
//        driver.findElement(By.id("search")).sendKeys("car");
       Thread.sleep(3000);
//        WebElement searchBtn= driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div[2]/form/div/div[1]/button"));
//        searchBtn.click();

        //linktext
       // driver.findElement(By.linkText("PRINTED LONG SLEEVE SHIRT")).click();

        //numbers of products in home page
        List<WebElement> productList = driver.findElements(By.className("product"));
        System.out.println(productList.size());

        //find the total numbers of link in home page
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
    }
}
