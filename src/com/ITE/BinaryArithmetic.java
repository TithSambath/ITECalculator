package com.ITE;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class contain all method that can be use to do binary arithmetic.
 */
public class BinaryArithmetic {
    // create object from class StorageConverter in order to us its Protected Method:
        NumberSystemConversion check = new NumberSystemConversion();
        NumberSystemConversion.checkingUserInput checkUserInput = check.new checkingUserInput();
        // create Complement object from nested inner class:
            Complement complement = new Complement();

    // Binary Arithmetic Operator:

    /**
     * This method is use to do binary addition.
     * @param valueOfFirstBinary take value as binary string
     * @param valueOfSecondBinary take value as binary string
     * @return value after do addition both value.
     */
    private String binaryAdd(String valueOfFirstBinary, String valueOfSecondBinary) {

        // create list for storing each binary digit
        ArrayList<Character> afterAddBinary = new ArrayList<>(1);

        /*
         check if both value have the same number of bit or not:
         if not shift 0 to the value that has less bit.
        */
        if (valueOfFirstBinary.length() > valueOfSecondBinary.length()){
            needShift want2Shift = new needShift();
            valueOfSecondBinary = want2Shift.Shift(valueOfFirstBinary,valueOfSecondBinary);

        }else if (valueOfFirstBinary.length() < valueOfSecondBinary.length()){
            needShift want2Shift = new needShift();
            valueOfFirstBinary = want2Shift.Shift(valueOfFirstBinary,valueOfSecondBinary);
        }

        // Process of adding binary:
        char tratuk = '0';
        int index = -1;
        for (int i = valueOfFirstBinary.length() - 1; i >= 0; i--) {
            index += 1;
            // define condition:

            // condition: 0 + 0 = 0
            boolean firstCondition = (valueOfFirstBinary.charAt(i) == '0' && valueOfSecondBinary.charAt(i) == '0');

            // condition: 1 + 0 || 0 + 1 = 0
            boolean secondCondition = (valueOfFirstBinary.charAt(i) == '1' && valueOfSecondBinary.charAt(i) == '0')
                    || (valueOfFirstBinary.charAt(i) == '0' && valueOfSecondBinary.charAt(i) == '1');

            // condition: 1 + 1 = 10
            boolean thirdCondition = (valueOfFirstBinary.charAt(i) == '1' && valueOfSecondBinary.charAt(i) == '1');

            if (firstCondition) {
                if (tratuk == '0') {
                    afterAddBinary.add(index, '0');
                } else {
                    afterAddBinary.add(index, '1'); // 0 + 1
                    tratuk = '0';
                }
                if (i == 0) {
                    if (tratuk != '0'){
                        afterAddBinary.add(index + 1, tratuk);
                    }
                }

            } else if (secondCondition) {
                if (tratuk == '0') {
                    afterAddBinary.add(index, '1');
                } else {
                    afterAddBinary.add(index, '0'); // then tratuk still 1.
                }
                if (i == 0) { // mean its last
                    if (tratuk != '0') {
                        afterAddBinary.add(index + 1, tratuk);
                    }
                }

            } else if (thirdCondition) {
                if (tratuk == '0') {
                    afterAddBinary.add(index, '0'); // tratuk 1.

                } else {
                    afterAddBinary.add(index, '1');
                }
                tratuk = '1'; // always tratuk 1 coz 1 + 1 = 10
                if (i == 0) { // mean its last
                    if (tratuk != '0') {
                        afterAddBinary.add(index + 1, tratuk);
                    }
                }
            }
        }

        String Answer = ""; // mean assign nothing or whitespace to String Answer.
        for (int i = afterAddBinary.size() - 1; i >= 0; i--){
            Answer += afterAddBinary.get(i).toString();
        }
        afterAddBinary.clear();
        return Answer;
    }

