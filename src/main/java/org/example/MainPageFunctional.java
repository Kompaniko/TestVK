package org.example;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;
import com.codeborne.selenide.ex.ElementShould;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.Set;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
@DisplayName("Тестирование страницы профиля")
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


    public void createNewEntry() {
       $(By.xpath("//*[@id=\"post_field\"]")).click();
       $(By.xpath("//*[@id=\"post_field\"]")).setValue("Test");
       $(By.xpath("//*[@id=\"post_visibility_btn\"]/div[1]")).click();
       $(By.xpath("//*[@id=\"friends_only\"]/div")).click();
       $(By.xpath("//*[@id=\"send_post\"]/span/span")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void reNewEntry(){
        $(By.xpath("//*[@id=\"post108586078_15309\"]/div/div[1]/div[3]/div/div/div/span/span/svg")).click();
        $(By.xpath("//*[@id=\"post108586078_15309\"]/div/div[1]/div[3]/div/div/div/div/a[4]")).click();
        $(By.xpath("//*[@id=\"wpe_text\"]")).click();
        $(By.xpath("//*[@id=\"wpe_text\"]")).setValue("Testteset");
        $(By.xpath("//*[@id=\"wpe_save\"]/span/span")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void deleteNewEntry(){
       $(By.xpath("//*[@id=\"post108586078_15308\"]/div[1]/div[1]/div[3]/div/div/div/span/span/svg")).click();
       $(By.xpath("//*[@id=\"post108586078_15308\"]/div[1]/div[1]/div[3]/div/div/div/div/a[1]")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkPowerButton() throws InterruptedException {
        $(By.xpath("//*[@id=\"l_pr\"]/a/span[1]")).click();
        Thread.sleep(5000);
        $(By.xpath("//*[@id=\"l_nwsf\"]/a/span[1]")).click();
        Thread.sleep(5000);
        $(By.xpath("//*[@id=\"l_msg\"]/a/span[1]")).click();
        Thread.sleep(5000);
        $(By.xpath("//*[@id=\"l_ca\"]/a/span[1]")).click();
        Thread.sleep(5000);
        $(By.xpath("//*[@id=\"l_fr\"]/a/span")).click();
        Thread.sleep(5000);
        $(By.xpath("//*[@id=\"l_gr\"]/a/span[1]")).click();
        Thread.sleep(5000);
        $(By.xpath("//*[@id=\"l_ph\"]/a/span[1]")).click();
        Thread.sleep(5000);
        $(By.xpath("//*[@id=\"l_aud\"]/a/span[1]")).click();
        Thread.sleep(5000);
        $(By.xpath("//*[@id=\"l_vid\"]/a/span[1]")).click();
        Thread.sleep(5000);
        $(By.xpath("//*[@id=\"l_svd\"]/a/span[1]")).click();
        Thread.sleep(5000);
        $(By.xpath("//*[@id=\"l_ap\"]/a/span")).click();
        Thread.sleep(5000);
        $(By.xpath("//*[@id=\"l_stickers\"]/a/span[1]")).click();
        Thread.sleep(5000);
        $(By.xpath("//*[@id=\"l_mk\"]/a/span[1]")).click();
        Thread.sleep(5000);

    }

}
