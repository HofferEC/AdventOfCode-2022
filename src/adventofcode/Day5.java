package adventofcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day5 extends AbstractAdventOfCode {

//    final int numberIndex = 3;
//    final int totalCols = 3;
    final int numberIndex = 8;
    final int totalCols = 9;

    @Override
    public Object solvePartOne() throws Exception {
        List<String> lines = readInputForDay(5);
        Stack<Character>[] stacks = new Stack[totalCols];
        for (int i = 0; i < stacks.length; i++) {
            stacks[i] = new Stack<Character>();
        }
        for (int i = numberIndex - 1; i >= 0; i--) {
            for (int j = 0; j < totalCols; j++) {
                int charIdx = j * 4 + 1;
                if (charIdx < lines.get(i).length()) {
                    char c = lines.get(i).charAt(charIdx);
                    if (c == ' ') continue;
                    stacks[j].push(c);
                }
            };
        }
        Pattern commandPattern = Pattern.compile("move (?<amt>\\d+) from (?<srt>\\d+) to (?<end>\\d+)");
        for (int i = numberIndex + 1; i < lines.size(); i++) {
            String line = lines.get(i);
            Matcher commandMatcher = commandPattern.matcher(line);
            if(commandMatcher.find()) {
                int amount = Integer.parseInt(commandMatcher.group("amt"));
                int start = Integer.parseInt(commandMatcher.group("srt")) - 1;
                int end = Integer.parseInt(commandMatcher.group("end")) - 1;

                for (int j = 0; j < amount; j++) {
                    char c = stacks[start].pop();
                    stacks[end].push(c);
                }
            }

//            print("STEP " + (i - numberIndex));
//            for (Stack<Character> s : stacks) {
//                print(s.toString());
//            }
        }
        StringBuilder out = new StringBuilder();
        for (Stack<Character> s : stacks) {
            if (!s.isEmpty()) {
                out.append(s.peek());
            }
        }
        return out.toString();
    }

    @Override
    public Object solvePartTwo() throws Exception {
        List<String> lines = readInputForDay(5);
        Stack<Character>[] stacks = new Stack[totalCols];
        for (int i = 0; i < stacks.length; i++) {
            stacks[i] = new Stack<Character>();
        }
        for (int i = numberIndex - 1; i >= 0; i--) {
            for (int j = 0; j < totalCols; j++) {
                int charIdx = j * 4 + 1;
                if (charIdx < lines.get(i).length()) {
                    char c = lines.get(i).charAt(charIdx);
                    if (c == ' ') continue;
                    stacks[j].push(c);
                }
            };
        }
        Pattern commandPattern = Pattern.compile("move (?<amt>\\d+) from (?<srt>\\d+) to (?<end>\\d+)");
        for (int i = numberIndex + 1; i < lines.size(); i++) {
            String line = lines.get(i);
            Matcher commandMatcher = commandPattern.matcher(line);
            if(commandMatcher.find()) {
                int amount = Integer.parseInt(commandMatcher.group("amt"));
                int start = Integer.parseInt(commandMatcher.group("srt")) - 1;
                int end = Integer.parseInt(commandMatcher.group("end")) - 1;

                Stack<Character> intermediateStack = new Stack<>();
                for (int j = 0; j < amount; j++) {
                    char c = stacks[start].pop();
                    intermediateStack.push(c);
                }
                while(!intermediateStack.isEmpty()) {
                    stacks[end].push(intermediateStack.pop());
                }
            }

//            print("STEP " + (i - numberIndex));
//            for (Stack<Character> s : stacks) {
//                print(s.toString());
//            }
        }
        StringBuilder out = new StringBuilder();
        for (Stack<Character> s : stacks) {
            if (!s.isEmpty()) {
                out.append(s.peek());
            }
        }
        return out.toString();
    }
}
