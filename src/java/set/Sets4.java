package set;

import java.util.HashSet;
import java.util.Set;


public class Sets4 {

    private static Set<Integer> setOfNums = new HashSet<>();

    public Sets4() {
    }

    public static Set<Integer> Sets4(Integer[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            setOfNums.add(numbers[i]);
        }
        return setOfNums;
    }

    public static void printSet4(Set<Integer> arraysSet) {
        for (int i = 0; i < arraysSet.size(); i++) {
        }
        System.out.println("Numbers in set (HashSet): " + arraysSet);
    }
}
