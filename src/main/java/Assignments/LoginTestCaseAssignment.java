package Assignments;

import org.bouncycastle.asn1.eac.CertificateHolderReference;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCaseAssignment {
    public static void main(String[] args) throws InterruptedException {
        /*
        *
        * 1) Launch browser
        2) open url
            URL: https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
        3) Provide username  - admin@yourstore.com
        4) Provide password  - admin
        5) Click on Login button
        6) Verify the title of dashboard page
            Exp title : Dashboard / nopCommerce administration
        7) Verify Dashboard
        * */
        //1 launch the browser
        WebDriver driver= new ChromeDriver();
        //2 open url
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

        //3 provide username
        WebElement username= driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        username.clear();
        username.sendKeys("admin@yourstore.com");

        //4 provide password
        WebElement password= driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        password.clear();
        password.sendKeys("admin");

        //5 click the login button
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();

        //Thread.sleep(3000);
        //6 verify the dashboard title
        String actTitle ="";
        try{
         actTitle = driver.getTitle();}
        catch (Exception e )
        {
            System.out.println("the title is not set yet or");
            System.out.println(e.getMessage());
        }
        if(actTitle.equals("Dashboard / nopCommerce administration")) System.out.println("Test Passed!");
        else System.out.println("Sorry Test Failed!!");

        //7 verify the dashboard
        String dashboardTitle= driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();

        if(dashboardTitle.equals("Dashboard")) System.out.println("Test Passed!!!:)");
        else System.out.println("Sorry Your Test2 Has been Failed!!!");


    }
}
