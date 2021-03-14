import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class login_Module extends func {
    @Test()


    public void test() throws Exception {
        SetupChromedriver();

        driver.manage().timeouts().implicitlyWait(80L, TimeUnit.SECONDS);
        loginIN();
        driver.quit();
    }
}