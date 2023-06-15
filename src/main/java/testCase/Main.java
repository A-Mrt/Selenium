package testCase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("Webdriver.Chrome.Driver", "\"C:\\Users\\user\\Desktop\\repozytoria\\Selenium\\chromedriver\\chromedriver.exe\"");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops);
        driver.get("https://demoqa.com/books");
        driver.manage().window().maximize();

        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);

        homepage.loginClick();

        loginpage.enterUserName("gunjankaushik");
        loginpage.enterPassword("Password@123");
        scrollTillEnd(driver);
        loginpage.clickLogin();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        dashboardPage.isCurrentUserCorrect("gunjankaushik");
    }

    // metoda na scrollowanie okna przegladarki do samego dolu
    private static void scrollTillEnd(WebDriver driver){
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}