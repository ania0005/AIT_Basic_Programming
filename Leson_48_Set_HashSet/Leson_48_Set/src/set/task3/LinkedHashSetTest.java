package set.task3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {

        Set<String> tree = new TreeSet<>();
        Set<String> hash = new HashSet<>();
        Set<String> linked = new LinkedHashSet<>();

        tree.add("BBB");
        tree.add("EEE");
        tree.add("AAA");
        tree.add("DDD");
        tree.add("GGG");
        tree.add("CCC");
        tree.add("FFF");
        tree.add("EEE");

        hash.add("BBB");
        hash.add("EEE");
        hash.add("AAA");
        hash.add("DDD");
        hash.add("GGG");
        hash.add("CCC");
        hash.add("FFF");
        hash.add("EEE");

        linked.add("BBB");
        linked.add("EEE");
        linked.add("AAA");
        linked.add("DDD");
        linked.add("GGG");
        linked.add("CCC");
        linked.add("FFF");
        linked.add("EEE");

        System.out.println(tree);
        System.out.println(hash);
        System.out.println(linked);
    }
}
