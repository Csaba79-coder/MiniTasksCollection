import set.Sets1;
import set.Sets2;
import set.Sets3;
import set.Sets4;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------1------------");

        Integer[] numbers = {1, 2, 7, 2, 3, 4, 10, 8, 9, 11, 5, 4, 3, 6, 5, 6, 5, 1, 8, 10, 9, 15};

        System.out.println("Numbers in the original array: " + Arrays.toString(numbers));
        System.out.println("The set has unique numbers in ordered list!");

        Sets1 sets = new Sets1();
        sets.printSet(sets.Sets(numbers));

        System.out.println("another solution:");

        Sets2 sets2 = new Sets2();
        sets2.printSet2(sets2.Sets2(numbers));

        Sets3.printSet3(Sets3.Sets3(numbers));

        Sets4.printSet4(Sets4.Sets4(numbers));

        System.out.println("----------2------------");


   /*     Anita 's solution:

        Map<Integer, Integer> myMap = new HashMap<>();
        int rnDice;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;
        for (int i = 1; i < 1001; i++) {
            rnDice = (int) (Math.random() * 6) + 1;
            if (rnDice == 1) {
                counter1++;
                myMap.put(rnDice, counter1);
            }
            if (rnDice == 2) {
                counter2++;
                myMap.put(rnDice, counter2);
            }
            if (rnDice == 3) {
                counter3++;
                myMap.put(rnDice, counter3);
            }
            if (rnDice == 4) {
                counter4++;
                myMap.put(rnDice, counter4);
            }
            if (rnDice == 5) {
                counter5++;
                myMap.put(rnDice, counter5);
            }
            if (rnDice == 6) {
                counter6++;
                myMap.put(rnDice, counter6);
            }
        }
        System.out.println(myMap);

        */
    }
}


