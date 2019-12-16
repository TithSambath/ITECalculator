package com.ITE;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BinaryArithmetic {
    // create object from class StorageConverter in order to us its Protected Method:
        NumberSystemConversion check = new NumberSystemConversion();
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
        String firstComplementOfsecondValue = findFirstComplement(secondValue);
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
            Answer += binaryAdd(findFirstComplement(addBothValue),"1");
        }
        return Answer;
    }
    class callBinaryArithmetic {
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
                            while (!check.isValidBinary(FirstValue)){
                                System.out.print("Warning: Wrong input. Try to input First Value again here: ");
                                FirstValue = scan.next();
                            }
                        System.out.print("Second Value: ");
                        SecondValue = scan.next();
                        // Protect if User type in wrong input
                            while (!check.isValidBinary(SecondValue)){
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
                            while (!check.isValidBinary(FirstValue)){
                                System.out.print("Warning: Wrong input. Try to input First Value again here: ");
                                FirstValue = scan.next();
                            }
                        System.out.print("Second Value: ");
                        SecondValue = scan.next();
                        // Protect if User type in wrong input
                            while (!check.isValidBinary(SecondValue)){
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
                            while (!check.isValidBinary(Value)){
                                System.out.print("Warning: Wrong input. Try to input Value again here: ");
                                Value = scan.next();
                            }
                        Answer = findFirstComplement(Value);
                        System.out.println("Answer = " +Answer);
                        break;


            }
        }
    }
    class needShift {
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
    }


}
