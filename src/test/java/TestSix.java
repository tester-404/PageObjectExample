import org.junit.jupiter.api.Test;
import page.TaskSix;

import static java.lang.Thread.sleep;

public class TestSix extends TestBase {

    @Test
    public void firstTest() throws InterruptedException {
        main.goTo()
                .chooseTask("6");
        //      taskOne.checkPageIsCorrect();
           sleep(2500);
        taskSix.checkAllElementsOnPagePresent()
                .fillInLogin("tester")
                .fillInPassword("123-xyz")
                .loginButtonClick()
                .isLoginCorrect();
        // FORMAT CODE = CTRL ALT + L OR + SHIFT
    }
}