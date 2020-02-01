package com.ITE;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Integer.*;

/**
 * @author Dyly TithSambath
 */

/**
 * This class is the main class all class instance of other class have been create and use.
 */
public class Main {

    // Create an object of another class for use:(import class)
        static Scanner scan = new Scanner(System.in);
        static Bitwise bitwise = new Bitwise();
        static Operators operators = new Operators();
        static StorageConverter storageConverter = new StorageConverter();
        static NumberSystemConversion numberSystemConversion = new NumberSystemConversion();
        static BinaryArithmetic binaryArithmetic = new BinaryArithmetic();
        static int previousMenu = 0;

    // Create function Menu display:

    /**
     * This Method is use to print out Menu on console output and let user input there option here.
     */
    static void createMenu () {
    // Menu Display
        System.out.println("OPERATOR MENU: ");
        System.out.println("____________________________________");
        System.out.println("    1. Arithmetic Operator");
        System.out.println("    2. Trigonometric Operator");
        System.out.println("    3. Bitwise Operation");
        System.out.println("    4. Storage Converter");
        System.out.println("    5. Number System Conversion");
        System.out.println("    6. Binary Arithmetic");
        System.out.println("    7. Set Operation");
        System.out.println("____________________________________");

    // Ask user option:
        System.out.println("Enter your option here: ");
        int MenuOption = 0;
        int FunctionOption = 0;

        MenuOption = scan.nextInt(); // let user input their option.
        previousMenu = MenuOption;

        switch (MenuOption){
            case 1: System.out.println("____________________________________");
                        System.out.println("Arithmetic Operator: ");
                        System.out.println("    1. Sum");
                        System.out.println("    2. Divide");
                        System.out.println("    3. Minus");
                        System.out.println("    4. Multiply");
                        System.out.println("    5. Modulo");
                    System.out.println("____________________________________");
                        System.out.println("Enter your option here: ");
                    FunctionOption = scan.nextInt();
                    operators.calledArithmeticOperators(FunctionOption);
                    break;
            case 2: System.out.println("____________________________________");
                        System.out.println("Trigonometric Operator: ");
                        System.out.println("    1. Sin in Radian");
                        System.out.println("    2. Sin in Degree");
                        System.out.println("    3. Cos in Radian");
                        System.out.println("    4. Cos in Degree");
                        System.out.println("    5. tan in Radian");
                        System.out.println("    6. tan in Degree");
                    System.out.println("____________________________________");
                        System.out.println("Enter your option here: ");
                    FunctionOption = scan.nextInt();
                    operators.calledTrigonometricOperators(FunctionOption);
                    break;
            case 3: System.out.println("____________________________________");
                        System.out.println("Bitwise Operator: ");
                        System.out.println("    1. AND Operator");
                        System.out.println("    2. OR Operator");
                        System.out.println("    3. XOR Operator");
                        System.out.println("    4. Bitwise Inversion Operator");
                        System.out.println("    5. Left Shift");
                        System.out.println("    6. Right Shift");
                    System.out.println("____________________________________");
                        System.out.println("Enter your option here: ");
                    FunctionOption = scan.nextInt();
                    bitwise.calledBitwiseOperators(FunctionOption);
                    break;
            case 4: System.out.println("____________________________________");
                        System.out.println("Storage Converter: ");
                        System.out.println("    1. Byte");
                        System.out.println("    2. KiloByte");
                        System.out.println("    3. Megabyte");
                        System.out.println("    4. Gigabyte");
                        System.out.println("    5. Terabyte");
                        System.out.println("    6. Petabyte");
                    System.out.println("____________________________________");
                    System.out.println("Enter your option here: ");
                    FunctionOption = scan.nextInt();
                    storageConverter.storageConverterSubMenu(FunctionOption);
                    break;
            case 5: System.out.println("____________________________________");
                        System.out.println("Number System Conversion: ");
                        System.out.println("    1. Binary");
                        System.out.println("    2. Octal");
                        System.out.println("    3. Decimal");
                        System.out.println("    4. Hexadecimal");
                    System.out.println("____________________________________");
                    System.out.println("Enter your option here: ");
                    FunctionOption = scan.nextInt();
                    numberSystemConversion.numberSystemConversionSubMenu(FunctionOption);
                    break;
            case 6: System.out.println("____________________________________");
                        System.out.println("Binary Arithmetic: ");
                        System.out.println("    1. Binary Add");
                        System.out.println("    2. Binary Subtraction");
                        System.out.println("    3. Find First Complement");
                        System.out.println("    4. Second Complement");
                        System.out.println("    5. Subtract with 2nd Complement");
                        System.out.println("    6. Multiply");
                        System.out.println("    7. Divide");
                    System.out.println("____________________________________");
                    System.out.println("Enter your option here: ");
                    FunctionOption = scan.nextInt();
                    BinaryArithmetic.callBinaryArithmetic CalledBIArithmetic = binaryArithmetic.new callBinaryArithmetic();
                    CalledBIArithmetic.binaryArithmetic(FunctionOption);
                    break;
            case 7: System.out.println("____________________________________");
                    System.out.println("Set Operation: ");
                    System.out.println("    1. Union");
                    System.out.println("    2. Intersection");
                    System.out.println("    3. Difference");
                    System.out.println("____________________________________");
                    System.out.println("Enter your option here: ");
                    FunctionOption = scan.nextInt();
                    SetTheory set = new SetTheory();
                    set.calledSetOperation(FunctionOption);
                    break;


        }
    }
    static void PreviousMenu (int previousMenu) {
        int FunctionOption = 0;

        switch (previousMenu){
            case 1: System.out.println("____________________________________");
                System.out.println("Arithmetic Operator: ");
                System.out.println("    1. Sum");
                System.out.println("    2. Divide");
                System.out.println("    3. Minus");
                System.out.println("    4. Multiply");
                System.out.println("    5. Modulo");
                System.out.println("____________________________________");
                System.out.println("Enter your option here: ");
                FunctionOption = scan.nextInt();
                operators.calledArithmeticOperators(FunctionOption);
                break;
            case 2: System.out.println("____________________________________");
                System.out.println("Trigonometric Operator: ");
                System.out.println("    1. Sin in Radian");
                System.out.println("    2. Sin in Degree");
                System.out.println("    3. Cos in Radian");
                System.out.println("    4. Cos in Degree");
                System.out.println("    5. tan in Radian");
                System.out.println("    6. tan in Degree");
                System.out.println("____________________________________");
                System.out.println("Enter your option here: ");
                FunctionOption = scan.nextInt();
                operators.calledTrigonometricOperators(FunctionOption);
                break;
            case 3: System.out.println("____________________________________");
                System.out.println("Bitwise Operator: ");
                System.out.println("    1. AND Operator");
                System.out.println("    2. OR Operator");
                System.out.println("    3. XOR Operator");
                System.out.println("    4. Bitwise Inversion Operator");
                System.out.println("    5. Left Shift");
                System.out.println("    6. Right Shift");
                System.out.println("____________________________________");
                System.out.println("Enter your option here: ");
                FunctionOption = scan.nextInt();
                bitwise.calledBitwiseOperators(FunctionOption);
                break;
            case 4: System.out.println("____________________________________");
                System.out.println("Storage Converter: ");
                System.out.println("    1. Byte");
                System.out.println("    2. KiloByte");
                System.out.println("    3. Megabyte");
                System.out.println("    4. Gigabyte");
                System.out.println("    5. Terabyte");
                System.out.println("    6. Petabyte");
                System.out.println("____________________________________");
                System.out.println("Enter your option here: ");
                FunctionOption = scan.nextInt();
                storageConverter.storageConverterSubMenu(FunctionOption);
                break;
            case 5: System.out.println("____________________________________");
                System.out.println("Number System Conversion: ");
                System.out.println("    1. Binary");
                System.out.println("    2. Octal");
                System.out.println("    3. Decimal");
                System.out.println("    4. Hexadecimal");
                System.out.println("____________________________________");
                System.out.println("Enter your option here: ");
                FunctionOption = scan.nextInt();
                numberSystemConversion.numberSystemConversionSubMenu(FunctionOption);
                break;
            case 6: System.out.println("____________________________________");
                System.out.println("Binary Arithmetic: ");
                System.out.println("    1. Binary Add");
                System.out.println("    2. Binary Subtraction");
                System.out.println("    3. Find First Complement");
                System.out.println("    4. Second Complement");
                System.out.println("    5. Subtract with 2nd Complement");
                System.out.println("    6. Multiply");
                System.out.println("    7. Divide");
                System.out.println("____________________________________");
                System.out.println("Enter your option here: ");
                FunctionOption = scan.nextInt();
                BinaryArithmetic.callBinaryArithmetic CalledBIArithmetic = binaryArithmetic.new callBinaryArithmetic();
                CalledBIArithmetic.binaryArithmetic(FunctionOption);
                break;
            case 7: System.out.println("____________________________________");
                System.out.println("Set Operation: ");
                System.out.println("    1. Union");
                System.out.println("    2. Intersection");
                System.out.println("    3. Difference");
                System.out.println("____________________________________");
                System.out.println("Enter your option here: ");
                FunctionOption = scan.nextInt();
                SetTheory set = new SetTheory();
                set.calledSetOperation(FunctionOption);
                break;
        }
    }

