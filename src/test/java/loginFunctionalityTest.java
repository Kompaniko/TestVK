import org.example.LoginFunctionality;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName("Проверка аутентификации ")
public class loginFunctionalityTest {

    LoginFunctionality loginFunctionality = new LoginFunctionality();
    @Test
    public void testvkAuth(){
      loginFunctionality.vkAuthValid("nikitakompanic@gmail.com", "ko14juvF");
    }

    @Test
    public void testvkAuthInvalidPass(){
        loginFunctionality.vkAuthInvalidPassword("nikitakompanic@gmail.com", "ko15juvF");
    }

    @Test
    public void testvkAuthInvalidLog(){
        loginFunctionality.vkAuthInvalidLogin("asdds12gmail.com","ko14juvF");
    }

//    @Test
//    public void testSendMessage(){
//        loginFunctionality.sendMessage();
//    }

}