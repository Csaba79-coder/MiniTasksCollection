package set;

import java.util.HashSet;
import java.util.Set;

public class Sets2 {

    Set<Integer> setOfNums = new HashSet<>();

    public Sets2() {
    }

    public Set<Integer> Sets2(Integer[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            setOfNums.add(numbers[i]);
        }
        return setOfNums;
    }

    public void printSet2(Set<Integer> arraysSet) {
        for (int i = 0; i < arraysSet.size(); i++) {
        }
        System.out.println("Numbers in set (HashSet): " + arraysSet);
    }

}
