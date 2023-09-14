import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class CSSselectors {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com");
        //driver.get("http://localhost/sdetpractice.com");
        driver.findElement(By.cssSelector("img[alt='Picture of Build your own computer']")).click();
    }
}
