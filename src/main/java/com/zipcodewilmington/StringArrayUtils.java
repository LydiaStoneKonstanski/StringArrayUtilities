package com.zipcodewilmington;
import java.lang.String.split;
import java.util.Arrays;
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
        String [] intoWords = array.split(" ");

        return intoWords[0];
    }


    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        String[] sentenceToWords = array.split(" ");
            return sentenceToWords [1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        String[] sentenceToWords = array.split(" ");
        if (sentenceToWords.length > 0) {
            return array[sentenceToWords.length - 1];
        }
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String[] sentenceToWords = array.split(" ");
        if (array.length > 0) {
            return array[array.length - 2];
        }
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        int i;
        String x;
        String[] sentenceToWords = array.split(" ");
        for (i = 0; i <= sentenceToWords.length; i++) {
            String x = sentenceToWords[i];
        }
        if (x.equals(value)) {
            return true;
        }

        public static boolean contains (String[]array, String value){
            String check;
            for (int i = 0; i <= array.length; i++) {
                String[] sentenceToWords = array.split(" ");
                String check = sentenceToWords[i];
                if (check.equals(value)) {
                    return true;
                }
            }

            /**
             * @param array of String objects
             * @return an array with identical contents in reverse order
             */ // TODO
            public static String[] reverse (String[]array){
                return null;
            }

            /**
             * @param array array of String objects
             * @return true if the order of the array is the same backwards and forwards
             */ // TODO
            public static boolean isPalindromic (String[]array){
                return false;
            }

            /**
             * @param array array of String objects
             * @return true if each letter in the alphabet has been used in the array
             */ // TODO
            public static boolean isPangramic (String[]array){
                return false;
            }

            /**
             * @param array array of String objects
             * @param value value to check array for
             * @return number of occurrences the specified `value` has occurred
             */ // TODO
            public static int getNumberOfOccurrences (String[]array, String value){
                return 0;
            }

            /**
             * @param array         array of String objects
             * @param valueToRemove value to remove from array
             * @return array with identical contents excluding values of `value`
             */ // TODO
            public static String[] removeValue (String[]array, String valueToRemove){
                return null;
            }

            /**
             * @param array array of chars
             * @return array of Strings with consecutive duplicates removes
             */ // TODO
            public static String[] removeConsecutiveDuplicates (String[]array){
                return null;
            }

            /**
             * @param array array of chars
             * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
             */ // TODO
            public static String[] packConsecutiveDuplicates (String[]array){
                return null;
            }


            private static int[] getRandomArray(int len) {

                Random random = new Random();
                int[] newInt = new int[len];
                for (int i = 0; i < len; i++) {
                    newInt[i] = random.nextInt(100);
                }
                return newInt;
            }
            int[] firstArray = getRandomArray(len 10);
            System.out.println(Arrays.toString(firstArray));
        }
        }
        }