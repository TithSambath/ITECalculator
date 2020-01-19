package com.ITE;

import java.util.Scanner;

/**
 * Bitwise: This class is cantain all Bitwise operators.
 */
class Bitwise{

    /**
     * AND operator copies a bit to the result if it exists in both operands
     * @param firstValue Integer number.
     * @param secondValue Integer number.
     * @return value as an integer.
     */
    int AND_Operator(int firstValue,int secondValue){
        return firstValue & secondValue;
    }

    /**
     * OR operator copies a bit if it exists in either operand
     * @param firstValue Integer number.
     * @param secondValue Integer number.
     * @return value as an integer.
     */
    int OR_Operator(int firstValue,int secondValue){
        return firstValue | secondValue;
    }

    /**
     * XOR operator copies a bit if it is set in only one of the operand but not both
     * @param firstValue Integer number.
     * @param secondValue Integer number.
     * @return value as an integer.
     */
    int XOR_Operator(int firstValue,int secondValue){
        return firstValue ^ secondValue;
    }

    /**
     * This Bitwise inversion is use to inverse number by add 1 and then Multiply -1.
     * @param value Integer number.
     * @return value as an integer.
     */
    int Bitwise_Inversion_Operator(int value){
        return ~value;
    }

    /**
     * Left shift operator. The left operands value is moved left by the number of bits specified by the right operand
     * @param value Integer number.
     * @param number_of_shift shift time.
     * @return value as an integer.
     */
    int Left_shift(int value,int number_of_shift){
        return value << number_of_shift;
    }

    /**
     * Right shift operator. The left operands value is moved right by the number of bits specified by the right operand
     * @param value Integer number.
     * @param number_of_shift shift time.
     * @return value as an integer.
     */
    int Right_shift(int value,int number_of_shift){
        return value >> number_of_shift;
    }

    // Create Function for using to call each of above Method to use in main function:
    /**
     * This function is use to call each operators from Bitwise Method.
     * Option: <br>
     *      1.  AND Operator<br>
     *      2.  OR Operator <br>
     *      3.  XOR Operator <br>
     *      4.  Bit-wise inversion <br>
     *      5.  Left Shift Operator <br>
     *      6.  Right Shift Operator <br>
     * @param option is an user choice from 1 to 6
     */
    void calledBitwiseOperators (int option){
        int A,B,answer;
        Scanner scan = new Scanner(System.in);
        switch(option){

            case 1 : System.out.println("Enter Number for value 1 and value 2 here: ");
                A = scan.nextInt();
                B = scan.nextInt();
                answer = AND_Operator(A,B);
                System.out.println("Answer =  "+answer);
                break;
            case 2 : System.out.println("Enter Number for value 1 and value 2 here: ");
                A = scan.nextInt();
                B = scan.nextInt();
                answer = OR_Operator(A,B);
                System.out.println("Answer =  "+answer);
                break;
            case 3 : System.out.println("Enter Number for value 1 and value 2 here: ");
                A = scan.nextInt();
                B = scan.nextInt();
                answer = XOR_Operator(A,B);
                System.out.println("Answer =  "+answer);
                break;
            case 4 : System.out.println("Enter Number for value that you want to Inversion here: ");
                int value = scan.nextInt();
                answer = Bitwise_Inversion_Operator(value);
                System.out.println("Answer =  "+answer);
                break;
            case 5 : System.out.println("Enter Number for value and time of shift here (Left Shift): ");
                A = scan.nextInt();
                B = scan.nextInt();
                answer = Left_shift(A,B);
                System.out.println("Answer =  "+answer);
                break;
            case 6 : System.out.println("Enter Number for value and time of shift here (Right Shift): ");
                A = scan.nextInt();
                B = scan.nextInt();
                answer = Right_shift(A,B);
                System.out.println("Answer =  "+answer);

        }
    }
}