    /**
     * This method is use to do binary Subtraction using first complement rule.
     * @param firstValue as binary.
     * @param secondValue as binary.
     * @return value after subtraction both value.
     */
    private String binarySubtraction (String firstValue, String secondValue) {
        /*
         check if both value have the same number of bit or not:
         if not shift 0 to the value that has less bit.
        */
        if (firstValue.length() > secondValue.length()){
            needShift want2Shift = new needShift();
            secondValue = want2Shift.Shift(firstValue,secondValue);
        }else if (firstValue.length() < secondValue.length()){
            needShift want2Shift = new needShift();
            firstValue = want2Shift.Shift(firstValue,secondValue);
        }
        // Process of Subtraction:
        String firstComplementOfsecondValue = complement.findFirstComplement(secondValue);
        String secondcomplement = binaryAdd(firstComplementOfsecondValue,"1");
        String addBothValue = binaryAdd(firstValue,secondcomplement);
        String Answer = "";
        // check if its answer is not positive:
        /*
            Base on second complement: the number of bit of both value less than number of bit after add both value,
                                       the Answer will be positive.
                                       In contrast if the number of bit of both value equal to number of bit after add both value,
                                       the Answer will be Negative.
         */
        if (addBothValue.length() > secondcomplement.length()){
            for (int i = 1; i < addBothValue.length(); i++){
                Answer += addBothValue.charAt(i);
            }
        }else {
            Answer += "-";
            Answer += binaryAdd(complement.findFirstComplement(addBothValue),"1");
        }
        return Answer;
    }

    /**
     * This method is use to do binary multiplication between two binary value.
     * @param fValue First value as binary
     * @param secValue First value as binary
     * @return value after do multiply between two value.
     */
    private String multiply (String fValue,String secValue){
        /*
         check if both value have the same number of bit or not:
         if not shift 0 to the value that has less bit.
        */
        if (fValue.length() > secValue.length()){
            needShift want2Shift = new needShift();
            secValue = want2Shift.Shift(fValue,secValue);
        }else if (fValue.length() < secValue.length()){
            needShift want2Shift = new needShift();
            fValue = want2Shift.Shift(fValue,secValue);
        }

        // Multiplication process:
        String addLinebyLine = "0";
        String afterMultiply;
        int cycle = -1;
            for (int i = secValue.length()-1; i >= 0; i--){
                boolean condition1 = secValue.charAt(i) == '1';
                boolean condition2 = secValue.charAt(i) == '0';
                cycle += 1;
                if (condition1){
                    // copy first value:
                        if (cycle != 0) {
                            afterMultiply = fValue;
                            needShift want2Shift = new needShift();
                            afterMultiply = want2Shift.rightShift(afterMultiply,cycle);
                            // add those value line by line:
                            addLinebyLine = binaryAdd(afterMultiply,addLinebyLine);
                        }
                        else {
                            afterMultiply = fValue;
                            // no need to shift.
                            addLinebyLine = binaryAdd(afterMultiply,addLinebyLine);
                        }
                }
                else if (condition2){
                    // assign all bit to zero: coz multiply with zero.
                        if (cycle != 0){
                            afterMultiply = "0";
                            needShift want2Shift = new needShift();
                            afterMultiply = want2Shift.rightShift(afterMultiply,cycle);
                            // add those value line by line:
                            addLinebyLine = binaryAdd(afterMultiply,addLinebyLine);
                        }
                }
            }
            return addLinebyLine;
    }

    /**
     * This method is use to do binary division between two value.
     * @param dividend first value
     * @param divisor second value
     * @return value after division.
     */
    private String divide (String dividend, String divisor){
        String Zero = "";
        needShift needToShift = new needShift();
        Zero = needToShift.rightShift(Zero,dividend.length());
        String Answer = Zero;
        if (!dividend.equals(Zero)) {
            while (!dividend.equals(Zero)){
                dividend = complement.subtractWith2ndComplement(dividend,divisor);
                Answer = binaryAdd(Answer,"1");
            }
            return Answer;
        }else {
            return "0";
        }
    }

    // Nested Class:

    /**
     * This CallBinaryArithmetic class is use for call all Binary Arithmetic to use in main class or other class.
     */
    class callBinaryArithmetic { // called all these function to used in Main function

