import org.example.UIVKAutomation;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName("Позитивные автоматизированные UI тесты для проверки основного функционала")
public class UIVKAutomationTest {

    UIVKAutomation uivkAutomation = new org.example.UIVKAutomation();
    @Test
    public void testvkAuth() throws InterruptedException {
        uivkAutomation.vkAuthValid("nikitakompanic@gmail.com", "ko14juvF");
    }

    @Test
    public void testVKAuthToExit() throws InterruptedException {
        uivkAutomation.vkAuthValidToExit("nikitakompanic@gmail.com","ko14juvF");
    }
    @Test
    public void testVkSearchFriends() throws InterruptedException{
        uivkAutomation.vkAuthValid("nikitakompanic@gmail.com", "ko14juvF");
        uivkAutomation.vkSearchFriends();
    }

    @Test
    public void testVkSendMessage() throws InterruptedException{
        uivkAutomation.vkAuthValid("nikitakompanic@gmail.com", "ko14juvF");
        uivkAutomation.vkSendMessage("Избранное", "Тестовое сообщение");
    }
    @Test
    public void testVKNewEntryBlog() throws InterruptedException{
        uivkAutomation.vkAuthValid("nikitakompanic@gmail.com", "ko14juvF");
        uivkAutomation.vkNewEntryBlog("Тестовая запись/n тест");

    }
    @Test
    public void testVKRedactorProfile() throws InterruptedException{
        uivkAutomation.vkAuthValid("nikitakompanic@gmail.com", "ko14juvF");
        uivkAutomation.vkRedactorProfile("Вот так вот");
    }
    @Test
    public void testSearchCommunity() throws InterruptedException{
        uivkAutomation.vkAuthValid("nikitakompanic@gmail.com", "ko14juvF");
        uivkAutomation.searchCommunity("НостальжиПК");
    }
}
