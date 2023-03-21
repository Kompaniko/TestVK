import org.example.MainPageFunctional;
import org.junit.jupiter.api.Test;

public class MainPageFunctionalTest {

    MainPageFunctional mainPageFunctional = new MainPageFunctional();

    @Test
    public void testAuth(){
        mainPageFunctional.vkAuthValid("nikitakompanic@gmail.com", "ko14juvF");
    }
    @Test
    public void testEdit(){
        mainPageFunctional.mainPageEdit();
    }
}
