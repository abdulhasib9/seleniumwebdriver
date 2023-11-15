import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDown {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //divpaxinfo
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        //adding four adults
        for (int i =0;i<=3;i++)  {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        //driver.findElement(By.id("hrefIncAdt")).click();
        //Thread.sleep(2000);
        driver.findElement(By.id("btnclosepaxoption")).click();

        Thread.sleep(7000);
        driver.close();
    }
}
