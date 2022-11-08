package th.ac.ku.book.testingWithSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.web.server.LocalServerPort;

public class RegistationTest {
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
        driver.get("http://localhost:" + "8091" + "/signup" );
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
    void testRegistration() {

        WebElement firstNameField = wait.until(webDriver ->
                webDriver.findElement(By.id("inputFirstName")));
        WebElement lastNameField = driver.findElement(By.id("inputLastName"));
        WebElement userNameField = driver.findElement(By.id("inputUsername"));
        WebElement passwordField = driver.findElement(By.id("inputPassword"));
        WebElement emailField = driver.findElement(By.id("inputEmail"));


        WebElement submitButton = driver.findElement(By.id("submit-button"));



        //ก่อนรัน test เปลี่ยนชื่อและรหัสผ่านตามใน database table user
        firstNameField.sendKeys("panisra");
       lastNameField.sendKeys("wongbupha");
       userNameField.sendKeys("test1");
       passwordField.sendKeys("1104200178882");
       emailField.sendKeys("panisra.w@ku.th");

        submitButton.click();


//        WebElement usernameLoginField = wait.until(webDriver ->
//                webDriver.findElement(By.id("inputUsername")));
//        WebElement passwordLoginField = driver.findElement(By.id("inputPassword"));
//
//        WebElement submitLoginButton = driver.findElement(By.id("submit-button"));
//
//
//        //ก่อนรัน test เปลี่ยนชื่อและรหัสผ่านตามใน database table user
//        usernameLoginField.sendKeys("test");
//        passwordLoginField.sendKeys("1104200178882");
//
//        submitLoginButton.click();

    }

}
