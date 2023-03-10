import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class Registration {

    private By btnJoinFree = By.linkText("Sign up");
    private By inputFirstName = By.xpath("//div[@class='form-group']//input[@id='user_first_name']");
    private By inputLastName = By.xpath("//div[@class='form-group']//input[@id='user_last_name']");
    private By inputEmail = By.xpath("//div[@class='form-group']//input[@id='user_email']");
    private By inputUserName = By.xpath("//div[@class='form-group']//input[@id='user_username']");
    private By inputPassword = By.xpath("//div[@class='form-group']//input[@id='user_password']");
    private By btmJoin = By.name("commit");
    private By btnCopyEmail = By.xpath("/html/body/div[8]/div[1]/div[3]/div[2]/form/div/button");


    @Test
    public void registration() throws InterruptedException {
        WebDriver driver = new ChromeDriver();


        driver.get("https://unsplash.com/");
        driver.manage().window().maximize();
        driver.findElement(btnJoinFree).click();
        driver.findElement(inputFirstName).sendKeys("Nfecxxcw");
        driver.findElement(inputLastName).sendKeys("Tefcxcxcst");

        driver.switchTo().newWindow(WindowType.TAB).get("https://tempmail.plus/ru/#!");
        driver.findElement(btnCopyEmail).click();
        sleep(3000);

        ArrayList<String>newTab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(0)); //window for open


        driver.findElement(inputEmail).sendKeys(Keys.LEFT_CONTROL+"v");
        driver.findElement(inputUserName).sendKeys("txcxcoafsas");
        driver.findElement(inputPassword).sendKeys("647cxcxc3f72144");
        driver.findElement(btmJoin).click();





    }
}
