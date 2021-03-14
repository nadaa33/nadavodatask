
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Cart_checkout extends func {
    @Test

    public void test() throws Exception {
        SetupChromedriver();

        AddToCart();

        Checkout();

        driver.quit();
    }
}