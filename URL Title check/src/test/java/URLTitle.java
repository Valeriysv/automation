import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLTitle {

WebDriver driver = new ChromeDriver();

@Test
public void checkTitle(){
    driver.get("https://grinfer.com/");
    driver.manage().window().maximize();

    String getTitle = driver.getTitle();
    Assert.assertEquals(getTitle, "Top Online Courses | Grinfer");

}
    @Test
    public void checkURL(){
        driver.get("https://grinfer.com/");
        driver.manage().window().maximize();

        String getURL = driver.getCurrentUrl();
        Assert.assertEquals(getURL, "https://grinfer.com/");

    }
    @Test
    public void checkPage(){
        driver.get("https://grinfer.com/");
        driver.manage().window().maximize();

        String getPage = driver.getPageSource();
        System.out.println("Page: "+getPage);
        driver.close();
    }

}
