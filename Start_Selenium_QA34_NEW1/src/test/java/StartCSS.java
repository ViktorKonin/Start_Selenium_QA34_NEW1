import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class StartCSS {
    WebDriver wd;

    @Test
    public void startCssLocators() {
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

        WebElement el1 = wd.findElement(By.id("root"));
        WebElement el2 = wd.findElement(By.tagName("a"));
        List<WebElement> list = wd.findElements(By.tagName("a"));// --> 3 a
        wd.findElements(By.className("container"));
        //wd.findElement(By.name("name"));

        wd.findElements(By.linkText("LOGIN"));
        wd.findElements(By.partialLinkText("LOG"));

        //////////////////////CSS//////////////////////

        //tagname--------------------------
        wd.findElements(By.cssSelector("div"));
        wd.findElements(By.xpath("//div"));

        wd.findElements(By.cssSelector("a"));
        wd.findElements(By.xpath("//a"));

        wd.findElements(By.cssSelector("input"));
        wd.findElements(By.xpath("//input"));

        wd.findElements(By.cssSelector("button"));
        wd.findElements(By.xpath("//button"));

        //id--->#
        wd.findElements(By.cssSelector("#root"));
        wd.findElements(By.id("root"));
        wd.findElements(By.xpath("//*[@id='root']"));
        //class----> .class
        wd.findElements(By.cssSelector(".container"));
        wd.findElements(By.xpath("//*[@class='container']"));
        //------------------------
        wd.findElements(By.cssSelector("[href='/home']"));
        wd.findElement(By.xpath("//*[@href='/home']"));


        //attribute
        wd.findElement(By.cssSelector("[placeholder='Email']"));
        wd.findElement(By.xpath("//*@placeholder='Email'"));

        //start with
        wd.findElement(By.cssSelector("[placeholder='Email']"));
        //start with "Em"
        wd.findElement(By.cssSelector("[placeholder ^='Em']"));
        wd.findElement(By.xpath("//*[starts-with(@placeholder,'Em')]"));
        //end on "il"
        wd.findElement(By.cssSelector("[placeholder $='il']"));
        //contains -> "ai"
        wd.findElement(By.cssSelector("[placeholder *='ai']"));
        wd.findElement(By.xpath("//*[contains(@placeholder,'ei')]"));


    }
}
