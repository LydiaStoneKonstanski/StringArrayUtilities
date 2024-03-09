package com.zipcodewilmington;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }


    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }


    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        int i;
        String x;
        for (i = 0; i <= array.length; i++) {
            x = array[i];
            if (x.equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] b = new String[array.length];
        int j = array.length;
        for (int i = 0; i < array.length; i++) {
            b[j - 1] = array[i];
            j = j - 1;
        }
        return b;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversedStringArray = reverse(array);
        if (reversedStringArray.equals(array)) {
            return true;
        }
        return false;
    }

    //    /**
//     * @param array array of String objects
//     * @return true if each letter in the alphabet has been used in the array
//     */ // TODO
    public static boolean isPangramic(String[] array) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        //convert input array to lowercase
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toLowerCase();
        }
        for (char letter : alphabet.toCharArray()) {
            boolean foundLetter = false;

            for (String item : array) {
                if(item.indexOf(letter) != -1) {
                foundLetter = true;
                break;
            }
        }
        if (!foundLetter) {
            return false;
        }
    }
    return true;
}

//        String alphabet = "abcdefghijklmnopqrstuvwxyz";
//
//        //iterate through the alphabet
//        for (char letter : alphabet.toCharArray()) {
//            boolean foundLetter = false;
//            //iterate through given array
//            for (String item : array) {
//                //convert given array to lowercase
//                item = item.toLowerCase();
//                //compare the alphabet letter to the strings in the given array
//                for (item.indexOf(letter) != -1) {
//                    foundLetter = true;
//                    break; //Exit when a letter is found in the current string
//
//                    }
//                }
//            //if letter not found in any string, return false.
//            if (!foundLetter){
//                return false;
//            }
//        }
//        //If all letters found in the array, return true!
//        return true;
//    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences (String[]array, String value){
        //need counter for occurrences
        Integer counter = 0;
        //iterate through array
        //compare to value,
        //each time value is found, trip the counter, return counter.
        for(String eachItem: array){
            if (eachItem.equals(value)){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue (String[]array, String valueToRemove){
        //create an empty array list
        List<String> list = new ArrayList<>();
        for(String eachItem : array){
            //iterate through the array, if item in array != valueToRemove,
            // store in array list
            if(!eachItem.equals(valueToRemove)){
                list.add(eachItem);
            }
        }
        //convert array list to array at the end.
        return list.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates (String[]array){
        //convert array to an array list,
        List<String> list = new ArrayList<>();
        //iterate through array,
        //if same, don't add current item,otherwise do add it,
        for(int i = 0; i <= array.length-2; i++){
            String eachItem = array[i];
            String nextItem = array[i + 1];
            if(!eachItem.equals(nextItem)){
                list.add(eachItem);
            }
        }
        //convert back to array
        //return new
        return list.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates (String[]array) {
        //convert array to an array list
        List<String> list = new ArrayList<>();
        // iterate through each character.
        int i = 0;
        while (i < array.length) {
            String currentItem = array[i];
            StringBuilder packed = new StringBuilder(currentItem);

            while (i < array.length - 1 && currentItem.equals(array[i + 1])) {
                packed.append(array[i + 1]);
                i++;
            }
            list.add(packed.toString());
            i++;
        }
        return list.toArray(new String[0]);
    }

//    // This is a useful function for future reference
//    private static int[] getRandomArray(int len) {
//
//        Random random = new Random();
//        int[] newInt = new int[len];
//        for (int i = 0; i < len; i++) {
//            newInt[i] = random.nextInt(100);
//        }
//        return newInt;
//    }

            // Notes - this is useful information:
//            int[] firstArray = getRandomArray(len 10);
//            System.out.println(Arrays.toString(firstArray));
}