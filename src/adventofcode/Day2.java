package adventofcode;

import java.util.List;

public class Day2 extends AbstractAdventOfCode {

    @Override
    public Object solvePartOne() throws Exception {
        List<String> input = readInputForDay(2);
        int score = 0;
        for (String s : input) {
            if (s.charAt(2) == 'X') { // rock
                score += 1;
                if (s.charAt(0) == 'A') { // rock
                    score += 3;
                } else if (s.charAt(0) == 'C') {  // Scissors
                    score += 6;
                }
            } else if (s.charAt(2) == 'Y') { // Paper
                score += 2;
                if (s.charAt(0) == 'B') { // paper
                    score += 3;
                } else if (s.charAt(0) == 'A') { // rock
                    score += 6;
                }
            } else { // Scissors
                score += 3;
                if (s.charAt(0) == 'C') { // scissors
                    score += 3;
                } else if (s.charAt(0) == 'B') { // paper
                    score += 6;
                }
            }
        }
        return score;
    }

    @Override
    public Object solvePartTwo() throws Exception {
        List<String> input = readInputForDay(2);
        int score = 0;
        for (String s : input) {
            if (s.charAt(2) == 'X') { // lose
                if (s.charAt(0) == 'A') { // rock
                    score += 3;
                } else if (s.charAt(0) == 'B') { // paper
                    score += 1;
                } else { // scissors
                    score += 2;
                }
            } else if (s.charAt(2) == 'Y') { // draw
                score += 3;
                if (s.charAt(0) == 'A') { // rock
                    score += 1;
                } else if (s.charAt(0) == 'B') { // paper
                    score += 2;
                } else { // scissors
                    score += 3;
                }

            } else { // win
                score += 6;
                if (s.charAt(0) == 'A') { // rock
                    score += 2;
                } else if (s.charAt(0) == 'B') { // paper
                    score += 3;
                } else { // scissors
                    score += 1;
                }
            }
        }
        return score;
    }
}
