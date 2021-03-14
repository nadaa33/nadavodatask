import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class Registeration extends func {
    @Test()


    public void test () throws Exception
    {
       SetupChromedriver();

       registration();

       driver.manage().timeouts().implicitlyWait(120L, TimeUnit.SECONDS);
         driver.quit();   ;


    }


}
