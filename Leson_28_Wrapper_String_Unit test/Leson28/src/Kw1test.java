import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Kw1test {
@Test
    public void test_getDigits_validString_digitsString() {
    //given дано
    String testString = "gjs7 576";
    //When  если
    String result = Kw1.getDigits(testString);
    // Then  тогда
    String expectedResult = "7576";
    Assertions.assertNotNull(result);
    Assertions.assertEquals(expectedResult, result);
}


    @Test
    @DisplayName("Тест для проверки входящего элемента")
    public void vartest_getdigits_inpytValueIsNull_emptyString(){
        String testString = null;
        //When  если
        String result = Kw1.getDigits(testString);
        // Then  тогда


        Assertions.assertNull(result);


    }



@Test
    private void vartest_getdigits_inpytValueIsNull_emptyString1() {
    }

}
