package adventofcode;

public class Main {

    public static void main(final String[] args) {
        AbstractAdventOfCode[] calendar = new AbstractAdventOfCode[26];

        calendar[0] = null; // it brings me joy to have the numbers match up
        calendar[1] = new Day1();
        calendar[2] = new Day2();
        calendar[3] = new Day3();
        calendar[4] = new Day4(); // lost to the archives
        calendar[5] = new Day5();
        calendar[6] = new Day6();
        calendar[7] = new Day7();
//        calendar[8] = new Day4();
//        calendar[9] = new Day4();
//        calendar[10] = new Day4();
//        calendar[11] = new Day4();
//        calendar[12] = new Day4();
//        calendar[13] = new Day4();
//        calendar[14] = new Day4();
//        calendar[15] = new Day4();
//        calendar[16] = new Day4();
//        calendar[17] = new Day4();
//        calendar[18] = new Day4();
//        calendar[19] = new Day4();
//        calendar[20] = new Day4();
//        calendar[21] = new Day4();
//        calendar[22] = new Day4();
//        calendar[23] = new Day4();
//        calendar[24] = new Day4();
//        calendar[25] = new Day4();

        int day = Integer.parseInt(args[0]);

        calendar[day].execute();
    }
}
