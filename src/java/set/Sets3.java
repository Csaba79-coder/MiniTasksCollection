package set;

import java.util.HashSet;
import java.util.Set;


public class Sets3 {

    public Sets3() {
    }

    public static Set<Integer> Sets3(Integer[] numbers) {
        Set<Integer> setOfNums = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            setOfNums.add(numbers[i]);
        }
        return setOfNums;
    }

    public static void printSet3(Set<Integer> arraysSet) {
        for (int i = 0; i < arraysSet.size(); i++) {
        }
        System.out.println("Numbers in set (HashSet): " + arraysSet);
    }
}
