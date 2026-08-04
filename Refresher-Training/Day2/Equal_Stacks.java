package Day2;

import java.util.*;

public class Equal_Stacks {

    public static int equalStacks(List<Integer> first, List<Integer> second, List<Integer> third) {

        int heightOne = 0;
        int heightTwo = 0;
        int heightThree = 0;

        for (int value : first) {
            heightOne += value;
        }

        for (int value : second) {
            heightTwo += value;
        }

        for (int value : third) {
            heightThree += value;
        }

        int topOne = 0;
        int topTwo = 0;
        int topThree = 0;

        while (true) {

            if (topOne == first.size() || topTwo == second.size() || topThree == third.size()) {
                return 0;
            }

            if (heightOne == heightTwo && heightTwo == heightThree) {
                return heightOne;
            }

            if (heightOne >= heightTwo && heightOne >= heightThree) {
                heightOne -= first.get(topOne);
                topOne++;
            } else if (heightTwo >= heightOne && heightTwo >= heightThree) {
                heightTwo -= second.get(topTwo);
                topTwo++;
            } else {
                heightThree -= third.get(topThree);
                topThree++;
            }
        }
    }

    public static void main(String[] args) {

        List<Integer> stack1 = Arrays.asList(3, 2, 1, 1, 1);
        List<Integer> stack2 = Arrays.asList(4, 3, 2);
        List<Integer> stack3 = Arrays.asList(1, 1, 4, 1);

        System.out.println(equalStacks(stack1, stack2, stack3));
    }
}