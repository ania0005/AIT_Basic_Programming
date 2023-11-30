package Hw2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStringNumber {
    @Test
    public void test_string_number_equals(){
        String testStr1 = "00.43";
        String testStr2 = "00.43";
       int result = StringNumber.stringNumberEquals(testStr1, testStr2);
        int expectedResult = 1;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
        public void test_string_number_notequals() {
        String testStr1 = "88.994560.43";
        String testStr2 = "00.43";
        int result = StringNumber.stringNumberEquals(testStr1, testStr2);
        int expectedResult = 0;
        Assertions.assertNotEquals(expectedResult, result);
    }

    @Test
    public void test_string_number_not_equals_minus() {
        String testStr1 = "88.994560.43";
        String testStr2 = "-2";
        int result = StringNumber.stringNumberEquals(testStr1, testStr2);
        int expectedResult = -1;
        Assertions.assertNotEquals(expectedResult,result);
    }
    @Test
    public void test_string_number_notnull() {
        String testStr1 = "";
        String testStr2 = "00.43";
        int result = StringNumber.stringNumberEquals(testStr1, testStr2);
        Assertions.assertNotNull (result);
    }




}
