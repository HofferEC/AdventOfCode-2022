package adventofcode;

public class Main {

    public static void main(final String[] args) {
        AbstractAdventOfCode[] calendar = new AbstractAdventOfCode[26];

        calendar[0] = null; // it brings me joy to have the numbers match up
        calendar[1] = new Day1();
        calendar[2] = new Day2();
        calendar[3] = new Day3();
        calendar[4] = new Day4();

        int day = Integer.parseInt(args[0]);

        calendar[day].execute();
    }
}
