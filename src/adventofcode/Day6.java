package adventofcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day6 extends AbstractAdventOfCode {

    @Override
    public Object solvePartOne() throws Exception {
        String line = readInputForDay(6).get(0);

        int numsToCheck = 4;

        char[] letters = new char[numsToCheck];
        for (int i = 0; i < line.length(); i++) {
            letters[i % numsToCheck] = line.charAt(i);
            if (i < numsToCheck) continue;
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < numsToCheck; j++) {
                set.add(letters[j]);
            }
            if (set.size() == numsToCheck) return i + 1;
        }

        return null;
    }

    @Override
    public Object solvePartTwo() throws Exception {
        String line = readInputForDay(6).get(0);

        int numsToCheck = 14;

        char[] letters = new char[numsToCheck];
        for (int i = 0; i < line.length(); i++) {
            letters[i % numsToCheck] = line.charAt(i);
            if (i < numsToCheck) continue;
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < numsToCheck; j++) {
                set.add(letters[j]);
            }
            if (set.size() == numsToCheck) return i + 1;
        }

        return null;
    }
}
