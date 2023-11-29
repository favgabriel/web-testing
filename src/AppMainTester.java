import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppMainTester {
    WebDriver driver;

    void launch(){
        //System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Desktop\\selenium drivers\\geckodriver\\geckodriver.exe");
        //driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium drivers\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://google.com/");
    }

    void navigate(){
        driver.findElement(By.name("q")).sendKeys("selenium");
        driver.findElement(By.name("q")).submit();
    }
    public static void main(String[] args) {
        AppMainTester appMainTester = new AppMainTester();
        appMainTester.launch();
        appMainTester.navigate();
    }
}