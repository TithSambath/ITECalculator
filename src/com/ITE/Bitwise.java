package com.ITE;

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
}