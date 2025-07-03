import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class NewTestNg extends BaseTest {


    @Test
    public void firstTest() throws InterruptedException {
        System.out.println("sevnhhf");
        driver.get("https://github.com/InnaKozlovska/InnaFirstProjekt");
        By pullRequestTab = By.xpath("//a[@id='pull-requests-tab']");
        String InKommit = "zxcbb";

        driver.findElement(pullRequestTab).click();
        Thread.sleep(1000);
        //a[@data-hovercard-type='pull_request']
        By allPullRequest = By.xpath("//a[@data-hovercard-type='pull_request']");

        List<WebElement> allPullRequestList = driver.findElements(allPullRequest);

        List<String> pullRequestTexts = allPullRequestList.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        System.out.println(pullRequestTexts);





        System.out.println();

    }
}
