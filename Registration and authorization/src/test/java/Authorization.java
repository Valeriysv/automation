import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authorization {
    WebDriver driver = new ChromeDriver();
    Data getDate = new Data();

    private By btnLogin = By.linkText("Log in");
    private By inputEmail = By.xpath("//div[@class='form-group']//input[@id='user_email']");
    private By inputPassword = By.xpath("//div[@class='form-group']//input[@id='user_password']");
    private By btmJoin = By.name("commit");
    private By getErrorText = By.xpath("//div[@class='row']//div[@class='col-xs-10 col-sm-6 center-block flash__message']");


    @Test
    public void authorization(){
        driver.get(getDate.getUrl);
        driver.manage().window().maximize();
        driver.findElement(btnLogin).click();
        driver.findElement(inputEmail).sendKeys(getDate.email);
        driver.findElement(inputPassword).sendKeys(getDate.password);
        driver.findElement(btmJoin).click();


    }
    @Test
    public void negativeAuthorization(){
        driver.get(getDate.getUrl);
        driver.manage().window().maximize();
        driver.findElement(btnLogin).click();
        driver.findElement(inputEmail).sendKeys(getDate.email);
        driver.findElement(inputPassword).sendKeys(getDate.password);
        driver.findElement(btmJoin).click();
        String getError = driver.findElement(getErrorText).getText();

        Assert.assertEquals("Invalid email or password.", getError);

    }


}
