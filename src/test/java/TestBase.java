import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import page.Main;
import page.TaskOne;
import page.TaskSix;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;
    public Main main;
    public TaskOne taskOne;
    public TaskSix taskSix;

    @BeforeEach
    public void start(){
    //ff    WebDriverManager.firefoxdriver().setup();
        //  System.out.println("Before each test");
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
   //ff     driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        main = PageFactory.initElements(driver, Main.class);
        taskOne = PageFactory.initElements(driver, TaskOne.class);
        taskSix = PageFactory.initElements(driver, TaskSix.class);
    }

    @AfterEach
    public void finish(){
        driver.quit();
    }

}
