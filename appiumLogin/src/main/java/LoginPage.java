import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    By userNameText = By.id("com.akakce.akakce:id/email_edt");
    By userPass = By.id("com.akakce.akakce:id/password_edt");
    By loginButton = By.id("com.akakce.akakce:id/login_btn_text");

    public LoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void logIn() {

        waiting(userNameText,30);
        type(userNameText,"tolga-han-kara@hotmail.com");
        type(userPass,"**********");
        click(loginButton);

    }
}
