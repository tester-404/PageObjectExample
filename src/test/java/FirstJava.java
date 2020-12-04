import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class FirstJava extends TestBase {

    @Test
    public void firstTest() {
        main    .goTo()
                .chooseTask("1");
        taskOne.checkPageIsCorrect();

 //       main.goTo();
   //     main.chooseTask("1");
     //   taskOne.checkPageIsCorrect();

    }

//    @Test
  //  public void secondTest() {
    //    driver.get(SITE_URL);
   // }

}
