import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class RShowNamesAllPR extends BaseTest {

    @Test
    public void showNamesAllPR() {
        driver.get("https://github.com/InnaKozlovska/InnaFirstProjekt");
        By pullRequestTab = By.xpath("//a[@id='pull-requests-tab']");
        driver.findElement(pullRequestTab).click();
        sleep(1);
        By allPullRequest = By.xpath("//a[@data-hovercard-type='pull_request']");
        List<WebElement> allPullRequestList = driver.findElements(allPullRequest);
        List<String> pullRequestTexts = allPullRequestList.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

        //! for
        System.out.println("через for");
        for (int iFor = 0; iFor < pullRequestTexts.size(); iFor++) {
            System.out.println(iFor + 1 + " : Назва пул реквеста = " + pullRequestTexts.get(iFor));
        }

        //! for-each
        System.out.println();
        System.out.println("через for-each");
        int iForEach = 0;
        for (String pullRequestText : pullRequestTexts) {
            System.out.println(iForEach + 1 + " : Назва пул реквеста = " + pullRequestText);
            iForEach++;
        }

    }
}
