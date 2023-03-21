import org.example.MainPageFunctional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

    @DisplayName("Тестирование страницы профиля")
public class MainPageFunctionalTest {

    MainPageFunctional mainPageFunctional = new MainPageFunctional();

    @Test
    public void testAuth(){
        mainPageFunctional.vkAuthValid("nikitakompanic@gmail.com", "ko14juvF");
    }
    @Test
    public void testEdit(){
        mainPageFunctional.vkAuthValid("nikitakompanic@gmail.com", "ko14juvF");
        mainPageFunctional.mainPageEdit();
    }
    @Test
    public void testCheckNewEntry(){
        mainPageFunctional.vkAuthValid("nikitakompanic@gmail.com", "ko14juvF");
        mainPageFunctional.createNewEntry();
    }
    @Test
    public void testnewEntry(){
        mainPageFunctional.vkAuthValid("nikitakompanic@gmail.com", "ko14juvF");
        mainPageFunctional.reNewEntry();
    }
    @Test
    public void testDeleteEntry(){
        mainPageFunctional.vkAuthValid("nikitakompanic@gmail.com", "ko14juvF");
        mainPageFunctional.deleteNewEntry();
    }
    @Test
    public void testCheckButton() throws InterruptedException {
        mainPageFunctional.vkAuthValid("nikitakompanic@gmail.com", "ko14juvF");
        mainPageFunctional.checkPowerButton();
    }
}
