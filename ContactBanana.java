import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Random;

public class ContactBanana extends Hooks {
    @Test
    public void contactus() {
        System.out.println("i am in contact page");
        driver.findElement(By.xpath("//*[@id='navbar-collapse']/ul/li[4]/a")).click();
        //driver.findElement(By.linkText("contact-us")).click();
        driver.findElement(By.name("uname")).sendKeys("akhi");
        driver.findElement(By.name("email")).sendKeys("maturiakhila@gmail.com");
        driver.findElement(By.name("subject")).sendKeys("Sony");
        driver.findElement(By.name("message")).sendKeys("We want to speak about ur product");
        driver.findElement(By.name("btnSubmit")).click();
    }

    @Test
    public void registerp()throws InterruptedException {
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("uname22")).sendKeys("jushu");
        Random r = new Random();
        int result = r.nextInt();
        System.out.println(result);
        driver.findElement(By.name("email22")).sendKeys("akhi"+result+"@gmail.com", " ");
        driver.findElement(By.id("pass22")).sendKeys("jush123");
        driver.findElement(By.id("cpass22")).sendKeys("jush123");
        driver.findElement(By.name("phone22")).sendKeys("07878789000");
        driver.findElement(By.name("address22")).sendKeys("444fourthavenue");
        driver.findElement(By.name("postal")).sendKeys("E116dd");
        driver.findElement(By.name("reg_button1")).click();
        Thread.sleep(3000);
    }
    @Test
    public void contactassert()

    {
        System.out.println("Checking the message displayed");
        driver.findElement(By.id("email")).sendKeys("maturiakhila@gmail.com");
        driver.findElement(By.id("subject")).sendKeys("Hello");
        driver.findElement(By.id("message")).sendKeys("We want to know about Laptops");
        driver.findElement(By.name("btnSubmit")).click();
        boolean req=driver.getPageSource().contains("Name Required");
        Assert.assertTrue(req);
        System.out.println(req);
    }
    }
