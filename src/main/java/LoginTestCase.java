import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {

    public static void main(String[] args) throws InterruptedException {

                /*
        * Test case
        --------
        1) Launch browser
        2) open url
            https://opensource-demo.orangehrmlive.com/
        3) Provide username  - Admin
        4) Provide password  - admin123
        5) Click on Login button
        6) Verify the title of dashboard page
            Exp title : OrangeHRM
        7) close browser*/



       // WebDriverManager.chromedriver().setup(); do not need to specify this after selenium 4.6.0

        //1: launch browser
        ChromeDriver driver = new ChromeDriver();
        //2: open URL
        driver.get("https://opensource-demo.orangehrmlive.com");
        //opening the browser in fullsize window size
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //3: provide username
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");
        //4: provide password
        driver.findElement(By.name("password")).sendKeys("admin123");
        //5: click on login button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        Thread.sleep(3000);
        //validate page title
        String title =driver.getTitle();
        String expectedTitle = "OrangeHRMa";
        System.out.println(title);
        if(title.equals(expectedTitle)){ System.out.println("Test Passed!!!");}
        else{ System.out.println("Test Failed");}

        //lable validation
        WebElement dashLable =null;
        try {
           dashLable= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
            if (dashLable.getText().equals("Dashboard")) System.out.println("Test Passed");
            else System.out.println("Test failed!!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        //driver.wait(5000);
        driver.quit();

    }
}
