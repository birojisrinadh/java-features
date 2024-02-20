package jdk.v9;

import jdk.common.PrivateInterface;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class features {
    public static void main(String[] args) {
        // Factory methods for Immutable List, Set, Map & Map.Entry
        List<String> immutableList = List.of("i", "2", "gone");
        Set<Integer> immutableSet = Set.of(1, 2);
        Map<Integer, String> immutableMap = Map.of(1, "s", 2, "r");

        // Default & Static methods in interface
        System.out.println(PrivateInterface.isStaticMethod());
        System.out.println(new Sample().isDefaultMethod());
    }

    static class Sample implements PrivateInterface {

    }
}
