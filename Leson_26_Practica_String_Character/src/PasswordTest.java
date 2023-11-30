import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordTest {
    //public void test_decodePassword_passworDecoded
    @Test
  public void testDecodePasswordPassworDecoded(){
        String password = "asd123";
        int n = 6;
        String encodedPassword = Hw2.encodePassword(password, n);


        String decodedPassword = Hw2.decodePassword(encodedPassword, n);
        Assertions.assertNotNull(encodedPassword);
        Assertions.assertEquals(password,decodedPassword);
        Assertions.assertEquals(password.length() +6, encodedPassword.length());
        Assertions.assertEquals(password, decodedPassword);


  }


}
