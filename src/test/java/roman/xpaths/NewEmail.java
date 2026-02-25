package roman.xpaths;

import org.testng.annotations.Test;

import java.util.NoSuchElementException;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.fail;

public class NewEmail extends BaseTest {
    @Test
    public void NewEmail() {
        try {
            driver.get("https://www.ukr.net/");
            getElementByXpath("//a[text()='Створити скриньку']").click();
            String regNewEmailPage = driver.getCurrentUrl();
            assertTrue(regNewEmailPage.contains("accounts.ukr.net"));
        } catch (NoSuchElementException errorMsg) {
            fail("Такої кнопки не існує" + errorMsg.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
