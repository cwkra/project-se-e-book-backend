package th.ac.ku.book;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest {
    @LocalServerPort
    private Integer port;

    private static WebDriver driver;
    private static WebDriverWait wait;

    @BeforeAll
    public static void beforeAll() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 1000);
    }

    @BeforeEach
    public void beforeEach() {
        driver.get("http://localhost:" + "8091" + "/login" );
    }

    @AfterEach
    public void afterEach() throws InterruptedException {
        Thread.sleep(3000);
    }

    @AfterAll
    public static void afterAll() {
        driver.quit();
    }

    @Test
    void testLogin() {

        WebElement usernameField = wait.until(webDriver ->
                webDriver.findElement(By.id("inputUsername")));
        WebElement passwordField = driver.findElement(By.id("inputPassword"));

        WebElement submitButton = driver.findElement(By.id("submit-button"));


        //ก่อนรัน test เปลี่ยนชื่อและรหัสผ่านตามใน database table user
        usernameField.sendKeys("parn");
        passwordField.sendKeys("1104200178882");

        submitButton.click();





    }


}
