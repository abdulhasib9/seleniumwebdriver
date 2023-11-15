import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDowns {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //select dropdown with select tag
        WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropDown = new Select(staticDropDown);
        dropDown.selectByIndex(3);
        String selectedItem = dropDown.getFirstSelectedOption().getText();
        System.out.println(selectedItem);
        dropDown.selectByVisibleText("AED");
        //selecting by element value attribute
        dropDown.selectByValue("INR");



    }
}
