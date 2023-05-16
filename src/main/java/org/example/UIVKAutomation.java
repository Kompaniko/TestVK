package org.example;

import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;


import java.util.Set;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
@DisplayName("UI тесты основного функционала")
public class UIVKAutomation {

    // Авторизация пользователя
    public String vkAuthValid(String login, String password) throws InterruptedException {
        open("https://vk.com/login");
        $(By.xpath("//*[@id=\"index_email\"]")).setValue(login);
        $(By.xpath("//*[@id=\"content\"]/div[1]/form/button[1]/span")).click();
        $(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div/form/div[1]/div[3]/div[1]/div/input")).setValue(password);
        $(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div/form/div[2]/button/span[1]/span/span")).click();
        Thread.sleep(10000);
        WebDriver.Options options = getWebDriver().manage();
        Set<Cookie> cookies = options.getCookies();
        cookies.forEach(cookie -> System.out.println(cookie.getName() + ":" +
                cookie.getValue()));
        return login;
    }

    public void vkAuthValidToExit(String login, String password) throws InterruptedException {
        open("https://vk.com/login");
        $(By.xpath("//*[@id=\"index_email\"]")).setValue(login);
        $(By.xpath("//*[@id=\"content\"]/div[1]/form/button[1]/span")).click();
        $(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div/form/div[1]/div[3]/div[1]/div/input")).setValue(password);
        $(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div/form/div[2]/button/span[1]/span/span")).click();
        Thread.sleep(3000);
        $(By.xpath("//*[@id=\"top_profile_link\"]/img")).click();
        $(By.xpath("//*[@id=\"top_logout_link\"]/span")).click();
        Thread.sleep(5000);
    }

    public void vkSearchFriends() throws  InterruptedException{
        $(By.xpath("//*[@id=\"l_fr\"]/a/span")).click();
        $(By.xpath("//*[@id=\"s_search\"]")).setValue("Имя любого пользователя");
        $(By.xpath("//*[@id=\"friends_user_row125464720\"]/div[3]/div[1]/a")).click();
        Thread.sleep(4000);
        $(By.xpath("//*[@id=\"l_pr\"]/a/span[1]")).click();
        Thread.sleep(4000);
    }

    public void vkSendMessage(String nameFriends,String message) throws InterruptedException{
        $(By.xpath("//*[@id=\"l_msg\"]/a/span[1]")).click();
        $(By.xpath("//*[@id=\"im_dialogs_search\"]")).click();
        $(By.xpath("//*[@id=\"im_dialogs_search\"]")).setValue(nameFriends);
        $(By.xpath("//*[@id=\"im_dialogs\"]/li[3]/div[2]/div/div[1]/span[1]/span")).click();
        $(By.xpath("//*[@id=\"im_editable0\"]")).setValue(message).pressEnter();
        Thread.sleep(6000);
        $(By.xpath("//*[@id=\"l_nwsf\"]/a/span[1]")).click();
    }

    public void vkNewEntryBlog(String newRecord) throws InterruptedException{
        $(By.xpath("//*[@id=\"post_field\"]")).click();
        Thread.sleep(2000);
        $(By.xpath("//*[@id=\"post_field\"]")).setValue(newRecord);
        Thread.sleep(2000);
        $(By.xpath("//*[@id=\"send_post\"]/span/span")).click();
        Thread.sleep(2000);
        $(By.xpath("//*[@id=\"send_post\"]/span/span")).click();
        Thread.sleep(4000);
    }

    public void vkRedactorProfile(String message) throws InterruptedException{
        $(By.xpath("//*[@id=\"profile_redesigned\"]/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div[1]/a/span[1]")).click();
        $(By.xpath("//*[@id=\"pedit_general_short_information\"]")).click();
        $(By.xpath("//*[@id=\"pedit_general_short_information\"]")).setValue(message);
        Thread.sleep(4000);
        $(By.xpath("//*[@id=\"pedit_general\"]/div[18]/button/span/span")).click();
        $(By.xpath("//*[@id=\"l_pr\"]/a/span[1]")).click();
    }

    public void searchCommunity(String community) throws InterruptedException{
        $(By.xpath("//*[@id=\"l_gr\"]/a/span[1]")).click();
        $(By.xpath("//*[@id=\"groups_list_search\"]")).setValue(community).pressEnter();
        Thread.sleep(4000);
        $(By.xpath("//*[@id=\"gl_groups142819097\"]/div[3]/div[2]")).contextClick();
        Thread.sleep(4000);


    }

}