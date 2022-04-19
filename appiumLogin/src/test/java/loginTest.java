import org.testng.annotations.Test;

public class loginTest extends BaseTest{

    HomePage homePage;
    LoginPage loginPage;

    @Test
    public void goToChrome(){

        homePage = new HomePage(driver);
        homePage.goToLogInPage();
        loginPage = new LoginPage(driver);
        loginPage.logIn();


    }
}
