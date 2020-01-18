package com.ITE;
import sun.security.provider.certpath.OCSP;

import java.lang.Integer.*;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.ArrayList;
/**
 * This class is consist of wide range to perform conversion.
 */
public class NumberSystemConversion {

    private long binaryNumber;
    private ArrayList<Long> elementList = new ArrayList<Long>(1); // this one is use every where in here so after use need to clear it.
    private checkingUserInput CheckingUserInput = new checkingUserInput();

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
     * This binary2Hexadecimal is use to convert from Binary system to Hexadecimal system.
     * @param binary take user input as a binary system.(Accept only 0 and 1)
     */
    void binary2Hexadecimal (long binary) {

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
     */
    void Octal2Hexadecimal (long octal) {
        long binaryNumber = Octal2Binary(octal);
        binary2Hexadecimal(binaryNumber);
    }

    /*Decimal to any various type of number system:*/

    /**
     * This Decimal2Binary Method is use to convert from Decimal to Binary number system.
     * @param decimal parameter take value as decimal
     * @return value as long.
     */
    long Decimal2Binary (long decimal) {
        short index = 0;
        while (decimal > 0){
            elementList.add(index,decimal % 2);
            decimal = decimal /2;
            index += 1;
        }
        long binaryData = 0;
        for (int i = index - 1; i >= 0; i--){
            binaryData += elementList.get(i) * Math.pow(10,i); // combine each digit together.
        }
        elementList.clear();
        return binaryData;
    }

    /**
     * This Decimal2Octal Method is use to convert from Decimal to Octal number system.
     * @param decimal parameter take value as decimal
     * @return value as long data.
     */
    long Decimal2Octal (long decimal) {
        long binaryData = Decimal2Binary(decimal);
        return binary2Octal(binaryData);
    }

    /**
     * This Decimal2Hexadecimal Method is use to convert from Decimal to Hexadecimal number system.
     * @param decimal parameter take value as decimal
     */
    void Decimal2Hexadecimal (long decimal) {
       long binaryData = Decimal2Binary(decimal);
       binary2Hexadecimal(binaryData);
    }

    /*Hexadecimal to any various type of number system:*/

    /**
     * This Method is use to convert from Hexadecimal to Decimal.
     * @param hexadecimalValue take value input as string.
     * @return value as decimal.
     */
        long Hexadecimal2Decimal (String hexadecimalValue) {
            String hexaValue = hexadecimalValue;
            char[] arrayofChar = hexaValue.toCharArray();
            for (int i = 0; i < arrayofChar.length; i++){
                if (arrayofChar[i] == '1'){
                    elementList.add(i,1L);
                }else if (arrayofChar[i] == '2'){
                    elementList.add(i,2L);
                }else if (arrayofChar[i] == '3'){
                    elementList.add(i,3L);
                }else if (arrayofChar[i] == '4'){
                    elementList.add(i,4L);
                }else if (arrayofChar[i] == '5'){
                    elementList.add(i,5L);
                }else if (arrayofChar[i] == '6'){
                    elementList.add(i,6L);
                }else if (arrayofChar[i] == '7'){
                    elementList.add(i,7L);
                }else if (arrayofChar[i] == '8'){
                    elementList.add(i,8L);
                }else if (arrayofChar[i] == '9'){
                    elementList.add(i,9L);
                }else if (arrayofChar[i] == 'A' || arrayofChar[i] == 'a'){
                    elementList.add(i,10L);
                }else if (arrayofChar[i] == 'B' || arrayofChar[i] == 'b'){
                    elementList.add(i,11L);
                }else if (arrayofChar[i] == 'C' || arrayofChar[i] == 'c'){
                    elementList.add(i,12L);
                }else if (arrayofChar[i] == 'D' || arrayofChar[i] == 'd'){
                    elementList.add(i,13L);
                }else if (arrayofChar[i] == 'E' || arrayofChar[i] == 'e'){
                    elementList.add(i,14L);
                }else if (arrayofChar[i] == 'F' || arrayofChar[i] == 'f'){
                    elementList.add(i,15L);
                }
            }// end of loop.
            // Generate value to Decimal:
            long DecimalValue = 0;
            int power = arrayofChar.length;
            for (int i = 0; i < arrayofChar.length; i++){
                power = power - 1; // power start from n - 1 coz our value store as sequence already.
                long Decimal_eachValue = (long) (elementList.get(i) * Math.pow(16,power));
                DecimalValue += Decimal_eachValue;
            }
            elementList.clear();
            // Result output:
            return DecimalValue;
        }

    /**
     * This method is use to convert from Hexadecimal to Binary.
      * @param hexadecimalValue take value input as string.
     * @return value as binary string.
     */
        long Hexadecimal2Binary (String hexadecimalValue){
            long DecimalValue = Hexadecimal2Decimal(hexadecimalValue);
            long BinaryValue = Decimal2Binary(DecimalValue);
            return BinaryValue;
        }

    /**
     * This method is use to convert from Hexadecimal to Octal
      * @param hexadecimalValue take value input as string.
     * @return value as Integer that has long data type.
     */
        long Hexadecimal2Octal (String hexadecimalValue){
            long DecimalValue = Hexadecimal2Decimal(hexadecimalValue);
            long Octal = Decimal2Octal(DecimalValue);
            return Octal;
        }

    /*Function that create for call to use in main function*/
        // declare variable for use to receive result or answer:
            private String value_as_string;
            private long answer;
            Scanner scan = new Scanner(System.in);

    /**
     * This Binary Method group all of binary Conversion.
     * Option:
     *      1. Binary to Octal
     *      2. Binary to Decimal
     *      3. Binary to Hexadecimal
      * @param convertOption take option value as integer.
     */
         private void Binary (int convertOption){
        switch (convertOption){
            case 1: System.out.println("      Binary to Octal");
                System.out.println("Enter number of Binary here: ");
                value_as_string = scan.next();
                if (CheckingUserInput.isValidBinary(value_as_string)){
                    answer = binary2Octal(Long.parseLong(value_as_string));
                }else {
                    while (!CheckingUserInput.isValidBinary(value_as_string)) {
                        System.out.println("Binary number consist only 0 and 1.");
                        System.out.println("Enter number of Binary again here: ");
                        value_as_string = scan.next();
                    }
                    answer = binary2Octal(Long.parseLong(value_as_string));
                }
                System.out.println("Octal number = " + answer);
                break;

            case 2: System.out.println("      Binary to Decimal");
                System.out.println("Enter number of Binary here: ");
                value_as_string = scan.next();
                if (CheckingUserInput.isValidBinary(value_as_string)){
                    answer = binary2Decimal(Long.parseLong(value_as_string));
                }else {
                    while (!CheckingUserInput.isValidBinary(value_as_string)){
                        System.out.println("Binary number consist only 0 and 1.");
                        System.out.println("Enter number of Binary again here: ");
                        value_as_string = scan.next();
                    }
                    answer = binary2Decimal(Long.parseLong(value_as_string));
                }
                System.out.println("Decimal number = " + answer);
                break;

            case 3: System.out.println("   Binary to Hexadecimal");
                System.out.println("Enter number of Binary here: ");
                value_as_string = scan.next();
                if (CheckingUserInput.isValidBinary(value_as_string)){
                    binary2Hexadecimal(Long.parseLong(value_as_string));
                }else {
                    while (!CheckingUserInput.isValidBinary(value_as_string)){
                        System.out.println("Binary number consist only 0 and 1.");
                        System.out.println("Enter number of Binary again here: ");
                        value_as_string = scan.next();
                    }
                    binary2Hexadecimal(Long.parseLong(value_as_string));
                }
                break;
        }
    }

    /**
     * This Octal Method group all octal Conversion.
     * Option:
     *      1. Octal to Binary
     *      2. Octal to Decimal
     *      3. Octal to Hexadecimal
     * @param convertOption take option value as integer
     */
        private void Octal (int convertOption){
        switch (convertOption){
            case 1: System.out.println("      Octal to Binary: ");
                System.out.println("Enter number of Octal here: ");
                value_as_string = scan.next();
                /*Prevent when there is something wrong.*/
                if (CheckingUserInput.isValidOctal(value_as_string)){
                    answer = Octal2Binary(Long.parseLong(value_as_string));
                }else {
                    while (!CheckingUserInput.isValidOctal(value_as_string)){
                        System.out.println("Octal digit range from 0-7.");
                        System.out.println("Enter number of Octal again here:");
                        value_as_string = scan.next();
                    }
                    answer = Octal2Binary(Long.parseLong(value_as_string));
                }
                System.out.println("Binary = " + answer);
                break;

            case 2: System.out.println("      Octal to Decimal: ");
                System.out.println("Enter number of Octal here: ");
                value_as_string = scan.next();
                /*Prevent when there is something wrong.*/
                if (CheckingUserInput.isValidOctal(value_as_string)){
                    answer = Octal2Decimal(Long.parseLong(value_as_string));
                }else {
                    while (!CheckingUserInput.isValidOctal(value_as_string)){
                        System.out.println("Octal digit range from 0-7.");
                        System.out.println("Enter number of Octal again here:");
                        value_as_string = scan.next();
                    }
                    answer = Octal2Decimal(Long.parseLong(value_as_string));
                }
                System.out.println("Decimal = " +answer);
                break;

            case 3: System.out.println("    Octal to Hexadecimal: ");
                System.out.println("Enter number of Octal here: ");
                value_as_string = scan.next();
                /*Prevent when there is something wrong.*/
                if (CheckingUserInput.isValidOctal(value_as_string)){
                    Octal2Hexadecimal(Long.parseLong(value_as_string));
                }else {
                    while (!CheckingUserInput.isValidOctal(value_as_string)){
                        System.out.println("Octal digit range from 0-7.");
                        System.out.println("Enter number of Octal again here: ");
                        value_as_string = scan.next();
                    }
                    Octal2Hexadecimal(Long.parseLong(value_as_string));
                }
                break;
        }
    }

    /**
     * This Decimal Method group all Decimal Conversion.
     * Option:
     *      1. Decimal to Binary
     *      2. Decimal to Octal
     *      3. Decimal to Hexadecimal
     * @param convertOption take option value as integer
     */
        private void Decimal (int convertOption){
        int value;
        switch (convertOption) {
            case 1: System.out.println("      Decimal to Binary: ");
                System.out.println("Enter number of Decimal here: ");
                value_as_string = scan.next();
                if (CheckingUserInput.isValidDecimal(value_as_string)){
                    answer = Decimal2Binary(Long.parseLong(value_as_string));
                }else {
                    while (!CheckingUserInput.isValidDecimal(value_as_string)){
                        System.out.println("System valid only Decimal number: 0-9\n");
                        System.out.print("Enter number of Decimal again here: ");
                        value_as_string = scan.next();
                    }
                    answer = Decimal2Binary(Long.parseLong(value_as_string));
                }
                System.out.println("Binary = " +answer);
                break;

            case 2: System.out.println("      Decimal to Octal: ");
                System.out.println("Enter number of Decimal here: ");
                value_as_string = scan.next();
                if (CheckingUserInput.isValidDecimal(value_as_string)){
                    answer = Decimal2Octal(Long.parseLong(value_as_string));
                }else{
                    while (!CheckingUserInput.isValidDecimal(value_as_string)){
                        System.out.println("System valid only Decimal number: 0-9\n");
                        System.out.print("Enter number of Decimal again here: ");
                        value_as_string = scan.next();
                    }
                    answer = Decimal2Octal(Long.parseLong(value_as_string));
                }
                System.out.println("Octal = " +answer);
                break;

            case 3: System.out.println("   Decimal to Hexadecimal: ");
                System.out.println("Enter number of Decimal here: ");
                value_as_string = scan.next();
                if (CheckingUserInput.isValidDecimal(value_as_string)){
                    Decimal2Hexadecimal(Long.parseLong(value_as_string));
                }else {
                    while (!CheckingUserInput.isValidDecimal(value_as_string)) {
                        System.out.println("System valid only Decimal number: 0-9\n");
                        System.out.print("Enter number of Decimal again here: ");
                        value_as_string = scan.next();
                    }
                    Decimal2Hexadecimal(Long.parseLong(value_as_string));
                }
                break;
        }
    }

    /**
     * This Hexadecimal Method group all Hexadecimal Conversion.
     * Option:
     *      1. Hexadecimal to Binary
     *      2. Hexaadecimal to Octal
     *      3. Hexadecimal to Decimal
     * @param convertOption take option value as integer
     */
        private void Hexadecimal (int convertOption) {
        String Hexa_string_Value;
        long answer;
        Scanner scan = new Scanner(System.in);
        switch (convertOption) {
            case 1: System.out.println("     Hexadecimal to Binary: ");
                    System.out.println("Enter number of Hexadecimal here: ");
                    Hexa_string_Value = scan.next();
                    if (CheckingUserInput.isValidHexadecimal(Hexa_string_Value)){
                        answer = Hexadecimal2Binary(Hexa_string_Value);
                    }else {
                        while (!CheckingUserInput.isValidHexadecimal(Hexa_string_Value)){
                            System.out.println("Invalid Hexadecimal number system.");
                            System.out.print("Enter number of Hexadecimal again here: ");
                            Hexa_string_Value = scan.next();
                        }
                        answer = Hexadecimal2Binary(Hexa_string_Value);
                    }
                    System.out.println("Binary = " + answer);
                    break;
            case 2: System.out.println("      Hexadecimal to Octal: ");
                    System.out.println("Enter number of Hexadecimal here: ");
                    Hexa_string_Value = scan.next();
                    if (CheckingUserInput.isValidHexadecimal(Hexa_string_Value)){
                        answer = Hexadecimal2Octal(Hexa_string_Value);
                    }else {
                        while (!CheckingUserInput.isValidHexadecimal(Hexa_string_Value)){
                            System.out.println("Invalid Hexadecimal number system.");
                            System.out.print("Enter number of Hexadecimal again here: ");
                            Hexa_string_Value = scan.next();
                        }
                        answer = Hexadecimal2Octal(Hexa_string_Value);
                    }
                    System.out.println("Octal = " + answer);
                    break;
            case 3: System.out.println("      Hexadecimal to Decimal: ");
                    System.out.println("Enter number of Hexadecimal here: ");
                    Hexa_string_Value = scan.next();
                    if (CheckingUserInput.isValidHexadecimal(Hexa_string_Value)){
                        answer = Hexadecimal2Decimal(Hexa_string_Value);
                    }else {
                        while (!CheckingUserInput.isValidHexadecimal(Hexa_string_Value)){
                            System.out.println("Invalid Hexadecimal number system.");
                            System.out.print("Enter number of Hexadecimal again here: ");
                            Hexa_string_Value = scan.next();
                        }
                        answer = Hexadecimal2Decimal(Hexa_string_Value);
                    }
                    System.out.println("Decimal = " + answer);
                    break;
        }
    }

    /**
     * This method is use to call all Number System Converter.
     * Main Option:
     *      1. Binary Converter.
     *      2. Octal Converter.
     *      3. Decimal Converter.
     *      4. Hexadecimal Converter.
     * In the Sub-Menu there is a specific Converter.
     * @param mainOption take input as integer.
     * @param subMenuOption take input as integer.
     */
        private void calledNumberSystemConverter(int mainOption, int subMenuOption){
        switch (mainOption) {
            case 1: Binary(subMenuOption);break;
            case 2: Octal(subMenuOption);break;
            case 3: Decimal(subMenuOption);break;
            case 4: Hexadecimal(subMenuOption);break;
        }
    }

    /**
     * This function is use to display subMenu of number system conversion.
     * Main Option:
     *      1. Binary Converter.
     *      2. Octal Converter.
     *      3. Decimal Converter.
     *      4. Hexadecimal Converter.
     * @param mainOption option value as interger.
     */
        void numberSystemConversionSubMenu(int mainOption){
        int subMenuOption;
        switch (mainOption){
            case 1: System.out.println("Binary: ");
                System.out.println("    1.  Binary to Octal");
                System.out.println("    2.  Binary to Decimal");
                System.out.println("    3.  Binary to Hexadecimal");
                System.out.println("Enter your option here: ");
                subMenuOption = scan.nextInt();
                calledNumberSystemConverter(mainOption,subMenuOption);
                break;
            case 2: System.out.println("Octal: ");
                System.out.println("    1.  Octal to Binary");
                System.out.println("    2.  Octal to Decimal");
                System.out.println("    3.  Octal to Hexadecimal");
                System.out.println("Enter your option here: ");
                subMenuOption = scan.nextInt();
                calledNumberSystemConverter(mainOption,subMenuOption);
                break;
            case 3: System.out.println("Decimal: ");
                System.out.println("    1. Decimal to Binary");
                System.out.println("    2. Decimal to Octal");
                System.out.println("    3. Decimal to Hexadecimal");
                System.out.println("Enter your option here: ");
                subMenuOption = scan.nextInt();
                calledNumberSystemConverter(mainOption,subMenuOption);
                break;
            case 4: System.out.println("Hexadecimal: ");
                System.out.println("    1. Hexadecimal to Binary");
                System.out.println("    2. Hexadecimal to Octal");
                System.out.println("    3. Hexadecimal to Decimal");
                System.out.println("Enter your option here: ");
                subMenuOption = scan.nextInt();
                calledNumberSystemConverter(mainOption,subMenuOption);
                break;

        }
    }

    /*Protected Method*/

    /**
     * This Nested class is contain all function that use to check user input.
     */
        class checkingUserInput {
        Boolean isValidBinary (String BinaryValue){
            char[] set_of_char = BinaryValue.toCharArray();
            Boolean isAllow = true;
            for (int i = 0; i < set_of_char.length; i++){
                Boolean condition = Character.isDigit(set_of_char[i]);
                if (!condition){
                    isAllow = false;
                    break;
                }
            }
            if (isAllow){
                for (int i = 0; i < set_of_char.length; i++){
                    Boolean conditionBiggerthan = set_of_char[i] > '1';
                    Boolean conditionSmallerthan = set_of_char[i] < '0';
                    if (conditionBiggerthan || conditionSmallerthan){
                        isAllow = false;
                        break;
                    }
                }
            }
            return isAllow;
        }
        Boolean isValidOctal (String OctalValue){
            char[] set_of_char = OctalValue.toCharArray();
            Boolean isAllow = true;
            for (int i = 0; i < set_of_char.length; i++){
                Boolean condition = Character.isDigit(set_of_char[i]);
                if (!condition){
                    isAllow = false;
                    break;
                }
            }
            if (isAllow){
                for (int i = 0; i < set_of_char.length; i++){
                    Boolean condition = set_of_char[i] >= '8';
                    if (condition){
                        isAllow = false;
                        break;
                    }
                }
            }
            return isAllow;
        }
        Boolean isValidDecimal (String DecimalValue){
            char[] set_of_char = DecimalValue.toCharArray();
            Boolean isAllow = true;
            for (int i = 0; i < set_of_char.length;i++){
                Boolean condition = Character.isDigit(set_of_char[i]);
                if (!condition){
                    isAllow = false;
                    break;
                }
            }
            return isAllow;
        }
        Boolean isValidHexadecimal (String Hexadecimal){
            char[] set_of_char = Hexadecimal.toCharArray();
            Boolean isAllow = true;
            for (int i = 0; i < set_of_char.length;i++){
                Boolean condition = Character.isLetterOrDigit(set_of_char[i]);
                if (!condition){
                    isAllow = false;
                    break;
                }
            }
            if (isAllow){
                for (int i = 0; i < set_of_char.length; i++){
                    Boolean conditionuppercase = Character.toUpperCase(set_of_char[i]) <= 'F';
                    if (!conditionuppercase){
                        isAllow = false;
                        break;
                    }
                }
            }
            return isAllow;
        }
    }
}

