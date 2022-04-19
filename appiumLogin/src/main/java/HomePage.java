import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage extends BasePage {

    By profilIcon = By.id("com.akakce.akakce:id/rightIcon");

    public HomePage(AppiumDriver<MobileElement> driver) {

        super(driver);

    }

    public void goToLogInPage() {

        waiting(profilIcon,30);
        click(profilIcon);


    }
}
