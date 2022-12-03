package adventofcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day3 extends AbstractAdventOfCode {

    @Override
    public Object solvePartOne() throws Exception {
        List<String> input = readInputForDay(3);
        int sum = 0;
        for (String s : input) {
            String first = s.substring(0, s.length() / 2);
            String second = s.substring(s.length() / 2);
            System.out.println(first);
            for (Character c : first.toCharArray()) {
                if (second.contains(c.toString())) {
                    int val = 0;
                    if (c >= 'a') {
                        val = c - 'a' + 1;
                        System.out.println(s + ": " + val);
                    } else {
                        val = c - 'A' + 27;
                        System.out.println(s + ": " + val);
                    }
                    sum += val;
                    break;
                }
            }
        }
        return sum;
    }

    @Override
    public Object solvePartTwo() throws Exception {
        List<String> input = readInputForDay(3);

        int sum = 0;
        for (int i = 0; i < input.size() ; i+=3) {
            Set<Character> commonLetters = new HashSet<>();
            String firstString = input.get(i);
            for (char c : firstString.toCharArray()) {
                commonLetters.add(c);
            }
            for (int j = 1; j < 3; j++) {
                String str = input.get(i + j);
                for (Object c : commonLetters.toArray()) {
                    if (!str.contains("" + c)) {
                        commonLetters.remove(c);
                    }
                }
            }
            char c = commonLetters.stream().findFirst().get(); // this is what I get for using java
            if (c >= 'a') {
                sum += 1 + c - 'a';
            } else {
                sum += 27 + c - 'A';
            }
        }
        return sum;
   }
}
