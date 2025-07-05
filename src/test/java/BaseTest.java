import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    //  ініціалізація браузера хром
    WebDriver driver = new ChromeDriver();

    //! метод який завжди виконується перед початком тесту
    @BeforeTest
    public void BeforeTest(){
        //  фулскрін вікна браузера
        driver.manage().window().maximize();
    }

    //! метод який завжди виконується після завершення тесту
    // закриття вікна браузера після закінчення тесту
    @AfterTest
    public void afterTest(){
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
}