        public void binaryArithmetic(int operationOption) {

            Scanner scan = new Scanner(System.in);
            String Answer;
            String FirstValue;
            String SecondValue;
            switch (operationOption) {
                case 1: System.out.println("     ADD Binary ");
                    System.out.print("First Value: ");
                    FirstValue = scan.next();
                    // Protect if User type in wrong input
                    while (!checkUserInput.isValidBinary(FirstValue)){
                        System.out.print("Warning: Wrong input. Try to input First Value again here: ");
                        FirstValue = scan.next();
                    }
                    System.out.print("Second Value: ");
                    SecondValue = scan.next();
                    // Protect if User type in wrong input
                    while (!checkUserInput.isValidBinary(SecondValue)){
                        System.out.print("Warning: Wrong input. Try to input Second Value again here: ");
                        SecondValue = scan.next();
                    }
                    Answer = binaryAdd(FirstValue, SecondValue);
                    System.out.println("Answer = " + Answer);
                    break;
                case 2: System.out.println("    Binary Subtraction");
                    System.out.print("_______________________________\n");
                    System.out.print("First Value: ");
                    FirstValue = scan.next();
                    // Protect if User type in wrong input
                    while (!checkUserInput.isValidBinary(FirstValue)){
                        System.out.print("Warning: Wrong input. Try to input First Value again here: ");
                        FirstValue = scan.next();
                    }
                    System.out.print("Second Value: ");
                    SecondValue = scan.next();
                    // Protect if User type in wrong input
                    while (!checkUserInput.isValidBinary(SecondValue)){
                        System.out.print("Warning: Wrong input. Try to input Second Value again here: ");
                        SecondValue = scan.next();
                    }
                    Answer = binarySubtraction(FirstValue,SecondValue);
                    System.out.println("Answer = "+Answer);
                    break;
                case 3: System.out.println("    Binary First Complement ");
                    System.out.print("_______________________________\n");
                    System.out.print("Give Binary Value: ");
                    String Value = scan.next();
                    // Protect if User type in wrong input
                    while (!checkUserInput.isValidBinary(Value)){
                        System.out.print("Warning: Wrong input. Try to input Value again here: ");
                        Value = scan.next();
                    }
                    Answer = complement.findFirstComplement(Value);
                    System.out.println("Answer = " +Answer);
                    break;
                case 4: System.out.println("    Binary Second Complement ");
                    System.out.print("_______________________________\n");
                    System.out.print("Give Binary Value: ");
                    Value = scan.next();
                    // Protect if User type in wrong input
                    while (!checkUserInput.isValidBinary(Value)){
                        System.out.print("Warning: Wrong input. Try to input Value again here: ");
                        Value = scan.next();
                    }
                    Answer = complement.secondComplement(Value);
                    System.out.println("Answer = " + Answer);
                    break;
                case 5: System.out.println("    Subtract with 2nd Complement");
                    System.out.print("_______________________________\n");
                    System.out.print("First Value: ");
                    FirstValue = scan.next();
                    // Protect if User type in wrong input
                    while (!checkUserInput.isValidBinary(FirstValue)){
                        System.out.print("Warning: Wrong input. Try to input First Value again here: ");
                        FirstValue = scan.next();
                    }
                    System.out.print("Second Value: ");
                    SecondValue = scan.next();
                    // Protect if User type in wrong input
                    while (!checkUserInput.isValidBinary(SecondValue)){
                        System.out.print("Warning: Wrong input. Try to input Second Value again here: ");
                        SecondValue = scan.next();
                    }
                    Answer = complement.subtractWith2ndComplement(FirstValue,SecondValue);
                    System.out.println("Answer: " + Answer);
                    break;
                case 6: System.out.println("    Binary Multipication ");
                    System.out.print("_______________________________\n");
                    System.out.print("First Value: ");
                    FirstValue = scan.next();
                    // Protect if User type in wrong input
                    while (!checkUserInput.isValidBinary(FirstValue)){
                        System.out.print("Warning: Wrong input. Try to input First Value again here: ");
                        FirstValue = scan.next();
                    }
                    System.out.print("Second Value: ");
                    SecondValue = scan.next();
                    // Protect if User type in wrong input
                    while (!checkUserInput.isValidBinary(SecondValue)){
                        System.out.print("Warning: Wrong input. Try to input Second Value again here: ");
                        SecondValue = scan.next();
                    }
                    Answer = multiply(FirstValue,SecondValue);
                    System.out.println("Answer = " + Answer);
                    break;
                case 7: System.out.println("    Binary Division ");
                    System.out.print("_______________________________\n");
                    System.out.print("First Value: ");
                    FirstValue = scan.next();
                    // Protect if User type in wrong input
                    while (!checkUserInput.isValidBinary(FirstValue)){
                        System.out.print("Warning: Wrong input. Try to input First Value again here: ");
                        FirstValue = scan.next();
                    }
                    System.out.print("Second Value: ");
                    SecondValue = scan.next();
                    // Protect if User type in wrong input
                    while (!checkUserInput.isValidBinary(SecondValue)){
                        System.out.print("Warning: Wrong input. Try to input Second Value again here: ");
                        SecondValue = scan.next();
                    }
                    Answer = divide(FirstValue,SecondValue);
                    System.out.println("Answer = " + Answer);
                    break;
            }
        }
    }

