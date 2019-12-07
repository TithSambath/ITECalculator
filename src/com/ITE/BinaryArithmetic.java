package com.ITE;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BinaryArithmetic {
    private String binaryAdd(String valueOfFirstBinary, String valueOfSecondBinary) {
        // create list for storing each binary digit
        ArrayList<Character> afterAddBinary = new ArrayList<>(1);
        // convert trim string to each char
        char[] firstBinary = valueOfFirstBinary.toCharArray();
        char[] secondBinary = valueOfSecondBinary.toCharArray();

        char tratuk = '0';
        int index = -1;
        for (int i = firstBinary.length - 1; i >= 0; i--) {
            index += 1;
            // define condition:
            // condition: 0 + 0 = 0
            boolean firstCondition = (firstBinary[i] == '0' && secondBinary[i] == '0');

            // condition: 1 + 0 || 0 + 1 = 0
            boolean secondCondition = (firstBinary[i] == '1' && secondBinary[i] == '0')
                    || (firstBinary[i] == '0' && secondBinary[i] == '1');

            // condition: 1 + 1 = 10
            boolean thirdCondition = (firstBinary[i] == '1' && secondBinary[i] == '1');

            if (firstCondition) {
                if (tratuk == '0') {
                    afterAddBinary.add(index, '0');
                } else {
                    afterAddBinary.add(index, '1'); // 0 + 1
                    tratuk = '0';
                }
                if (i == 0) {
                    afterAddBinary.add(index + 1, tratuk);
                }

            } else if (secondCondition) {
                if (tratuk == '0') {
                    afterAddBinary.add(index, '1');
                } else {
                    afterAddBinary.add(index, '0'); // then tratuk still 1.
                }
                if (i == 0) { // mean its last
                    afterAddBinary.add(index + 1, tratuk);
                }

            } else if (thirdCondition) {
                if (tratuk == '0') {
                    afterAddBinary.add(index, '0'); // tratuk 1.

                } else {
                    afterAddBinary.add(index, '1');
                }
                tratuk = '1'; // always tratuk 1 coz 1 + 1 = 10
                if (i == 0) { // mean its last
                    afterAddBinary.add(index + 1, tratuk);
                }
            }
        }

        String Answer= ""; // mean assign nothing or whitespace to String Answer.
        for (int i = afterAddBinary.size() - 1; i >= 0; i--){
            Answer += afterAddBinary.get(i).toString();
        }
        return Answer;
    }

    public void binaryArithmetic(int operationOption) {
        Scanner scan = new Scanner(System.in);
        switch (operationOption) {
            case 1:
                System.out.println("     ADD Binary ");
                System.out.print("First Value: ");
                String FirstValue = scan.next();
                System.out.print("First Value: ");
                String SecondValue = scan.next();

                String Answer = binaryAdd(FirstValue, SecondValue);
                System.out.println("Answer = " + Answer);

        }
    }

}
