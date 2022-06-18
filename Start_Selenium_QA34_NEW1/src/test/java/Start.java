import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Random;

public class Start {
    WebDriver wd;

    @Test
    public void start() {
        wd = new ChromeDriver();
        //wd.get("https://contacts-app.tobbymarshall815.vercel.app/home");

        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();


        //wd.close(); only one tab
        wd.quit(); //all tabs
    }

    @Test
    public void firstTest() {
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

        //open form -->click login button
        WebElement loginTab = wd.findElement(By.cssSelector("[href='/login']"));
        loginTab.click();

        //fill valid email
        WebElement emailTextBox = wd.findElement(By.cssSelector("[placeholder='Email']"));
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("noa@gmail.com");
        //fill valid password
        WebElement passwordTextBox = wd.findElement(By.cssSelector("[placeholder='Password']"));
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("Nnoa12345$");

        //click login button
        WebElement loginButton = wd.findElement(By.cssSelector("button"));
        loginButton.click();
    }


    //HomeWork--------------------------------------------------------------
    @Test
    public void firstTestRegistrationSuccess() {
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");

        //Generate random number
        Random rand = new Random();
        int upperbound = 10000;
        int int_random = rand.nextInt(upperbound);

        //fill valid email
        WebElement emailTextBox = wd.findElement(By.cssSelector("div.login_login__3EHKB :first-child"));
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("viktor" + int_random + "@gmail.com");

        //fill valid password
        WebElement passwordTextBox = wd.findElement(By.cssSelector("div.login_login__3EHKB :nth-child(2)"));
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("Vvik" + int_random + "$");

        //click Registration button
        WebElement registrationButton = wd.findElement(By.cssSelector("div.login_login__3EHKB :last-child"));
        registrationButton.click();
    }
}
