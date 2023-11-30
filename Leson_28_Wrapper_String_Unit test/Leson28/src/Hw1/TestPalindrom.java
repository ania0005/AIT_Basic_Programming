package Hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPalindrom {

@Test
    public void  test_getLine_inputValueIsNull_resultfalse(){
    // Given
    String testString = null;
    // When
    boolean result = Palindrom.isPalindrom(testString);
    // Then
    Assertions.assertFalse(result);
}
@Test
public void  test_getLine_is_not_palindrom(){
    String testString = "Tania";
    boolean result = Palindrom.isPalindrom(testString);
   Assertions.assertFalse(result);
}
    @Test
    public void  test_getLine_is_palindrom(){
        String testString = "anina";
        boolean result = Palindrom.isPalindrom(testString);
        Assertions.assertTrue(result);
    }

}
