import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import static java.lang.Thread.sleep;

public class MyCookie {
    WebDriver driver = new ChromeDriver();

    @Test
    public void mycookie() throws InterruptedException {
        driver.get("https://github.com/Valeriysv/");
        Cookie getCookie = new Cookie("user_session","2SjA94DN33qvonZfje9VJNAZxsAish0Im8BQbssHIB1bzZ");
        driver.manage().addCookie(getCookie);
        driver.navigate().refresh();
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("cookie======>"+cookies);
        sleep(5000);
        driver.close();

    }
}
