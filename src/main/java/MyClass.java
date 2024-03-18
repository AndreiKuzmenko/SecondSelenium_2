import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyClass {
    WebDriver wd;
@BeforeMethod
    public void precondition(){
    wd = new ChromeDriver();
    wd.get("https://telranedu.web.app/home");

}
@Test
    public void Class(){

}
@AfterMethod
    public void postcondition(){

}

}