    /**
     * This function is use to go back to Menu or close program.
     * @param decision is user option: back to menu or close program.
     */
    static void ContinuousOrClose (int decision) {
        if (decision == 1){
            createMenu();
        }else if (decision == 2){
            PreviousMenu(previousMenu);
        }else {
            return;
        }
    }

    public static void main(String[] args) {

        System.out.println("                        Welcome to ITE-Calculator"); // Label

            createMenu(); // display Menu and do user order process.

            // This do while use to call createMenu again and again until user want to stop.
                int decision; // user decision;
                do {
                    System.out.println("\nPress 1: Main Menu, Press 2: Previous Menu, Press 0: Close Program");
                    System.out.print("PRESS: ");
                    decision = scan.nextInt();
                    ContinuousOrClose(decision);
                }while (decision == 1 || decision == 2);

       /*
            case 12 : System.out.println("Enter integer value here: ");
                        base = scan.nextLong(); // base type long
                        answer = Operators.Square2(base);
                        System.out.println("Answer = "+answer);
                        break;
            case 13 : System.out.println("Enter float value here: ");
                        Base = scan.nextDouble();
                        Answer = Double.parseDouble(df.format(Operators.Square2(Base)));
                        System.out.println("Answer = "+Answer);
                        break;
            case 14 : System.out.println("Enter integer value here:  ");
                        base =  scan.nextLong();
                        answer = operators.Square3(base);
                        System.out.println("Answer = "+answer);
                        break;
            case 15 : System.out.println("Enter float value here: ");
                        Base = scan.nextDouble();
                        Answer = Double.parseDouble(df.format(operators.Square3(Base)));
                        System.out.println("Answer = "+Answer);
                        break;
            case 16 : System.out.println("Enter float value here: ");
                        double degree = scan.nextDouble();
                        Answer = Double.parseDouble(df.format(operators.degree2Radian(degree)));
                        System.out.println("Answer = "+Answer);
         */
        }//end main function.
}// end main class.
