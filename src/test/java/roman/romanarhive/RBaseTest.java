package roman.romanarhive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.List;

public class RBaseTest {
    public class BaseTest {

        //  ініціалізація браузера хром
        WebDriver driver = new ChromeDriver();

        //! метод який завжди виконується перед початком тесту
        @BeforeTest
        public void beforeTest() {
            //  фулскрін вікна браузера
            driver.manage().window().maximize();
        }

        //! метод який завжди виконується після завершення тесту
        // закриття вікна браузера після закінчення тесту
        @AfterTest
        public void afterTest() {
            driver.quit();
        }

        //! метод сліп (сек)
        public void sleep(int seconds) {
            try {
                // затримка на N секунд
                Thread.sleep(seconds * 1000);
            } catch (InterruptedException e) {
                // якщо потік перервано під час сну — виводиться інформація про помилку
                e.printStackTrace();
            }
        }

        public WebElement getElementByXpath(String locator) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(15000));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
            return driver.findElement(By.xpath(locator));
        }

        public WebElement getElementByXpath(By locator) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(15000));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return driver.findElement(locator);
        }

        public List<WebElement> getElementsByXpath(String locator) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
            return driver.findElements(By.xpath(locator));
        }

        public void implicitlyWait() {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }

    }

}
