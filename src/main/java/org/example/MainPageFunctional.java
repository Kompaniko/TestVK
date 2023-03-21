package org.example;
import com.codeborne.selenide.ex.ElementNotFound;
import com.codeborne.selenide.ex.ElementShould;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.util.Set;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
public class MainPageFunctional {

    public void vkAuthValid(String login, String password){
        open("https://vk.com/login");
        $(By.xpath("//*[@id=\"index_email\"]")).setValue(login);
        $(By.xpath("//*[@id=\"content\"]/div[1]/form/button[1]/span")).click();
        $(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div/form/div[1]/div[3]/div[1]/div/input")).setValue(password);
        $(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div/form/div[2]/button/span[1]/span/span")).click();
        WebDriver.Options options = getWebDriver().manage();
        Set<Cookie> cookies = options.getCookies();
        cookies.forEach(cookie -> System.out.println(cookie.getName() + ":" +
                cookie.getValue()));
    }

    public void mainPageEdit() {
        $(By.xpath("//*[@id=\"l_pr\"]/a/span[1]")).click();
        $(By.xpath("//*[@id=\"profile_redesigned\"]/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[1]/a/span[1]/span")).click();
        $(By.xpath("//*[@id=\"pedit_general_short_information\"]")).setValue("Вот так вот");
        $(By.xpath("//*[@id=\"pedit_general\"]/div[18]/button/span/span")).click();
        $(By.xpath("//*[@id=\"l_pr\"]/a/span[1]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
