package Collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static jdk.jfr.internal.instrument.JDKEvents.remove;
import static org.junit.jupiter.api.Assertions.*;

class ArraylistTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        String [] sourse = {"Jan", "Feb", "Mar", "Apr", "Mai"};
    }

    @org.junit.jupiter.api.Test
    void add() {
    }

    @org.junit.jupiter.api.Test
    void get() {
    }

    @org.junit.jupiter.api.Test
    void set() {
    }

    @org.junit.jupiter.api.Test
    void size() {
    }

    @org.junit.jupiter.api.Test
    void contains() {
        contains();
    }

    @Test
    public void test_remove () {
        MyList<String> list = new Arraylist<String>();
        boolean result = list.remove("Mai");
        System.out.println(list);
        System.out.println();



    }

    @org.junit.jupiter.api.Test
    void removeByIndex() {
    }
}