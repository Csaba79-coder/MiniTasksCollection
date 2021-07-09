package set;

import java.util.HashSet;
import java.util.Set;

public class Sets1 {

    public Sets1() {
    }

    public Set<Integer> Sets(Integer[] numbers) {
        Set<Integer> setOfNums = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            setOfNums.add(numbers[i]);
        }
        return setOfNums;
    }

    public void printSet(Set<Integer> arraysSet) {
        for (int i = 0; i < arraysSet.size(); i++) {
        }
        System.out.println("Numbers in set (HashSet): " + arraysSet);
    }
}
