package com.ITE;
import sun.security.provider.certpath.OCSP;

import java.lang.Integer.*;
import java.util.function.BinaryOperator;
import java.util.ArrayList;
/**
 * This class is consist of wide range to perform conversion.
 */
public class NumberSystemConversion {

    private long binaryNumber;
    private ArrayList<Long> elementList = new ArrayList<Long>(1); // this one is use every where in here so after use need to clear it.
    /*
       Instruction to convert from one number system to another:
            1.Think of the user input value as any number system
              depend on each parameter of the function that its
              use.
            2.Convert all those number system by using
               all this (Predefine function) function
                Integer.parseInt();
                Integer.toString();
                Integer.toHex();
                Integer.toBinaryString();
                //This 4 function above take string as a parameter.//
               also use this user-define function: binary2Decimal(int binary);
               to convert all any number system to decimal then convert it to
               what user number system want.
     */
// Binary number system conversion:
    /**
     * This binary2Decimal is use to convert from Binary system to Decimal system.
     * @param binary take user input as a binary system.(only 0 and 1)
     * @return value of decimal as string.
     */
    long binary2Decimal (long binary){
            int numberOfDigit = 0;
            binaryNumber = binary;
            int decimalNumber = 0;
            boolean condition = binaryNumber > 0;
            /*Get each digit of binary:*/
            while (condition) {
                elementList.add(numberOfDigit, binaryNumber % 10);
                binaryNumber = binaryNumber / 10;
                condition = binaryNumber > 0;
                numberOfDigit += 1;
            }
            /*Prevent in case user input digit that bigger than 1 and smaller than -1*/
            for (int i = 0; i < numberOfDigit; i++){
                //System.out.println("each element = " +elementList.get(i));
                if (elementList.get(i) > 1){
                    elementList.clear();
                    return -1; // if condition true it will return -1;
                }
            }
            /*Generate each binary to the decimal number*/
            int i = 0;
            for (Long digit : elementList) {
                decimalNumber += digit * Math.pow(2, i);
                i += 1;
            }
            elementList.clear();
            return decimalNumber;
    }

    /**
     * This binary2Octal is use to convert from Binary system to Octal system.
     * @param binary take user input as a binary system.(Accept only 0 and 1)
     * @return value of Octal as string.
     */
    long binary2Octal (long binary){
        long decimalNumber =  binary2Decimal(binary);
        short index = 0;
        while (decimalNumber > 0){
            elementList.add(index,decimalNumber % 8);
            decimalNumber = decimalNumber / 8;
            index += 1;
        }
        int octalNumber = 0;
        int numberPower = 0;
        for (Long digit: elementList){
            octalNumber += digit * Math.pow(10,numberPower);
            numberPower += 1;
        }
        elementList.clear();// clear all element that has been store.
        return octalNumber;

    }

    /**
     * This binary2Octal is use to convert from Binary system to Hexadecimal system.
     * @param binary take user input as a binary system.(Accept only 0 and 1)
     * @return value of Hexadecimal as string.
     */
    String binary2Hexadecimal (long binary){

        ArrayList<String> hexa = new ArrayList<>(1);
        long decimalNumber = binary2Decimal(binary);
        System.out.println(decimalNumber);
        boolean condition = decimalNumber != -1; // prevent wrong input.
        if (condition) {
            short index = 0;
            while (decimalNumber > 0) {
                elementList.add(index, decimalNumber % 16);
                decimalNumber = decimalNumber / 16;
                index += 1;
            }
            int Index = 0;
            for (Long digit : elementList) {
                if (digit == 10) {
                    hexa.add(Index, "A");
                } else if (digit == 11) {
                    hexa.add(Index, "B");
                } else if (digit == 12) {
                    hexa.add(Index, "C");
                } else if (digit == 13) {
                    hexa.add(Index, "D");
                } else if (digit == 14) {
                    hexa.add(Index, "E");
                } else if (digit == 15) {
                    hexa.add(Index, "F");
                } else {
                    hexa.add(Index, Long.toString(digit));
                }
                Index += 1;
            }
            System.out.print("Hexadecimal = ");
            for (int i = index - 1; i >= 0; i--) {
                System.out.print(hexa.get(i));
            }
            elementList.clear();
            return "true";
        }else {
            return "Binary number consist only 0 and 1.";
        }
    }

// Octal number system conversion:
    /**
     * This Octal2Decimal is use to convert from octal system to decimal system.
     * @param Octal take user input as a octal sytem.
     * @return value of Decimal as string.
     */
    long Octal2Decimal (long Octal){
        long binaryNumber = Octal2Binary(Octal);
        return binary2Decimal(binaryNumber);
    }

