package cse2010.hw4;
/*
 * CSE2010 Homework #4: BinToDec.java
 *
 * Complete the code below.
 */

public class BinToDec {

    public static int binToDec(String number) {
        if (number.length() == 1) {
            // Base case
            return Integer.parseInt(number);    //0또는 1이 들어오지 않을 경우에 대비한 예외처리는 따로 하지 않음
        } else {
            // Recursive case
            return (int)(Math.pow(2, number.length() - 1) * binToDec(number.substring(0, 1))) + binToDec(number.substring(1));
        }
    }

    // Tail-recursion
    public static int binToDecTR(String number, int result) {
        if (number.length() == 0) {
            // Base case
            return result;
        } else {
            // Recursive case
            result += (int)(Math.pow(2, number.length() - 1)) * Character.getNumericValue(number.charAt(0));
            
            return binToDecTR(number.substring(1), result);
        }
    }

}
