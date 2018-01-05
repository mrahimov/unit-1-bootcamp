import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {

    public static void main(String args[]) {



        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Nika"));
        cats.add(new Cat("Sie"));
        cats.add(new Cat("Safed"));
        cats.add(new Cat("Surh"));
        cats.add(new Cat("Kabut"));

        for (int i = 0; i < cats.size(); i++) {
            //System.out.println(cats.get(i).getName());

        }

//==================================================================================================


        ArrayList<Integer> myInt = new ArrayList<>();
        myInt.add(2);
        myInt.add(1);
        myInt.add(2);
        myInt.add(3);
        myInt.add(2);
        myInt.add(4);
        myInt.add(2);
        myInt.add(3);
        myInt.add(2);
        myInt.add(3);
        myInt.add(2);

        //mostFrequentElement(myInt);


//==================================================================================================


        HashMap<String, Integer> accessCodeFellows = new HashMap<>();
        accessCodeFellows.put("Muaadh", 25);
        accessCodeFellows.put("Naz", 24);
        accessCodeFellows.put("Darnel", 23);
        accessCodeFellows.put("Volha", 24);
        accessCodeFellows.put("Tati", 19);
        accessCodeFellows.put("Victoria", 20);

        for (String key : accessCodeFellows.keySet()) {

            int value = accessCodeFellows.get(key);
            // System.out.println(key + "  " + value);
        }


//==================================================================================================




        //System.out.println(canRentACar(accessCodeFellows));


//==================================================================================================

        String[] a = {"a", "bb", "b", "ccc"};


        //System.out.println(wordsWithoutList(a, 1));// → {"bb", "ccc"}
        //System.out.println(wordsWithoutList(a, 3));// → {"a", "bb", "b"}
        //System.out.println(wordsWithoutList(a, 4));// → {"a", "bb", "b", "ccc"}

//==================================================================================================


        printStrings("hello C4Q Fellows, thanks for you all");

    }

    public static boolean canRentACar(HashMap<String, Integer> hashMap) {
        for (String key : hashMap.keySet()) {

            if (hashMap.get(key) >= 25) {
                return true;
            }
        }
        return false;
    }


    public static void mostFrequentElement(ArrayList<Integer> x) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < x.size(); i++) {
            int y = 1;

            int num = x.get(i);

            if (hashMap.containsKey(num)) {
                y = hashMap.get(num) + 1;
            }
            hashMap.put(num, y);
        }
        System.out.println(hashMap);
    }


    public static ArrayList<String> wordsWithoutList(String[] s, int num) {

        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < s.length; i++) {
            if (s[i].length() != num) {
                words.add(s[i]);
            }
        }
        return words;
    }

    public static int countClumps(List<Integer> list) {

        int clumpCount = 0;

        for(int i = 0; i < list.size(); i++) {

            int num1 = list.get(i);

            if(i+1 < list.size() && num1 == list.get(i+1)) {
                clumpCount++;

                while(i+2 < list.size() && list.get(i+1).equals(list.get(i+2))) {
                    i++;
                }
            }
        }
        return clumpCount;

    }

    public static void printStrings(String s) {

        StringBuilder stringBuilder = new StringBuilder();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ')
            {
                stringBuilder.append(s.charAt(i));
            }
            if (s.charAt(i) == ' ')
            {
                list.add(stringBuilder.toString());
                stringBuilder.setLength(0);
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}










