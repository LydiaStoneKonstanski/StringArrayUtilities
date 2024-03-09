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
            return array [1];
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
    public static String[] reverse (String[]array){
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
    public static boolean isPalindromic (String[]array){
        String[] reversedStringArray = reverse(array);
        if(reversedStringArray.equals(array)){
            return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic (String[]array){
        //iterate through contents of each string in the array
        //check all the characters could turn all the characters into one string,
        //or nest for each string in array and each character in string.
        //compare to alphabet.
        //if alphabet letter does not appear in the strings, false.
        //else return true.

        // Iterate through array
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (Character letter : alphabet.toCharArray()) {
            Boolean foundLetter = false;
            for (String item : array) {
                for (Character c : item.toCharArray()) {
                    // Add logic for true
                    if(letter.equals(c)){
                        foundLetter = true;
                    }
                }
            }
            return false;
        }
        return true;
    }

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
        List<String> list = new ArrayList<String>();
        for(String eachItem : array){
            //iterate through the array, if item in array != valueToRemove,
            // store in array list
            if(!eachItem.equals(valueToRemove)){
                list.add(eachItem);
            }
        }
        //convert array list to array at the end.
        return (String[])list.toArray();
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates (String[]array){
        //convert to array list,
        List<String> list = new ArrayList<String>();
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
        return (String[])list.toArray();
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates (String[]array){
        //iterate through array,
        //if same, send to string with +,
        //create an array with index of 0,
        //put the string into the singleIndexArray
        //return singleIndexArray.
        return null;
    }


    // This is a useful function for future reference
    private static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

            // Notes - this is useful information:
//            int[] firstArray = getRandomArray(len 10);
//            System.out.println(Arrays.toString(firstArray));
}