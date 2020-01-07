package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private WebDriver webDriver;

    @FindBy(name = "email")
    WebElement email;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "/html/body/div[2]/form[1]/button")
    WebElement loginButton;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void setEmail(String email) {
        this.email.clear();
        this.email.sendKeys(email);
    }

    public void setPassword(String password) {
        this.password.clear();
        this.password.sendKeys(password);
    }

    public void clickLogin() {
        this.loginButton.click();
    }
}
