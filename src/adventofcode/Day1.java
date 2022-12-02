package adventofcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day1 extends AbstractAdventOfCode {

    @Override
    public Object solvePartOne() throws Exception {
        List<Integer> ints = readInputAsIntsForDay(1);
        int highest = 0;
        int current = 0;
        for (Integer i : ints) {
            if (i != null) {
                current += i;
            } else {
                highest = Math.max(highest, current);
                current = 0;
            }
        }
        highest = Math.max(highest, current);
        return highest;
    }

    @Override
    public Object solvePartTwo() throws Exception {
        List<Integer> ints = readInputAsIntsForDay(1);
        List<Integer> totals = new ArrayList<>();
        int current = 0;
        for (Integer i : ints) {
            if (i != null) {
                current += i;
            } else {
                totals.add(current);
                current = 0;
            }
        }
        totals.add(current);

        Collections.sort(totals);

        return totals.get(totals.size()-1) + totals.get(totals.size()-2) + totals.get(totals.size()-3);
    }
}
