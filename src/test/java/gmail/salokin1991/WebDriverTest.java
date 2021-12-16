package gmail.salokin1991;

import gmail.salokin1991.config.WebDriverProvider;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    private WebDriver driver = new WebDriverProvider().get();

    @Test
    public void testGithubTitle() {
        System.out.println(driver.getTitle());
        assertEquals("GitHub: Where the world builds software · GitHub", driver.getTitle());
        driver.quit();
    }
}