    /**
     * This Octal2Binary is use to convert from octal system to Binary system.
     * @param octal take user input value as an octal system.
     * @return value of Binary as string.
     */
    long Octal2Binary (long octal) {
        ArrayList<Long> binarylist = new ArrayList<>(1);
        short index = 0;
        short Index = 0;
        short countDevide = 0;
        /*First break each digit from the whole number. For ex: 377 to 3,7,7*/
        while(octal > 0){
            elementList.add(index,octal % 10);
            octal = octal / 10;
            index += 1;
        }
        /*Prevent in case user input digit that bigger than or equal 8*/
        for (int i = 0; i < index; i++){
            if (elementList.get(i) >= 8){
                elementList.clear();
                return -1; // if condition true it will return -1;
            }
        }
    /*generate 3 octal digit to each binary digit*/
        /*
            In this case:
            - The number that can divide 3 time don't need to shift number 0 to complete three digit.
            - The number that can divide only 1 or 2 time or 0 time need to shift 0 to complete 3 digit of binary.
         */
        // covert each octal digit to binary digit.
        for (int i = 0; i < index; i++){
            while (elementList.get(i) > 0){
                binarylist.add(Index,elementList.get(i) % 2);
                elementList.set(i,elementList.get(i)/2); // replace element in its old position.
                Index += 1;
                countDevide += 1;
            }
        /* Shift area: */
            if (countDevide == 0){
                for (int j = 0; j < 3; j++){
                    binarylist.add(Index + j,0L);
                }
                countDevide = 0;
                Index += 3;
            }else if (countDevide == 1){
                for (int j = 0; j < 2; j++){
                    binarylist.add(Index + j,0L);
                }
                countDevide = 0;
                Index += 2;
            }else if (countDevide == 2){
                binarylist.add(Index,0L);
                Index += 1;
                countDevide = 0;
            }
        }
    /*Combine each binary element from the end of array to the first of array(binarylist)*/
        long binaryNumber = 0;
        for (int i = Index - 1; i >= 0; i--){
            binaryNumber += binarylist.get(i) * Math.pow(10,i);
        }
        elementList.clear();
        return binaryNumber;
    }

    /**
     * This Octal2Hexadecimal is use to convert from octal system to Binary system.
     * @param octal take user input value as an octal system.
     * @return value of Hexadecimal as string.
     */

    String Octal2Hexadecimal (long octal) {
        long binaryNumber = Octal2Binary(octal);
        if (binaryNumber != -1){
            binary2Hexadecimal(binaryNumber);
            return "true";
        }else {
            return "Octal digit range from 0-7.";
        }
    }

    /*Decimal to any various type of number system:*/

    long Decimal2Binary (long decimal) {
        short index = 0;
        while (decimal > 0){
            elementList.add(index,decimal % 2);
            decimal = decimal /2;
            index += 1;
        }
        long binaryData = 0;
        for (int i = index - 1; i >= 0; i--){
            binaryData += elementList.get(i) * Math.pow(10,i);
        }
        elementList.clear();
        return binaryData;
    }

    long Decimal2Octal (long decimal) {
        long binaryData = Decimal2Binary(decimal);
        return binary2Octal(binaryData);
    }

    void Decimal2Hexadecimal (long decimal) {
       long binaryData = Decimal2Binary(decimal);
       binary2Hexadecimal(binaryData);
    }


}
