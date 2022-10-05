import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.jupiter.api.Assertions;

import static io.restassured.RestAssured.when;

public class webApplicationTests {
    static WebDriver driver = null;

    @Test
    public void testWebApplication() {
        //Your test
    }


    @Test
    public void testUI() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shay\\Desktop\\auotoCAD\\chromedriver.exe");
        driver = new ChromeDriver();
        String domain = "http://localhost:2020/";
        String nameAndIdStudent = "Mahyar Rahmaniezad - 324525237";
        String realNameIdStudent;
        driver.get(domain);
        realNameIdStudent = driver.findElement(By.id("Mahyar Rahmaniezad")).getText();
        Assertions.assertEquals(nameAndIdStudent, realNameIdStudent);





        driver.quit();

    }
}


