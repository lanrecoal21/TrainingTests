package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    public static Properties CONFIG = null;
    public static WebDriver driver = null;
    public void initialize() throws IOException {
        if (driver==null) {

            CONFIG = new Properties();
            FileInputStream fn = new FileInputStream( System.getProperty("user.dir") + "/src/main/java/config/config.properties");
            CONFIG.load(fn);

            if (CONFIG.getProperty("browser").equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
                driver = new ChromeDriver();
            } else if (CONFIG.getProperty("browser").equals("IE")) {
                driver =  new InternetExplorerDriver();
                System.setProperty("webdriver.chrome.driver", "c:\\InternetExplorerdriver.exe");

            } else if (CONFIG.getProperty("browser").equals("firefox")) {
                driver = new FirefoxDriver();
                System.setProperty("webdriver.chrome.driver", "c:\\Firefoxdriver.exe");
            }

        }

    }
}
