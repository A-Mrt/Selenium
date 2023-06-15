package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath="//*[@id=\"userName-value\"]")
    WebElement currentUser;

    public void isCurrentUserCorrect(String user) {
        if (currentUser.getText().equalsIgnoreCase(user)){
            System.out.println("Prawidłowy User: " + currentUser.getText());
        }
        else {
            System.out.println("Błędny User: " + currentUser.getText());
        }
    }
}