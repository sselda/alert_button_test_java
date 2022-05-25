package alert_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert_test {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users//User//Selenium//ChromeDriver//chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("promtButton")).click();

        WebDriverWait  wait = new WebDriverWait(driver,5); // 5 saniye bekledikten sonra alert pop up cıksın
        wait.until(ExpectedConditions.alertIsPresent());

        System.out.println(driver.switchTo().alert().getText()); //alert pop up da evet veya hayır deyince pop up üzerndeki yazıyı konsole yazdır.

        driver.switchTo().alert().sendKeys("selda");

        driver.switchTo().alert().dismiss(); //switch to : başka pencereye geçtim.alert() methodu - accept() = acılan pop up ta evet tuşlanırsa
                                              //dismiss () : cansel butonu seçilirse



    }


}
