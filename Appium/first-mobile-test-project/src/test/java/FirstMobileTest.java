import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstMobileTest {

    private static AppiumDriverLocalService server;
    private AppiumDriver driver;

    @BeforeAll
    public static void setUpServer(){

        server = new AppiumServiceBuilder()
                .usingPort(4723)
                .withArgument(() -> "--base-path", "/wd/hub")
                .build();

        server.start();

    }

    @AfterAll
    public static void tearDownServer(){
        if(server != null) server.stop();
        server = null;
    }

    @BeforeEach
    public void setUpDriver() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("deviceName", "f2fbd0f8");
        capabilities.setCapability("ignoreHiddenApiPolicyError", true);
        capabilities.setCapability("ensureWebviewsHavePages", true);
        capabilities.setCapability("newCommandTimeout", 3600);
        capabilities.setCapability("connectHardwareKeyboard", true);
        capabilities.setCapability("app", "/home/aluno/Downloads/app-release-unsigned.apk");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AppiumDriver(url, capabilities);
    }

    @AfterEach
    public void tearDownDriver(){

        if(driver != null) driver.quit();
        driver = null;
    }

    @Test
    public void loginTest(){

        new WebDriverWait(driver, 60)
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.xpath("//*[@resource-id='yourUsername']")));

        WebElement txtUser = driver.findElement(By.xpath("//*[@resource-id='yourUsername']")),
                    txtPassword = driver.findElement(By.xpath("//*[@resource-id='yourPassword']")),
                    btnLogin = driver.findElement(By.xpath("//*[@resource-id='logginButton']"));

        txtUser.sendKeys("admin@automacao.org.br");
        txtPassword.sendKeys("password01");
        btnLogin.click();

        new WebDriverWait(driver, 100)
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.xpath("(//*[@text='Dashboard'])[1]")));

    }
}
