package example;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class DummySelenideTest {
    @BeforeClass
    public void setUp() {
        Configuration.browser = "chrome";
    }

    @Test
    public void googleSearchTest() throws InterruptedException {
        // Open Chrome and go to Google
        open("https://www.google.com");
        Thread.sleep(4000);
        // Search for 'selenide'
        Selenide.$x("//textarea[@name='q']").sendKeys("selenide");
        Selenide.$x("//textarea[@name='q']").pressEnter();
        
    }
}
