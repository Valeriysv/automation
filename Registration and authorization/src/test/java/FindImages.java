import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class FindImages {

    WebDriver driver = new ChromeDriver();
    Data getDate = new Data();

    private By btnOpenWindow = By.xpath("//div[@class = 'TkpKu']//button[@type='button']");
    private By openFile = By.xpath("//div[@class='Y7cLH QzYnR L2Q39']//input[@type='file']");
    private By getText = By.xpath("//div[@class='Aa1sS j8AIa xNKUO dvBHu oh0KJ']//h1[@class='dvBHu oh0KJ']");

    @Test
    public void findImages() throws InterruptedException {
        driver.get(getDate.getUrl);
        driver.manage().window().maximize();
        sleep(3000);
        driver.findElement(btnOpenWindow).click();
        sleep(3000);
        driver.findElement(openFile).sendKeys(getDate.pathFile);
        sleep(5000);

        String getTextVisualSearch = driver.findElement(getText).getText();
        Assert.assertEquals("Visual search", getTextVisualSearch);
    }

}
