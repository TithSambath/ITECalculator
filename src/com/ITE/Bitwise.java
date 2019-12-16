package com.ITE;

import java.util.Scanner;

/**
 * Bitwise: This class is cantain all Bitwise operators.
 */
class Bitwise{

    /**
     * This Method is use to solve true or false base on AND Gate.
     * @param firstValue Integer number.
     * @param secondValue Integer number.
     * @return value as an integer.
     */
    int AND_Operator(int firstValue,int secondValue){
        return firstValue & secondValue;
    }

    /**
     * This Method is use to solve true or false base on OR Gate.
     * @param firstValue Integer number.
     * @param secondValue Integer number.
     * @return value as an integer.
     */
    int OR_Operator(int firstValue,int secondValue){
        return firstValue | secondValue;
    }

    /**
     * This Method is use to solve true or false base on XOR Gate.
     * @param firstValue Integer number.
     * @param secondValue Integer number.
     * @return value as an integer.
     */
    int XOR_Operator(int firstValue,int secondValue){
        return firstValue ^ secondValue;
    }

    /**
     * This Method is use to inverse number by add 1 and then Multiply -1.
     * @param value Integer number.
     * @return value as an integer.
     */
    int Bitwise_Inversion_Operator(int value){
        return ~value;
    }

    /**
     * This Method is use to shift our number to the left but number of shift.
     * @param value Integer number.
     * @param number_of_shift shift time.
     * @return value as an integer.
     */
    int Left_shift(int value,int number_of_shift){
        return value << number_of_shift;
    }

    /**
     * This Method is use to shift our number to the right but number of shift.
     * @param value Integer number.
     * @param number_of_shift shift time.
     * @return value as an integer.
     */
    int Right_shift(int value,int number_of_shift){
        return value >> number_of_shift;
    }

    // Create Function for using to call each of above Method to use in main function:
    /**
     * This funtion is use to call each operators from Bitwise Method.
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