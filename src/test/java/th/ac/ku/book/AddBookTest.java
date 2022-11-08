package th.ac.ku.book;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AddBookTest {
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
        driver.get("http://localhost:" + "8091" + "/book/add");
    }

    @AfterEach
    public void afterEach() throws InterruptedException {
        Thread.sleep(3000);
    }

    @AfterAll
    public static void afterAll() {
        driver.quit();
    }


    //test add ผ่าน แต่ price ไม่ตรง
    @Test
    void testAddBook() {

        WebElement usernameField = wait.until(webDriver ->
                webDriver.findElement(By.id("inputUsername")));
        WebElement passwordField = driver.findElement(By.id("inputPassword"));

        WebElement submitButton1 = driver.findElement(By.id("submit-button"));


        //ก่อนรัน test เปลี่ยนชื่อและรหัสผ่านตามใน database table user
        usernameField.sendKeys("parn");
        passwordField.sendKeys("1104200178882");

        submitButton1.click();


        WebElement submitButton2 = driver.findElement(By.id("addBook-button"));
        submitButton2.click();



        WebElement nameField = wait.until(webDriver ->
                webDriver.findElement(By.id("inputName")));
        WebElement priceField = driver.findElement(By.id("inputPrice"));
        WebElement categoryField = driver.findElement(By.id("inputCategory"));
        WebElement authorField = driver.findElement(By.id("inputAuthor"));

        WebElement submitButton = driver.findElement(By.id("submit-button"));

        //clearText
        priceField.sendKeys("");

        nameField.sendKeys("Clean Code2");
        priceField.sendKeys("2145");
        categoryField.sendKeys("Science Fiction");
        authorField.sendKeys("Robert Martin");

        submitButton.click();

        WebElement firstTd = wait.until(webDriver ->
                webDriver.findElement(By.tagName("td")));
        assertEquals("Clean Code2", firstTd.getText());

    }




}


