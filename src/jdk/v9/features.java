package jdk.v9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class features {
    public static void main(String[] args) {
        // Factory methods for Immutable List, Set, Map & Map.Entry
        List<String> immutableList = List.of("i", "2", "gone");
        Set<Integer> immutableSet = Set.of(1, 2);
        Map<Integer, String> immutableMap = Map.of(1, "s", 2, "r");
    }
}
