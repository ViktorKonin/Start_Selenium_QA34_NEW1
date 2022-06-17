import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {
    WebDriver wd;

    @Test
    public void start(){
      wd=new ChromeDriver();
      //wd.get("https://contacts-app.tobbymarshall815.vercel.app/home");

      wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
      wd.navigate().back();
      wd.navigate().forward();
      wd.navigate().refresh();


      //wd.close(); only one tab
      wd.quit(); //all tabs
    }

    @Test
    public void firstTest(){
       wd=new ChromeDriver();
       wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

       //open form -->click login button
        WebElement loginTab;
       // loginTab.click();
    }
}
