import java.util.*;
public class Gyaxa {
    public static void main(String[] args) {
        /**
         * Adott az alábbi tömb:
         *
         * int[] numbers = {34808, 422, 334, 12014, 412617, 292389, 342260, 32244, 334534, 497721, 3775, 544, 433, 55340, 257952, 1496173, 539141, 3355, 305720, 3677429, 114047, 5656 };
         *
         * - Van ismétlődés a tömbben? (Szerepel-e többször ugyanaz a szám?)
         * - Hány számjegyből állnak a számok a tömbben? Írd ki a képernyőre mindegyiket egyesével!
         * - Hány különböző számjegyből állnak a számok a tömbben? (Hint: Set.)
         * - Hány szám van, ami a különböző számjegyekből áll? (Hint: Map.)
         * - És melyik szám melyik számjegyhez tartozik - úgymond? Válogasd szét a számjegyeket az alapján, hogy hány számjegyből állnak! (Hint: a Map-ben értékként tárolhatsz adatstruktúrákat.)
         */
        int[] numbers = {34808, 412, 324, 12034, 412617, 292389, 342260, 32244, 334534, 497721, 3775, 544, 433, 55340,
                257952, 1496173, 539141, 3355, 305720, 3677429, 114047, 5656};
        Set<Integer> mySet = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            mySet.add(numbers[i]);
        }
        if (numbers.length == mySet.size()) {
            System.out.println("A tömböm nem tartalmaz duplikációkat.");
        } else {
            System.out.println("A tömbön belüli duplikációk száma: " + (numbers.length - mySet.size()));
        }
        //Set<Integer> numOfUniqueDigits = new HashSet<>();
        //for (int i = 0; i < numOfDigits.length; i++) {
        //    numOfUniqueDigits.add(numOfDigits[i]);
        //}
        //System.out.println("Ennyi féle számból állnak a Set-em elemei: " + numOfUniqueDigits.size());
        Map<Integer, Set<Integer>> differentDigits = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            differentDigits.put(numbers[i], getSet(numbers[i]));
        }
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (differentDigits.get(numbers[i]).size() == getNumOfDigits(numbers)[i]) {
                newList.add(numbers[i]);
            }
        }
        System.out.println("Kulonbozo szamjegyekbol allo szamok darabszama: " + newList.size());
    }
    private static Set<Integer> getSet(int number) {
        Set<Integer> digitsOfElement = new HashSet<>();
        while (number != 0) {
            digitsOfElement.add(number % 10);
            number /= 10;
        }
        return digitsOfElement;
    }
    private static int[] getNumOfDigits(int[] szamok) {
        int[] numOfDigits = new int[szamok.length];
        for (int i = 0; i < szamok.length; i++) {
            int var1 = szamok[i];
            while (var1 != 0) {
                var1 = var1 / 10;
                numOfDigits[i]++;
            }
            System.out.println("A tömböm " + i + ". eleme " + numOfDigits[i] + " db karakterből áll.");
        }
        return numOfDigits;
    }


    public HashMap<Integer, ArrayList<Integer>> resultOfDigitsAndNums(int[] array) {
        HashMap<Integer, ArrayList<Integer>> hashMapOfDigitOfNums = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int digits = getNumOfDigit(array[i]);
            hashMapOfDigitOfNums.putIfAbsent(digits, new ArrayList<>());
            List<Integer> value = hashMapOfDigitOfNums.get(digits);
            value.add(array[i]);
            hashMapOfDigitOfNums.put(digits, (ArrayList<Integer>) value);
        }
        return hashMapOfDigitOfNums;
    }

    private static int getNumOfDigit(int num) {
        int var1 = num;
        int result = 0;
        while (var1 != 0) {
            var1 = var1 / 10;
            result++;
            return result;
        }
        return var1;
    }
}