    /**
     * This needShift class group all shift function that have been use in this outer class.
     */
    private class needShift {
        /**
         * This method is use to shift more bit to the left to make this two value have the same number of bit.
         * @param FirstValue as binary String
         * @param SecondValue as binary String
         * @return value after shift as string.
         */
            String Shift (String FirstValue, String SecondValue){

                boolean firstMorethanSecond = FirstValue.length() > SecondValue.length();

                    if (firstMorethanSecond){
                        String temp = SecondValue;
                        SecondValue = "";
                        // give second number more value in order to equal to first
                            int shiftnumber = FirstValue.length() -  temp.length();
                            for (int i = 0; i <= shiftnumber - 1; i++){
                                SecondValue += "0";
                            }
                        SecondValue += temp;
                        return SecondValue;

                    }else{
                        String temp = FirstValue;
                        FirstValue = "";
                        // give First number more value in order to equal to second
                            int shiftnumber = SecondValue.length() - temp.length();
                            for (int i = 0; i <= shiftnumber - 1; i++){
                                FirstValue += "0";
                            }
                        FirstValue += temp;
                        return FirstValue;
                    }
            }

        /**
         * This method is use to shift more bit (zero) to the right to make this value have the number of bit.
          * @param value is the value that need to shift.
         * @param numbertoShift is the number of zero that want append to the right.
         * @return value as string.
         */
            String rightShift (String value,int numbertoShift){
                for (int i = 0; i < numbertoShift; i++){
                    value += "0";
                }
                return value;
            }
    }

    /**
     * This Complement class group all complement function that have been use in this outer class class.
     */
    public class Complement {
        /**
         * This method is use to find the first complement of binary number.
         * @param Value as binary String
         * @return first Complement value as string
         */
        private String findFirstComplement (String Value){
                char[] Binarydigit = Value.toCharArray();
                String firstComplement = "";
                for (int i = 0; i < Value.length(); i++){
                    if (Binarydigit[i] == '0'){
                        Binarydigit[i] = '1';
                    }else {
                        Binarydigit[i] = '0';
                    }
                    firstComplement += Binarydigit[i];
                }
                return firstComplement;
            }

        /**
         * This method is use to find the second complement of binary number.
         * @param value as binary String
         * @return second complement value as string
         */
        private String secondComplement (String value){
                String firstComplement = findFirstComplement(value);
                String secondComplement = binaryAdd(firstComplement,"1");
                return secondComplement;
            }

        /**
         * This method is use to do subtraction between two number by using second complement rule.
         * @param fValue take binary value as string.
         * @param secValue take binary value as string.
         * @return value after subtraction.
         */
        private String subtractWith2ndComplement(String fValue,String secValue) {
         /*
         check if both value have the same number of bit or not:
         if not shift 0 to the value that has less bit.
        */
                if (fValue.length() > secValue.length()){
                    needShift want2Shift = new needShift();
                    secValue = want2Shift.Shift(fValue,secValue);
                }else if (fValue.length() < secValue.length()){
                    needShift want2Shift = new needShift();
                    fValue = want2Shift.Shift(fValue,secValue);
                }
                // Subtraction process:
                // convert second value to second binary:
                String secondValas2ndComplement = secondComplement(secValue);
                String addBothValue = binaryAdd(fValue,secondValas2ndComplement);
                // check if its answer is not positive:
        /*
            Base on second complement: the number of bit of both value less than number of bit after add both value,
                                       the Answer will be positive.
                                       In contrast if the number of bit of both value equal to number of bit after add both value,
                                       the Answer will be Negative.
         */
                String Answer = "";
                if (addBothValue.length() > secondValas2ndComplement.length()){
                    for (int i = 1; i < addBothValue.length(); i++){
                        Answer += addBothValue.charAt(i);
                    }
                }else {
                    Answer += "-";
                    Answer += binaryAdd(findFirstComplement(addBothValue),"1");
                }
                return Answer;

            }
    }


}
