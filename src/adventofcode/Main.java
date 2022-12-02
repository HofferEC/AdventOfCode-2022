package adventofcode;

public class Main {

    public static void main(final String[] args) {
        AbstractAdventOfCode[] calendar = new AbstractAdventOfCode[25];

        calendar[0] = new Day1();
        calendar[1] = new Day1();

        int day = Integer.parseInt(args[0]) - 1;

        calendar[day].execute();
    }
}
